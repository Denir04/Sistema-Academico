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
        JOptionPane.showMessageDialog(null,"Aluno(a) cadastrado(a) com sucesso");
    }
    
    public void cadastrar(Professor prof){
        listaProfs.add(prof);
        JOptionPane.showMessageDialog(null,"Professor(a) cadastrado(a) com sucesso");
    }
    
    public void excluir(Aluno alu){
        int i;
        for(i=0;i<listaAlunos.size();i++){
            if((alu.getCodigo()).equals(listaAlunos.get(i).getCodigo())){
                listaAlunos.remove(i);
                JOptionPane.showMessageDialog(null,"Aluno(a) removido(a) com sucesso");
            }
        }
        if(i==listaAlunos.size()) JOptionPane.showMessageDialog(null,"Aluno(a) não encontrado(a) no sistema");
    }
    public void excluir(Professor prof){
        int i;
        for(i=0;i<listaProfs.size();i++){
            if((prof.getCodigo()).equals(listaProfs.get(i).getCodigo())){
                listaProfs.remove(i);
                JOptionPane.showMessageDialog(null,"Professor(a) removido(a) com sucesso");
            }
        }
        if(i==listaProfs.size()) JOptionPane.showMessageDialog(null,"Professor(a) não encontrado(a) no sistesma");
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
