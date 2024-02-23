package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class customer_details extends javax.swing.JFrame {
    PreparedStatement stmt;
    Connection con;
    ResultSet rs,rs1;
    String s3,s1;
    File f;
    long b,a;
    ImageIcon img,img1,img2;
    DateFormat df=new SimpleDateFormat("dd-MMM-yy");
    Calendar cal = Calendar.getInstance(); 
        public customer_details(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        cal.add(Calendar.DATE,0);
        java.util.Date d = cal.getTime();
        con=connDb.conLink();
        this.rs1=rs1;
        this.getRootPane().setDefaultButton(submit_bt);
        cusname_tf.requestFocus();
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        cusadd_ta.setLineWrap(true);
        this.setLocationRelativeTo(null);
        cusareatype_cmb.setSelectedIndex(0);
        cusverification_cmb.setSelectedIndex(0);
        conndate_tf.setText(df.format(d));
        submit_bt.setEnabled(false);
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
        stmt=con.prepareStatement("select abillid,acus_id from automatic");
        rs=stmt.executeQuery();
        rs.next();
        a=rs.getLong(1);
        a++;
        b=rs.getLong(2);
        b++;
        auto();
    }
        public void auto(){
             if(a<10)
            s3="000000000"+a;
        else if(a<100)
            s3="00000000"+a;
        else if(a<1000)
            s3="0000000"+a;
        else if(a<10000)
            s3="000000"+a;
        else if(a<100000)
            s3="00000"+a;
        else if(a<1000000)
            s3="0000"+a;
        else if(a<10000000)
            s3="000"+a;
        else if(a<100000000)
            s3="00"+a;
        else
            JOptionPane.showMessageDialog(this,"Form number exceeds its limit!");
        if(b<10)
        s1="CA0000000"+b;
        else if(b<100)
        s1="CA000000"+b;
        else if(b<1000)
        s1="CA00000"+b;
        else if(b<10000)
        s1="CA0000"+b;
        else if(b<100000)
        s1="CA000"+b;
        else if(b<1000000)
        s1="CA00"+b;
        else if(b<10000000)
        s1="CA0"+b;
        else
            JOptionPane.showMessageDialog(this,"Form number exceeds its limit!");
        cusid_tf.setText(s1);
                }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cusid_tf = new javax.swing.JTextField();
        contno_tf = new javax.swing.JTextField();
        cusconnid_tf = new javax.swing.JTextField();
        cusname_tf = new javax.swing.JTextField();
        pic_lb = new javax.swing.JLabel();
        upload_bt = new javax.swing.JButton();
        submit_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cusadd_ta = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        emailid_tf = new javax.swing.JTextField();
        conndate_tf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cusareatype_cmb = new javax.swing.JComboBox<>();
        verification_tf = new javax.swing.JTextField();
        cusverification_cmb = new javax.swing.JComboBox<>();
        pic1 = new javax.swing.JLabel();
        meter_bt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(15, 30, 70));

        jLabel12.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Customer  Id");

        jLabel13.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enter Customer  Name");

        jLabel14.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer  Address");

        jLabel15.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Customer Areatype");

        jLabel16.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact Number");

        jLabel17.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Connection Id");

        cusid_tf.setEditable(false);
        cusid_tf.setBackground(new java.awt.Color(255, 255, 255));
        cusid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        contno_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        contno_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        contno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contno_tfKeyTyped(evt);
            }
        });

        cusconnid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusconnid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        cusname_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusname_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        cusname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusname_tfKeyTyped(evt);
            }
        });

        pic_lb.setBackground(new java.awt.Color(255, 255, 255));
        pic_lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        upload_bt.setBackground(new java.awt.Color(255, 255, 255));
        upload_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        upload_bt.setForeground(new java.awt.Color(15, 30, 70));
        upload_bt.setText("Upload Image");
        upload_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        upload_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_btActionPerformed(evt);
            }
        });

        submit_bt.setBackground(new java.awt.Color(255, 255, 255));
        submit_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        submit_bt.setForeground(new java.awt.Color(15, 30, 70));
        submit_bt.setText("Submit");
        submit_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        cusadd_ta.setColumns(20);
        cusadd_ta.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusadd_ta.setRows(5);
        cusadd_ta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jScrollPane1.setViewportView(cusadd_ta);

        jLabel18.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Connection Date");

        jLabel19.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email Id");

        jLabel20.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Customer Verification");

        emailid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        emailid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        conndate_tf.setEditable(false);
        conndate_tf.setBackground(new java.awt.Color(255, 255, 255));
        conndate_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        conndate_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        jLabel21.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("New  Customer Entry");

        cusareatype_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cusareatype_cmb.setForeground(new java.awt.Color(15, 30, 70));
        cusareatype_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urban", "Rural" }));
        cusareatype_cmb.setBorder(null);

        verification_tf.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        verification_tf.setForeground(new java.awt.Color(51, 0, 102));
        verification_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        verification_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verification_tfKeyTyped(evt);
            }
        });

        cusverification_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cusverification_cmb.setForeground(new java.awt.Color(15, 30, 70));
        cusverification_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aadhar Number", "Ration Card", "Voter Id", "Passport Number" }));
        cusverification_cmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cusverification_cmbItemStateChanged(evt);
            }
        });

        meter_bt.setBackground(new java.awt.Color(255, 255, 255));
        meter_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        meter_bt.setForeground(new java.awt.Color(15, 30, 70));
        meter_bt.setText("Issue Meter");
        meter_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        meter_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meter_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cusverification_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contno_tf)
                    .addComponent(cusconnid_tf)
                    .addComponent(cusname_tf)
                    .addComponent(cusid_tf)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(emailid_tf)
                    .addComponent(conndate_tf)
                    .addComponent(cusareatype_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upload_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verification_tf)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(meter_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(upload_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusareatype_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cusconnid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conndate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(verification_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cusverification_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meter_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        try {
            stmt=con.prepareStatement("insert into customer_details values(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,cusid_tf.getText());
            stmt.setString(2,cusname_tf.getText());
            stmt.setString(3,cusadd_ta.getText());
            stmt.setString(4,cusareatype_cmb.getSelectedItem().toString());
            stmt.setString(5,cusconnid_tf.getText().toUpperCase());
            stmt.setString(6,contno_tf.getText());
            stmt.setString(7,emailid_tf.getText());
            stmt.setString(8,conndate_tf.getText());
            stmt.setString(9,cusverification_cmb.getSelectedItem().toString());
            stmt.setString(10,verification_tf.getText());
            FileInputStream fin=new FileInputStream(f);
            stmt.setBinaryStream(11,fin,fin.available());
            if(!(cusname_tf.getText().length()==0||cusadd_ta.getText().length()==0||cusconnid_tf.getText().length()==0||contno_tf.getText().length()==0||emailid_tf.getText().length()==0||verification_tf.getText().length()==0||conndate_tf.getText().length()==0||pic_lb.getIcon()==null)){
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Submitted SuccessFully!","Submission Message",JOptionPane.INFORMATION_MESSAGE);
            cusid_tf.setText("");submit_bt.setEnabled(false);
            cusname_tf.requestFocus();
            cusname_tf.setText("");
            cusadd_ta.setText("");
            cusconnid_tf.setText("");
            contno_tf.setText("");
            emailid_tf.setText("");
            verification_tf.setText("");
            cusareatype_cmb.setSelectedIndex(0);
            cusverification_cmb.setSelectedIndex(0);
            pic_lb.setIcon(null);
            stmt=con.prepareStatement("insert into bill_cycle values(?,?,0,0,0,0,0,0,0,0,?,0,?)");
            stmt.setString(1,s3); 
            cal.add(Calendar.DATE,0);
            java.util.Date d = cal.getTime();
            stmt.setString(4,df.format(d));
            stmt.setString(3,conndate_tf.getText());
            stmt.setString(2,s1);
            stmt.executeUpdate();
            stmt=con.prepareStatement("insert into arrear_details values(0,0,0,?,?)");
            stmt.setString(1,s3);
            stmt.setString(2,s1);
            stmt.executeUpdate();
            stmt=con.prepareStatement("insert into payment values(?,?,0,'cash',?)");
            stmt.setString(1,s3);
            stmt.setString(3,conndate_tf.getText());
            stmt.setString(2,s1);
            stmt.executeUpdate();
            {
            stmt=con.prepareStatement("update automatic set abillid=?,acus_id=?");
            stmt.setLong(1,a);
            stmt.setLong(2,b);
            stmt.executeUpdate();
            a++;
            b++;
            auto();
            backdata.back("select * from customer_details","customer_details.xls");
            backdata.back("select * from automatic", "autobackup.xls");
            backdata.back("select * from arrear_details","arrear_details.xls");
            backdata.back("select * from payment", "payment.xls");
            backdata.back("select * from bill_cycle","bill_cycle.xls");
            }
            }
            else
            JOptionPane.showMessageDialog(this,"You Left Some Information Blank!");
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(customer_details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submit_btActionPerformed

    private void cusverification_cmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cusverification_cmbItemStateChanged
          verification_tf.setText("");
    }//GEN-LAST:event_cusverification_cmbItemStateChanged

    private void upload_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_btActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.showOpenDialog(null);
        f=jf.getSelectedFile();
        ImageIcon img=new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(pic_lb.getWidth(),pic_lb.getHeight(),Image.SCALE_DEFAULT));
        pic_lb.setIcon(img);
        if(!(f==null))
            submit_bt.setEnabled(true);
    }//GEN-LAST:event_upload_btActionPerformed

    private void cusname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusname_tfKeyTyped
        char ch= evt.getKeyChar();
        if(!((ch>=65 && ch<=90) ||(ch>=97 && ch<=121)|| ch==8 || ch==32))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
    }//GEN-LAST:event_cusname_tfKeyTyped

    private void contno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contno_tfKeyTyped
         char ch= evt.getKeyChar();
        if(!((ch>=48 && ch<=57) || ch==8)|| !(contno_tf.getText().length()<=11))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
    }//GEN-LAST:event_contno_tfKeyTyped

    private void verification_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verification_tfKeyTyped
         char ch= evt.getKeyChar();
         if(cusverification_cmb.getSelectedIndex()==0){
        if(!((ch>=48 && ch<=57) || ch==8) || !(verification_tf.getText().length()<=11))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    }
        else if(cusverification_cmb.getSelectedIndex()==1){
           if(!((ch>=48 && ch<=57) || ch==8) || !(verification_tf.getText().length()<=9))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep(); 
        }}
           else if(cusverification_cmb.getSelectedIndex()==2){
           if(!((ch>=48 && ch<=57) ||(ch<=65 && ch>=90)||(ch<=97 && ch>=122)|| ch==8) || !(verification_tf.getText().length()<=7))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep(); 
        }}
           else{
           if(!((ch>=48 && ch<=57) || ch==8) || !(verification_tf.getText().length()<=9))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep(); 
        }}
    }//GEN-LAST:event_verification_tfKeyTyped

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {close();
            this.dispose();
            if(rs1.getInt(2)==0)
                new mainwindow(rs1).setVisible(true);
            else
                new controller(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(customer_details.class.getName()).log(Level.SEVERE, null, ex);
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

    private void meter_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meter_btActionPerformed
        if(!(cusname_tf.getText().length()==0||cusadd_ta.getText().length()==0||cusconnid_tf.getText().length()==0||contno_tf.getText().length()==0||emailid_tf.getText().length()==0||verification_tf.getText().length()==0||conndate_tf.getText().length()==0||pic_lb.getIcon()==null)){
            try {
                this.setEnabled(false);
                new meter(this).setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(customer_details.class.getName()).log(Level.SEVERE, null, ex);
            }   }
    }//GEN-LAST:event_meter_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conndate_tf;
    private javax.swing.JTextField contno_tf;
    private javax.swing.JTextArea cusadd_ta;
    private javax.swing.JComboBox<String> cusareatype_cmb;
    private javax.swing.JTextField cusconnid_tf;
    private javax.swing.JTextField cusid_tf;
    private javax.swing.JTextField cusname_tf;
    private javax.swing.JComboBox<String> cusverification_cmb;
    private javax.swing.JTextField emailid_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton meter_bt;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic_lb;
    private javax.swing.JButton submit_bt;
    private javax.swing.JButton upload_bt;
    private javax.swing.JTextField verification_tf;
    // End of variables declaration//GEN-END:variables
}
