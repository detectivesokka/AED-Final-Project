/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceFinanceManagerRole;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.InsFinanceTeamOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.InsuranceWorkRequest;
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
 * @author Akshita
 */
public class InsuranceFinanceManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsFinanceTeamOrganization insuranceFinanceOrganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil;
    private EcoSystem ecosystem;
    
    public InsuranceFinanceManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, InsFinanceTeamOrganization insuranceFinanceOrganization, Enterprise enterprise,DB4OUtil dB4OUtil,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.insuranceFinanceOrganization = insuranceFinanceOrganization;
        this.enterprise = enterprise;
        this.dB4OUtil=dB4OUtil;
        this.ecosystem=ecosystem;
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
        tblFinance = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnLogoutPatient = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnProcessReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(13, 17, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFinance.setBackground(new java.awt.Color(13, 17, 23));
        tblFinance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblFinance.setForeground(new java.awt.Color(188, 188, 188));
        tblFinance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Policy Number", "Policy Name", "Coverage%", "Claim Amount", "Bill Amount", "Insurance Claim Status", "Requesting HealthCenter ", "Finance Manager"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFinance);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1120, 430));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(188, 188, 188));
        jLabel4.setText("INSURANCE FINANCE WORK AREA");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 6, 400, -1));

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

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(188, 188, 188));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(188, 188, 188));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 158, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Insurance Work Queue");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, 228, 30));

        btnAssign.setBackground(new java.awt.Color(13, 17, 23));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(188, 188, 188));
        btnAssign.setText("Assign to Me");
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
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 157, 32));

        btnProcessReq.setBackground(new java.awt.Color(13, 17, 23));
        btnProcessReq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProcessReq.setForeground(new java.awt.Color(188, 188, 188));
        btnProcessReq.setText("Process Request");
        btnProcessReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProcessReqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProcessReqMouseExited(evt);
            }
        });
        btnProcessReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessReqActionPerformed(evt);
            }
        });
        add(btnProcessReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 157, 32));
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

        userProcessContainer.removeAll();
        LoginJPanel lp = new LoginJPanel(ecosystem, dB4OUtil, userProcessContainer);
        userProcessContainer.add("LoginJPanel", lp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutPatientActionPerformed

    private void btnAssignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignMouseEntered
        // TODO add your handling code here:
        btnAssign.setForeground(new Color(0,0,0));
        btnAssign.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnAssignMouseEntered

    private void btnAssignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignMouseExited
        // TODO add your handling code here:
        btnAssign.setForeground(new Color(188,188,188));
        btnAssign.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnAssignMouseExited

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectedRow = tblFinance.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row first from the table to view details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            WorkRequest request = (InsuranceWorkRequest) tblFinance.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent To Finance Department")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmp().getEmpName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success. Request is assigned to you", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessReqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcessReqMouseEntered
        // TODO add your handling code here:
        btnProcessReq.setForeground(new Color(0,0,0));
        btnProcessReq.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnProcessReqMouseEntered

    private void btnProcessReqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcessReqMouseExited
        // TODO add your handling code here:
        btnProcessReq.setForeground(new Color(188,188,188));
        btnProcessReq.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnProcessReqMouseExited

    private void btnProcessReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessReqActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblFinance.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row first from the table to view details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            InsuranceWorkRequest insuranceWorkRequest = (InsuranceWorkRequest) tblFinance.getValueAt(selectedRow, 0);
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Sent To Finance Department")) {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Insurance Claim Approved")) {
                JOptionPane.showMessageDialog(null, "Request already Completed", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!userAccount.equals(insuranceWorkRequest.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!userAccount.getEmp().equals(insuranceWorkRequest.getReceiver().getEmp())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other manager", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (insuranceWorkRequest.getStatus().equals("Insurance Claim Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {

                InsuranceFinanceManagerProcessRequest panel = new InsuranceFinanceManagerProcessRequest(userProcessContainer, userAccount, insuranceWorkRequest, enterprise);
                userProcessContainer.add("OfficerProcessWorkRequestJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            }
        }
        
    }//GEN-LAST:event_btnProcessReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnLogoutPatient;
    private javax.swing.JButton btnProcessReq;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFinance;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblFinance.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : insuranceFinanceOrganization.getWorkQueue().getWorkRequests()) {
            InsuranceWorkRequest insuranceworkRequest = ((InsuranceWorkRequest) workRequest);
            Object[] row = new Object[8];
            row[0] = insuranceworkRequest;
            row[1] = insuranceworkRequest.getPolicyName();
            row[2] = insuranceworkRequest.getInsCustomer().getInsurance().getCoverage();
            row[3] = insuranceworkRequest.getClaimAmount();
            row[4] = insuranceworkRequest.getBillAmount();
            row[5] = insuranceworkRequest.getStatus();
            row[6] = insuranceworkRequest.getIncCompany();
            row[7] = insuranceworkRequest.getReceiver() == null ? "" : insuranceworkRequest.getReceiver().getEmp().getEmpName();

            model.addRow(row);
        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblFinance.setRowSorter(sorter);
    }

}
