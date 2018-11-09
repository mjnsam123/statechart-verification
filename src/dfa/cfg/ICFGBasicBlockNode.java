package cfg;

import ast.IStatement;
public interface ICFGBasicBlockNode extends ICFGNode {
	public IStatement getStatement();					//
	public void setStatement(IStatement stmt);			//
	public ICFEdge getOutgoingEdge();
	public ICFGNode getSuccessorNode();
	public ICFEdge setOutgoingEdge(ICFEdge edge);
}
