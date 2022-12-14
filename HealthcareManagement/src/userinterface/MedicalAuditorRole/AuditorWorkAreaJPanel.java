/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalAuditorRole;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.NGOAuditorOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import model.WorkQueue.NGOFundRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import userinterface.LoginJPanel;

/**
 *
 * @author Sai Dutt and Ganesh
 */
public class AuditorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private UserAccount userAccount;
    private NGOAuditorOrganization MedicalOfficerOrganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil;
    private EcoSystem ecoSystem;

    public AuditorWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.enterprise = enterprise;

        this.jPanel = jpanel;
        this.dB4OUtil = dB4OUtil;
        this.MedicalOfficerOrganization = (NGOAuditorOrganization) organization;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        valueLabel.setText(enterprise.getName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnLogoutPatient = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(13, 17, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(13, 17, 23));
        workRequestJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(188, 188, 188));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1120, 450));

        btnLogoutPatient.setBackground(new java.awt.Color(13, 17, 23));
        btnLogoutPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogoutPatient.setForeground(new java.awt.Color(188, 188, 188));
        btnLogoutPatient.setText("Logout");
        btnLogoutPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutPatientMouseExited(evt);
            }
        });
        btnLogoutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutPatientActionPerformed(evt);
            }
        });
        add(btnLogoutPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 10, -1, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(188, 188, 188));
        jLabel5.setText("GOVERNMENT AUDITOR WORK AREA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 6, 410, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Insurance Work Queue");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 79, 228, 30));

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(188, 188, 188));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 79, -1, 30));

        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(188, 188, 188));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 79, 158, 30));

        btnAssign.setBackground(new java.awt.Color(13, 17, 23));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(188, 188, 188));
        btnAssign.setText("Assign To Me");
        btnAssign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignMouseExited(evt);
            }
        });
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 157, 32));

        processRequestBtn.setBackground(new java.awt.Color(13, 17, 23));
        processRequestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        processRequestBtn.setForeground(new java.awt.Color(188, 188, 188));
        processRequestBtn.setText("Process Request");
        processRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                processRequestBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                processRequestBtnMouseExited(evt);
            }
        });
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });
        add(processRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 157, 32));
    }// </editor-fold>//GEN-END:initComponents


    private void btnLogoutPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseEntered
        // TODO add your handling code here:
        btnLogoutPatient.setForeground(new Color(255, 255, 255));
        btnLogoutPatient.setBackground(new Color(158, 33, 50));
    }//GEN-LAST:event_btnLogoutPatientMouseEntered

    private void btnLogoutPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseExited
        // TODO add your handling code here:
        btnLogoutPatient.setForeground(new Color(188, 188, 188));
        btnLogoutPatient.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnLogoutPatientMouseExited

    private void btnLogoutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutPatientActionPerformed
        // TODO add your handling code here:

        jPanel.removeAll();
        LoginJPanel lp = new LoginJPanel(ecoSystem, dB4OUtil, jPanel);
        jPanel.add("LoginJPanel", lp);
        CardLayout crdLyt = (CardLayout) jPanel.getLayout();
        crdLyt.next(jPanel);
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_btnLogoutPatientActionPerformed

    private void btnAssignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignMouseEntered
        // TODO add your handling code here:
        btnAssign.setForeground(new Color(0, 0, 0));
        btnAssign.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAssignMouseEntered

    private void btnAssignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignMouseExited
        // TODO add your handling code here:
        btnAssign.setForeground(new Color(188, 188, 188));
        btnAssign.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAssignMouseExited

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row first from the table to view details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            WorkRequest request = (NGOFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmp().getEmpName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success. Request is assigned to you", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cannot assign this work request, as the work request is in " + request.getStatus() + " status", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void processRequestBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processRequestBtnMouseEntered
        // TODO add your handling code here:
        processRequestBtn.setForeground(new Color(0, 0, 0));
        processRequestBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_processRequestBtnMouseEntered

    private void processRequestBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processRequestBtnMouseExited
        // TODO add your handling code here:
        processRequestBtn.setForeground(new Color(188, 188, 188));
        processRequestBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_processRequestBtnMouseExited

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row first from the table to view details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            NGOFundRequest request = (NGOFundRequest) workRequestJTable.getValueAt(selectedRow, 0);

            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "Request already processed", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Request needs to be assigned first", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!userAccount.getEmp().equals(request.getReceiver().getEmp())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other auditor", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {

                AuditorProcessWorkRequestJPanel panel = new AuditorProcessWorkRequestJPanel(jPanel, userAccount, request, enterprise, ecoSystem);
                jPanel.add("OfficerProcessWorkRequestJPanel", panel);
                CardLayout layout = (CardLayout) jPanel.getLayout();
                layout.next(jPanel);

            }
        }

    }//GEN-LAST:event_processRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnLogoutPatient;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : MedicalOfficerOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[5];
            String status = request.getStatus();
            row[0] = ((NGOFundRequest) request);
            row[1] = request.getSender().getEmp().getEmpName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getEmpName();
            }
            row[3] = request.getStatus();
            row[4] = ((NGOFundRequest) request).getAmount();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }
}
