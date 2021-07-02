package player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import entidades.Musica.*;
import entidades.Autor.*;
/**
 *
 * @author ferna
 */
public class Player extends javax.swing.JFrame {
    int i =0;
    
    
        
    public Player() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeMusica = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnProxima = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblVolume = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnAumentaVolume = new javax.swing.JButton();
        btnDiminuiVolume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeMusica.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeMusica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomeMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeMusica.setText("Nome da música - Autor (genero)");
        lblNomeMusica.setToolTipText("");

        btnPlay.setText("Plause/Play");
        btnPlay.setToolTipText("");
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnProxima.setText("Próxima");
        btnProxima.setToolTipText("Próxima música");
        btnProxima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximaMouseClicked(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.setToolTipText("Voltar à música anterior");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        lblVolume.setText("Volume");

        lstGeneros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nome da playlist (gênero)", "Nome da playlist (gênero)", "Nome da playlist (gênero)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstGeneros);

        jLabel2.setText("Playlists");

        btnAumentaVolume.setText("+");
        btnAumentaVolume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAumentaVolumeMouseClicked(evt);
            }
        });

        btnDiminuiVolume.setText("-");
        btnDiminuiVolume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiminuiVolumeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblVolume)
                                                    .addComponent(jLabel2)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnterior)
                                        .addGap(92, 92, 92)
                                        .addComponent(btnPlay)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProxima))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnAumentaVolume)
                        .addGap(39, 39, 39)
                        .addComponent(btnDiminuiVolume)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblNomeMusica)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlay)
                    .addComponent(btnProxima)
                    .addComponent(btnAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAumentaVolume)
                    .addComponent(btnDiminuiVolume))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
       
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
       this.lblNomeMusica.setText("cuido");
       this.btnPlay.setText("pause");
       
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnAumentaVolumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAumentaVolumeMouseClicked
     this.lblVolume.setText(this.i);
     double vol = Double.par   
     
    }//GEN-LAST:event_btnAumentaVolumeMouseClicked

    private void btnDiminuiVolumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiminuiVolumeMouseClicked
      this.lblVolume.setText("");
    }//GEN-LAST:event_btnDiminuiVolumeMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
       
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void btnProximaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximaMouseClicked
      
    }//GEN-LAST:event_btnProximaMouseClicked

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
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAumentaVolume;
    private javax.swing.JButton btnDiminuiVolume;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnProxima;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeMusica;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JList<String> lstGeneros;
    // End of variables declaration//GEN-END:variables
}