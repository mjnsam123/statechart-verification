package cfg;

import ast.Expression;
import ast.Name;
import utilities.IdGenerator;

import java.util.HashSet;
import java.util.Set;

public class CFG implements ICFG {
    private ICFGBasicBlockNode mStartNode;
    private ICFGBasicBlockNode mStopNode;
    private Set<Name> mVariables = new HashSet<Name>();
    private Set<ICFGBasicBlockNode> mCFGBasicBlockNodeList;
    private Set<ICFGDecisionNode> mDecisionNodeList;
    private String mId;
    private Set<ICFEdge> mEdges = new HashSet<ICFEdge>();

    // Initialises CFG instance with start & end node
    public CFG(ICFGBasicBlockNode start, ICFGBasicBlockNode stop) throws Exception {
        if(start == null || stop == null) {
            Exception e = new Exception("Can't construct CFG: start or stop node is null.");
            throw e;
        }
        this.mStartNode = start;
        start.setCFG(this);
        this.mStopNode = stop;
        stop.setCFG(this);
        this.mCFGBasicBlockNodeList.add(start);
        this.mCFGBasicBlockNodeList.add(stop);
        this.mId = CFG.generateId();
    }

    public CFG(String id, ICFGBasicBlockNode start, ICFGBasicBlockNode stop) throws Exception {
        this.mStartNode = start;
        if(start == null || stop == null) {
            Exception e = new Exception("Can't construct CFG: start or stop node is null.");
            throw e;
        }
        start.setCFG(this);
        this.mStopNode = stop;
        stop.setCFG(this);
        this.mCFGBasicBlockNodeList.add(start);
        this.mCFGBasicBlockNodeList.add(stop);

        if(IdGenerator.hasId(id)) {
            Exception e = new Exception("Can't construct CFG : something with name '" + id + "' already exists.");
            throw e;
        }
        IdGenerator.addId(id);
        this.mId = id;
    }

    private static String generateId() {
        return IdGenerator.generateId("CFG");
    }



    @Override
    public ICFGBasicBlockNode getStartNode() {
        return this.mStartNode;
    }

    @Override
    public ICFGBasicBlockNode addBasicBlockNode(ICFGBasicBlockNode node) {
        if(this.hasBasicBlockNode(node)) {
            return null;
        }
        this.mCFGBasicBlockNodeList.add(node);
        node.setCFG(this);
        return node;
    }

    @Override
    public boolean hasBasicBlockNode(ICFGBasicBlockNode node) {
        return this.mCFGBasicBlockNodeList.contains(node);
    }

    @Override
    public int getNumberOfBasicBlockNodes() {
        return this.mCFGBasicBlockNodeList.size();
    }

    @Override
    public ICFGDecisionNode addDecisionNode(ICFGDecisionNode node) {
        if(this.hasDecisionNode(node)) {
            return null;
        }
        this.mDecisionNodeList.add(node);
        node.setCFG(this);
        return node;
    }

    @Override
    public boolean hasDecisionNode(ICFGDecisionNode node) {
        return this.mDecisionNodeList.contains(node);
    }

    @Override
    public int getNumberOfDecisionNodes() {
        return this.mDecisionNodeList.size();
    }

    @Override
    public boolean hasNode(ICFGNode node) {
        if(node instanceof ICFGDecisionNode) {
            return(this.hasDecisionNode((ICFGDecisionNode)node));
        }
        if(node instanceof ICFGBasicBlockNode) {
            return(this.hasBasicBlockNode((ICFGBasicBlockNode)node));
        }
        return false;
    }

    @Override
    public int getNumberOfNodes() {
        return this.mCFGBasicBlockNodeList.size() + this.mDecisionNodeList.size();
    }

    @Override
    public Set<ICFGDecisionNode> getDecisionNodeSet() {
        return this.mDecisionNodeList;
    }

    @Override
    public Set<ICFGBasicBlockNode> getBasicBlockNodeSet() {
        return this.mCFGBasicBlockNodeList;
    }

    @Override
    public String getId() {
        return this.mId;
    }

    @Override
    public Name addVariable(Name var) {
        if(this.hasVariable(var)) {
            return null;
        }
        this.mVariables.add(var);
        //var.setProgram(this);
        return var;
    }

    @Override
    public Set<ICFGNode> getNodeSet() {
        Set<ICFGNode> nodeSet = new HashSet<ICFGNode>();
        for(ICFGNode n : this.mCFGBasicBlockNodeList) {
            nodeSet.add(n);
        }
        for(ICFGNode n : this.mDecisionNodeList) {
            nodeSet.add(n);
        }
        return nodeSet;
    }

    @Override
    public Set<Name> getVariables() {
        return this.mVariables;
    }

    @Override
    public boolean hasVariable(Name var) {
        return this.mVariables.contains(var);
    }

    //  NFN - not focusing now

//    @Override
//    public void deleteCFGNode(ICFGNode node) {
//
//    }

//    @Override
//    public ICFEdge addEdge(ICFEdge edge) {
//        return null;
//    }
//
//    @Override
//    public ICFEdge deleteEdge(ICFEdge edge) {
//        return null;
//    }
//

//
//    @Override
//    public Set<ICFEdge> getEdgeSet() {
//        return null;
//    }
//
//    @Override
//    public boolean hasEdge(ICFEdge edge) {
//        return false;
//    }
//
//    @Override
//    public int getNumberOfEdges() {
//        return 0;
//    }
}
