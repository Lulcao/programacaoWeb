package Domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Aluno {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private String id;
    private String nome;
    private String matricula;

    @OneToMany(mappedBy = "aluno")
    private Set<Aluno_curso> cursos;
}
