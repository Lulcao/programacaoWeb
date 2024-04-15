package Controller;

import Domain.Aluno;
import Repository.AlunoRepository;
import Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private AlunoRepository AlunoRepository;
    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
      return AlunoRepository.save(aluno);
    }
    @GetMapping
    public List<Aluno> getAllAlunos (){
        return AlunoRepository.findAll();
    }
    @PutMapping
    public Aluno editarAluno(@PathVariable String id, @RequestBody Aluno aluno){
        Aluno novoAluno = AlunoRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Erro")
                );
        novoAluno.setNome(aluno.getNome());
        novoAluno.setMatricula(aluno.getMatricula());
        return AlunoRepository.save(novoAluno);
    }

    @DeleteMapping
    public void deleteAluno(@PathVariable String id){
        AlunoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAlunoPorCurso(@PathVariable String id){
        return alunoService.getAlunoComCursos(id)
                .map(ResponseEntity::ok)
                .orElseThrow(()->
                        new RuntimeException("Erro")
                        );
    }
}
