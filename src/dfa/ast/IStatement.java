package ast;

import program.IProgram;

public interface IStatement {
    public Name getLHS();
    public Expression getRHS();
    public IProgram getProgram();
}
