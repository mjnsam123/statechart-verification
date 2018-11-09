package cfg;

import java.util.Set;

import program.IProgram;
import ast.Environment;
import java.util.Queue;
import ast.Expression;
import java.util.List;

public interface ICFG extends IProgram {
	public ICFGBasicBlockNode getStartNode();								//
	public ICFGBasicBlockNode addBasicBlockNode(ICFGBasicBlockNode node);	//
	public boolean hasBasicBlockNode(ICFGBasicBlockNode node);				//
	public int getNumberOfBasicBlockNodes();								//
	public ICFGDecisionNode addDecisionNode(ICFGDecisionNode node);			//
	public boolean hasDecisionNode(ICFGDecisionNode node);					//
	public int getNumberOfDecisionNodes();									//
	public boolean hasNode(ICFGNode node);									//
	public int getNumberOfNodes();											//
	public Set<ICFGNode> getNodeSet();										//
	public Set<ICFGDecisionNode> getDecisionNodeSet();                      //
	public Set<ICFGBasicBlockNode> getBasicBlockNodeSet();					//
	public String getId();													//

	//	NFN
//	public void deleteCFGNode(ICFGNode node);
	public ICFEdge addEdge(ICFEdge edge);
//	public ICFEdge deleteEdge(ICFEdge edge);
//	public boolean hasEdge(ICFEdge edge);
//	public Set<ICFEdge> getEdgeSet();
//	public int getNumberOfEdges();

}
