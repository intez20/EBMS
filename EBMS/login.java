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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
public class login extends javax.swing.JFrame {
    ImageIcon img,img1,img3,i;
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    public login() throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.getRootPane().setDefaultButton(login_bt);
        error_lb.setText("");
        pwd_tf.setEchoChar('\u25cf');
        login_tf.requestFocus();
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        this.setLocationRelativeTo(null);
        img=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img3=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img3);
        i=new ImageIcon(new ImageIcon(getClass().getResource("eye.png")).getImage().getScaledInstance(eye_lb.getWidth(),eye_lb.getHeight(),Image.SCALE_DEFAULT));
        eye_lb.setIcon(i);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        forgotpwd_lb.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        login_bt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        minimize_bt = new javax.swing.JButton();
        Signup_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();
        forgotpwd_lb = new javax.swing.JLabel();
        error_lb = new javax.swing.JLabel();
        pwd_tf = new javax.swing.JPasswordField();
        eye_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 30, 70));
        jLabel1.setText("Enter LogIn Id");

        login_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        login_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 30, 70));
        jLabel2.setText("Enter  Password");

        login_bt.setBackground(new java.awt.Color(255, 255, 255));
        login_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        login_bt.setForeground(new java.awt.Color(25, 30, 70));
        login_bt.setText("Log In");
        login_bt.setMinimumSize(new java.awt.Dimension(107, 31));
        login_bt.setPreferredSize(new java.awt.Dimension(200, 40));
        login_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 30, 70));
        jLabel5.setLabelFor(jPanel1);
        jLabel5.setText("Log In Here");

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

        Signup_bt.setBackground(new java.awt.Color(255, 255, 255));
        Signup_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Signup_bt.setForeground(new java.awt.Color(25, 30, 70));
        Signup_bt.setText("Sign Up");
        Signup_bt.setPreferredSize(new java.awt.Dimension(200, 40));
        Signup_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_btActionPerformed(evt);
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

        forgotpwd_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        forgotpwd_lb.setForeground(new java.awt.Color(25, 30, 70));
        forgotpwd_lb.setText("Forgot Password ?");
        forgotpwd_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpwd_lbMouseClicked(evt);
            }
        });

        error_lb.setBackground(new java.awt.Color(255, 255, 255));
        error_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        error_lb.setForeground(new java.awt.Color(255, 0, 0));
        error_lb.setText("Enter  Password");

        pwd_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        pwd_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pwd_tf.setSelectionColor(new java.awt.Color(15, 30, 70));
        pwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwd_tfFocusGained(evt);
            }
        });

        eye_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eye_lbMouseMoved(evt);
            }
        });
        eye_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eye_lbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(login_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Signup_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(forgotpwd_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(login_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eye_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(485, 485, 485)
                                .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel5)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exit_bt, minimize_bt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eye_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Signup_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forgotpwd_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login_tf, pwd_tf});

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

    private void Signup_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_btActionPerformed
        try {close();
            this.dispose();
            new newUser().setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Signup_btActionPerformed

    private void minimize_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_btActionPerformed

    private void login_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btActionPerformed
        try {
            stmt=con.prepareStatement("select * from login where upper(login_user_id)=? and login_user_password=?");
            stmt.setString(1,login_tf.getText().toUpperCase());
            stmt.setString(2,pwd_tf.getText());
            rs=stmt.executeQuery();
            if(rs.next()){
                if(rs.getString(3).equals("null")){
                    new QandA(rs,this).setVisible(true);
                    this.setEnabled(false);
                }else{
                    this.dispose();
                    if(rs.getInt(2)==0){
                        new afterlogin(rs).setVisible(true);
                    }else if(rs.getInt(2)==1){
                        new pcontroller(rs).setVisible(true);
                    }else if(rs.getInt(2)==2){
                        new bcontroller(rs).setVisible(true);
                    }else if(rs.getInt(2)==3){
                        new controller(rs).setVisible(true);
                    }
                }}
                else{
                    pwd_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
                    error_lb.setText("Wrong Password!");
                    forgotpwd_lb.setVisible(true);
                    login_tf.setText("");
                    pwd_tf.setText("");
                    login_tf.requestFocus();
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_login_btActionPerformed

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btActionPerformed

    private void forgotpwd_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpwd_lbMouseClicked
        try {                                          
            close();
            this.dispose();
            new ForgotPassword().setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_forgotpwd_lbMouseClicked
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
    private void pwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_tfFocusGained
        pwd_tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
        error_lb.setText("");
    }//GEN-LAST:event_pwd_tfFocusGained

    private void exit_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseMoved
        exit_bt.setBackground(new Color(220,0,0));
    }//GEN-LAST:event_exit_btMouseMoved

    private void exit_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseExited
        exit_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_exit_btMouseExited

    private void minimize_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseMoved
        minimize_bt.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_minimize_btMouseMoved

    private void minimize_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseExited
        minimize_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimize_btMouseExited

    private void eye_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye_lbMouseExited
        pwd_tf.setEchoChar('\u25cf');
    }//GEN-LAST:event_eye_lbMouseExited

    private void eye_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye_lbMouseMoved
        pwd_tf.setEchoChar((char)0);
    }//GEN-LAST:event_eye_lbMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signup_bt;
    private javax.swing.JLabel error_lb;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel eye_lb;
    private javax.swing.JLabel forgotpwd_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_bt;
    private javax.swing.JTextField login_tf;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic1;
    private javax.swing.JPasswordField pwd_tf;
    // End of variables declaration//GEN-END:variables
}
