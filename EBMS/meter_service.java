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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class meter_service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs,rs1;
    ImageIcon img,img1,img2;
    public meter_service(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        this.rs1=rs1;
        con=connDb.conLink();
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
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cusid_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        meterno_tf = new javax.swing.JTextField();
        meterrent_tf = new javax.swing.JTextField();
        search_bt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        panel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        updatecusid_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        updatemeterno_tf = new javax.swing.JTextField();
        updatemeterrent_tf = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 0, 102));
        jTabbedPane1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N

        jToolBar1.setRollover(true);

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Enter Meter Rent");

        cusid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("Enter Customer Id");

        jLabel7.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Enter Meter Number");

        meterno_tf.setEditable(false);
        meterno_tf.setBackground(new java.awt.Color(255, 255, 255));
        meterno_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        meterno_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 2)));

        meterrent_tf.setEditable(false);
        meterrent_tf.setBackground(new java.awt.Color(255, 255, 255));
        meterrent_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        meterrent_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));

        search_bt.setBackground(new java.awt.Color(255, 255, 255));
        search_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        search_bt.setForeground(new java.awt.Color(51, 0, 102));
        search_bt.setText("Search");
        search_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("Search Meter Details");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meterno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meterrent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel8)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meterno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meterrent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jToolBar1.add(panel1);

        jTabbedPane1.addTab("Search", jToolBar1);

        jToolBar2.setRollover(true);

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("Enter Meter Rent");

        updatecusid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        updatecusid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                updatecusid_tfFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Enter Customer Id");

        jLabel11.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Enter Meter Number");

        updatemeterno_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        updatemeterno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updatemeterno_tfKeyTyped(evt);
            }
        });

        updatemeterrent_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        updatemeterrent_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updatemeterrent_tfKeyTyped(evt);
            }
        });

        update_bt.setBackground(new java.awt.Color(255, 255, 255));
        update_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        update_bt.setForeground(new java.awt.Color(51, 0, 102));
        update_bt.setText("Update");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 102));
        jLabel12.setText("Update Meter");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatecusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatemeterrent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatemeterno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatecusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatemeterno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatemeterrent_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.add(panel2);

        jTabbedPane1.addTab("Update", jToolBar2);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
        try {
            stmt=con.prepareStatement("select * from meter where upper(cus_id)=?");
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                meterno_tf.setText(rs.getString(2));
                meterrent_tf.setText(rs.getString(3));
            }
            else
            JOptionPane.showMessageDialog(this,"No Records Found!");
        } catch (SQLException ex) {
            Logger.getLogger(meter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btActionPerformed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed
        try {
            stmt=con.prepareStatement("update meter set meter_no=?,meter_rent=? where upper(cus_id)=?");
            stmt.setString(3,updatecusid_tf.getText().toUpperCase());
            stmt.setString(1,updatemeterno_tf.getText());
            stmt.setString(2,updatemeterrent_tf.getText());
            stmt.executeUpdate();
            backdata.back("select * from meter","meter.xls");
            cusid_tf.setText("");
            meterno_tf.setText("");
            meterrent_tf.setText("");
            JOptionPane.showMessageDialog(this,"Records Updated Successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(meter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(meter_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void updatecusid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updatecusid_tfFocusLost
        try {
            stmt=con.prepareStatement("select * from meter where upper(cus_id)=?");
            stmt.setString(1,updatecusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                cusid_tf.setEditable(false);
                updatemeterno_tf.setText(rs.getString(2));
                updatemeterrent_tf.setText(rs.getString(3));
            }
            else
            JOptionPane.showMessageDialog(this,"No Records Found!");
        } catch (SQLException ex) {
            Logger.getLogger(meter_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updatecusid_tfFocusLost

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {
            close();
            this.dispose();
            if(rs1.getInt(2)==0)
            new mainwindow(rs1).setVisible(true);
            else
            new controller(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(meter_service.class.getName()).log(Level.SEVERE, null, ex);
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

    private void updatemeterno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatemeterno_tfKeyTyped
         char ch=evt.getKeyChar();
        if(!((ch>=48 && ch<=57)||!(meterno_tf.getText().length()<=11))){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_updatemeterno_tfKeyTyped

    private void updatemeterrent_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatemeterrent_tfKeyTyped
        char ch=evt.getKeyChar();
        if(!((ch>=48 && ch<=57)|| ch==8|| ch==46)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_updatemeterrent_tfKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusid_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField meterno_tf;
    private javax.swing.JTextField meterrent_tf;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton search_bt;
    private javax.swing.JButton update_bt;
    private javax.swing.JTextField updatecusid_tf;
    private javax.swing.JTextField updatemeterno_tf;
    private javax.swing.JTextField updatemeterrent_tf;
    // End of variables declaration//GEN-END:variables
}
