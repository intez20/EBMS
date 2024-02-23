package ebms;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class payment_details extends javax.swing.JFrame {
    ResultSet rs,rs1;
    PreparedStatement stmt;
    Connection con;
    Calendar c,c1;SimpleDateFormat dt;
    DefaultTableModel model;
    ImageIcon img,img1,img2;
    public payment_details(ResultSet rs1) throws SQLException, ClassNotFoundException {
        initComponents();
        con=connDb.conLink();
        cusid_tf.requestFocus();
        this.rs1=rs1;
         this.setIconImage(new ImageIcon(getClass().getResource("bspgcl.jpg")).getImage());
        c=Calendar.getInstance();
        c.add(Calendar.DATE,0);c.getTime();dp1.setMaxDate(c);dp2.setMaxDate(c);
        this.setLocationRelativeTo(null);
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
        this.getRootPane().setDefaultButton(search_bt);
        dp2.setEnabled(false);
        dt=new SimpleDateFormat("dd-MMM-yy");dp1.setDateFormat(dt);dp2.setDateFormat(dt);
        model=(DefaultTableModel)table.getModel();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cusid_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dp1 = new datechooser.beans.DateChooserCombo();
        dp2 = new datechooser.beans.DateChooserCombo();
        pic1 = new javax.swing.JLabel();
        search_bt = new javax.swing.JButton();
        minimize_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(15, 30, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(86, 200));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment  Details");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Id");

        cusid_tf.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        cusid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cusid_tfFocusLost(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("To");

        dp1.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dp1.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dp1.setCalendarPreferredSize(new java.awt.Dimension(325, 180));
    dp1.setNothingAllowed(false);
    dp1.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
    dp1.setFieldFont(new java.awt.Font("Century", java.awt.Font.PLAIN, 18));
    dp1.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    dp1.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            dp1OnSelectionChange(evt);
        }
    });

    dp2.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dp2.setCalendarBackground(new java.awt.Color(255, 255, 255));
dp2.setCalendarPreferredSize(new java.awt.Dimension(325, 180));
dp2.setNothingAllowed(false);
dp2.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
dp2.setFieldFont(new java.awt.Font("Century", java.awt.Font.PLAIN, 18));
dp2.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
dp2.setShowOneMonth(true);

search_bt.setBackground(new java.awt.Color(255, 255, 255));
search_bt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
search_bt.setForeground(new java.awt.Color(15, 30, 70));
search_bt.setText("Search");
search_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 30, 70)));
search_bt.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        search_btActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(dp1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(dp2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cusid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(33, Short.MAX_VALUE))
    );

    minimize_bt.setBackground(new java.awt.Color(255, 255, 255));
    minimize_bt.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
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
    exit_bt.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
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

    table.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Bill  Id", "Paid Amount", "Paid Date", "Pay Mode"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    table.setGridColor(new java.awt.Color(115, 130, 170));
    table.setRowHeight(20);
    table.setSelectionBackground(new java.awt.Color(15, 30, 70));
    table.setShowVerticalLines(false);
    jScrollPane1.setViewportView(table);
    if (table.getColumnModel().getColumnCount() > 0) {
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(3).setResizable(false);
    }

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                .addComponent(jScrollPane1))
            .addGap(0, 0, Short.MAX_VALUE))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exit_bt, minimize_bt});

    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(minimize_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(exit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, 0)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Logger.getLogger(payment_details.class.getName()).log(Level.SEVERE, null, ex);
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

    private void exit_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseExited
        exit_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_exit_btMouseExited

    private void exit_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btMouseMoved
        exit_bt.setBackground(new Color(220,0,0));
    }//GEN-LAST:event_exit_btMouseMoved

    private void minimize_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseExited
        minimize_bt.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_minimize_btMouseExited

    private void minimize_btMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btMouseMoved
        minimize_bt.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimize_btMouseMoved

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
        try {if(rs.next()){
            rs.beforeFirst();
            while(rs.next()){
               Date d=dt.parse(rs.getString(5));
               c1=Calendar.getInstance();
               c1.setTime(d);
               if((c1.compareTo(dp2.getSelectedDate())<=0)&&(c1.compareTo(dp1.getSelectedDate())>=0)){
                   model.addRow(new Object[]{rs.getString(1),rs.getString(3),dt.format(d),rs.getString(4)});  }           }  }
        else{
            JOptionPane.showMessageDialog(this,"NO Records Available Between Dates!");
        }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(payment_details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btActionPerformed

    private void dp1OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dp1OnSelectionChange
        c1=dp1.getSelectedDate();
        dp2.setMinDate(c1);
    }//GEN-LAST:event_dp1OnSelectionChange

    private void cusid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cusid_tfFocusLost
        try {
            stmt=con.prepareStatement("select * from payment where upper(cus_id)=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,cusid_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {  dp1.setEnabled(true);dp2.setEnabled(true);
               Date d=dt.parse(rs.getString(5));
               c1=Calendar.getInstance();
               c1.setTime(d);
               dp1.setMinDate(c1);
               dp2.setMinDate(c1);
               rs.beforeFirst();
               dp1.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid Customer Id!","Enter Correct Information",JOptionPane.ERROR_MESSAGE);
                cusid_tf.requestFocus();
                cusid_tf.setText("");
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(payment_details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cusid_tfFocusLost
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusid_tf;
    private datechooser.beans.DateChooserCombo dp1;
    private datechooser.beans.DateChooserCombo dp2;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimize_bt;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton search_bt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
