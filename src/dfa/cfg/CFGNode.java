package cfg;

import java.util.ArrayList;
import java.util.List;

public class CFGNode implements ICFGNode {
    protected ICFG mCFG;
    protected List<ICFGNode> mIncomingNodeList = new ArrayList<ICFGNode>();
    protected List<ICFGNode> mOutgoingNodeList = new ArrayList<ICFGNode>();
    protected String mId;

    @Override
    public boolean isIncomingEdge(ICFGNode node) {
        return this.mIncomingNodeList.contains(node);
    }

    @Override
    public boolean isOutgoingEdge(ICFGNode node) {
        return this.mOutgoingNodeList.contains(node);
    }

    @Override
    public boolean isCFPredecessor(ICFGNode node) {
        for(ICFGNode n : this.mIncomingNodeList) {
            if(n.equals(node)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isCFSuccessor(ICFGNode node) {
        return false;
    }

    @Override
    public ICFG getCFG() {
        return this.mCFG;
    }

    @Override
    public void setCFG(ICFG graph) {
        this.mCFG = graph;
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
    public ICFGNode addIncomingEdge(ICFGNode node) {
        if(this.mIncomingNodeList.add(node)) {
            return node;
        }
        return null;
    }

    @Override
    public ICFGNode deleteIncomingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public ICFGNode addOutgoingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public ICFGNode deleteOutgoingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
}
