import aluno.aluno.Aluno;
import aluno.aluno.AlunosRepository;
import aluno.aluno.CPF;
import aluno.aluno.exceptions.AlunoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosMemoria  implements AlunosRepository {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {

    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {

        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
    }

    @Override
    public List<Aluno> listarTodosALunosMatriculados() {
        return this.matriculados;
    }
}
