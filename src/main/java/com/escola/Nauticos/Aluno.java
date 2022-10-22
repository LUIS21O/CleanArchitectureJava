package com.escola.Nauticos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    private CPF cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefoneList = new ArrayList<>();

    public void adicionarTelefone (String ddd, String numero) {

        this.telefoneList.add(new Telefone(ddd, numero));

    }
}
