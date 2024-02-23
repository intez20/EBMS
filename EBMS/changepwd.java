package ebms;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class changepwd extends javax.swing.JFrame {
ResultSet rs ;
Connection con ;
PreparedStatement stmt ;
String s;
byte b;
Object obj;
    public changepwd(String s,Object obj) throws SQLException, ClassNotFoundException {
        initComponents();
        con =connDb.conLink();
        this.s=s;
        this.getRootPane().setDefaultButton(update_bt);
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        this.obj=obj;
        setpwd_lb.setText("");
        userid_tf.setText(s);
        this.setLocationRelativeTo(null); 
        update_bt.setEnabled(false);
        label.setText(""); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userid_tf = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        exit_bt = new javax.swing.JButton();
        oldpwd_tf = new javax.swing.JPasswordField();
        newpwd_tf = new javax.swing.JPasswordField();
        confpwd_tf = new javax.swing.JPasswordField();
        setpwd_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(25, 30, 70));

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 30, 70));
        jLabel1.setText("USER ID");

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 30, 70));
        jLabel2.setText("OLD PASSWORD");

        jLabel3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 30, 70));
        jLabel3.setText("NEW PASSWORD");

        jLabel4.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 30, 70));
        jLabel4.setText("CONFIRM PASSWORD");

        userid_tf.setEditable(false);
        userid_tf.setBackground(new java.awt.Color(255, 255, 255));
        userid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N

        update_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        update_bt.setForeground(new java.awt.Color(25, 30, 70));
        update_bt.setText("Change");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 0, 0));
        label.setText("jLabel5");

        exit_bt.setBackground(new java.awt.Color(255, 255, 255));
        exit_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        exit_bt.setForeground(new java.awt.Color(15, 30, 70));
        exit_bt.setText("Back");
        exit_bt.setBorder(null);
        exit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btActionPerformed(evt);
            }
        });

        oldpwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                oldpwd_tfFocusLost(evt);
            }
        });

        newpwd_tf.setEditable(false);
        newpwd_tf.setBackground(new java.awt.Color(255, 255, 255));
        newpwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newpwd_tfFocusGained(evt);
            }
        });
        newpwd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newpwd_tfKeyTyped(evt);
            }
        });

        confpwd_tf.setEditable(false);
        confpwd_tf.setBackground(new java.awt.Color(255, 255, 255));
        confpwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confpwd_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confpwd_tfFocusLost(evt);
            }
        });

        setpwd_lb.setBackground(new java.awt.Color(255, 255, 255));
        setpwd_lb.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        setpwd_lb.setForeground(new java.awt.Color(255, 0, 0));
        setpwd_lb.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oldpwd_tf)
                    .addComponent(userid_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confpwd_tf)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(newpwd_tf)
                    .addComponent(setpwd_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update_bt)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldpwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newpwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(setpwd_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confpwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(label)
                .addGap(18, 18, 18)
                .addComponent(update_bt)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {confpwd_tf, jLabel1, jLabel2, jLabel3, jLabel4, newpwd_tf, oldpwd_tf, update_bt, userid_tf});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed
    try {
        stmt=con.prepareStatement("update login set login_user_password=? where upper(login_user_id)=?");
        stmt.setString(1,newpwd_tf.getText());
        stmt.setString(2,userid_tf.getText().toUpperCase());
        if(newpwd_tf.getText().length()>5){
        stmt.executeUpdate();
        backdata.back("select * from login","login.xls");
        JOptionPane.showMessageDialog(this,"Password Change Successfully!");
        newpwd_tf.setText("");
        oldpwd_tf.setText("");
        confpwd_tf.setText("");
        exit_bt.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this,"Password Must Be greater than 6 character!");
            newpwd_tf.requestFocus();
        }
    } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
        Logger.getLogger(changepwd.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_update_btActionPerformed

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        close();
        this.dispose();
        String str=obj.getClass().toString();
        if(str.equalsIgnoreCase("class ebms.pcontroller")){
            ((pcontroller)obj).setVisible(true);
            ((pcontroller)obj).setEnabled(true);}
        else if(str.equalsIgnoreCase("class ebms.bcontroller")){
            ((bcontroller)obj).setVisible(true);
            ((bcontroller)obj).setEnabled(true);}
        else if(str.equalsIgnoreCase("class ebms.mainwindow")){
            ((mainwindow)obj).setVisible(true);
            ((mainwindow)obj).setEnabled(true);}
        else{
            ((controller)obj).setVisible(true);
            ((controller)obj).setEnabled(true);}
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
    private void confpwd_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confpwd_tfFocusLost
        if (newpwd_tf.getText().equals(confpwd_tf.getText()))
            update_bt.setEnabled(true);
        else { 
            newpwd_tf.requestFocus();
            newpwd_tf.setText("");
            confpwd_tf.setText("");
            label.setText("Passwords did not match!");
            newpwd_tf.setBorder(BorderFactory.createLineBorder(Color.red,2));
            confpwd_tf.setBorder(BorderFactory.createLineBorder(Color.red,2));
        }
    }//GEN-LAST:event_confpwd_tfFocusLost

    private void confpwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confpwd_tfFocusGained
        confpwd_tf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setText("");
    }//GEN-LAST:event_confpwd_tfFocusGained

    private void newpwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpwd_tfFocusGained
        newpwd_tf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setpwd_lb.setText("");
    }//GEN-LAST:event_newpwd_tfFocusGained

    private void oldpwd_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldpwd_tfFocusLost
    try {
        stmt=con.prepareStatement("select login_user_password from login where upper(login_user_id)=?"); 
        stmt.setString(1,s.toUpperCase());
        rs=stmt.executeQuery();
        rs.next();
        if(rs.getString(1).equals(oldpwd_tf.getText())){
            newpwd_tf.setEditable(true);confpwd_tf.setEditable(true);newpwd_tf.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this,"Password Did not Match!");
            oldpwd_tf.setText("");oldpwd_tf.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(changepwd.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_oldpwd_tfFocusLost

    private void newpwd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpwd_tfKeyTyped
        if(newpwd_tf.getText().length()<=5){
            setpwd_lb.setForeground(Color.red);
            setpwd_lb.setText("Password Strength: Weak");
        }
        else if(newpwd_tf.getText().length()<=9){
            setpwd_lb.setText("Password Strength: Strong");
            setpwd_lb.setForeground(Color.GREEN);
        }
        else if(newpwd_tf.getText().length()>10){
            char ch=evt.getKeyChar();
            setpwd_lb.setForeground(Color.black);
            setpwd_lb.setText("Maximum 10 Digit allowed!");
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_newpwd_tfKeyTyped
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confpwd_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JPasswordField newpwd_tf;
    private javax.swing.JPasswordField oldpwd_tf;
    private javax.swing.JLabel setpwd_lb;
    private javax.swing.JButton update_bt;
    private javax.swing.JTextField userid_tf;
    // End of variables declaration//GEN-END:variables
}
