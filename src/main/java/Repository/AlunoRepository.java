package Repository;

import Domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, String> {

}
