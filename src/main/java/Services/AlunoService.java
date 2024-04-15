package Services;

import Domain.Aluno;
import Repository.AlunoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Optional<Aluno> getAlunoComCursos(String id){
        return alunoRepository.findById(id);
    }

}
