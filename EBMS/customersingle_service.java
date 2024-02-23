package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class customersingle_service extends javax.swing.JFrame {
    ResultSet rs,rs1;
    File f;
    Connection con;
    PreparedStatement stmt;
    boolean flag=true;
    ImageIcon img1,img2;
    public customersingle_service(ResultSet rs1,ResultSet rs) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.rs1=rs1;this.rs=rs;
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img2);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        this.setLocationRelativeTo(null);
        cusid_tf.setText(rs.getString(1).toUpperCase());
        cusname_tf.setText(rs.getString(2));
        cusadd_ta.setText(rs.getString(3));
        cusareatype_cmb.setSelectedItem(rs.getString(4));
        cusconnid_tf.setText(rs.getString(5));
        contno_tf.setText(rs.getString(6));
        emailid_tf.setText(rs.getString(7));
        conndate_tf.setText(rs.getString(8));
        cusverification_cmb.setSelectedItem(rs.getString(9));
        verification_tf.setText(rs.getString(10));
        Blob b;
                b=rs.getBlob(11);
                byte []data=b.getBytes(1,(int)b.length());
                ImageIcon img=new ImageIcon(new ImageIcon(data).getImage().getScaledInstance(pic_lb.getWidth(),pic_lb.getHeight(),Image.SCALE_DEFAULT));
                pic_lb.setIcon(img);
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
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(15, 30, 70));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Customer  Id");

        jLabel13.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Customer  Name");

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

        cusconnid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusconnid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        cusname_tf.setEditable(false);
        cusname_tf.setBackground(new java.awt.Color(255, 255, 255));
        cusname_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusname_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        pic_lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        upload_bt.setBackground(new java.awt.Color(255, 255, 255));
        upload_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        upload_bt.setForeground(new java.awt.Color(15, 30, 70));
        upload_bt.setText("Change Image");
        upload_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 3));
        upload_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_btActionPerformed(evt);
            }
        });

        submit_bt.setBackground(new java.awt.Color(255, 255, 255));
        submit_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        submit_bt.setForeground(new java.awt.Color(15, 30, 70));
        submit_bt.setText("Update");
        submit_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 3));
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        cusadd_ta.setColumns(20);
        cusadd_ta.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusadd_ta.setLineWrap(true);
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
        jLabel21.setText(" Customer Update");

        cusareatype_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cusareatype_cmb.setForeground(new java.awt.Color(15, 30, 70));
        cusareatype_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urban", "Rural" }));

        verification_tf.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        verification_tf.setForeground(new java.awt.Color(51, 0, 102));
        verification_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        cusverification_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cusverification_cmb.setForeground(new java.awt.Color(15, 30, 70));
        cusverification_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aadhar Number", "Pan Card", "Ration Card", "Voter Id", "Passport" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upload_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pic_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verification_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
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

    private void upload_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_btActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.showOpenDialog(null);
        f=jf.getSelectedFile();
        ImageIcon img=new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(pic_lb.getWidth(),pic_lb.getHeight(),Image.SCALE_DEFAULT));
        pic_lb.setIcon(img);  
        flag=false;
    }//GEN-LAST:event_upload_btActionPerformed

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        try {
            String s="update customer_details set cus_name=?,cus_add=?,cus_areatype=?,conn_id=?,cus_mobile=?,cus_email=?,conn_date=?,cus_verification=?,verification_no=?";
            if(!flag)
                s=s+",cus_photo=? where upper(cus_id)=?";
            else
                s=s+" where upper(cus_id)=?";
            stmt=con.prepareStatement(s);
            if(!flag ||f!=null ){
            FileInputStream fin=new FileInputStream(f);
            stmt.setBinaryStream(10,fin,fin.available());
            stmt.setString(11,cusid_tf.getText().toUpperCase());
            }   
            else
            stmt.setString(10,cusid_tf.getText().toUpperCase());
            stmt.setString(1,cusname_tf.getText());
            stmt.setString(2,cusadd_ta.getText());
            stmt.setString(3,cusareatype_cmb.getSelectedItem().toString());
            stmt.setString(4,cusconnid_tf.getText().toUpperCase());
            stmt.setString(5,contno_tf.getText());
            stmt.setString(6,emailid_tf.getText());
            stmt.setString(7,conndate_tf.getText());
            stmt.setString(8,cusverification_cmb.getSelectedItem().toString());
            stmt.setString(9,verification_tf.getText());
            stmt.executeUpdate();
            backdata.back("select * from customer_details","customer_details.xls");
            JOptionPane.showMessageDialog(this,"Record Updated Successfully!");
                    } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(customersingle_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submit_btActionPerformed

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {
            this.dispose();
            new customer_details_service(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(customersingle_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exit_btActionPerformed
public void close(){
        try {
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
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic_lb;
    private javax.swing.JButton submit_bt;
    private javax.swing.JButton upload_bt;
    private javax.swing.JTextField verification_tf;
    // End of variables declaration//GEN-END:variables
}
