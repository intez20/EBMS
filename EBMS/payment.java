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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class payment extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs,rs1;
    ImageIcon img,img1,img2;
    Date d,d1,d2;Float f;
    SimpleDateFormat dt=new SimpleDateFormat("dd-MMM-yyyy");
   public payment(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.rs1=rs1;
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(submit_bt);
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
        d=new Date();
        paiddate_tf.setText(dt.format(d));
        lb.setText("");
        cusid_tf.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        billid_tf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        paidamt_tf = new javax.swing.JTextField();
        paiddate_tf = new javax.swing.JTextField();
        paymode_cmb = new javax.swing.JComboBox<>();
        submit_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cusid_tf = new javax.swing.JTextField();
        pic1 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(15, 30, 70));
        jLabel12.setText("Bill Id");

        billid_tf.setEditable(false);
        billid_tf.setBackground(new java.awt.Color(255, 255, 255));
        billid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        billid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                billid_tfFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 30, 70));
        jLabel13.setText("Paid Amount");

        jLabel15.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(15, 30, 70));
        jLabel15.setText("Paid Date");

        jLabel16.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(15, 30, 70));
        jLabel16.setText("Pay Mode");

        paidamt_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        paidamt_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paidamt_tfKeyTyped(evt);
            }
        });

        paiddate_tf.setEditable(false);
        paiddate_tf.setBackground(new java.awt.Color(255, 255, 255));
        paiddate_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N

        paymode_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        paymode_cmb.setForeground(new java.awt.Color(15, 30, 70));
        paymode_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", "Demand Draft", "Online" }));
        paymode_cmb.setBorder(null);

        submit_bt.setBackground(new java.awt.Color(255, 255, 255));
        submit_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        submit_bt.setForeground(new java.awt.Color(15, 30, 70));
        submit_bt.setText("Submit");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 30, 70));
        jLabel1.setText("Make Payment Here!");

        jLabel14.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(15, 30, 70));
        jLabel14.setText("Customer Id");

        cusid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cusid_tfFocusLost(evt);
            }
        });

        lb.setText("B");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paiddate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paidamt_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymode_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cusid_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(billid_tf))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {billid_tf, cusid_tf, paidamt_tf, paiddate_tf, paymode_cmb});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paiddate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymode_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(15, 30, 70));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        try {
            stmt=con.prepareStatement("insert into payment values(?,?,?,?,?)");
            stmt.setString(1,billid_tf.getText());
            stmt.setString(3,paidamt_tf.getText());
            stmt.setString(5,paiddate_tf.getText());
            stmt.setString(4,paymode_cmb.getSelectedItem().toString());
            stmt.setString(2,cusid_tf.getText().toUpperCase());
            if(!(billid_tf.getText().length()==0||cusid_tf.getText().length()==0||paiddate_tf.getText().length()==0||paidamt_tf.getText().length()==0))
        {   stmt.executeUpdate();
            backdata.back("select * from payment","payment.xls");
            if(Float.parseFloat(paidamt_tf.getText())<f){
                stmt=con.prepareStatement("insert into arrear_details values(0,?,0,?,?)");
                stmt.setFloat(1,f-Float.parseFloat(paidamt_tf.getText()));
                stmt.setString(2,billid_tf.getText());
                stmt.setString(3,cusid_tf.getText().toUpperCase());
                stmt.executeUpdate();
            }else if(Float.parseFloat(paidamt_tf.getText())>=f){
                stmt=con.prepareStatement("insert into arrear_details values(?,0,0,?,?)");
                stmt.setFloat(1,Float.parseFloat(paidamt_tf.getText())-f);
                stmt.setString(2,billid_tf.getText());
                stmt.setString(3,cusid_tf.getText().toUpperCase());
                stmt.executeUpdate();
            }
            billid_tf.setText("");
            paidamt_tf.setText("");
            paiddate_tf.setText("");
            cusid_tf.setText("");
            lb.setText("");
            paymode_cmb.setSelectedIndex(0);
            JOptionPane.showMessageDialog(this,"Record Inserted Successfully!");cusid_tf.requestFocus();
        }
            else{
                JOptionPane.showMessageDialog(this,"Fill all the Fields!","Insertion Error",JOptionPane.WARNING_MESSAGE);
                cusid_tf.setText("");cusid_tf.requestFocus();
            }
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submit_btActionPerformed

    private void paidamt_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidamt_tfKeyTyped
       char ch=evt.getKeyChar();
       if(!((ch>=48 && ch<=57)||ch==8||ch==46)){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_paidamt_tfKeyTyped

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {close();
            this.dispose();
            if(rs1.getInt(2)==0)
                new mainwindow(rs1).setVisible(true);
            else
                new pcontroller(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
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

    private void billid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_billid_tfFocusLost
try{
    stmt=con.prepareStatement("select gross_total,due_date from bill_cycle where bill_id=? and upper(cus_id)=?");
            stmt.setString(1,billid_tf.getText());
            stmt.setString(2,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
                fetch();
            stmt=con.prepareStatement("select paid_date from payment where bill_id=?");
            stmt.setString(1,billid_tf.getText());
            rs=stmt.executeQuery();
            if(rs.next()){
                String s=rs.getString(1);
                JOptionPane.showMessageDialog(this,"Bill Already Paid on :"+s,"Incorrect Insertion!",JOptionPane.INFORMATION_MESSAGE);
                cusid_tf.setText("");
                lb.setText("");
                billid_tf.setText("");
                cusid_tf.requestFocus();
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_billid_tfFocusLost

    private void cusid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cusid_tfFocusLost
        try {
            stmt=con.prepareStatement("select bill_id from bill_cycle where upper(cus_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
            rs.last();
            billid_tf.setText(rs.getString(1));
            }
            else
                JOptionPane.showMessageDialog(this,"Invalid Customer ID!","Error Input",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cusid_tfFocusLost
        public void fetch() throws SQLException, ParseException{  
        d2=d1=dt.parse(rs.getString(2));
        f=rs.getFloat(1);
        System.out.println(d2);
        d2.setDate(d2.getDate()+10);
        System.out.println(d2);
               if(d1.before(d) && (d.before(d2)||d.equals(d2)))
                   f=f+f/10;  
               else if(d.after(d2)){
                   f=f+f/10;f=f+f/10;}
                   stmt=con.prepareStatement("update bill_cycle set gross_total=? where bill_id=?");
                   stmt.setFloat(1,f);
                   stmt.setString(2,billid_tf.getText());
                   stmt.executeUpdate();
                   lb.setText("Payable Amount : Rs."+f);
                   paidamt_tf.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billid_tf;
    private javax.swing.JTextField cusid_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JTextField paidamt_tf;
    private javax.swing.JTextField paiddate_tf;
    private javax.swing.JComboBox<String> paymode_cmb;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton submit_bt;
    // End of variables declaration//GEN-END:variables
}
