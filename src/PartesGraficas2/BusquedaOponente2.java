/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PartesGraficas2;


import PartesGraficas2.POVJugador2;
import Datos.Listas;

/**
 *
 * 
 */
public class BusquedaOponente2 extends javax.swing.JFrame {
    
    public Listas l = new Listas();
    
    /**
     * Creates new form BusquedaOponente
     */
    public BusquedaOponente2() {
        initComponents();
        
        MensajeSeEncontróOP.setVisible(false);
        tuopes.setVisible(false);
        mostrarop2.setVisible(false);
        SiguienteBusquedaOP.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MensajeSeEncontróOP = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tuopes = new javax.swing.JLabel();
        mostrarop2 = new javax.swing.JLabel();
        SiguienteBusquedaOP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MensajeSeEncontróOP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/zsearch_find_search_locate_9603.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tuopes.setText("Tu oponente es:");

        mostrarop2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SiguienteBusquedaOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/znext_icon-icons.com_64984.png"))); // NOI18N
        SiguienteBusquedaOP.setText("Siguiente");
        SiguienteBusquedaOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteBusquedaOPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tuopes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mostrarop2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MensajeSeEncontróOP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SiguienteBusquedaOP)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(MensajeSeEncontróOP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tuopes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrarop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(64, 64, 64)
                .addComponent(SiguienteBusquedaOP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MensajeSeEncontróOP.setVisible(true);
        tuopes.setVisible(true);
        mostrarop2.setVisible(true);
        SiguienteBusquedaOP.setVisible(true);
        MensajeSeEncontróOP.setText("Oponente encontrado!");
        
       
        if(l.list!=null && l.list.size()>0){
          mostrarop2.setText(" "+l.ObtenerNom2());
            System.out.println(mostrarop2);
        }     
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SiguienteBusquedaOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteBusquedaOPActionPerformed

     POVJugador2 AbrirPOVJugador2= new POVJugador2();
     dispose();
     AbrirPOVJugador2.setVisible(true);
    
    }//GEN-LAST:event_SiguienteBusquedaOPActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaOponente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaOponente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaOponente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaOponente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaOponente2().setVisible(true);
            }
        });
    }
    
    String nombreJugador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MensajeSeEncontróOP;
    private javax.swing.JButton SiguienteBusquedaOP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mostrarop2;
    private javax.swing.JLabel tuopes;
    // End of variables declaration//GEN-END:variables
}
