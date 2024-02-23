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
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class bill_cycle_service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs,rs1;
    ImageIcon img,img1,img2;
    DefaultTableModel model;
    public bill_cycle_service(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        this.rs1=rs1;
        this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        img=new ImageIcon(new ImageIcon(getClass().getResource("bspgcl.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        img1=new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        exit_bt.setIcon(img1);
        img2=new ImageIcon(new ImageIcon(getClass().getResource("minim.png")).getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        minimize_bt.setIcon(img2);
        this.getRootPane().setDefaultButton(search_bt);
        UIManager.put("ToolTip.background",new Color(255,255,220));
        UIManager.put("ToolTip.font",new Font("Verdana",Font.PLAIN,15));
        exit_bt.setToolTipText("Close");
        minimize_bt.setToolTipText("Minimize");
        model=(DefaultTableModel)table.getModel();
        this.setLocationRelativeTo(null);
        scrollpane.getVerticalScrollBar().setUnitIncrement(40);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pic1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cusid_tf = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        search_bt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exit_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 645));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 30, 70));

        table.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(15, 30, 70));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Id", "Bill Date", "Previous Reading", "Current Reading", "Total Consume", "Energy Charges", "Electric Duty", "Govt. Subsidy", "Other Charges", "Gross Total", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(15, 30, 70));
        table.setSelectionBackground(new java.awt.Color(115, 130, 170));
        table.setShowVerticalLines(false);
        scrollpane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(8).setResizable(false);
            table.getColumnModel().getColumn(9).setResizable(false);
            table.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel21.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Customer Bill Details");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Customer Id");

        cusid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusid_tf.setForeground(new java.awt.Color(51, 0, 102));

        lb3.setBackground(new java.awt.Color(255, 255, 255));
        lb3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Connection Type:");

        lb2.setBackground(new java.awt.Color(255, 255, 255));
        lb2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Areatype:");

        lb1.setBackground(new java.awt.Color(255, 255, 255));
        lb1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Customer Name:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        try {close();
            this.dispose();
            if(rs1.getInt(2)==0)
                new mainwindow(rs1).setVisible(true);
            else
                new controller(rs1).setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(bill_cycle_service.class.getName()).log(Level.SEVERE, null, ex);
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

    private void minimize_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseMoved
        minimize_bt.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_minimize_btMouseMoved

    private void minimize_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseExited
        minimize_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimize_btMouseExited

    private void exit_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseMoved
        exit_bt.setBackground(new Color(220,0,0));
    }//GEN-LAST:event_exit_btMouseMoved

    private void exit_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseExited
        exit_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_exit_btMouseExited
    public void concall(){
        try {
            stmt=con.prepareStatement("select conn_type from connections where upper(conn_id)=?");
            stmt.setString(1,rs.getString(3).toUpperCase());
            rs=stmt.executeQuery();
            rs.next();    
            lb3.setText("Connection Type: "+rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(bill_cycle_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
        try {
            stmt=con.prepareStatement("select cus_name,cus_areatype,conn_id from customer_details where upper(cus_id)=?");
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                lb1.setText("Customer Name: "+rs.getString(1));
                lb2.setText("AreaType: "+rs.getString(2));
                concall();
            }
            stmt=con.prepareStatement("select * from bill_cycle where upper(cus_id)=?");
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(13),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(10),rs.getString(9),rs.getString(12),rs.getString(11)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(bill_cycle_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusid_tf;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic1;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JButton search_bt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
