package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class connections extends javax.swing.JFrame {
    Connection con;
    int a;String s;
    PreparedStatement stmt;
    ResultSet rs,rs1;
    ImageIcon img,img1,img2;
    public connections(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.rs1=rs1;
        this.setLocationRelativeTo(null);
        conntype_tf.requestFocus();
        this.getRootPane().setDefaultButton(submit_bt);
        img=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt1.setIcon(img2);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt1.setToolTipText("Minimize");
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        stmt=con.prepareStatement("select aconnid from automatic");
        rs=stmt.executeQuery();
        rs.next();
        a=rs.getInt(1);
        a++;
        auto();
    }

    public void auto(){
        if(a<10)
            s="CD00"+a;
        else if(a<100)
            s="CD0"+a;
        else if(a<1000)
            s="CD"+a;
        else
            JOptionPane.showMessageDialog(this,"Connection Number Exceeds Its Limit");
        connid_tf.setText(s);
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit_bt = new javax.swing.JButton();
        connid_tf = new javax.swing.JTextField();
        conntype_tf = new javax.swing.JTextField();
        connfc_tf = new javax.swing.JTextField();
        connec_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        minimize_bt1 = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Connection Type");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Connection Id");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Energy Charges");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Fixed Charges");

        submit_bt.setBackground(new java.awt.Color(255, 255, 255));
        submit_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        submit_bt.setForeground(new java.awt.Color(51, 0, 102));
        submit_bt.setText("Submit");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        connid_tf.setEditable(false);
        connid_tf.setBackground(new java.awt.Color(255, 255, 255));
        connid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        connid_tf.setForeground(new java.awt.Color(51, 0, 102));

        conntype_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        conntype_tf.setForeground(new java.awt.Color(51, 0, 102));

        connfc_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        connfc_tf.setForeground(new java.awt.Color(51, 0, 102));
        connfc_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                connfc_tfKeyTyped(evt);
            }
        });

        connec_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        connec_tf.setForeground(new java.awt.Color(51, 0, 102));
        connec_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                connec_tfKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Connection Entry");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(conntype_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(connfc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(connec_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(connid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(connid_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conntype_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connfc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connec_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(15, 30, 70));

        minimize_bt1.setBackground(new java.awt.Color(255, 255, 255));
        minimize_bt1.setBorder(null);
        minimize_bt1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                minimize_bt1MouseMoved(evt);
            }
        });
        minimize_bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_bt1MouseExited(evt);
            }
        });
        minimize_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimize_bt1ActionPerformed(evt);
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
                .addComponent(minimize_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connfc_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_connfc_tfKeyTyped
         char ch=evt.getKeyChar();
       if(!((ch>=48 && ch<=57)||ch==8||ch==46)){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_connfc_tfKeyTyped

    private void connec_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_connec_tfKeyTyped
         char ch=evt.getKeyChar();
       if(!((ch>=48 && ch<=57)||ch==8||ch==46)){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_connec_tfKeyTyped

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        try {
            stmt=con.prepareStatement("insert into connections values(?,?,?,?)");
            stmt.setString(1,connid_tf.getText());
            stmt.setString(2,conntype_tf.getText());
            stmt.setString(3,connfc_tf.getText());
            stmt.setString(4,connec_tf.getText());
            if(!(conntype_tf.getText().length()==0)&&!(connfc_tf.getText().length()==0)&&!(connec_tf.getText().length()==0)){
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Inserted Successfully!");
            connid_tf.setText("");
            conntype_tf.setText("");
            conntype_tf.requestFocus();
            connfc_tf.setText("");
            connec_tf.setText("");
            stmt=con.prepareStatement("update automatic set aconnid=?");
            stmt.setInt(1,a);
            stmt.executeUpdate();
            a++;
            auto();
            backdata.back("select * from connections","connections.xls");
            backdata.back("select * from automatic", "autobackup.xls");
           }
            else{
                JOptionPane.showMessageDialog(this,"Some Fields Are Empty!");
                conntype_tf.requestFocus();
            }
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submit_btActionPerformed

    private void minimize_bt1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_bt1MouseMoved
        minimize_bt1.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_minimize_bt1MouseMoved

    private void minimize_bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_bt1MouseExited
        minimize_bt1.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimize_bt1MouseExited

    private void minimize_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_bt1ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_bt1ActionPerformed

    private void exit_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseMoved
        exit_bt.setBackground(new Color(220,0,0));
    }//GEN-LAST:event_exit_btMouseMoved

    private void exit_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseExited
        exit_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_exit_btMouseExited

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {close();
            this.dispose();
            new mainwindow(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField connec_tf;
    private javax.swing.JTextField connfc_tf;
    private javax.swing.JTextField connid_tf;
    private javax.swing.JTextField conntype_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minimize_bt1;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton submit_bt;
    // End of variables declaration//GEN-END:variables
}
