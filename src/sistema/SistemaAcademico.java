package sistema;
import entidadesFisicas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class SistemaAcademico {
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfs;

    public SistemaAcademico(){
        this.listaAlunos = new ArrayList();
        this.listaProfs = new ArrayList();
    }

    public void cadastrar(Aluno alu){
        listaAlunos.add(alu);
        JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso");
    }
    
    public void cadastrar(Professor prof){
        listaProfs.add(prof);
        JOptionPane.showMessageDialog(null,"Professor cadastrado com sucesso");
    }
    
    public void excluir(Aluno alu){
        listaAlunos.remove(alu);
        JOptionPane.showMessageDialog(null,"Aluno removido com sucesso");
    }
   
    public void listarAlunos(){
        if(listaAlunos.isEmpty()) JOptionPane.showMessageDialog(null,"Não há nenhum aluno no sistema");
        for(Aluno alu : listaAlunos){
            String msg = "\nRA: "+alu.getCodigo();
            msg+="\nNome: "+alu.getNome();
            msg+="\nCurso: "+alu.getCurso();
            JOptionPane.showMessageDialog(null, msg,"Informações dos Alunos", 1);
        }
    }
    public void listarProfessores(){
        if(listaProfs.isEmpty()) JOptionPane.showMessageDialog(null,"Não há nenhum professor no sistema");
        for(Professor prof : listaProfs){
            String msg = "\nRA: "+prof.getCodigo();
            msg+="\nNome: "+prof.getNome();
            msg+="\nCursos: "+prof.getCursos();
            JOptionPane.showMessageDialog(null, msg,"Informações do Professor", 1);
        }
    }
}
