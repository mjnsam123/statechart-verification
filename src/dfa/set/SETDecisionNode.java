package set;

import ast.Expression;

public class SETDecisionNode implements ISETDecisionNode {
    private SETDecisionNode thenNode;
    private SETDecisionNode elseNode;
    private Expression mCondition;

    public SETDecisionNode()

    @Override
    public Expression getCondition() {
        return null;
    }

    @Override
    public void setCondition(Expression expr) {

    }
}
