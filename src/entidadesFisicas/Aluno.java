package entidadesFisicas;
public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String codigo, String nome, String sexo, String endereco, String curso) {
        super(codigo, nome, sexo, endereco);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
