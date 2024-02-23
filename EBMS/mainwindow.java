package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
public class mainwindow extends javax.swing.JFrame {
    String s;
    Connection con;
    ResultSet rs;
    byte b=0;
    ImageIcon img3,img1,img2;
    public mainwindow(ResultSet rs) throws SQLException, ClassNotFoundException {
        initComponents();
        this.setEnabled(true);
        con=connDb.conLink();
        this.rs=rs;
        s=rs.getString(1);
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        img3=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_DEFAULT));
        pic.setIcon(img3);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img2);
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        service_bt = new javax.swing.JButton();
        entry_bt = new javax.swing.JButton();
        logout_bt = new javax.swing.JButton();
        epanel = new javax.swing.JPanel();
        customer_lb = new javax.swing.JLabel();
        bill_lb = new javax.swing.JLabel();
        meter_lb = new javax.swing.JLabel();
        conntype_lb = new javax.swing.JLabel();
        payment_lb = new javax.swing.JLabel();
        rcvr_lb = new javax.swing.JLabel();
        chngpwd_bt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        minimize_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 634));

        service_bt.setBackground(new java.awt.Color(255, 255, 255));
        service_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        service_bt.setForeground(new java.awt.Color(15, 30, 70));
        service_bt.setText("Service Form");
        service_bt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 30, 70), 1, true));
        service_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                service_btActionPerformed(evt);
            }
        });

        entry_bt.setBackground(new java.awt.Color(255, 255, 255));
        entry_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        entry_bt.setForeground(new java.awt.Color(15, 30, 70));
        entry_bt.setText("Entry Form");
        entry_bt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 30, 70), 1, true));
        entry_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_btActionPerformed(evt);
            }
        });

        logout_bt.setBackground(new java.awt.Color(255, 255, 255));
        logout_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        logout_bt.setForeground(new java.awt.Color(15, 30, 70));
        logout_bt.setText("Log Out");
        logout_bt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 30, 70), 1, true));
        logout_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btActionPerformed(evt);
            }
        });

        epanel.setBackground(new java.awt.Color(15, 30, 70));

        customer_lb.setBackground(new java.awt.Color(51, 0, 102));
        customer_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        customer_lb.setForeground(new java.awt.Color(255, 255, 255));
        customer_lb.setLabelFor(customer_lb);
        customer_lb.setText(" New Customer Entry");
        customer_lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        customer_lb.setIconTextGap(8);
        customer_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                customer_lbMouseMoved(evt);
            }
        });
        customer_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_lbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customer_lbMouseExited(evt);
            }
        });

        bill_lb.setBackground(new java.awt.Color(51, 0, 102));
        bill_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        bill_lb.setForeground(new java.awt.Color(255, 255, 255));
        bill_lb.setText(" Create Bill");
        bill_lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        bill_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bill_lbMouseMoved(evt);
            }
        });
        bill_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bill_lbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bill_lbMouseExited(evt);
            }
        });

        meter_lb.setBackground(new java.awt.Color(51, 0, 102));
        meter_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        meter_lb.setForeground(new java.awt.Color(255, 255, 255));
        meter_lb.setText(" Issue Meter");
        meter_lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        meter_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                meter_lbMouseMoved(evt);
            }
        });
        meter_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meter_lbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meter_lbMouseExited(evt);
            }
        });

        conntype_lb.setBackground(new java.awt.Color(51, 0, 102));
        conntype_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        conntype_lb.setForeground(new java.awt.Color(255, 255, 255));
        conntype_lb.setText(" New Connection Type Entry");
        conntype_lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        conntype_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                conntype_lbMouseMoved(evt);
            }
        });
        conntype_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conntype_lbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conntype_lbMouseExited(evt);
            }
        });

        payment_lb.setBackground(new java.awt.Color(51, 0, 102));
        payment_lb.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        payment_lb.setForeground(new java.awt.Color(255, 255, 255));
        payment_lb.setText(" Make Payment");
        payment_lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        payment_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                payment_lbMouseMoved(evt);
            }
        });
        payment_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payment_lbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payment_lbMouseExited(evt);
            }
        });

        rcvr_lb.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        rcvr_lb.setForeground(new java.awt.Color(255, 255, 255));
        rcvr_lb.setText("Recover");
        rcvr_lb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                rcvr_lbMouseMoved(evt);
            }
        });
        rcvr_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rcvr_lbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rcvr_lbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout epanelLayout = new javax.swing.GroupLayout(epanel);
        epanel.setLayout(epanelLayout);
        epanelLayout.setHorizontalGroup(
            epanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epanelLayout.createSequentialGroup()
                .addGroup(epanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(epanelLayout.createSequentialGroup()
                        .addGroup(epanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(epanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(payment_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, epanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(epanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(conntype_lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                                    .addComponent(meter_lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bill_lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customer_lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, epanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rcvr_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        epanelLayout.setVerticalGroup(
            epanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(customer_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bill_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(meter_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(conntype_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(payment_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rcvr_lb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customer_lb.getAccessibleContext().setAccessibleDescription("");

        chngpwd_bt.setBackground(new java.awt.Color(255, 255, 255));
        chngpwd_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        chngpwd_bt.setForeground(new java.awt.Color(15, 30, 70));
        chngpwd_bt.setText("Change Password");
        chngpwd_bt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 30, 70), 1, true));
        chngpwd_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chngpwd_btActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(15, 30, 70));
        jPanel2.setForeground(new java.awt.Color(15, 30, 70));

        jLabel1.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIHAR STATE POWER GENERATION COMPANY LIMITED");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

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
                .addGap(121, 121, 121)
                .addComponent(entry_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(service_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(logout_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chngpwd_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(epanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entry_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(epanel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chngpwd_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimize_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimize_btActionPerformed

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {if(con!=null)
            con.close();
            this.dispose();
            new afterlogin(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exit_btActionPerformed

    private void customer_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_lbMouseClicked
        try {if(con!=null)
            con.close();
            this.dispose();
            if(b==0)
            new customer_details(rs).setVisible(true);
            else
            new  customer_details_service(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_customer_lbMouseClicked

    private void bill_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_lbMouseClicked
         try {if(con!=null)
            con.close();
             this.dispose();
             if(b==0)
            new bill_cycle(rs).setVisible(true);
             else
                 new bill_cycle_service(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bill_lbMouseClicked

    private void payment_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payment_lbMouseClicked
         try {if(con!=null)
            con.close();
             this.dispose();
             if(b==0)
            new payment(rs).setVisible(true);
         else
             new payment_details(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payment_lbMouseClicked

    private void meter_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meter_lbMouseClicked
         try {if(con!=null)
            con.close();
            if(b==0){
                this.setEnabled(false);
            new meter(this).setVisible(true);
            }
            else{
                this.dispose();
            new meter_service(rs).setVisible(true);
            }} catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meter_lbMouseClicked

    private void conntype_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conntype_lbMouseClicked
         try {if(con!=null)
            con.close();
            this.dispose();
            if(b==0)
            new connections(rs).setVisible(true);
            else
            new connectionquery(rs).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_conntype_lbMouseClicked

    private void logout_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btActionPerformed
        try {if(rs!=null)
            rs.close();
            if(con!=null)
            con.close();
            this.dispose();
            new login().setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logout_btActionPerformed

    private void chngpwd_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chngpwd_btActionPerformed
        try {this.setEnabled(false);
            new changepwd(s,this).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chngpwd_btActionPerformed

    private void service_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_service_btActionPerformed
        b=1;
        bill_lb.setText(" Bill Details");
        customer_lb.setText(" Customer Details");
        meter_lb.setText(" Meter Information");
        payment_lb.setText(" Payment Details");
        conntype_lb.setText(" Connection Types Information");
    }//GEN-LAST:event_service_btActionPerformed

    private void entry_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_btActionPerformed
        b=0;
        bill_lb.setText(" Create Bill");
        customer_lb.setText(" New Customer Entry");
        meter_lb.setText(" Issue Meter");
        conntype_lb.setText(" New Connection Type Entry");
        payment_lb.setText(" Make Payment");
    }//GEN-LAST:event_entry_btActionPerformed

    private void customer_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_lbMouseMoved
        customer_lb.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_customer_lbMouseMoved

    private void customer_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_lbMouseExited
        customer_lb.setBorder(BorderFactory.createLineBorder(Color.white,2));
    }//GEN-LAST:event_customer_lbMouseExited

    private void bill_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_lbMouseMoved
        bill_lb.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_bill_lbMouseMoved

    private void meter_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meter_lbMouseMoved
        meter_lb.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_meter_lbMouseMoved

    private void conntype_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conntype_lbMouseMoved
        conntype_lb.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_conntype_lbMouseMoved

    private void payment_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payment_lbMouseMoved
        payment_lb.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_payment_lbMouseMoved

    private void bill_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_lbMouseExited
        bill_lb.setBorder(BorderFactory.createLineBorder(Color.white,2));
    }//GEN-LAST:event_bill_lbMouseExited

    private void meter_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meter_lbMouseExited
        meter_lb.setBorder(BorderFactory.createLineBorder(Color.white,2));       
    }//GEN-LAST:event_meter_lbMouseExited

    private void conntype_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conntype_lbMouseExited
        conntype_lb.setBorder(BorderFactory.createLineBorder(Color.white,2));      
    }//GEN-LAST:event_conntype_lbMouseExited

    private void payment_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payment_lbMouseExited
            payment_lb.setBorder(BorderFactory.createLineBorder(Color.white,2));        
    }//GEN-LAST:event_payment_lbMouseExited

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

    private void rcvr_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcvr_lbMouseClicked
        try {
            this.setEnabled(false);
            new Recovery(this).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rcvr_lbMouseClicked

    private void rcvr_lbMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcvr_lbMouseMoved
        Font f=new Font("Century",Font.BOLD,17);
        rcvr_lb.setFont(f);
    }//GEN-LAST:event_rcvr_lbMouseMoved

    private void rcvr_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rcvr_lbMouseExited
        Font f=new Font("Century",Font.BOLD,16);
        rcvr_lb.setFont(f);
    }//GEN-LAST:event_rcvr_lbMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bill_lb;
    private javax.swing.JButton chngpwd_bt;
    private javax.swing.JLabel conntype_lb;
    private javax.swing.JLabel customer_lb;
    private javax.swing.JButton entry_bt;
    private javax.swing.JPanel epanel;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout_bt;
    private javax.swing.JLabel meter_lb;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel payment_lb;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel rcvr_lb;
    private javax.swing.JButton service_bt;
    // End of variables declaration//GEN-END:variables
}
