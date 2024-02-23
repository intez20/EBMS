package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
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
public class newUser extends javax.swing.JFrame {
Connection con ;
ImageIcon img1,img,img2;
PreparedStatement stmt ;
ResultSet rs,rs1;
char c1 ;
byte id=1,b ;
    public newUser() throws SQLException, ClassNotFoundException {
        call();b=1;
    }
    public newUser(ResultSet rs1) throws SQLException, ClassNotFoundException {
        call();b=0; this.rs1=rs1;
    }
    public void call() throws SQLException, ClassNotFoundException{
        initComponents();
        con = connDb.conLink();
        this.getRootPane().setDefaultButton(signup_bt);
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        userid_tf.requestFocus();
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
        role_cmb.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        astric_ib = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        userid_tf = new javax.swing.JTextField();
        signup_bt = new javax.swing.JButton();
        role_cmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contno_tf = new javax.swing.JTextField();
        username_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        setpwd_tf = new javax.swing.JPasswordField();
        confpwd_tf = new javax.swing.JPasswordField();
        uname_lb = new javax.swing.JLabel();
        userid_lb = new javax.swing.JLabel();
        umob_lb = new javax.swing.JLabel();
        uemail_lb = new javax.swing.JLabel();
        setpwd_lb = new javax.swing.JLabel();
        confpwd_lb = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        minimize_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        astric_ib.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(15, 30, 70));
        jLabel10.setText(" Role");

        userid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        userid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userid_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userid_tfFocusLost(evt);
            }
        });
        userid_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userid_tfKeyTyped(evt);
            }
        });

        signup_bt.setBackground(new java.awt.Color(255, 255, 255));
        signup_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        signup_bt.setForeground(new java.awt.Color(15, 30, 70));
        signup_bt.setText("Sign Up");
        signup_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btActionPerformed(evt);
            }
        });

        role_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        role_cmb.setForeground(new java.awt.Color(15, 30, 70));
        role_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BILL CONTROLLER", "ARREAR CONTROLLER", "PAYMENT CONTROLLER" }));
        role_cmb.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 30, 70));
        jLabel2.setText(" User Id");

        jLabel7.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(15, 30, 70));
        jLabel7.setText(" Confirm Password");

        jLabel8.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 30, 70));
        jLabel8.setText(" Set Password");

        jLabel3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 30, 70));
        jLabel3.setText(" User Name");

        jLabel4.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 30, 70));
        jLabel4.setText(" Email Id");

        jLabel5.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 30, 70));
        jLabel5.setText(" Mobile Number ");

        contno_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        contno_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contno_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contno_tfFocusLost(evt);
            }
        });
        contno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contno_tfKeyTyped(evt);
            }
        });

        username_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        username_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        username_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_tfFocusLost(evt);
            }
        });
        username_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_tfKeyTyped(evt);
            }
        });

        email_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        email_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_tfFocusLost(evt);
            }
        });
        email_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                email_tfKeyTyped(evt);
            }
        });

        setpwd_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setpwd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                setpwd_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                setpwd_tfFocusLost(evt);
            }
        });
        setpwd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                setpwd_tfKeyTyped(evt);
            }
        });

        confpwd_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        pic2.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        pic2.setForeground(new java.awt.Color(15, 30, 70));
        pic2.setText("  Sign Up Here!");

        javax.swing.GroupLayout astric_ibLayout = new javax.swing.GroupLayout(astric_ib);
        astric_ib.setLayout(astric_ibLayout);
        astric_ibLayout.setHorizontalGroup(
            astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(astric_ibLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(signup_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, astric_ibLayout.createSequentialGroup()
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(astric_ibLayout.createSequentialGroup()
                        .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(astric_ibLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(astric_ibLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(contno_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(role_cmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, 275, Short.MAX_VALUE)
                            .addComponent(setpwd_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(confpwd_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(umob_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uemail_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setpwd_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confpwd_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, astric_ibLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_tf)
                            .addGroup(astric_ibLayout.createSequentialGroup()
                                .addComponent(userid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(uname_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userid_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, astric_ibLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        astric_ibLayout.setVerticalGroup(
            astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(astric_ibLayout.createSequentialGroup()
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(astric_ibLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(astric_ibLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(pic2)))
                .addGap(20, 20, 20)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(userid_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(uname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(umob_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(uemail_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setpwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(setpwd_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confpwd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(confpwd_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(astric_ibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(signup_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(15, 30, 70));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(astric_ib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(astric_ib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confpwd_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confpwd_tfFocusLost
        if (setpwd_tf.getText().equals(confpwd_tf.getText()))
        role_cmb.requestFocus();
        else
        {
         setpwd_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
         confpwd_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
         confpwd_lb.setText("Passwords didn't match !");
         setpwd_tf.setText("");
         confpwd_tf.setText("");
         setpwd_tf.requestFocus();
      }
    }//GEN-LAST:event_confpwd_tfFocusLost

    private void email_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tfFocusLost
        if (email_tf.getText().length()==0)
        {
        email_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
        uemail_lb.setText("This field cannot be empty !");
        }
    }//GEN-LAST:event_email_tfFocusLost

    private void email_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tfFocusGained
        email_tf.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_email_tfFocusGained

    private void username_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_tfKeyTyped
uname_lb.setText("");
        char ch= evt.getKeyChar();
        if (ch==' ' && username_tf.getText().length()== 0)
        { evt.consume();
            Toolkit.getDefaultToolkit().beep();}
        else if (!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==32||ch==8))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if (ch==' '&& c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        c1=ch ;
    }//GEN-LAST:event_username_tfKeyTyped

    private void username_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfFocusLost
        if (username_tf.getText().length()==0)
        {
        uname_lb.setText("this Field can not be left Blank");
        username_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
        }
    }//GEN-LAST:event_username_tfFocusLost

    private void username_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfFocusGained
    username_tf.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_username_tfFocusGained

    private void contno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contno_tfKeyTyped
        umob_lb.setText("");
        char ch=evt.getKeyChar();
        if (!((ch>=48 && ch<=57) || ch==8)||!(contno_tf.getText().length()<=11))
        { evt.consume();
            Toolkit.getDefaultToolkit().beep();}        
    }//GEN-LAST:event_contno_tfKeyTyped

    private void contno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contno_tfFocusLost
        if (contno_tf.getText().length()== 0 )
        {
        contno_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
        umob_lb.setText("This Field cannot be empty!");
        }
        if(contno_tf.getText().length()<=9){
            contno_tf.setBorder(BorderFactory.createLineBorder(Color.red,2));
            umob_lb.setText("Invalid Number!");
        }
    }//GEN-LAST:event_contno_tfFocusLost

    private void contno_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contno_tfFocusGained
        contno_tf.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_contno_tfFocusGained

    private void signup_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btActionPerformed
        if (role_cmb.getSelectedItem().toString().equalsIgnoreCase("payment controller"))
            id=1 ;
        else if (role_cmb.getSelectedItem().toString().equalsIgnoreCase("bill controller"))
            id=2 ;
        else if (role_cmb.getSelectedItem().toString().equalsIgnoreCase("arrear controller"))
            id=3 ;
        try {
            stmt=con.prepareStatement("insert into request values (?,?,?,?,?,?)");
            stmt.setString(1, userid_tf.getText());
            stmt.setString(2, username_tf.getText());
            stmt.setString(3,contno_tf.getText());
            stmt.setString(4, email_tf.getText());
            stmt.setString(5, setpwd_tf.getText());
            stmt.setInt(6,id);
            if(!(userid_tf.getText().length()==0||email_tf.getText().length()==0||username_tf.getText().length()==0||contno_tf.getText().length()==0||setpwd_tf.getText().length()<=5)){
            stmt.executeUpdate();
            //backdata.back("select * from request","request.xls");
            JOptionPane.showMessageDialog(this,"New User Request Generated Sucessfully!");
            userid_tf.setText("");
            setpwd_lb.setText("");
            username_tf.setText("");
            contno_tf.setText("");
            email_tf.setText("");
            setpwd_tf.setText("");
            confpwd_tf.setText("");
            role_cmb.setSelectedIndex(0);
            }
            else{
                JOptionPane.showMessageDialog(this,"Some Information is Left Blank!");  
            }userid_tf.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signup_btActionPerformed

    private void userid_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userid_tfKeyTyped
userid_lb.setText("");
        char ch= evt.getKeyChar();
        if (ch== ' ' && userid_tf.getText().length()==0)
        {  evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if ( !((ch>=65 && ch<=90)|| ( ch>=97 && ch<=122)||(ch>=48 && ch<=57)))
        {         evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_userid_tfKeyTyped

    private void userid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userid_tfFocusLost
        if (userid_tf.getText().length()==0){
            userid_lb.setText("this Field can not be left Blank");
            userid_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));}
        else{ try {
        stmt=con.prepareStatement("select login_user_id from login where upper(login_user_id)=?");
        stmt.setString(1,userid_tf.getText().toUpperCase());
        rs=stmt.executeQuery();
        if(rs.next()){
            userid_tf.setBorder(BorderFactory.createLineBorder(Color.red));
            userid_lb.setText("User id Already Exists!");
            signup_bt.setEnabled(false);
        }else{
            username_tf.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, ex);
    }}
    }//GEN-LAST:event_userid_tfFocusLost

    private void userid_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userid_tfFocusGained
        userid_tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
        userid_lb.setText("");
        signup_bt.setEnabled(true);
    }//GEN-LAST:event_userid_tfFocusGained

    private void setpwd_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setpwd_tfFocusLost
    if (setpwd_tf.getText().length()==0 )
    {
    setpwd_tf.setBorder(BorderFactory.createLineBorder(Color.RED,2));
    setpwd_lb.setText("This field cannot be empty !"); }   
    }//GEN-LAST:event_setpwd_tfFocusLost

    private void confpwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confpwd_tfFocusGained
        confpwd_lb.setText("");
    }//GEN-LAST:event_confpwd_tfFocusGained

    private void setpwd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_setpwd_tfKeyTyped
        confpwd_lb.setText("");
        setpwd_lb.setText("");
        if(setpwd_tf.getText().length()<=5){
            setpwd_lb.setForeground(Color.red);
            setpwd_lb.setText("Password Strength: Weak");
        }
        else if(setpwd_tf.getText().length()<=9){
            setpwd_lb.setText("Password Strength: Strong");
            setpwd_lb.setForeground(Color.GREEN);
        }
        else if(setpwd_tf.getText().length()>10){
            char ch=evt.getKeyChar();
            setpwd_lb.setForeground(Color.black);
            setpwd_lb.setText("Maximum 10 Digit allowed!");
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_setpwd_tfKeyTyped

    private void email_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_tfKeyTyped
    uemail_lb.setText("");
    }//GEN-LAST:event_email_tfKeyTyped

    private void setpwd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setpwd_tfFocusGained
    setpwd_tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
    confpwd_tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
    setpwd_lb.setText("");
    }//GEN-LAST:event_setpwd_tfFocusGained

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
    try {close();
        this.dispose();
        if(b==0)
            new afterlogin(rs1).setVisible(true);
        else
        new login().setVisible(true);
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, ex);
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
    private void minimize_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_btActionPerformed

    private void confpwd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confpwd_tfKeyTyped
        confpwd_lb.setText("");
    }//GEN-LAST:event_confpwd_tfKeyTyped

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
    private javax.swing.JPanel astric_ib;
    private javax.swing.JLabel confpwd_lb;
    private javax.swing.JPasswordField confpwd_tf;
    private javax.swing.JTextField contno_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JComboBox<String> role_cmb;
    private javax.swing.JLabel setpwd_lb;
    private javax.swing.JPasswordField setpwd_tf;
    private javax.swing.JButton signup_bt;
    private javax.swing.JLabel uemail_lb;
    private javax.swing.JLabel umob_lb;
    private javax.swing.JLabel uname_lb;
    private javax.swing.JLabel userid_lb;
    private javax.swing.JTextField userid_tf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
