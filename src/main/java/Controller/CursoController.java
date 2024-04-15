package Controller;

import Domain.Curso;
import Repository.CursoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    private CursoRepository CursoRepository;
    @PostMapping
    public Curso cadastrarCurso(@RequestBody Curso curso){
        return CursoRepository.save(curso);
    }
    @GetMapping
    public List<Curso> getAllCursos (){
        return CursoRepository.findAll();
    }
    @PutMapping
    public Curso editarCurso(@PathVariable String id, @RequestBody Curso curso){
        Curso novoCurso = CursoRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Erro")
                );
        novoCurso.setNome(curso.getNome());
        novoCurso.setDescricao(curso.getDescricao());
        return CursoRepository.save(novoCurso);
    }
    @DeleteMapping
    public void deleteCurso(@PathVariable String id){
        CursoRepository.deleteById(id);
    }
}
