package ebms;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Recovery extends javax.swing.JFrame { 
    ResultSet rs;ResultSetMetaData rsmd;
    Object obj;String str,filename,url;
PreparedStatement stmt,st;
Connection con;
File f;
    public Recovery(Object obj) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.obj=obj;
        rcvr_cmb.setSelectedIndex(0);
        this.setLocationRelativeTo(null);
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rcvr_cmb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        back_bt.setBackground(new java.awt.Color(255, 255, 255));
        back_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        back_bt.setForeground(new java.awt.Color(15, 30, 70));
        back_bt.setText("Back");
        back_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        back_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECOVERY");

        rcvr_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        rcvr_cmb.setForeground(new java.awt.Color(51, 0, 102));
        rcvr_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Users", "Bill", "Customer Details", "Meter", "Payments", "Arrear", "Connection", "Automatic" }));
        rcvr_cmb.setBorder(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Recover");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rcvr_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(rcvr_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btActionPerformed
        this.dispose();
        ((mainwindow)obj).setEnabled(true);
        ((mainwindow)obj).setVisible(true);
    }//GEN-LAST:event_back_btActionPerformed
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        str=rcvr_cmb.getSelectedItem().toString();
        if(str.equalsIgnoreCase("Customer Details")){
            stmt=con.prepareStatement("truncate table customer_details");
            stmt.executeUpdate();
            f=new File("backup\\customer_details.xls"); 
            st=con.prepareStatement("select * from customer_details");
            url="Insert into customer_details values(?,?,?,?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Users")){
            stmt=con.prepareStatement("truncate table login");
            stmt.executeUpdate();
            f=new File("backup\\login.xls"); 
              st=con.prepareStatement("select * from login");
            url="Insert into login(login_user_id,login_role_id,question,login_user_password,answer,user_name,user_mobile,user_email) values(?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Connection")){
            stmt=con.prepareStatement("truncate table connections");
            stmt.executeUpdate();
            f=new File("backup\\connections.xls");
            st=con.prepareStatement("select * from connections");
            url="Insert into payment_details values(?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Meter")){
            stmt=con.prepareStatement("truncate table meter");
            stmt.executeUpdate();
            f=new File("backup\\meter.xls"); 
            st=con.prepareStatement("select cus_id,meter_no,meter_rent from meter");
            url="Insert into meter(cus_id,meter_no,meter_rent) values(?,?,?)";
        }
        else if(str.equalsIgnoreCase("Bill")){
            stmt=con.prepareStatement("truncate table bill_cycle");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from bill_cycle");
            f=new File("backup\\bill_cycle.xls");
            url="Insert into bill_cycle values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Payments")){
            stmt=con.prepareStatement("truncate table payment");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from payment");
            f=new File("backup\\payment.xls");     
            url="Insert into scheme_detail values(?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Arrear")){
            stmt=con.prepareStatement("truncate table arrear_details");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from arrear_details");
            f=new File("backup\\arrear_details.xls");     
            url="Insert into arrear_details values(?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("automatic")){
            stmt=con.prepareStatement("truncate table automatic");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from automatic");
            f=new File("backup\\autobackup.xls");     
            url="insert into automatic values(?,?,?)";
        }
                FileInputStream fs=new FileInputStream(f);
                Workbook wb=Workbook.getWorkbook(fs);
                Sheet sh=wb.getSheet(0);
                stmt=con.prepareStatement(url);
                ResultSetMetaData rsmd=st.getMetaData();
                for(byte i=1;i<sh.getRows();i++){
                    for(byte j=0;j<sh.getColumns();j++){
                        String str=sh.getCell(j,i).getContents();
                        if(rsmd.getColumnTypeName(j+1).equalsIgnoreCase("blob")){
                              InputStream inr=new ByteArrayInputStream(str.substring(1,str.length()).getBytes(StandardCharsets.UTF_8));
                          stmt.setBinaryStream(j+1,inr);
                          FileInputStream fin=new FileInputStream(str.substring(1,str.length()));
                        }else
                            stmt.setString(j+1,str.substring(1,str.length()));
                    }
                    stmt.executeUpdate();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Recovery.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | BiffException | SQLException ex) {
                Logger.getLogger(Recovery.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> rcvr_cmb;
    // End of variables declaration//GEN-END:variables
}
