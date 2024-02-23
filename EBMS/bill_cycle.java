package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class bill_cycle extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt; 
    ResultSet rs,rs1;ImageIcon img1,img2,img3;
    DateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
    long a;
    float eduty,subsidy,dps,f,m,oth,ec_rate,ec,pr,cr,consume,credit;
    String s,str,x,y,z;
    public bill_cycle(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.rs1=rs1;
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        bill_bt.setEnabled(false);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img3=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img3);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic_lb.getWidth(),pic_lb.getHeight(),Image.SCALE_DEFAULT));
        pic_lb.setIcon(img2);
        minimize_bt.setBackground(Color.WHITE);
        exit_bt.setBackground(Color.WHITE);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        cusid_tf.requestFocus();
        this.setLocationRelativeTo(null);
        stmt=con.prepareStatement("select abillid from automatic");
        rs=stmt.executeQuery();
        rs.next();
        a=rs.getLong(1);
        a++;
        auto();
    }
    public void auto(){
        if(a<10)
            s="000000000"+a;
        else if(a<100)
            s="00000000"+a;
        else if(a<1000)
            s="0000000"+a;
        else if(a<10000)
            s="000000"+a;
        else if(a<100000)
            s="00000"+a;
        else if(a<1000000)
            s="0000"+a;
        else if(a<10000000)
            s="000"+a;
        else if(a<100000000)
            s="00"+a;
        else{
            JOptionPane.showMessageDialog(this,"Form number exceeds its limit!");
        }
        billid_tf.setText(s);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        poa_tf = new javax.swing.JTextField();
        edues_tf = new javax.swing.JTextField();
        dps_tf = new javax.swing.JTextField();
        subA_tf = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        minimize_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        billdays_tf = new javax.swing.JTextField();
        billdate_tf = new javax.swing.JTextField();
        conntype_tf = new javax.swing.JTextField();
        contno_tf = new javax.swing.JTextField();
        cusarea_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cusadd_ta = new javax.swing.JTextArea();
        cusname_tf = new javax.swing.JTextField();
        meterno_tf = new javax.swing.JTextField();
        cusid_tf = new javax.swing.JTextField();
        billid_tf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        consume_tf = new javax.swing.JTextField();
        cr_tf = new javax.swing.JTextField();
        pr_tf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        lastpaidamt_tf = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        paymentid_tf = new javax.swing.JTextField();
        lastpaiddate_tf = new javax.swing.JTextField();
        bill_bt = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        pic_lb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        grosstot_tf = new javax.swing.JTextField();
        subB_tf = new javax.swing.JTextField();
        subsidy_tf = new javax.swing.JTextField();
        otherchrg_tf = new javax.swing.JTextField();
        meterrent_tf = new javax.swing.JTextField();
        elecduty_tf = new javax.swing.JTextField();
        fc_tf = new javax.swing.JTextField();
        energycharge_tf = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        pamt = new javax.swing.JLabel();
        pamt1 = new javax.swing.JLabel();
        pamt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1096, 1048));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(1096, 1048));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(15, 30, 70));
        jLabel83.setText("Arrear Details");

        poa_tf.setEditable(false);
        poa_tf.setBackground(new java.awt.Color(255, 255, 255));
        poa_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        poa_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        edues_tf.setEditable(false);
        edues_tf.setBackground(new java.awt.Color(255, 255, 255));
        edues_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        edues_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dps_tf.setEditable(false);
        dps_tf.setBackground(new java.awt.Color(255, 255, 255));
        dps_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        dps_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subA_tf.setEditable(false);
        subA_tf.setBackground(new java.awt.Color(255, 255, 255));
        subA_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        subA_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(15, 30, 70));
        jLabel85.setText("Sub Total (A)");

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(15, 30, 70));
        jLabel84.setText("Arrears DPS");

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(15, 30, 70));
        jLabel68.setText("Energy Dues");

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(15, 30, 70));
        jLabel70.setText("Payment On Account");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dps_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(poa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(edues_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(subA_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edues_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dps_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subA_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lb1.setBackground(new java.awt.Color(255, 255, 255));
        lb1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(15, 30, 70));
        lb1.setText("Consumer   Details");

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 30, 70));
        jLabel80.setText("Bill Id");

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(15, 30, 70));
        jLabel82.setText("Customer Id");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(15, 30, 70));
        jLabel77.setText("Meter Number");

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(15, 30, 70));
        jLabel78.setText("Customer Name");

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(15, 30, 70));
        jLabel71.setText("Customer Address");

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(15, 30, 70));
        jLabel72.setText("Area type");

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(15, 30, 70));
        jLabel75.setText("Mobile Number");

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(15, 30, 70));
        jLabel73.setText("Connection type");

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(15, 30, 70));
        jLabel79.setText("Bill Date");

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(15, 30, 70));
        jLabel100.setText("Billed Days");

        billdays_tf.setEditable(false);
        billdays_tf.setBackground(new java.awt.Color(255, 255, 255));
        billdays_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        billdays_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        billdate_tf.setEditable(false);
        billdate_tf.setBackground(new java.awt.Color(255, 255, 255));
        billdate_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        billdate_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        conntype_tf.setEditable(false);
        conntype_tf.setBackground(new java.awt.Color(255, 255, 255));
        conntype_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        conntype_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        contno_tf.setEditable(false);
        contno_tf.setBackground(new java.awt.Color(255, 255, 255));
        contno_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        contno_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cusarea_tf.setEditable(false);
        cusarea_tf.setBackground(new java.awt.Color(255, 255, 255));
        cusarea_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cusarea_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cusadd_ta.setEditable(false);
        cusadd_ta.setColumns(10);
        cusadd_ta.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cusadd_ta.setLineWrap(true);
        cusadd_ta.setRows(2);
        jScrollPane1.setViewportView(cusadd_ta);

        cusname_tf.setEditable(false);
        cusname_tf.setBackground(new java.awt.Color(255, 255, 255));
        cusname_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cusname_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        meterno_tf.setEditable(false);
        meterno_tf.setBackground(new java.awt.Color(255, 255, 255));
        meterno_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        meterno_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cusid_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cusid_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cusid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cusid_tfFocusLost(evt);
            }
        });

        billid_tf.setEditable(false);
        billid_tf.setBackground(new java.awt.Color(255, 255, 255));
        billid_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        billid_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cusname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(billid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(meterno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(contno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(conntype_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(billdays_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(cusarea_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(billdate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meterno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusarea_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billdate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conntype_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billdays_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(15, 30, 70));
        jLabel74.setText("Reading Details");

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(15, 30, 70));
        jLabel76.setText("Previous Reading");

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 30, 70));
        jLabel81.setText("Current Reading");

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(15, 30, 70));
        jLabel69.setText("Consumption");

        consume_tf.setEditable(false);
        consume_tf.setBackground(new java.awt.Color(255, 255, 255));
        consume_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        consume_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cr_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cr_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cr_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cr_tfFocusLost(evt);
            }
        });

        pr_tf.setEditable(false);
        pr_tf.setBackground(new java.awt.Color(255, 255, 255));
        pr_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        pr_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pr_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cr_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(consume_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pr_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cr_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consume_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(15, 30, 70));
        jLabel96.setText("Details of Last Payment");

        lastpaidamt_tf.setEditable(false);
        lastpaidamt_tf.setBackground(new java.awt.Color(255, 255, 255));
        lastpaidamt_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        lastpaidamt_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(15, 30, 70));
        jLabel97.setText("Last Paid Amount");

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(15, 30, 70));
        jLabel98.setText("Last Paid  Date");

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(15, 30, 70));
        jLabel99.setText("Payment Id");

        paymentid_tf.setEditable(false);
        paymentid_tf.setBackground(new java.awt.Color(255, 255, 255));
        paymentid_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        paymentid_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lastpaiddate_tf.setEditable(false);
        lastpaiddate_tf.setBackground(new java.awt.Color(255, 255, 255));
        lastpaiddate_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        lastpaiddate_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paymentid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastpaidamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastpaiddate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel96)
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastpaidamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastpaiddate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        bill_bt.setBackground(new java.awt.Color(255, 255, 255));
        bill_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        bill_bt.setForeground(new java.awt.Color(15, 30, 70));
        bill_bt.setText("Create Bill");
        bill_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_btActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(15, 30, 70));
        jLabel38.setText("BIHAR STATE POWER GENERATION COMPANY LIMITED");

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(15, 30, 70));
        jLabel40.setText("ELECTRICITY BILL");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel38))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel40)))
                .addGap(0, 176, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(15, 30, 70));
        jLabel86.setText("Current Bill Details");

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(15, 30, 70));
        jLabel87.setText("Energy Charges");

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(15, 30, 70));
        jLabel88.setText("Fixed Charge");

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(15, 30, 70));
        jLabel89.setText("Electric Duty");

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(15, 30, 70));
        jLabel90.setText("Meter Rent");

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(15, 30, 70));
        jLabel91.setText("Other Charges");

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(15, 30, 70));
        jLabel92.setText("Gov. Subsidy");

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(15, 30, 70));
        jLabel93.setText("Sub Total (B)");

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(15, 30, 70));
        jLabel94.setText("Gross Total (A+B)");

        grosstot_tf.setEditable(false);
        grosstot_tf.setBackground(new java.awt.Color(255, 255, 255));
        grosstot_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        grosstot_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subB_tf.setEditable(false);
        subB_tf.setBackground(new java.awt.Color(255, 255, 255));
        subB_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        subB_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subsidy_tf.setEditable(false);
        subsidy_tf.setBackground(new java.awt.Color(255, 255, 255));
        subsidy_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        subsidy_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        otherchrg_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        otherchrg_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otherchrg_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                otherchrg_tfFocusLost(evt);
            }
        });

        meterrent_tf.setEditable(false);
        meterrent_tf.setBackground(new java.awt.Color(255, 255, 255));
        meterrent_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        meterrent_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        elecduty_tf.setEditable(false);
        elecduty_tf.setBackground(new java.awt.Color(255, 255, 255));
        elecduty_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        elecduty_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fc_tf.setEditable(false);
        fc_tf.setBackground(new java.awt.Color(255, 255, 255));
        fc_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        fc_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        energycharge_tf.setEditable(false);
        energycharge_tf.setBackground(new java.awt.Color(255, 255, 255));
        energycharge_tf.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        energycharge_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grosstot_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subB_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subsidy_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(otherchrg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(meterrent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(elecduty_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(energycharge_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel86)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(energycharge_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elecduty_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meterrent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherchrg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subsidy_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subB_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grosstot_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pamt.setBackground(new java.awt.Color(255, 255, 255));
        pamt.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        pamt.setForeground(new java.awt.Color(15, 30, 70));
        pamt.setText("Payable Amount Upto");

        pamt1.setBackground(new java.awt.Color(255, 255, 255));
        pamt1.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        pamt1.setForeground(new java.awt.Color(15, 30, 70));
        pamt1.setText("Payable Amount Upto");

        pamt2.setBackground(new java.awt.Color(255, 255, 255));
        pamt2.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        pamt2.setForeground(new java.awt.Color(15, 30, 70));
        pamt2.setText("Paid After");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pamt, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(pamt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pamt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(pamt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pamt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pamt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bill_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(bill_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cusid_tfFocusLost
        try {
            stmt=con.prepareStatement("select c.cus_name,c.cus_add,c.cus_areatype,c.cus_mobile,m.meter_no,m.meter_rent from customer_details c,meter m where upper(c.cus_id)=? and upper(m.cus_id)=?");
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            stmt.setString(2,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                Calendar cal1,cal = Calendar.getInstance(); 
                cal.add(Calendar.DATE,0);
                java.util.Date d = cal.getTime();
                billdate_tf.setText(df.format(d));
                meterno_tf.setText(rs.getString(5));
                cusname_tf.setText(rs.getString(1));
                cusadd_ta.setText(rs.getString(2));
                cusarea_tf.setText(rs.getString(3));
                contno_tf.setText(rs.getString(4));
                meterrent_tf.setText(rs.getString(6));
                m=rs.getFloat(6);
                stmt=con.prepareStatement("select conn_type,fixed_charge,energy_charge from connections where upper(conn_id)=upper((select conn_id from customer_details where upper(cus_id)=?))");
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            rs.next();
            conntype_tf.setText(rs.getString(1));
            fc_tf.setText(rs.getString(2));
            f=rs.getFloat(2);
            ec_rate=rs.getFloat(3);
            stmt=con.prepareStatement("select bill_id,gross_total from bill_cycle where upper(cus_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            rs.last();
            String bil=rs.getString(1);
            Float dps1 =0f;
            if(!rs.isBeforeFirst())
            dps1=rs.getFloat(2);
            stmt=con.prepareStatement("select bill_id from payment where upper(bill_id)=?");
            stmt.setString(1,bil.toUpperCase());
            rs=stmt.executeQuery();
            System.out.println("gajab h");
            if(!rs.next()){
                System.out.print("ajab h"+dps1);
                stmt=con.prepareStatement("insert into arrear_details values(0,?,?,?,?)");
                stmt.setFloat(1,dps1);stmt.setFloat(2,(dps1/100));stmt.setString(3,bil.toUpperCase());
                stmt.setString(4,cusid_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
            }
            stmt=con.prepareStatement("select curr_reading,bill_date from bill_cycle where upper(cus_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();    
            rs.last();
            Date dk=df.parse(rs.getString(2));
            cal1=Calendar.getInstance();cal1.setTime(dk);
            Long diff=d.getTime()-dk.getTime();
            billdays_tf.setText(""+(diff/(1000*60*60*24)));
            pr_tf.setText(rs.getString(1));
            stmt=con.prepareStatement("select credit_balance,energy_dues,arrear_dps from arrear_details where upper(cus_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            rs.last();
            poa_tf.setText(rs.getString(1));
            edues_tf.setText(rs.getString(2));
            dps_tf.setText(rs.getString(3));
            dps=rs.getFloat(3);
            if(rs.getFloat(1)>=rs.getFloat(2)){
                credit=rs.getFloat(1);
            subA_tf.setText(""+(credit-dps));}
            else{
                credit=rs.getFloat(2);
            subA_tf.setText(""+(credit+dps));
            }
            stmt=con.prepareStatement("select bill_id,paid_amount,paid_date from payment where upper(cus_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            rs.last();
            lastpaiddate_tf.setText(rs.getString(3));
            lastpaidamt_tf.setText(rs.getString(2));
            paymentid_tf.setText(rs.getString(1));
            
            }else
            {
                JOptionPane.showMessageDialog(this,"Invalid Customer Id!");
                cusid_tf.requestFocus();
                cusid_tf.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(bill_cycle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(bill_cycle.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_cusid_tfFocusLost

    private void cr_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cr_tfFocusLost
        cr_tf.setEditable(false);
        cr_tf.setBackground(Color.WHITE);
        pr=Float.parseFloat(pr_tf.getText());
        cr=Float.parseFloat(cr_tf.getText());
        if(cr<pr){
            JOptionPane.showMessageDialog(this,"Incorrect Input In Current Reading!");
            consume=0;
        }else{
            consume=cr-pr;
        }
        consume_tf.setText(""+consume);
        ec=ec_rate*consume;
        energycharge_tf.setText(""+ec);
        if(ec>=1000){
            eduty=(float)ec/10;
            subsidy=(float)(ec+eduty)/10;
        }
        else if(ec>10000){
            eduty=(float)ec/8;
            subsidy=(float)(ec+eduty)/15;
        } else if(ec>25000){
            eduty=(float)ec/5;
            subsidy=(float)(ec+eduty)/50;
        }
        elecduty_tf.setText(""+eduty);
        subsidy_tf.setText(""+subsidy);
    }//GEN-LAST:event_cr_tfFocusLost

    private void otherchrg_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherchrg_tfFocusLost
       oth=Float.parseFloat(otherchrg_tf.getText());
        subB_tf.setText(""+(ec+eduty-subsidy+f+m+oth));
        eduty=Float.parseFloat(subB_tf.getText())+Float.parseFloat(subA_tf.getText());
        grosstot_tf.setText(""+eduty);
        if(!(otherchrg_tf.getText().length()==0))
           bill_bt.setEnabled(true);
        Calendar cal = Calendar.getInstance(); 
                cal.add(Calendar.DATE,15);
                Date d = cal.getTime();str=df.format(d);
                x="PAYABLE AMOUNT UPTO("+df.format(d)+") :"+grosstot_tf.getText();
                pamt.setText(x);
                cal.add(Calendar.DATE,25);
                d = cal.getTime();
                eduty=eduty+eduty/100;
                y="PAYABLE AMOUNT UPTO("+df.format(d)+") :"+eduty;
                pamt1.setText(y);
                eduty=eduty+eduty/100;
                z="PAYABLE AMOUNT AFTER("+df.format(d)+"):"+eduty;
                pamt2.setText(z);
    }//GEN-LAST:event_otherchrg_tfFocusLost

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {
            close();
            this.dispose();
            if(rs1.getInt(2)==0)
                new mainwindow(rs1).setVisible(true);
            else
                new bcontroller(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(bill_cycle.class.getName()).log(Level.SEVERE, null, ex);
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
    private void bill_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_btActionPerformed
        try {
            stmt=con.prepareStatement("insert into bill_cycle values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,billid_tf.getText());
            stmt.setString(2,cusid_tf.getText().toUpperCase());
            stmt.setFloat(3,Float.parseFloat(fc_tf.getText()));
            stmt.setFloat(4,Float.parseFloat(pr_tf.getText()));
            stmt.setFloat(5,Float.parseFloat(cr_tf.getText()));
            stmt.setFloat(6,Float.parseFloat(consume_tf.getText()));
            stmt.setFloat(7,Float.parseFloat(subB_tf.getText()));
            stmt.setFloat(8,Float.parseFloat(elecduty_tf.getText()));
            stmt.setFloat(9,Float.parseFloat(otherchrg_tf.getText()));
            stmt.setFloat(10,Float.parseFloat(subsidy_tf.getText()));
            stmt.setString(11,str);
            stmt.setFloat(12,Float.parseFloat(grosstot_tf.getText()));
            stmt.setString(13,billdate_tf.getText());
            stmt.executeUpdate();
            this.setEnabled(false);
            new Bill_generated(this).setVisible(true);
            billid_tf.setText("");
            meterno_tf.setText("");
            billdate_tf.setText("");
            billdays_tf.setText("");
            conntype_tf.setText("");
            consume_tf.setText("");
            contno_tf.setText("");
            cr_tf.setText("");
            cusarea_tf.setText("");
            cusid_tf.setText("");
            cusname_tf.setText("");
            dps_tf.setText(""); 
            edues_tf.setText("");
            elecduty_tf.setText("");
            meterrent_tf.setText("");
            energycharge_tf.setText("");
            fc_tf.setText("");
            grosstot_tf.setText("");
            cusadd_ta.setText("");
            lastpaiddate_tf.setText("");
            lastpaidamt_tf.setText("");
            meterno_tf.setText("");
            otherchrg_tf.setText("");
            paymentid_tf.setText("");
            poa_tf.setText("");
            pr_tf.setText("");
            subA_tf.setText("");
            subB_tf.setText("");
            subsidy_tf.setText("");
            cusid_tf.requestFocus();
            stmt=con.prepareStatement("update automatic set abillid=?");
            stmt.setLong(1,a);
            stmt.executeUpdate();
            a++;
            auto();
            backdata.back("select * from bill_cycle","bill_cycle.xls");
            backdata.back("select * from automatic", "autobackup.xls");    
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(bill_cycle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bill_btActionPerformed

    private void minimize_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_btActionPerformed

    private void minimize_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseExited
        minimize_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimize_btMouseExited

    private void exit_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseExited
        exit_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_exit_btMouseExited

    private void minimize_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseMoved
        minimize_bt.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_minimize_btMouseMoved

    private void exit_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseMoved
        exit_bt.setBackground(new Color(220,0,0));
    }//GEN-LAST:event_exit_btMouseMoved
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill_bt;
    javax.swing.JTextField billdate_tf;
    javax.swing.JTextField billdays_tf;
    javax.swing.JTextField billid_tf;
    javax.swing.JTextField conntype_tf;
    javax.swing.JTextField consume_tf;
    javax.swing.JTextField contno_tf;
    javax.swing.JTextField cr_tf;
    javax.swing.JTextArea cusadd_ta;
    javax.swing.JTextField cusarea_tf;
    javax.swing.JTextField cusid_tf;
    javax.swing.JTextField cusname_tf;
    javax.swing.JTextField dps_tf;
    javax.swing.JTextField edues_tf;
    javax.swing.JTextField elecduty_tf;
    javax.swing.JTextField energycharge_tf;
    private javax.swing.JButton exit_bt;
    javax.swing.JTextField fc_tf;
    javax.swing.JTextField grosstot_tf;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField lastpaidamt_tf;
    javax.swing.JTextField lastpaiddate_tf;
    private javax.swing.JLabel lb1;
    javax.swing.JTextField meterno_tf;
    javax.swing.JTextField meterrent_tf;
    private javax.swing.JButton minimize_bt;
    javax.swing.JTextField otherchrg_tf;
    private javax.swing.JLabel pamt;
    private javax.swing.JLabel pamt1;
    private javax.swing.JLabel pamt2;
    javax.swing.JTextField paymentid_tf;
    private javax.swing.JLabel pic_lb;
    javax.swing.JTextField poa_tf;
    javax.swing.JTextField pr_tf;
    javax.swing.JTextField subA_tf;
    javax.swing.JTextField subB_tf;
    javax.swing.JTextField subsidy_tf;
    // End of variables declaration//GEN-END:variables
}
