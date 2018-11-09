package cfg;


import java.util.List;

import ast.Statement;

public interface ICFGNode {

	public boolean isIncomingEdge(ICFGNode node);		//
	public boolean isOutgoingEdge(ICFGNode node);
	public boolean isCFSuccessor(ICFGNode node);
	public ICFG getCFG();								//
	public void setCFG(ICFG graph);						//	Of which CFG, this node is part of ?
	public List<ICFEdge> getIncomingEdgeList();
	public List<ICFEdge> getOutgoingEdgeList();
	public List<ICFGNode> getCFPredecessorNodeList();
	public List<ICFGNode> getCFSuccessorNodeList();
	public ICFEdge addIncomingEdge(ICFGNode node);
	public ICFEdge deleteIncomingEdge(ICFGNode node);
	public ICFEdge addOutgoingEdge(ICFGNode node);
	public ICFEdge deleteOutgoingEdge(ICFGNode node);
	public String getId();
	
}
