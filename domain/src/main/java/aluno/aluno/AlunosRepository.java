package aluno.aluno;

import java.util.List;

public interface AlunosRepository {

    void matricular (Aluno aluno); // save

    Aluno buscarPorCPF (CPF cpf);

    List<Aluno> listarTodosALunosMatriculados ();


}
