package cfg;

import utilities.IdGenerator;

public class CFEdge implements ICFEdge {
    private ICFG mCFG;
    private ICFGNode mHead;
    private ICFGNode mTail;
    private String mId;

    public CFEdge(ICFG cfg, ICFGNode tail, ICFGNode head) {
        this.mCFG = cfg;
        this.mTail = tail;
        this.mHead = head;
        if(cfg != null) {
			cfg.addEdge(this);
        }
        this.mId = CFEdge.generateId();
    }

    public CFEdge(String id, ICFG cfg, ICFGNode tail, ICFGNode head) throws Exception {
        this.mCFG = cfg;
        this.mTail = tail;
        this.mHead = head;
        if(IdGenerator.hasId(id)) {
            Exception e = new Exception("Can't construct CFEdge : something with name '" + id + "' already exists.");
            throw e;
        }
        if(cfg != null) {
            cfg.addEdge(this);
        }
        IdGenerator.addId(id);
        this.mId = id;
    }

    @Override
    public ICFGNode getHead() {
        return this.mHead;
    }

    @Override
    public ICFGNode getTail() {
        return this.getTail();
    }

    @Override
    public void setHead(ICFGNode node) {
        this.mHead = node;
    }

    @Override
    public void setTail(ICFGNode node) {
        this.mTail = node;
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
    public void setEdgeAnnotation(boolean bool) {

    }

    @Override
    public boolean getEdgeAnnotation() {
        return false;
    }

    @Override
    public String getId() {
        return this.mId;
    }

    public String toString() {
        return "CFEdge " + this.mId + " tail = " + this.mTail.getId() + " head = " + this.mHead.getId() + "\n";
    }

    private static String generateId() {
        return IdGenerator.generateId("CFEdge");
    }
}
