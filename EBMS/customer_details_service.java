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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class customer_details_service extends javax.swing.JFrame {
    String s1;
    Connection con;
    PreparedStatement stmt;
    ResultSet rs,rs1;
    ImageIcon img,img1,img2;
    public customer_details_service(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.rs1=rs1;
        this.setLocationRelativeTo(null);
        search_cmb.setSelectedItem("Customer_Id");
        search_tf.requestFocus();
        this.getRootPane().setDefaultButton(search_bt);
        //img=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        //pic1.setIcon(img);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img2);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search_tf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        search_bt = new javax.swing.JButton();
        search_cmb = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(15, 30, 70));

        search_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        search_tf.setForeground(new java.awt.Color(51, 0, 102));
        search_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        jLabel21.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Search Customer");

        search_bt.setBackground(new java.awt.Color(255, 255, 255));
        search_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        search_bt.setForeground(new java.awt.Color(15, 30, 70));
        search_bt.setText("Search");
        search_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 3));
        search_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btActionPerformed(evt);
            }
        });

        search_cmb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        search_cmb.setForeground(new java.awt.Color(15, 30, 70));
        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer Id", "Customer Name" }));

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
                .addGap(1, 1, 1)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(search_cmb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

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

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
        try {   
            String s="select * from customer_details where ";
            if(search_cmb.getSelectedItem().toString().equalsIgnoreCase("Customer Id")){
                s=s+"upper(cus_id)=?";
                stmt=con.prepareStatement(s,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                stmt.setString(1,search_tf.getText().toUpperCase());
                rs=stmt.executeQuery(); 
            if(rs.next()){
                this.dispose();
                new customersingle_service(rs1,rs).setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(this,"No Records Found!");
                search_tf.setText("");
            }
            else{
                s=s+"upper(cus_name)=?";
                try {
                    stmt=con.prepareStatement(s,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                     stmt.setString(1,search_tf.getText().toUpperCase());
                rs=stmt.executeQuery(); 
            if(rs.next()){
                this.dispose();
                new customertable_service(rs1,rs).setVisible(true);
            }
            else{
            JOptionPane.showMessageDialog(this,"No Records Found!");
                   search_tf.setText("");
            }
                } catch (SQLException ex) {
                    Logger.getLogger(customer_details_service.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(customer_details_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btActionPerformed

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {close();
            this.dispose();
            if(rs1.getInt(2)==0)
            new mainwindow(rs1).setVisible(true);
            else
            new controller(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JButton search_bt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTextField search_tf;
    // End of variables declaration//GEN-END:variables
}
