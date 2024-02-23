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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
public class afterlogin extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs,rs1;byte b;
    ImageIcon img,img1,img3;
    String s,c;boolean b1,b2;
    DefaultTableModel model;    
    public afterlogin(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.setLocationRelativeTo(null);
        panel.setVisible(false);
        this.rs1=rs1;
        this.getRootPane().setDefaultButton(mainwindow_bt);
        s=rs1.getString(1);
        img=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img3=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img3);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        model=(DefaultTableModel)table.getModel();
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        udetails_bt = new javax.swing.JButton();
        mainwindow_bt = new javax.swing.JButton();
        newuser_bt = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ureq_bt = new javax.swing.JButton();
        pic1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ok_bt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(795, 571));

        udetails_bt.setBackground(new java.awt.Color(255, 255, 255));
        udetails_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        udetails_bt.setForeground(new java.awt.Color(15, 30, 70));
        udetails_bt.setText("User Details");
        udetails_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        udetails_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udetails_btActionPerformed(evt);
            }
        });

        mainwindow_bt.setBackground(new java.awt.Color(255, 255, 255));
        mainwindow_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        mainwindow_bt.setForeground(new java.awt.Color(15, 30, 70));
        mainwindow_bt.setText("Main Window");
        mainwindow_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        mainwindow_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainwindow_btActionPerformed(evt);
            }
        });

        newuser_bt.setBackground(new java.awt.Color(255, 255, 255));
        newuser_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        newuser_bt.setForeground(new java.awt.Color(15, 30, 70));
        newuser_bt.setText("Create User");
        newuser_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        newuser_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuser_btActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(15, 30, 70));
        logout.setText("Log Out");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 30, 70));
        jLabel1.setText("Welcome Admin!");

        ureq_bt.setBackground(new java.awt.Color(255, 255, 255));
        ureq_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ureq_bt.setForeground(new java.awt.Color(15, 30, 70));
        ureq_bt.setText("New User Request");
        ureq_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        ureq_bt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ureq_bt.setVerifyInputWhenFocusTarget(false);
        ureq_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureq_btActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        table.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(15, 30, 70));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Id", "User Name", "User Role", "Accept", "Reject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(115, 130, 170));
        table.setSelectionBackground(new java.awt.Color(115, 130, 170));
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(25);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        ok_bt.setBackground(new java.awt.Color(255, 255, 255));
        ok_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ok_bt.setForeground(new java.awt.Color(15, 30, 70));
        ok_bt.setText("Ok");
        ok_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70), 2));
        ok_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ok_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ok_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainwindow_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newuser_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(udetails_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ureq_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {logout, newuser_bt, udetails_bt, ureq_bt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ureq_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainwindow_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(udetails_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newuser_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        System.exit(0);
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

    private void udetails_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udetails_btActionPerformed
        try {close();
            this.dispose();
            new user_details(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_udetails_btActionPerformed

    private void ureq_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureq_btActionPerformed
        try {   
            stmt=con.prepareStatement("select user_id,user_name,login_role_id from request",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery();
            if(rs.next()){
                rs.absolute(0);
                panel.setVisible(true);
            while(rs.next()){
                    switch (rs.getInt(3)) {
                        case 1: 
                            c="Payment Controller";
                            break;
                        case 2:
                            c="Bill Controller";
                            break;
                        case 3:
                            c="Arrear Controller";
                            break;
                    }
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),c,false,false});
                }   
            }
            else
                JOptionPane.showMessageDialog(this,"No Request!");
        } catch (SQLException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ureq_btActionPerformed

    private void mainwindow_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainwindow_btActionPerformed
        try {close();
            this.dispose();
            new mainwindow(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mainwindow_btActionPerformed

    private void newuser_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuser_btActionPerformed
        try {close();
            this.dispose();
            new newUser(rs1).setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newuser_btActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try {close();
            this.dispose();
            new login().setVisible(true);
        } catch (SQLException|ClassNotFoundException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void ok_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btActionPerformed
        try { for(byte i=0;i<model.getRowCount();i++){
            if(model.getValueAt(i,3)==null&&model.getValueAt(i,4)==null){
                model.removeRow(i);
                i--;
            }
            else if(!(model.getValueAt(i,3)==null)&&model.getValueAt(i,3).toString().equals("true")) {
                stmt=con.prepareStatement("select * from request where upper(user_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                stmt.setString(1,model.getValueAt(i,0).toString().toUpperCase());
                rs=stmt.executeQuery();
                rs.next();
                stmt=con.prepareStatement("insert into login values(?,?,'null',?,'null',?,?,?)");
                stmt.setString(1,rs.getString(1));
                stmt.setInt(2,rs.getInt(6));
                stmt.setString(3,rs.getString(5));
                stmt.setString(4,rs.getString(2));
                stmt.setString(5,rs.getString(3));
                stmt.setString(6,rs.getString(4));
                stmt.executeUpdate();
                stmt=con.prepareStatement("delete from request where upper(user_id)=?");
                stmt.setString(1,rs.getString(1).toUpperCase());
                stmt.executeUpdate();
                model.removeRow(i);
                --i;
            }
            else if(model.getValueAt(i,4).toString().equals("true")){
                stmt=con.prepareStatement("delete from request where upper(user_id)=?");
                stmt.setString(1,model.getValueAt(i,0).toString().toUpperCase());
                stmt.executeUpdate();
                model.removeRow(i);
                i--;}
        } backdata.back("select * from login","login.xls");
        } catch (SQLException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ok_btActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int r=table.getSelectedRow();
        int c=table.getSelectedColumn();
        if(model.getValueAt(r,3).toString().equalsIgnoreCase("true")&&c!=4)
        model.setValueAt(false,r,4);
        else if(model.getValueAt(r,4).toString().equalsIgnoreCase("true"))
        model.setValueAt(false,r,3);
    }//GEN-LAST:event_tableMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton mainwindow_bt;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JButton newuser_bt;
    private javax.swing.JButton ok_bt;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pic1;
    private javax.swing.JTable table;
    private javax.swing.JButton udetails_bt;
    private javax.swing.JButton ureq_bt;
    // End of variables declaration//GEN-END:variables
}
