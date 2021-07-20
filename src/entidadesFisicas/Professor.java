package entidadesFisicas;
public class Professor extends Pessoa{
    private String cursos;
    private String disciplinas;

    public Professor(String codigo, String nome, String sexo, String endereco, String cursos, String disciplinas) {
        super(codigo, nome, sexo, endereco);
        this.cursos = cursos;
        this.disciplinas = disciplinas;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

   
    
    
}
