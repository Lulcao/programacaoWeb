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
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private String id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "curso")
    private Set<Aluno_curso> alunos;
}
