package Register;

public class Aluno {
    private String nomeCompleto, matricula, id;

    public Aluno(){
        super();
    }
    public Aluno(String nomeCompleto, String matricula)
    {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.id = id;
    }
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getId(){
        return id;
    }
}
