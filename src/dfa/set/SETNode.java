package set;

import cfg.ICFGNode;


public class SETNode implements ISETNode {
    protected ISETNode mPredecessorNode;
    protected ISET mSET;
    protected ICFGNode mCFGNode;
    protected String mId;

    public SETNode(ISET set, ICFGNode cfgNode, ISETNode predecessorNode) {
        this.mSET = set;
        this.mCFGNode = cfgNode;
        this.mPredecessorNode = predecessorNode;
//		here we need to assign mIncomingedge
//		this.mIncomingEdge = cfgNode.getEd;
    }

    public boolean isIncomingEdge(ISETNode node) {
        return this.mPredecessorNode.equals(node);
    }

    public ISET getSET() {
        return this.mSET;
    }

    public void setSET(SET set) {
        this.mSET = set;
    }

    public String getId() {
        return this.mId;
    }

    public ISETNode getIncomingEdge() {
        return this.mPredecessorNode;
    }

    public ISETNode setIncomingEdge(SETNode node) {
        if(!this.mSET.equals(node.getSET())) {
            return null;
        }
        this.mPredecessorNode = node;
        return node;
    }
}
