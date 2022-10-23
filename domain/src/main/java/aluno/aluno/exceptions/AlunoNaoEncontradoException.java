package aluno.aluno.exceptions;

import aluno.aluno.CPF;

public class AlunoNaoEncontradoException extends RuntimeException{

    private static final long seriaVersionUID = 1L;


    public AlunoNaoEncontradoException (CPF cpf){

        super("Aluno nao encontrado com CPF:" + cpf.getNumero());

    }
}
