package set;

import java.util.Set;

public class SET implements ISET {
    private ISETInstructionNode mSETRootNode;


    @Override
    public void getPathConstraint(ISETNode currentNode) {

    }

    @Override
    public ISETEdge setPathEdgeAnnotation(ISETDecisionNode parent, ISETNode child) {
        return null;
    }

    @Override
    public void getPathEdgeAnnotation(ISETDecisionNode parent, ISETNode child, ISETEdge newEdge) {

    }

    @Override
    public ISETNode getSETRootNode() {
        return this.mSETRootNode;
    }

    @Override
    public ISETNode getParent(ISETNode node) {
        return null;
    }

    @Override
    public Set<ISETNode> getChildren(ISETNode node) {
        return null;
    }

    @Override
    public void setChildren(ISETNode node, Set<ISETNode> childNodes) {

    }
}
