package ebms;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
public class connectionquery extends javax.swing.JFrame {
    Connection con;ResultSet rs;
    public connectionquery(ResultSet rs) {
        initComponents();
        this.rs=rs;this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        connsearch = new javax.swing.JLabel();
        connupdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70)));

        connsearch.setBackground(new java.awt.Color(51, 0, 102));
        connsearch.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        connsearch.setForeground(new java.awt.Color(51, 0, 102));
        connsearch.setText("Seacrh Connection Types");
        connsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 2, true));
        connsearch.setIconTextGap(8);
        connsearch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                connsearchMouseMoved(evt);
            }
        });
        connsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connsearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                connsearchMouseExited(evt);
            }
        });

        connupdate.setBackground(new java.awt.Color(51, 0, 102));
        connupdate.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        connupdate.setForeground(new java.awt.Color(51, 0, 102));
        connupdate.setText("Update Connectin Type");
        connupdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 2, true));
        connupdate.setIconTextGap(8);
        connupdate.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                connupdateMouseMoved(evt);
            }
        });
        connupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connupdateMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                connupdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(connupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(connsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(connupdate)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connsearchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connsearchMouseMoved
        connsearch.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_connsearchMouseMoved

    private void connsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connsearchMouseClicked
        try {
            this.dispose();
            new connections_search(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(connectionquery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_connsearchMouseClicked

    private void connsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connsearchMouseExited
        connsearch.setBorder(BorderFactory.createLineBorder(Color.white,2));
    }//GEN-LAST:event_connsearchMouseExited

    private void connupdateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connupdateMouseMoved
        connupdate.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_connupdateMouseMoved

    private void connupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connupdateMouseClicked
        try {
            this.dispose();
            new connection_update(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(connectionquery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_connupdateMouseClicked

    private void connupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connupdateMouseExited
         connupdate.setBorder(BorderFactory.createLineBorder(Color.white,2));
    }//GEN-LAST:event_connupdateMouseExited
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connsearch;
    private javax.swing.JLabel connupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
