/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Lorraine
 */
public class Interface extends javax.swing.JFrame {

    private int returnVal;
    private int aux;
    private File file = null;
    private Grafo g;
    
    public Interface() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectArq = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        buscaArquivo = new javax.swing.JButton();
        mAdijacencia = new javax.swing.JButton();
        mDiagonal = new javax.swing.JButton();
        mIncidencia = new javax.swing.JButton();
        mLaplaciana = new javax.swing.JButton();
        grauV = new javax.swing.JButton();
        adjacenciaV = new javax.swing.JButton();
        euleriano = new javax.swing.JButton();
        jTextFieldGrau = new javax.swing.JTextField();
        jTextFieldAdijacencia = new javax.swing.JTextField();
        jTextFieldEuleriano = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        titulo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Trabalho - Aula 2 ");

        buscaArquivo.setText("Buscar Arquivo");
        buscaArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaArquivoActionPerformed(evt);
            }
        });

        mAdijacencia.setText("Matriz de adjacência");
        mAdijacencia.setEnabled(false);
        mAdijacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAdijacenciaActionPerformed(evt);
            }
        });

        mDiagonal.setText("Matriz diagonál");
        mDiagonal.setEnabled(false);
        mDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDiagonalActionPerformed(evt);
            }
        });

        mIncidencia.setText("Matriz de incidência");
        mIncidencia.setEnabled(false);
        mIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIncidenciaActionPerformed(evt);
            }
        });

        mLaplaciana.setText("Matriz laplaciana");
        mLaplaciana.setEnabled(false);
        mLaplaciana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLaplacianaActionPerformed(evt);
            }
        });

        grauV.setText("Grau de vértice");
        grauV.setEnabled(false);
        grauV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauVActionPerformed(evt);
            }
        });

        adjacenciaV.setText("Adjacências de vértice");
        adjacenciaV.setEnabled(false);
        adjacenciaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjacenciaVActionPerformed(evt);
            }
        });

        euleriano.setText("Caminho/circuito euleriano");
        euleriano.setEnabled(false);
        euleriano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eulerianoActionPerformed(evt);
            }
        });

        jTextFieldGrau.setEditable(false);
        jTextFieldGrau.setToolTipText("Informe o vértice aqui");
        jTextFieldGrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGrauActionPerformed(evt);
            }
        });

        jTextFieldAdijacencia.setEditable(false);
        jTextFieldAdijacencia.setToolTipText("Informe o vétice aqui");
        jTextFieldAdijacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdijacenciaActionPerformed(evt);
            }
        });

        jTextFieldEuleriano.setEditable(false);

        titulo.setColumns(20);
        titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo.setRows(5);
        jScrollPane2.setViewportView(titulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(euleriano, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(adjacenciaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grauV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGrau, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEuleriano, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAdijacencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscaArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mAdijacencia, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mLaplaciana, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mDiagonal, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grauV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldGrau))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adjacenciaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAdijacencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(euleriano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldEuleriano)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mAdijacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mLaplaciana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mDiagonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAdijacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAdijacenciaActionPerformed
        titulo.setText("");
        titulo.append("Matriz de Adjacencia");
        texto.setText("");
        texto.append(g.printAdijacencia());
    }//GEN-LAST:event_mAdijacenciaActionPerformed

    private void mIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIncidenciaActionPerformed
        titulo.setText("");
        titulo.append("Matriz de Incidência");
        texto.setText("");
        texto.append(g.printIncidencia());
    }//GEN-LAST:event_mIncidenciaActionPerformed

    private void jTextFieldGrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGrauActionPerformed
       
    }//GEN-LAST:event_jTextFieldGrauActionPerformed

    private void buscaArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaArquivoActionPerformed
        g = new Grafo();
        returnVal = selectArq.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = selectArq.getSelectedFile();
            try {
                titulo.append("Arquivo");
                texto.read( new FileReader( file.getAbsolutePath() ), null );
                g.lerArquivo(file);
                mAdijacencia.setEnabled(true);
                mDiagonal.setEnabled(true);
                mIncidencia.setEnabled(true);
                mLaplaciana.setEnabled(true);
                grauV.setEnabled(true);
                euleriano.setEnabled(true);
                adjacenciaV.setEnabled(true);
                jTextFieldAdijacencia.setEditable(true);
                jTextFieldEuleriano.setEditable(true);
                jTextFieldGrau.setEditable(true);
            } catch (IOException ex) {
              System.err.println("Erro de Acesso");
              
              
            }
        } else {
            System.err.println("Acesso cancelado!");
        }
    }//GEN-LAST:event_buscaArquivoActionPerformed

    private void mDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDiagonalActionPerformed
        titulo.setText("");
        titulo.append("Matriz Diagonal");
        texto.setText("");
        texto.append(g.printDiagonal());
    }//GEN-LAST:event_mDiagonalActionPerformed

    private void mLaplacianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLaplacianaActionPerformed
        titulo.setText("");
        titulo.append("Matriz Laplaciana");
        texto.setText("");
        texto.append(g.printLaplaciana());
    }//GEN-LAST:event_mLaplacianaActionPerformed

    private void jTextFieldAdijacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdijacenciaActionPerformed
        
    }//GEN-LAST:event_jTextFieldAdijacenciaActionPerformed

    private void adjacenciaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjacenciaVActionPerformed
        try{
            texto.setText("");
            titulo.setText("");
            aux = Integer.parseInt(jTextFieldAdijacencia.getText());
            jTextFieldAdijacencia.setText(g.printAdjacenciaV(aux));
        }catch(NumberFormatException e){
            jTextFieldAdijacencia.setText("Imforme apenas numeros");
        }
    }//GEN-LAST:event_adjacenciaVActionPerformed

    private void grauVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauVActionPerformed
        try{
            texto.setText("");
            titulo.setText("");
            aux = Integer.parseInt(jTextFieldGrau.getText());
            jTextFieldGrau.setText(g.printGrauV(aux));
        }catch (NumberFormatException e){
            jTextFieldGrau.setText("Imforme apenas numeros.");
        }
    }//GEN-LAST:event_grauVActionPerformed

    private void eulerianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eulerianoActionPerformed
        texto.setText("");
        titulo.setText("");
        jTextFieldEuleriano.setText(g.euleriano());
        
    }//GEN-LAST:event_eulerianoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adjacenciaV;
    private javax.swing.JButton buscaArquivo;
    private javax.swing.JButton euleriano;
    private javax.swing.JButton grauV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAdijacencia;
    private javax.swing.JTextField jTextFieldEuleriano;
    private javax.swing.JTextField jTextFieldGrau;
    private javax.swing.JButton mAdijacencia;
    private javax.swing.JButton mDiagonal;
    private javax.swing.JButton mIncidencia;
    private javax.swing.JButton mLaplaciana;
    private javax.swing.JFileChooser selectArq;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextArea titulo;
    // End of variables declaration//GEN-END:variables
}
