/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PartesGraficas2;

import Datos.Listas;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class BarcoDe3Casillas2 extends javax.swing.JFrame {

    /**
     * Creates new form BarcoDe3Casillas
     */
    public BarcoDe3Casillas2() {
        initComponents();
        VolverAMenú2Casillas.setVisible(false);

    }
    Listas l = new Listas();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtColumna1De3Casillas = new javax.swing.JTextField();
        txtFila1De3Casillas = new javax.swing.JTextField();
        txtColumna2De3Casillas = new javax.swing.JTextField();
        txtFila2De3Casillas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        VolverAMenú2Casillas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtColumna3De3Casillas = new javax.swing.JTextField();
        txtFila3De3Casillas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbMesagge = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la Columna 1:");

        jLabel2.setText("Ingrese la Fila 1:");

        jLabel3.setText("Ingrese la Columna 2:");

        jLabel4.setText("Ingrese la Fila 2:");

        txtColumna2De3Casillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumna2De3CasillasActionPerformed(evt);
            }
        });

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        VolverAMenú2Casillas.setText("Siguiente");
        VolverAMenú2Casillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAMenú2CasillasActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese la Columna 3:");

        jLabel6.setText("Ingrese la Fila 3:");

        txtColumna3De3Casillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumna3De3CasillasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 24)); // NOI18N
        jLabel7.setText("Barco de 3 Casillas");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbMesagge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtColumna1De3Casillas, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(txtColumna2De3Casillas))
                                    .addComponent(txtFila2De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFila1De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFila3De3Casillas, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(txtColumna3De3Casillas)))
                            .addComponent(lbMesagge, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VolverAMenú2Casillas)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFila1De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColumna1De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFila2De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtColumna2De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFila3De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtColumna3De3Casillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMesagge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(VolverAMenú2Casillas)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtColumna2De3CasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumna2De3CasillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumna2De3CasillasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int TamañoCont = l.ContadorJ2.size();
        int ColumnaIngresada1 = Integer.parseInt(txtColumna1De3Casillas.getText());
        int ColumnaIngresada2 = Integer.parseInt(txtColumna2De3Casillas.getText());
        int ColumnaIngresada3 = Integer.parseInt(txtColumna3De3Casillas.getText());

        int FilaIngresada1 = Integer.parseInt(txtFila1De3Casillas.getText());
        int FilaIngresada2 = Integer.parseInt(txtFila2De3Casillas.getText());
        int FilaIngresada3 = Integer.parseInt(txtFila3De3Casillas.getText());

        int RestCol1 = ColumnaIngresada1 - ColumnaIngresada2;
        int RestCol2 = ColumnaIngresada1 - ColumnaIngresada3;
        int RestFil1 = FilaIngresada1 - FilaIngresada2;
        int RestFil2 = FilaIngresada1 - FilaIngresada3;

        for (int i = 0; i < l.listaPosJ2.size(); i++) {

            int ColSave = l.listaPosJ2.get(i).getCol();
            int FilaSave = l.listaPosJ2.get(i).getFil();

            if (ColumnaIngresada1 == ColSave && FilaIngresada1 == FilaSave || ColumnaIngresada2 == ColSave && FilaIngresada2 == FilaSave || ColumnaIngresada3 == ColSave && FilaIngresada3 == FilaSave) {
                JOptionPane.showMessageDialog(null, "Ya hay un barco ahi,ingrese otra posicion");
                return;
            }
        }
        if (RestCol1 > 2 || RestCol1 < -2 || RestCol2 > 2 || RestCol2 < -2) {
            JOptionPane.showMessageDialog(null, "Verifique la casilla ingresadas,debe de estar cerca de las demas casillas");
            return;
        }
        if (RestFil1 > 2 || RestFil1 < -2 || RestFil2 > 2 || RestFil2 < -2) {
            JOptionPane.showMessageDialog(null, "Verifique la casilla ingresadas,debe de estar cerca de las demas casillas");
            return;
        }
        if (ColumnaIngresada1 == ColumnaIngresada2 && ColumnaIngresada1 == ColumnaIngresada3 && FilaIngresada1 == FilaIngresada2 && FilaIngresada1 == FilaIngresada3) {
            JOptionPane.showMessageDialog(null, "Error,verifique que las posiciones del barco,está colocado el barco en la misma casilla");
            return;

        }
        if (ColumnaIngresada1 != ColumnaIngresada2 && ColumnaIngresada2 != ColumnaIngresada3 && FilaIngresada1 != FilaIngresada2 && FilaIngresada2 != FilaIngresada3) {
            JOptionPane.showMessageDialog(null, "Error,verifique que las posiciones del barco está colocado de forma vertical o de forma horizontal");
            return;
        } else if (ColumnaIngresada1 == ColumnaIngresada2 && ColumnaIngresada2 == ColumnaIngresada3 && FilaIngresada1 != FilaIngresada2 && FilaIngresada2 != FilaIngresada3) {
            
            l.SumaCont2(cont);
            TamañoCont = l.ContadorJ2.size();
            cont++;
            if (TamañoCont > 10) {
                JOptionPane.showMessageDialog(null, "Has alcanzado el maximo de barcos");
                return;
            }
            l.añadirPosJ2(ColumnaIngresada1, FilaIngresada1, 3);
            l.añadirPosJ2(ColumnaIngresada2, FilaIngresada2, 3);
            l.añadirPosJ2(ColumnaIngresada3, FilaIngresada3, 3);
            VolverAMenú2Casillas.setVisible(true);
            lbMesagge.setText("Barco añadido!");
            
        } else if (ColumnaIngresada1 != ColumnaIngresada2 && ColumnaIngresada2 != ColumnaIngresada3 && FilaIngresada1 == FilaIngresada2 && FilaIngresada2 == FilaIngresada3) {
            l.SumaCont2(cont);
            TamañoCont = l.ContadorJ2.size();
            cont++;
            if (TamañoCont > 10) {
                JOptionPane.showMessageDialog(null, "Has alcanzado el maximo de barcos");
                return;
            }
            l.añadirPosJ2(ColumnaIngresada1, FilaIngresada1, 3);
            l.añadirPosJ2(ColumnaIngresada2, FilaIngresada2, 3);
            l.añadirPosJ2(ColumnaIngresada3, FilaIngresada3, 3);
            VolverAMenú2Casillas.setVisible(true);
            lbMesagge.setText("Barco añadido!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VolverAMenú2CasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAMenú2CasillasActionPerformed
        POVJugador2 volvermenú = new POVJugador2();
        dispose();
        volvermenú.setVisible(true);
    }//GEN-LAST:event_VolverAMenú2CasillasActionPerformed

    private void txtColumna3De3CasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumna3De3CasillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumna3De3CasillasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtColumna1De3Casillas.setText("");
        txtFila1De3Casillas.setText("");
        txtColumna2De3Casillas.setText("");
        txtFila2De3Casillas.setText("");
        txtColumna3De3Casillas.setText("");
        txtFila3De3Casillas.setText("");
        lbMesagge.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        POVJugador2 abrirMenu = new POVJugador2();
        dispose();
        abrirMenu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BarcoDe3Casillas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarcoDe3Casillas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarcoDe3Casillas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarcoDe3Casillas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarcoDe3Casillas2().setVisible(true);
            }
        });
    }
    int cont = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VolverAMenú2Casillas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbMesagge;
    private javax.swing.JTextField txtColumna1De3Casillas;
    private javax.swing.JTextField txtColumna2De3Casillas;
    private javax.swing.JTextField txtColumna3De3Casillas;
    private javax.swing.JTextField txtFila1De3Casillas;
    private javax.swing.JTextField txtFila2De3Casillas;
    private javax.swing.JTextField txtFila3De3Casillas;
    // End of variables declaration//GEN-END:variables
}
