/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalAccountantRole;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.AccountantOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.AccountantBillingRequest;
import model.WorkQueue.InsuranceWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sai Dutt & Ganesh
 */
public class ProcessMedicalBillingsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AccountantOrganization accountantOrganization;
    private EcoSystem ecoSystem;

    public ProcessMedicalBillingsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, AccountantOrganization accountantOrganization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.ecoSystem = ecoSystem;
        populateTable();
        populateInsuranceClaimTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processRequestBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInsurance = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 17, 23));
        setMinimumSize(new java.awt.Dimension(1200, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processRequestBtn.setBackground(new java.awt.Color(22, 27, 34));
        processRequestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        processRequestBtn.setForeground(new java.awt.Color(188, 188, 188));
        processRequestBtn.setText("Process Request");
        processRequestBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                processRequestBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                processRequestBtnFocusLost(evt);
            }
        });
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
        add(processRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, 37));

        workRequestJTable.setBackground(new java.awt.Color(13, 17, 23));
        workRequestJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(188, 188, 188));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PatientId", "Patient Name", "Assigned Doctor", "Accountant ", "Status", "Billing Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 95, 1140, 156));

        btnAssignToMe.setBackground(new java.awt.Color(22, 27, 34));
        btnAssignToMe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(188, 188, 188));
        btnAssignToMe.setText("AssignToMe");
        btnAssignToMe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAssignToMeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAssignToMeFocusLost(evt);
            }
        });
        btnAssignToMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignToMeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignToMeMouseExited(evt);
            }
        });
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });
        add(btnAssignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, 37));

        tblInsurance.setBackground(new java.awt.Color(13, 17, 23));
        tblInsurance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblInsurance.setForeground(new java.awt.Color(188, 188, 188));
        tblInsurance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Accountant", "Insurance Agent", "Billing Amount", "Claim Amount", "Claim Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInsurance);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 364, 1140, 156));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setText("Insurance Claim Status Table");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(188, 188, 188));
        jLabel3.setText("Patient Billing Table");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        backJButton.setBackground(new java.awt.Color(13, 17, 23));
        backJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(188, 188, 188));
        backJButton.setText("Back");
        backJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backJButtonMouseExited(evt);
            }
        });
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(188, 188, 188));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PATIENT BILLING AREA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, 380, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            AccountantBillingRequest accountBillingRequest = (AccountantBillingRequest) workRequestJTable.getValueAt(selectedRow, 5);

            if (accountBillingRequest.getReceiver() != null) {
                if (accountBillingRequest.getReceiver().equals(userAccount)) {
                    if (accountBillingRequest.getStatus().equalsIgnoreCase("Pending on " + accountBillingRequest.getReceiver().getEmp().getEmpName())) {
                        AccountantProcessRequestJPanel panel = new AccountantProcessRequestJPanel(userProcessContainer, userAccount, accountBillingRequest, enterprise, ecoSystem);
                        userProcessContainer.add("AccountantProcessRequestJPanel", panel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot process Request as request is in " + accountBillingRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a record to be assigned", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
//        }
    }//GEN-LAST:event_processRequestBtnActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            WorkRequest request = (AccountantBillingRequest) workRequestJTable.getValueAt(selectedRow, 5);
            if (request.getReceiver() == null) {

                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmp().getEmpName());
                JOptionPane.showMessageDialog(null, "Request assigned", "Success", JOptionPane.INFORMATION_MESSAGE);
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "The request is already assigned", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void backJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseEntered
        // TODO add your handling code here:
        backJButton.setForeground(new Color(0,0,0));
        backJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_backJButtonMouseEntered

    private void backJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseExited
        // TODO add your handling code here:
        backJButton.setForeground(new Color(188,188,188));
        backJButton.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_backJButtonMouseExited

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAssignToMeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAssignToMeFocusGained
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(255, 255, 255));
        btnAssignToMe.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAssignToMeFocusGained

    private void btnAssignToMeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAssignToMeFocusLost
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(188, 188, 188));
        btnAssignToMe.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAssignToMeFocusLost

    private void btnAssignToMeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseEntered
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(255, 255, 255));
        btnAssignToMe.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAssignToMeMouseEntered

    private void btnAssignToMeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseExited
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(188, 188, 188));
        btnAssignToMe.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAssignToMeMouseExited

    private void processRequestBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_processRequestBtnFocusGained
        // TODO add your handling code here:
        processRequestBtn.setForeground(new Color(255, 255, 255));
        processRequestBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_processRequestBtnFocusGained

    private void processRequestBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_processRequestBtnFocusLost
        // TODO add your handling code here:
        processRequestBtn.setForeground(new Color(188, 188, 188));
        processRequestBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_processRequestBtnFocusLost

    private void processRequestBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processRequestBtnMouseEntered
        // TODO add your handling code here:
        processRequestBtn.setForeground(new Color(255, 255, 255));
        processRequestBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_processRequestBtnMouseEntered

    private void processRequestBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processRequestBtnMouseExited
        // TODO add your handling code here:
        processRequestBtn.setForeground(new Color(188, 188, 188));
        processRequestBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_processRequestBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable tblInsurance;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : accountantOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[6];
            String status = request.getStatus();
            row[0] = ((AccountantBillingRequest) request).getPatient();
            row[1] = ((AccountantBillingRequest) request).getPatient().getPatientFirstName() + " " + ((AccountantBillingRequest) request).getPatient().getPatientLastName();
            row[2] = request.getSender().getEmp().getEmpName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getEmpName();
            }
            row[4] = request.getStatus();
            row[5] = ((AccountantBillingRequest) request);

            model.addRow(row);
        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);

    }

    public void populateInsuranceClaimTable() {
        List<InsuranceWorkRequest> insuranceWorkRequests = new ArrayList<>();
        ArrayList<WorkRequest> workRequests = userAccount.getWorkQueue().getWorkRequests();
        for (WorkRequest workRequest : workRequests) {
            if (workRequest instanceof InsuranceWorkRequest) {
                insuranceWorkRequests.add((InsuranceWorkRequest) workRequest);
            }
        }

        DefaultTableModel model = (DefaultTableModel) tblInsurance.getModel();

        model.setRowCount(0);
        for (InsuranceWorkRequest insuranceWorkRequest : insuranceWorkRequests) {
            Object[] row = new Object[6];
            row[0] = insuranceWorkRequest;
            row[1] = userAccount.getEmp().getEmpName();
            row[2] = insuranceWorkRequest.getReceiver() == null ? "" : insuranceWorkRequest.getReceiver().getEmp().getEmpName();
            row[3] = insuranceWorkRequest.getBillAmount();
            row[4] = insuranceWorkRequest.getClaimAmount();
            row[5] = insuranceWorkRequest.getStatus();
            model.addRow(row);

        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblInsurance.setRowSorter(sorter);
    }
}
