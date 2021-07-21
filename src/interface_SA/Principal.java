package interface_SA;
import sistema.SistemaAcademico;
import entidadesFisicas.*;
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame {
    SistemaAcademico sisa;
    public Principal() {
        initComponents();
        sisa = new SistemaAcademico();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_pessoa = new javax.swing.ButtonGroup();
        bg_funcao = new javax.swing.ButtonGroup();
        label_titulo = new javax.swing.JLabel();
        btn_OK = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rb_procurar = new javax.swing.JRadioButton();
        rb_alterar = new javax.swing.JRadioButton();
        rb_cadastrar = new javax.swing.JRadioButton();
        rb_excluir = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rb_aluno = new javax.swing.JRadioButton();
        rb_professor = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        label_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        label_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        label_sexo = new javax.swing.JLabel();
        txt_sexo = new javax.swing.JTextField();
        label_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        label_curso = new javax.swing.JLabel();
        txt_curso = new javax.swing.JTextField();
        label_disciplina = new javax.swing.JLabel();
        txt_disciplina = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_listar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fatec - Mogi das Cruzes");
        setResizable(false);

        label_titulo.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        label_titulo.setText("Sistema Acadêmico");

        btn_OK.setText("OK");
        btn_OK.setEnabled(false);
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bg_funcao.add(rb_procurar);
        rb_procurar.setText("Procurar");
        rb_procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_procurarActionPerformed(evt);
            }
        });

        bg_funcao.add(rb_alterar);
        rb_alterar.setText("Alterar");
        rb_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_alterarActionPerformed(evt);
            }
        });

        bg_funcao.add(rb_cadastrar);
        rb_cadastrar.setSelected(true);
        rb_cadastrar.setText("Cadastrar");
        rb_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_cadastrarActionPerformed(evt);
            }
        });

        bg_funcao.add(rb_excluir);
        rb_excluir.setText("Excluir");
        rb_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_cadastrar)
                    .addComponent(rb_procurar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_alterar)
                    .addComponent(rb_excluir))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_cadastrar)
                    .addComponent(rb_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_procurar)
                    .addComponent(rb_alterar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bg_pessoa.add(rb_aluno);
        rb_aluno.setText("Aluno");
        rb_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_alunoActionPerformed(evt);
            }
        });

        bg_pessoa.add(rb_professor);
        rb_professor.setText("Professor");
        rb_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_professorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_aluno)
                    .addComponent(rb_professor))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_aluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_professor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        label_codigo.setText("Código");

        txt_codigo.setEnabled(false);

        label_nome.setText("Nome");

        txt_nome.setEnabled(false);
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        label_sexo.setText("Sexo");

        txt_sexo.setEnabled(false);
        txt_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexoActionPerformed(evt);
            }
        });

        label_endereco.setText("Endereço");

        txt_endereco.setEnabled(false);
        txt_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_enderecoActionPerformed(evt);
            }
        });

        label_curso.setText("Curso");

        txt_curso.setEnabled(false);
        txt_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cursoActionPerformed(evt);
            }
        });

        label_disciplina.setText("Disciplina");

        txt_disciplina.setEnabled(false);
        txt_disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_disciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_codigo)
                    .addComponent(label_nome)
                    .addComponent(label_sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txt_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txt_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label_disciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(label_endereco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(label_curso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_endereco)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_curso)
                            .addComponent(txt_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_disciplina)
                            .addComponent(txt_disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_codigo)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nome)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_sexo)
                            .addComponent(txt_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btn_listar.setText("Listar");
        btn_listar.setEnabled(false);
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.setEnabled(false);
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_titulo)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_OK)
                    .addComponent(btn_listar)
                    .addComponent(btn_limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void turnAllTextFields(boolean bool){
        txt_codigo.setEnabled(bool);
        txt_nome.setEnabled(bool);
        txt_curso.setEnabled(bool);
        txt_endereco.setEnabled(bool);
        txt_sexo.setEnabled(bool);
        txt_disciplina.setEnabled(bool);
    }
    private void turnAllButtons(boolean bool){
        btn_OK.setEnabled(bool);
        btn_listar.setEnabled(bool);
        btn_limpar.setEnabled(bool);
    }
    private void rb_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_professorActionPerformed
        if(rb_cadastrar.isSelected()){
            turnAllTextFields(true);
            turnAllButtons(true);
        }
    }//GEN-LAST:event_rb_professorActionPerformed

    private void txt_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cursoActionPerformed

    private void txt_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_enderecoActionPerformed

    private void txt_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexoActionPerformed

    private void txt_disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_disciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_disciplinaActionPerformed

    private void rb_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_alterarActionPerformed

    private void rb_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_cadastrarActionPerformed
        if(rb_aluno.isSelected()){
            turnAllTextFields(true);
            txt_disciplina.setEnabled(false);
        }else if(rb_professor.isSelected()){
            turnAllTextFields(true);
        }
    }//GEN-LAST:event_rb_cadastrarActionPerformed

    private void rb_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_excluirActionPerformed
        if(rb_aluno.isSelected() || rb_professor.isSelected()){
            turnAllTextFields(false);
            txt_codigo.setEnabled(true);
        }
    }//GEN-LAST:event_rb_excluirActionPerformed

    private void rb_procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_procurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_procurarActionPerformed

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed

            if(rb_aluno.isSelected()){
                Aluno alu = new Aluno(txt_codigo.getText(),
                                      txt_nome.getText(),
                                      txt_sexo.getText(),
                                      txt_endereco.getText(),
                                      txt_curso.getText());
                if(rb_cadastrar.isSelected())sisa.cadastrar(alu);
                else if(rb_excluir.isSelected())sisa.excluir(alu);
            }else if(rb_professor.isSelected()){
                Professor prof = new Professor(txt_codigo.getText(),
                                      txt_nome.getText(),
                                      txt_sexo.getText(),
                                      txt_endereco.getText(),
                                      txt_curso.getText(),
                                      txt_disciplina.getText());
                if(rb_cadastrar.isSelected())sisa.cadastrar(prof);
                else if(rb_excluir.isSelected())sisa.excluir(prof);
            }
    }//GEN-LAST:event_btn_OKActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void rb_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_alunoActionPerformed
        if(rb_cadastrar.isSelected()){
            turnAllTextFields(true);
            txt_disciplina.setEnabled(false);
            txt_disciplina.setText(null);
            turnAllButtons(true);
        }else if(rb_excluir.isSelected()){
            turnAllTextFields(false);
            txt_codigo.setEnabled(true);
            txt_disciplina.setText(null);
            turnAllButtons(true);
        }
    }//GEN-LAST:event_rb_alunoActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        if(rb_aluno.isSelected()) sisa.listarAlunos();
        else if(rb_professor.isSelected()) sisa.listarProfessores();
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_curso.setText(null);
        txt_endereco.setText(null);
        txt_sexo.setText(null);
        txt_disciplina.setText(null);
    }//GEN-LAST:event_btn_limparActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_funcao;
    private javax.swing.ButtonGroup bg_pessoa;
    private javax.swing.JButton btn_OK;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_codigo;
    private javax.swing.JLabel label_curso;
    private javax.swing.JLabel label_disciplina;
    private javax.swing.JLabel label_endereco;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_sexo;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JRadioButton rb_alterar;
    private javax.swing.JRadioButton rb_aluno;
    private javax.swing.JRadioButton rb_cadastrar;
    private javax.swing.JRadioButton rb_excluir;
    private javax.swing.JRadioButton rb_procurar;
    private javax.swing.JRadioButton rb_professor;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_curso;
    private javax.swing.JTextField txt_disciplina;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_sexo;
    // End of variables declaration//GEN-END:variables
}
