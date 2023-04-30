/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class RomsPanel extends javax.swing.JPanel {

    /**
     * Creates new form Roms
     */
    Connection con = null;
    Statement stmt = null;
    private final DefaultTableModel tableModel;
    public RomsPanel() throws ClassNotFoundException, SQLException {
        initComponents();
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/boardinghousemanager?useSSL=false";
        con = DriverManager.getConnection(url,"root","140903");
        stmt = con.createStatement();
        tableModel = (DefaultTableModel) jTable1.getModel();
        jpnAdd.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldVal = new javax.swing.JTextField();
        jpnAdd = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addQuantityBed = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        addPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        addUtilities = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Số giường", "Tiền phòng", "Tiện ích", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Byte.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách phòng ");

        jButton1.setText("Xem thông tin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm thông tin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cập nhật thông tin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Xóa thông tin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập id:");

        jpnAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Id");

        jLabel4.setText("Số giường");

        addQuantityBed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel5.setText("Tiền phòng");

        jLabel6.setText("Trạng thái");

        addStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));

        jLabel7.setText("Tiện ích");

        btAdd.setBackground(new java.awt.Color(51, 153, 0));
        btAdd.setForeground(new java.awt.Color(255, 255, 255));
        btAdd.setText("Thêm");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnAddLayout = new javax.swing.GroupLayout(jpnAdd);
        jpnAdd.setLayout(jpnAddLayout);
        jpnAddLayout.setHorizontalGroup(
            jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnAddLayout.createSequentialGroup()
                        .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(addId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addQuantityBed, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnAddLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(addPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addComponent(addUtilities)
                    .addGroup(jpnAddLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(53, 53, 53)
                .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(addStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jpnAddLayout.setVerticalGroup(
            jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addQuantityBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnAddLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUtilities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdd)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(fieldVal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jpnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Lấy chỉ số của hàng được chọn trong JTable
        jpnAdd.setVisible(false);
        int rowIndex = jTable1.getSelectedRow();

        // Nếu không có hàng nào được chọn, hiển thị thông báo lỗi
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để cập nhật!");
            return;
        }

        // Lấy giá trị từ JTable và gán vào các biến tương ứng
        String id = jTable1.getValueAt(rowIndex, 0).toString();
        String quantityBed = jTable1.getValueAt(rowIndex, 1).toString();
        String price = jTable1.getValueAt(rowIndex, 2).toString();
        String utilities = jTable1.getValueAt(rowIndex, 3).toString();
        String status = jTable1.getValueAt(rowIndex, 4).toString();

        // Cập nhật giá trị trong database
        try {
            String sql = "UPDATE rom SET quantityBed=?, price =? , utilities=?, status =?  WHERE id=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, quantityBed);
            statement.setString(2, price);
            statement.setString(3, utilities);
            statement.setString(4, status);
            statement.setString(5, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm có id = " + id);
            }
            sql = "SELECT * FROM Rom";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // clear table before adding rows
            tableModel.setRowCount(0);

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getString("id");
                row[1] = rs.getInt("quantitybed");
                row[2] = rs.getDouble("price");
                row[3] = rs.getString("utilities");
                row[4] = rs.getString("status");
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            jpnAdd.setVisible(false);
            String sql = null;
            if (fieldVal.getText().isBlank()) {
                sql = "SELECT * FROM Rom";
            } else {
                sql = "SELECT * FROM Rom WHERE id=?";
            }

            PreparedStatement pstmt = con.prepareStatement(sql);
            if (!fieldVal.getText().isBlank()) {
                pstmt.setString(1, fieldVal.getText());
            }

            ResultSet rs = pstmt.executeQuery();

            // clear table before adding rows
            tableModel.setRowCount(0);

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getString("id");
                row[1] = rs.getInt("quantitybed");
                row[2] = rs.getDouble("price");
                row[3] = rs.getString("utilities");
                row[4] = rs.getString("status");
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RomsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jpnAdd.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        try {
            
            String sql = "INSERT INTO rom (id, quantityBed, price, utilities, status) VALUES (?,?,?,?,?)";
            String id = addId.getText().toString();
            String quantityBed = addQuantityBed.getSelectedItem().toString();
            String price = addPrice.getText().toString();
            String status = addStatus.getSelectedItem().toString();
            String utilities = addUtilities.getText().toString();
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(2, quantityBed);
            statement.setString(3, price);
            statement.setString(4, utilities);
            statement.setString(5, status);
            statement.setString(1, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Thêm phòng thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm phòng thất bại!");
            }
            sql = "SELECT * FROM Rom";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // clear table before adding rows
            tableModel.setRowCount(0);

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getString("id");
                row[1] = rs.getInt("quantitybed");
                row[2] = rs.getDouble("price");
                row[3] = rs.getString("utilities");
                row[4] = rs.getString("status");
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jpnAdd.setVisible(false);
        int rowIndex = jTable1.getSelectedRow();

        // Nếu không có hàng nào được chọn, hiển thị thông báo lỗi
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa!");
            return;
        }
        
        String id = jTable1.getValueAt(rowIndex, 0).toString();
        
        try {
            
            String sql = "DELETE FROM rom where id =?";
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Xóa phòng thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa phòng thất bại!");
            }
            sql = "SELECT * FROM Rom";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // clear table before adding rows
            tableModel.setRowCount(0);

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getString("id");
                row[1] = rs.getInt("quantitybed");
                row[2] = rs.getDouble("price");
                row[3] = rs.getString("utilities");
                row[4] = rs.getString("status");
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addId;
    private javax.swing.JTextField addPrice;
    private javax.swing.JComboBox<String> addQuantityBed;
    private javax.swing.JComboBox<String> addStatus;
    private javax.swing.JTextField addUtilities;
    private javax.swing.JButton btAdd;
    private javax.swing.JTextField fieldVal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnAdd;
    // End of variables declaration//GEN-END:variables
}
