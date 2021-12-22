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
        boolean removed = false;
        for(int i=0;i<listaAlunos.size();i++){
            if((alu.getCodigo()).equals(listaAlunos.get(i).getCodigo())){
                listaAlunos.remove(i);
                removed=true;
                JOptionPane.showMessageDialog(null,"Aluno(a) removido(a) com sucesso");
            }
        }
        if(removed==false) JOptionPane.showMessageDialog(null,"Aluno(a) não encontrado(a) no sistema");
    }
    public void excluir(Professor prof){
        boolean removed = false;
        for(int i=0;i<listaProfs.size();i++){
            if((prof.getCodigo()).equals(listaProfs.get(i).getCodigo())){
                listaProfs.remove(i);
                removed=true;
                JOptionPane.showMessageDialog(null,"Professor(a) removido(a) com sucesso");
            }
        }
        if(removed==false) JOptionPane.showMessageDialog(null,"Professor(a) não encontrado(a) no sistema");
    } 
    public void procurar(Aluno alu){
        boolean found=false;
        for(Aluno alu2 : listaAlunos){
            if(alu.getCodigo().equals(alu2.getCodigo())){
                found=true;
                String msg = "\nRA: "+alu2.getCodigo();
                msg+="\nNome: "+alu2.getNome();
                msg+="\nCurso: "+alu2.getCurso();
                JOptionPane.showMessageDialog(null, msg,"Informações do Aluno", 1);
            }
        }
        if(found==false) JOptionPane.showMessageDialog(null,"Aluno(a) inexistente");
    }
    public void procurar(Professor prof){
        boolean found=false;
        for(Professor prof2 : listaProfs){
            if(prof.getCodigo().equals(prof2.getCodigo())){
                found=true;
                String msg = "\nRA: "+prof2.getCodigo();
                msg+="\nNome: "+prof2.getNome();
                msg+="\nCurso: "+prof2.getCursos();
                JOptionPane.showMessageDialog(null, msg,"Informações do Professor", 1);
            }
        }
        if(found==false) JOptionPane.showMessageDialog(null,"Professor(a) inexistente");
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
