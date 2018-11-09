package ast;

import program.IProgram;

public class Statement implements IStatement{

    private Name mLHS;
    private Expression mRHS;
    private IProgram mProgram;

    public Statement(IProgram p, Name lhs, Expression rhs) {
        this.mProgram = p;
        this.mLHS = lhs;
        this.mRHS = rhs;
    }

    @Override
    public Name getLHS() {
        return this.mLHS;
    }

    @Override
    public Expression getRHS() {
        return this.mRHS;
    }

    @Override
    public IProgram getProgram() {
        return this.mProgram;
    }
}
