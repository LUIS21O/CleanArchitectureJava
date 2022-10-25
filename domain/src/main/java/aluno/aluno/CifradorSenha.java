package aluno.aluno;

public interface CifradorSenha {

    String cifraSenha (String senha);

    boolean validarSenhaCifrada (String senhaCifrada, String senha);


}
