package cfg;

import java.util.ArrayList;
import java.util.List;

public class CFGNode implements ICFGNode {
    protected ICFG mCFG;
    protected List<ICFEdge> mIncomingEdgeList = new ArrayList<ICFEdge>();
    protected List<ICFEdge> mOutgoingEdgeList = new ArrayList<ICFEdge>();
    protected String mId;

    @Override
    public boolean isIncomingEdge(ICFGNode node) {
        return false;
    }

    @Override
    public boolean isOutgoingEdge(ICFGNode node) {
        return this.mOutgoingEdgeList.contains();
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
    public ICFEdge addIncomingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public ICFEdge deleteIncomingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public ICFEdge addOutgoingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public ICFEdge deleteOutgoingEdge(ICFGNode node) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
}
