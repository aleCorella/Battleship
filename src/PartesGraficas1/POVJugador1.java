package PartesGraficas1;

import Datos.Listas;
import PartesGraficas2.Disparar2;
import PartesGraficas2.POVJugador2;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class POVJugador1 extends javax.swing.JFrame {

    private List<JButton> botones;
    Listas l = new Listas();

    public POVJugador1() {

        initComponents();

        botones = new ArrayList<>();
        BTdisparo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioJuego1 = new javax.swing.JButton();
        povJugador1Bienvenida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelPOVJugador1 = new javax.swing.JPanel();
        BTingresoB = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BTdisparo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ED = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        InicioJuego1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        InicioJuego1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/z1486486316-arrow-film-movie-play-player-start-video_81236.png"))); // NOI18N
        InicioJuego1.setText("INICIAR JUEGO");
        InicioJuego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioJuego1ActionPerformed(evt);
            }
        });

        povJugador1Bienvenida.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        povJugador1Bienvenida.setText("jugador 1");

        PanelPOVJugador1.setLayout(new java.awt.GridLayout(15, 15));
        jScrollPane1.setViewportView(PanelPOVJugador1);

        BTingresoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/zCargoShip_Black_icon-icons.com_54882.png"))); // NOI18N
        BTingresoB.setText("Ingresar Barco");
        BTingresoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTingresoBActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/zsearch_find_search_locate_9603.png"))); // NOI18N
        jButton3.setText("Buscar Oponente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BTdisparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/zweapon_war_missile_torpedo_explosive_icon_219284.png"))); // NOI18N
        BTdisparo.setText("Disparar");
        BTdisparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdisparoActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PartesGraficas1/z1491313935-pause_82989.png"))); // NOI18N
        jButton4.setText("Pausa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        jLabel1.setText("Barcos propios destruidos:");

        PD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        jLabel3.setText("Barcos enemigos destruidos:");

        ED.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(povJugador1Bienvenida)
                        .addContainerGap(1120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton3)
                        .addGap(83, 83, 83)
                        .addComponent(InicioJuego1)
                        .addGap(111, 111, 111)
                        .addComponent(BTingresoB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTdisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ED, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(povJugador1Bienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InicioJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTingresoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTdisparo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(PD, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ED, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void cargarBoton() {
        PanelPOVJugador1.removeAll();
        botones.clear();

        int[][] tablero = new int[15][15];
        int count = 0;
        
        int ask = JOptionPane.YES_NO_OPTION;
        for (int row = 0; row < tablero.length; row++) {
            for (int col = 0; col < tablero[row].length; col++) {
                JButton boton = new JButton("f" + row + "c" + col);
                PanelPOVJugador1.add(boton);
                botones.add(boton);
                PanelPOVJugador1.updateUI();

                for (int k = 0; k < l.listaPosicion.size(); k++) {
                    int IngresoCol = l.listaPosicion.get(k).getCol();
                    int IngresoFila = l.listaPosicion.get(k).getFil();

                    //saber si esta vacio o no y agregar 
                    if (boton.getText().equals("f" + IngresoFila + "c" + IngresoCol)) {
                        count++;

                        if (l.listaPosicion.get(k).isDañado()) {
                            boton.setBackground(Color.red);
                            int BarcosJ2N=l.ContBarcosJ2.size();
                            int BarcosJ1N = l.ContBarcosJ1.size();
                            PD.setText(String.valueOf(BarcosJ1N));
                            ED.setText(String.valueOf(BarcosJ2N));

                            int barcosN = l.ContBarcosJ1.size();
                            int barcoP = l.ContadorJ1.size();
                            
                            if (barcosN == barcoP) {

//                                HACER QUE SE QUITE LA SEGUNDA VENTANA
                                Disparar2 D2 = new Disparar2();
                                POVJugador2 POV2 = new POVJugador2();
                                dispose();
                                
                                JOptionPane.showMessageDialog(null, "Game Over");

                                int decision = JOptionPane.showConfirmDialog(null, "Quieres jugar denuevo?", "Juego", ask);
                                if (decision == 0) {

                                    JOptionPane.showMessageDialog(null, "Perfecto! Buena suerte");

                                    Menú abrirM = new Menú();
                                    dispose();

                                    abrirM.setVisible(true);
                                    l.list.clear();
                                    l.listaPosicion.clear();
                                    l.listaPosJ2.clear();
                                    l.ContBarcosJ1.clear();
                                    l.ContBarcosJ2.clear();
                                    l.ContadorJ1.clear();
                                    l.ContadorJ2.clear();
                                }
                                if (decision == 1) {

                                    JOptionPane.showMessageDialog(null, "Perfecto,gracias por jugar!");
                                    System.exit(0);

                                }
                            }
                        } else {
                            boton.setBackground(Color.green);
                        }
                        boton.setText("Barco" + count);
                        PanelPOVJugador1.updateUI();
                    }

                }

            }

        }
        int TamañoCont = l.ContadorJ1.size();
        if (TamañoCont < 11 || TamañoCont > 4) {
            BTdisparo.setVisible(true);
        }
    }
    private void InicioJuego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioJuego1ActionPerformed
        //Creo Matriz y botones

        cargarBoton();

    }//GEN-LAST:event_InicioJuego1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BusquedaOponente AbrirBusqueda = new BusquedaOponente();

        dispose();
        AbrirBusqueda.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Pausa1 abrirPausa = new Pausa1();
        dispose();
        abrirPausa.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BTdisparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTdisparoActionPerformed
        Disparar abrirDisparo = new Disparar();
        this.setVisible(false);
        abrirDisparo.setVisible(true);
    }//GEN-LAST:event_BTdisparoActionPerformed

    private void BTingresoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTingresoBActionPerformed
        ingresoBarco abrirIngresB = new ingresoBarco();
        dispose();
        abrirIngresB.setVisible(true);
    }//GEN-LAST:event_BTingresoBActionPerformed

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
            java.util.logging.Logger.getLogger(POVJugador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POVJugador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POVJugador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POVJugador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POVJugador1().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTdisparo;
    private javax.swing.JButton BTingresoB;
    private javax.swing.JLabel ED;
    private javax.swing.JButton InicioJuego1;
    private javax.swing.JLabel PD;
    private javax.swing.JPanel PanelPOVJugador1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel povJugador1Bienvenida;
    // End of variables declaration//GEN-END:variables

    private BusquedaOponente BusquedaOponente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void dispose(Disparar2 D2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
