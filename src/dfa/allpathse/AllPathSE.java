package allpathse;

import ast.Expression;
import cfg.ICFGBasicBlockNode;
import cfg.ICFGDecisionNode;
import cfg.ICFGNode;
import set.IAllPathSE;
import set.ISETDecisionNode;
import set.ISETInstructionNode;
import set.ISETNode;

import java.util.Queue;

public class AllPathSE implements IAllPathSE {
    @Override
    public ISETDecisionNode createNewSETDecisionNode(ICFGDecisionNode node, int level) {
        return null;
    }

    @Override
    public ISETInstructionNode createNewSETInstructionNode(ICFGBasicBlockNode node, int level) {
        return null;
    }

    @Override
    public void getPathConstraint(ISETNode currentNode) {

    }

    @Override
    public boolean IS_SAT(Expression exp) {
        return false;
    }

    @Override
    public void enqueue(Queue queue, ISETNode node, int level) {

    }

    @Override
    public ISETNode dequeue(Queue queue) {
        return null;
    }

    @Override
    public ICFGNode getCFGNode(ISETNode node) {
        return null;
    }

    @Override
    public void executeAllPathSE(ISETNode rootNode, int depth) {

    }
}
