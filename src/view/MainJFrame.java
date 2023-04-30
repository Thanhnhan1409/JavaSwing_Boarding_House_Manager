/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import beanBHM.listBean;
import controllers.forwardController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** *
 * @author PC
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainJFrame() throws ClassNotFoundException, SQLException{
        initComponents();
        setTitle("Hệ thống quản lý nhà trọ");
        
        forwardController controller = new forwardController(jpnView);
        controller.setView(jpnRom, jlbRom);
        
        List<listBean> listItem = new ArrayList<>();
            listItem.add(new listBean("Rom",jpnRom, jlbRom));
            listItem.add(new listBean("Statistical",jpnStatistical, jlbStatistical));
            listItem.add(new listBean("Customer",jpnCustomer, jlbCustomer));
            listItem.add(new listBean("Transaction",jpnTransaction, jlbTransaction));
            
            controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnCustomer = new javax.swing.JPanel();
        jlbCustomer = new javax.swing.JLabel();
        jpnTitle = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jpnRom = new javax.swing.JPanel();
        jlbRom = new javax.swing.JLabel();
        jpnTransaction = new javax.swing.JPanel();
        jlbTransaction = new javax.swing.JLabel();
        jpnStatistical = new javax.swing.JPanel();
        jlbStatistical = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(153, 153, 153));

        jpnCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jpnCustomer.setPreferredSize(new java.awt.Dimension(230, 90));

        jlbCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCustomer.setText("Khách hàng");

        javax.swing.GroupLayout jpnCustomerLayout = new javax.swing.GroupLayout(jpnCustomer);
        jpnCustomer.setLayout(jpnCustomerLayout);
        jpnCustomerLayout.setHorizontalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnCustomerLayout.setVerticalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jpnTitle.setBackground(new java.awt.Color(51, 153, 0));

        jlbTitle.setBackground(new java.awt.Color(255, 255, 255));
        jlbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitle.setText("Quản lý nhà trọ");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlbTitle)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTitleLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jpnRom.setBackground(new java.awt.Color(255, 255, 255));
        jpnRom.setPreferredSize(new java.awt.Dimension(230, 90));

        jlbRom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbRom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbRom.setText("Phòng");

        javax.swing.GroupLayout jpnRomLayout = new javax.swing.GroupLayout(jpnRom);
        jpnRom.setLayout(jpnRomLayout);
        jpnRomLayout.setHorizontalGroup(
            jpnRomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbRom, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jpnRomLayout.setVerticalGroup(
            jpnRomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbRom, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jpnTransaction.setBackground(new java.awt.Color(255, 255, 255));
        jpnTransaction.setPreferredSize(new java.awt.Dimension(220, 90));

        jlbTransaction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbTransaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTransaction.setText("Giao dịch");

        javax.swing.GroupLayout jpnTransactionLayout = new javax.swing.GroupLayout(jpnTransaction);
        jpnTransaction.setLayout(jpnTransactionLayout);
        jpnTransactionLayout.setHorizontalGroup(
            jpnTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnTransactionLayout.setVerticalGroup(
            jpnTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jpnStatistical.setBackground(new java.awt.Color(255, 255, 255));
        jpnStatistical.setPreferredSize(new java.awt.Dimension(220, 90));

        jlbStatistical.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbStatistical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbStatistical.setText("Thống kê");

        javax.swing.GroupLayout jpnStatisticalLayout = new javax.swing.GroupLayout(jpnStatistical);
        jpnStatistical.setLayout(jpnStatisticalLayout);
        jpnStatisticalLayout.setHorizontalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbStatistical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnStatisticalLayout.setVerticalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbStatistical, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnStatistical, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jpnTransaction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jpnTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnMenuLayout.createSequentialGroup()
                    .addComponent(jpnRom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jpnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpnTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpnStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnMenuLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jpnRom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbCustomer;
    private javax.swing.JLabel jlbRom;
    private javax.swing.JLabel jlbStatistical;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JLabel jlbTransaction;
    private javax.swing.JPanel jpnCustomer;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRom;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStatistical;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JPanel jpnTransaction;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}