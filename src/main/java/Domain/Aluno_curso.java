package Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Aluno_curso {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToMany
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToMany
    @JoinColumn(name = "curso_id")
    private Curso curso;

}
