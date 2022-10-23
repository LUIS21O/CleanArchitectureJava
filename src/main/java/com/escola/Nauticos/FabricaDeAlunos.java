package com.escola.Nauticos;

public class FabricaDeAlunos {

    private Aluno aluno;

    public FabricaDeAlunos comNomeCPFEmail (String nome, String cpf, String email){
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAlunos comTelefone (String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;

    }


    public Aluno criar () {
        System.out.println("Aluno criado");
        return  this.aluno;
    }

    public static void main(String[] args) {


        FabricaDeAlunos fabricaDeAlunos = new FabricaDeAlunos();
        Aluno aluno1 = fabricaDeAlunos.comNomeCPFEmail("Luis", "185.656.256-55","luis@email.com")
                .comTelefone("25", "988659865")
                .criar();

    }
}
