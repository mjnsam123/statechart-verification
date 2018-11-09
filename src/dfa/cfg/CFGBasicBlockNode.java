package cfg;

import ast.IStatement;

import java.util.List;

public class CFGBasicBlockNode implements ICFGBasicBlockNode {
    private IStatement mStatement;

    @Override
    public IStatement getStatement() {
        return this.mStatement;
    }

    @Override
    public void setStatement(IStatement stmt) {
        this.mStatement = stmt;
    }

    @Override
    public ICFEdge getOutgoingEdge() {
        return null;
    }

    @Override
    public ICFGNode getSuccessorNode() {
        if (this.mOutgoingEdge == null) {
            return null;
        }
        return this.mOutgoingEdge.getHead();
    }

    @Override
    public ICFEdge setOutgoingEdge(ICFEdge edge) {
        return null;
    }

    @Override
    public boolean isIncomingEdge(ICFEdge edge) {
        return false;
    }

    @Override
    public boolean isOutgoingEdge(ICFGNode node) {
        return false;
    }

    @Override
    public boolean isCFSuccessor(ICFGNode node) {
        return false;
    }

    @Override
    public ICFG getCFG() {
        return null;
    }

    @Override
    public void setCFG(ICFG graph) {

    }

    @Override
    public List<ICFEdge> getIncomingEdgeList() {
        return null;
    }

    @Override
    public List<ICFEdge> getOutgoingEdgeList() {
        return null;
    }

    @Override
    public List<ICFGNode> getCFPredecessorNodeList() {
        return null;
    }

    @Override
    public List<ICFGNode> getCFSuccessorNodeList() {
        return null;
    }

    @Override
    public ICFEdge addIncomingEdge(ICFEdge edge) {
        return null;
    }

    @Override
    public ICFEdge deleteIncomingEdge(ICFEdge edge) {
        return null;
    }

    @Override
    public ICFEdge addOutgoingEdge(ICFEdge edge) {
        return null;
    }

    @Override
    public ICFEdge deleteOutgoingEdge(ICFEdge edge) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
}