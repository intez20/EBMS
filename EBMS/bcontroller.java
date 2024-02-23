package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
public class bcontroller extends javax.swing.JFrame {
ResultSet rs;
Connection con;
PreparedStatement stmt;
String s;
ImageIcon img,img1,img2;    
    public bcontroller(ResultSet rs) throws SQLException, ClassNotFoundException {
        initComponents();
        this.rs=rs;
        con=connDb.conLink();
        s=rs.getString(1);
        this.getRootPane().setDefaultButton(bill_bt);
        login_lb.setText(rs.getString(1));
        name_lb.setText(rs.getString(6));
        mobile_lb.setText(rs.getString(7));
        mail_lb.setText(rs.getString(8));
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        img=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img2);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bill_bt = new javax.swing.JButton();
        changepwd_bt = new javax.swing.JButton();
        logout_bt = new javax.swing.JButton();
        pic1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        login_lb = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mail_lb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        role_lb = new javax.swing.JLabel();
        mobile_lb = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        name_lb = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        minimize_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(775, 483));

        bill_bt.setBackground(new java.awt.Color(255, 255, 255));
        bill_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        bill_bt.setForeground(new java.awt.Color(25, 30, 70));
        bill_bt.setText("Create Bill");
        bill_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_btActionPerformed(evt);
            }
        });

        changepwd_bt.setBackground(new java.awt.Color(255, 255, 255));
        changepwd_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        changepwd_bt.setForeground(new java.awt.Color(25, 30, 70));
        changepwd_bt.setText("Change Password");
        changepwd_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepwd_btActionPerformed(evt);
            }
        });

        logout_bt.setBackground(new java.awt.Color(255, 255, 255));
        logout_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        logout_bt.setForeground(new java.awt.Color(25, 30, 70));
        logout_bt.setText("Log Out");
        logout_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(15, 30, 70));

        login_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        login_lb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User  Details");

        mail_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        mail_lb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Login Id");

        role_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        role_lb.setForeground(new java.awt.Color(255, 255, 255));
        role_lb.setText("Bill Controller");

        mobile_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        mobile_lb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Name");

        name_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        name_lb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Role");

        jLabel15.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mobile Number");

        jLabel16.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email Id");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(login_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(role_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(mobile_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mail_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(137, 137, 137))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(15, 30, 70));
        jLabel10.setText("Bill Controller!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(changepwd_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bill_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bill_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(changepwd_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(15, 30, 70));

        minimize_bt.setBackground(new java.awt.Color(255, 255, 255));
        minimize_bt.setBorder(null);
        minimize_bt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                minimize_btMouseMoved(evt);
            }
        });
        minimize_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_btMouseExited(evt);
            }
        });
        minimize_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimize_btActionPerformed(evt);
            }
        });

        exit_bt.setBackground(new java.awt.Color(255, 255, 255));
        exit_bt.setBorder(null);
        exit_bt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exit_btMouseMoved(evt);
            }
        });
        exit_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_btMouseExited(evt);
            }
        });
        exit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bill_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_btActionPerformed
        try {if(con!=null)
            con.close();
            this.dispose();
            new bill_cycle(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(pcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bill_btActionPerformed

    private void changepwd_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepwd_btActionPerformed
        try {
            this.setEnabled(false);
            new changepwd(s,this).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(pcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changepwd_btActionPerformed

    private void logout_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btActionPerformed
        close();this.dispose();try {
            new login().setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(pcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logout_btActionPerformed

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        close();
        System.exit(0);
    }//GEN-LAST:event_exit_btActionPerformed
public void close(){
     try {   
        if(rs!=null)      
                rs.close();
        if(stmt!=null)
            stmt.close();
        if(con!=null)
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void minimize_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_btActionPerformed

    private void minimize_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseExited
        minimize_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimize_btMouseExited

    private void minimize_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseMoved
        minimize_bt.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_minimize_btMouseMoved

    private void exit_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseExited
        exit_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_exit_btMouseExited

    private void exit_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseMoved
        exit_bt.setBackground(new Color(220,0,0));
    }//GEN-LAST:event_exit_btMouseMoved
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill_bt;
    private javax.swing.JButton changepwd_bt;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login_lb;
    private javax.swing.JButton logout_bt;
    private javax.swing.JLabel mail_lb;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel mobile_lb;
    private javax.swing.JLabel name_lb;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel role_lb;
    // End of variables declaration//GEN-END:variables
}
