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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class ForgotPassword extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ImageIcon img3,img1;
    ResultSet rs;
    String s1,s2;
    byte a=0,b=0;
    public ForgotPassword() throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.setLocationRelativeTo(null);
        setpwd_lb.setText("");confpwd_lb.setText("");
        resetpwd_bt.setDefaultCapable(true);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img3=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img3);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
    }
    public void auto(){
        try {
            a=0;
            b=(byte)(Math.random()*10);
            stmt=con.prepareStatement("select question from login order by dbms_random.value");
            rs=stmt.executeQuery();
            while(rs.next() && a<=5){
                if(s1.equalsIgnoreCase(rs.getString(1)))
                    a--;
                else
                quest_cmb.addItem(rs.getString(1));
                a++;
            }
            if(b<=5)
            quest_cmb.insertItemAt(s1,b);
            else
                quest_cmb.insertItemAt(s1,2);            
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userid_tf = new javax.swing.JTextField();
        confpwd_tf = new javax.swing.JTextField();
        pwd_tf = new javax.swing.JTextField();
        answer_tf = new javax.swing.JTextField();
        resetpwd_bt = new javax.swing.JButton();
        quest_cmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        setpwd_lb = new javax.swing.JLabel();
        confpwd_lb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(15, 30, 70));
        jLabel9.setText("Answer");

        jLabel10.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(15, 30, 70));
        jLabel10.setText("Question");

        userid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        userid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userid_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userid_tfFocusLost(evt);
            }
        });

        confpwd_tf.setEditable(false);
        confpwd_tf.setBackground(new java.awt.Color(255, 255, 255));
        confpwd_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        confpwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confpwd_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confpwd_tfFocusLost(evt);
            }
        });
        confpwd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confpwd_tfKeyTyped(evt);
            }
        });

        pwd_tf.setEditable(false);
        pwd_tf.setBackground(new java.awt.Color(255, 255, 255));
        pwd_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        pwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwd_tfFocusGained(evt);
            }
        });
        pwd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwd_tfKeyTyped(evt);
            }
        });

        answer_tf.setEditable(false);
        answer_tf.setBackground(new java.awt.Color(255, 255, 255));
        answer_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N

        resetpwd_bt.setBackground(new java.awt.Color(255, 255, 255));
        resetpwd_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        resetpwd_bt.setForeground(new java.awt.Color(15, 30, 70));
        resetpwd_bt.setText("Confirm");
        resetpwd_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        resetpwd_bt.setEnabled(false);
        resetpwd_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetpwd_btActionPerformed(evt);
            }
        });

        quest_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 30, 70));
        jLabel2.setText("User Id");

        jLabel7.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(15, 30, 70));
        jLabel7.setText("Confirm Password");

        jLabel8.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 30, 70));
        jLabel8.setText("New Password");

        jLabel3.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 30, 70));
        jLabel3.setText("Reset Password!");

        setpwd_lb.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        setpwd_lb.setForeground(new java.awt.Color(15, 30, 70));
        setpwd_lb.setText("j");

        confpwd_lb.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        confpwd_lb.setForeground(new java.awt.Color(15, 30, 70));
        confpwd_lb.setText("j");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answer_tf)
                            .addComponent(quest_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userid_tf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confpwd_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setpwd_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwd_tf)
                            .addComponent(confpwd_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(resetpwd_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quest_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(setpwd_lb)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confpwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(confpwd_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(resetpwd_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(15, 30, 70));

        exit_bt.setBackground(new java.awt.Color(255, 255, 255));
        exit_bt.setBorder(null);
        exit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btActionPerformed(evt);
            }
        });

        minimize_bt.setBackground(new java.awt.Color(255, 255, 255));
        minimize_bt.setBorder(null);
        minimize_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimize_btActionPerformed(evt);
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
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetpwd_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetpwd_btActionPerformed
        try {
            if(s1.equals(quest_cmb.getSelectedItem().toString()) && s2.toUpperCase().equals(answer_tf.getText().toUpperCase())){
            stmt=con.prepareStatement("update login set login_user_password=? where upper(login_user_id)=?");
            stmt.setString(2,userid_tf.getText().toUpperCase());
            stmt.setString(1,pwd_tf.getText());
            if(!(pwd_tf.getText().length()<=7)){
            stmt.executeUpdate();
            backdata.back("select * from login","login.xls");
            JOptionPane.showMessageDialog(this,"Password Updated Succesfully!");
            close();this.dispose();
            new login().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this,"Password length must be greater than 8!");
                pwd_tf.requestFocus();
            }
            }else{
                JOptionPane.showMessageDialog(this,"Invalid Attempt!");
                userid_tf.setText("");setpwd_lb.setText("");
                quest_cmb.removeAllItems();
                answer_tf.setText("");
                pwd_tf.setText("");
                confpwd_tf.setText("");
                userid_tf.requestFocus();
            }
        } catch (SQLException | ClassNotFoundException | IOException | WriteException | BiffException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resetpwd_btActionPerformed

    private void userid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userid_tfFocusLost
        try {
            stmt=con.prepareStatement("select question,answer,login_user_password from login where upper(login_user_id)=?");
            stmt.setString(1,userid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(!(rs.next())){
                userid_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
                JOptionPane.showMessageDialog(this,"Enter a valid Login Id!");
                userid_tf.requestFocus();
            }
            else{
                answer_tf.setEditable(true);
               s1=rs.getString(1);s2=rs.getString(2);confpwd_tf.setEditable(true);pwd_tf.setEditable(true);
               auto();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_userid_tfFocusLost

    private void userid_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userid_tfFocusGained
       userid_tf.setBorder(null);
       userid_tf.setToolTipText("");
       quest_cmb.removeAllItems();
    }//GEN-LAST:event_userid_tfFocusGained

    private void confpwd_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confpwd_tfFocusLost
        if(pwd_tf.getText().equals(confpwd_tf.getText())){
            resetpwd_bt.setEnabled(true);
        }
        else{
            pwd_tf.setText("");pwd_tf.requestFocus();confpwd_tf.setText("");
            confpwd_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
            confpwd_lb.setText("Password Did not Match!");
        }
    }//GEN-LAST:event_confpwd_tfFocusLost

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {close();
            this.dispose();
            new login().setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exit_btActionPerformed

    private void minimize_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_btActionPerformed

    private void confpwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confpwd_tfFocusGained
        confpwd_lb.setText("");
        confpwd_tf.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_confpwd_tfFocusGained

    private void confpwd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confpwd_tfKeyTyped
        char ch=evt.getKeyChar();
        if(ch==13)
            resetpwd_bt.setEnabled(true);
    }//GEN-LAST:event_confpwd_tfKeyTyped

    private void pwd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwd_tfKeyTyped
        setpwd_lb.setText("");
        if(pwd_tf.getText().length()<=5){
            setpwd_lb.setForeground(Color.red);
            setpwd_lb.setText("Password Strength: Weak");
        }
        else if(pwd_tf.getText().length()<=9){
            setpwd_lb.setText("Password Strength: Strong");
            setpwd_lb.setForeground(Color.GREEN);
        }
        else if(pwd_tf.getText().length()>10){
            char ch=evt.getKeyChar();
            setpwd_lb.setForeground(Color.black);
            setpwd_lb.setText("Maximum 10 Digit allowed!");
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_pwd_tfKeyTyped

    private void pwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_tfFocusGained
        setpwd_lb.setText("");
    }//GEN-LAST:event_pwd_tfFocusGained
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
    private javax.swing.JTextField answer_tf;
    private javax.swing.JLabel confpwd_lb;
    private javax.swing.JTextField confpwd_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic1;
    private javax.swing.JTextField pwd_tf;
    private javax.swing.JComboBox<String> quest_cmb;
    private javax.swing.JButton resetpwd_bt;
    private javax.swing.JLabel setpwd_lb;
    private javax.swing.JTextField userid_tf;
    // End of variables declaration//GEN-END:variables
}
