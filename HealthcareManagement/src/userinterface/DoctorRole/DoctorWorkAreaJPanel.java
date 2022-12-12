/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.DoctorOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.PatientTreatmentWorkRequest;
import model.WorkQueue.WorkRequest;
import com.db4o.Db4o;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import userinterface.LoginJPanel;

/**
 *
 * @author Sai Dutt
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization doctorOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecosystem,DB4OUtil dB4OUtil) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.doctorOrganization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem=ecosystem;
        this.dB4OUtil=dB4OUtil;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[8];
            row[0] = ((PatientTreatmentWorkRequest) request).getRegDate();
            row[1] = String.valueOf(((PatientTreatmentWorkRequest) request).getPatient().getPatientId());
            row[2] = ((PatientTreatmentWorkRequest) request).getPatient().getPatientFirstName() + " " + ((PatientTreatmentWorkRequest) request).getPatient().getPatientLastName();
            row[3] = ((PatientTreatmentWorkRequest) request);
            row[4] = ((PatientTreatmentWorkRequest) request).getAssignedDoctor();
            row[5] = ((PatientTreatmentWorkRequest) request).getLabAssistant();
            row[6] = ((PatientTreatmentWorkRequest) request).getLabResult();
            row[7] = request.getStatus();

            model.addRow(row);

        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
        workRequestJTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
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
        requestTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        btnProvidePrescription = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogoutPatient = new javax.swing.JButton();

        setBackground(new java.awt.Color(13, 17, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(13, 17, 23));
        workRequestJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(188, 188, 188));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Registration Date", "Patient Id", "Patient Name", "Illness", "Assigned Doctor", "Lab Assistant", "Lab Result", "Treatment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 115, 1112, -1));

        requestTestJButton.setBackground(new java.awt.Color(13, 17, 23));
        requestTestJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(188, 188, 188));
        requestTestJButton.setText("Request Lab Test");
        requestTestJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestTestJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestTestJButtonMouseExited(evt);
            }
        });
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 575, 157, 32));

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(188, 188, 188));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 79, -1, 30));

        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(188, 188, 188));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 79, 158, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Medical Test Work Queue");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 79, 228, 30));

        btnAssignToMe.setBackground(new java.awt.Color(13, 17, 23));
        btnAssignToMe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(188, 188, 188));
        btnAssignToMe.setText("Assign To Me");
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
        add(btnAssignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 575, 157, 32));

        btnProvidePrescription.setBackground(new java.awt.Color(13, 17, 23));
        btnProvidePrescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProvidePrescription.setForeground(new java.awt.Color(188, 188, 188));
        btnProvidePrescription.setText("Provide Prescription");
        btnProvidePrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProvidePrescriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProvidePrescriptionMouseExited(evt);
            }
        });
        btnProvidePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvidePrescriptionActionPerformed(evt);
            }
        });
        add(btnProvidePrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 575, 157, 32));

        btnComplete.setBackground(new java.awt.Color(13, 17, 23));
        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(188, 188, 188));
        btnComplete.setText("Complete Treatment");
        btnComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompleteMouseExited(evt);
            }
        });
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 574, -1, 35));

        btnViewPatient.setBackground(new java.awt.Color(13, 17, 23));
        btnViewPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewPatient.setForeground(new java.awt.Color(188, 188, 188));
        btnViewPatient.setText("View Patient");
        btnViewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewPatientMouseExited(evt);
            }
        });
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });
        add(btnViewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 575, 157, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setText("DOCTOR WORK AREA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 6, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + workRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            WorkRequest patientTreatmentWorkRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).getAssignedDoctor() == null) {

                if (patientTreatmentWorkRequest.getStatus().equalsIgnoreCase("Waiting for Doctor")) {
                    ((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).setAssignedDoctor(userAccount);
                    patientTreatmentWorkRequest.setStatus("Under Consultation");
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null, "Success!! Request is assigned to you.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign this patient as its current state is: " + patientTreatmentWorkRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                if (userAccount.equals(((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).getAssignedDoctor())) {
                    JOptionPane.showMessageDialog(null, "Request is already assigned to you", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorized", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest patientWorkRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            patientWorkRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewPatientJPanel", new ViewPatientJPanel(userProcessContainer, userAccount, enterprise, patientWorkRequest));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnProvidePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Lab Test Completed") || workRequest.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        userProcessContainer.add("ProvidePrescriptionJPanel", new ProvidePrescriptionJPanel(userProcessContainer, userAccount, enterprise, workRequest, ecosystem));
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot prescribe the Patient as the status is: " + workRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnProvidePrescriptionActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Prescription Provided")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        userProcessContainer.add("RequestBillingJPanel", new RequestBillingJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                        workRequest.getPatient().setIsTreatmentFinished(true);
                        layout.next(userProcessContainer);
                    } else {
                        if (workRequest.getStatus().equalsIgnoreCase("Consultation Completed")) {
                            JOptionPane.showMessageDialog(null, "Treatment is already complete", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Prescription is needed for the treatment to be completed", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnViewPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPatientMouseEntered
        // TODO add your handling code here:
        btnViewPatient.setForeground(new Color(0,0,0));
        btnViewPatient.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnViewPatientMouseEntered

    private void btnViewPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPatientMouseExited
        // TODO add your handling code here:
        btnViewPatient.setForeground(new Color(188,188,188));
        btnViewPatient.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnViewPatientMouseExited

    private void btnAssignToMeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseEntered
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(0,0,0));
        btnAssignToMe.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnAssignToMeMouseEntered

    private void btnAssignToMeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseExited
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(188,188,188));
        btnAssignToMe.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnAssignToMeMouseExited

    private void requestTestJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTestJButtonMouseEntered
        // TODO add your handling code here:
        requestTestJButton.setForeground(new Color(0,0,0));
        requestTestJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_requestTestJButtonMouseEntered

    private void requestTestJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTestJButtonMouseExited
        // TODO add your handling code here:
        requestTestJButton.setForeground(new Color(188,188,188));
        requestTestJButton.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_requestTestJButtonMouseExited

    private void btnProvidePrescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionMouseEntered
        // TODO add your handling code here:
        btnProvidePrescription.setForeground(new Color(0,0,0));
        btnProvidePrescription.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnProvidePrescriptionMouseEntered

    private void btnProvidePrescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionMouseExited
        // TODO add your handling code here:
        btnProvidePrescription.setForeground(new Color(188,188,188));
        btnProvidePrescription.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnProvidePrescriptionMouseExited

    private void btnCompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompleteMouseEntered
        // TODO add your handling code here:
        btnComplete.setForeground(new Color(0,0,0));
        btnComplete.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnCompleteMouseEntered

    private void btnCompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompleteMouseExited
        // TODO add your handling code here:
        btnComplete.setForeground(new Color(188,188,188));
        btnComplete.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnCompleteMouseExited

    private void btnLogoutPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseEntered
        // TODO add your handling code here:
        btnLogoutPatient.setForeground(new Color(255,255,255));
        btnLogoutPatient.setBackground(new Color(158,33,50));
    }//GEN-LAST:event_btnLogoutPatientMouseEntered

    private void btnLogoutPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseExited
        // TODO add your handling code here:
        btnLogoutPatient.setForeground(new Color(188,188,188));
        btnLogoutPatient.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnLogoutPatientMouseExited

    private void btnLogoutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutPatientActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.removeAll();
        LoginJPanel lp= new LoginJPanel(ecosystem,dB4OUtil,userProcessContainer );
        userProcessContainer.add("LoginJPanel", lp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
        
    }//GEN-LAST:event_btnLogoutPatientActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnLogoutPatient;
    private javax.swing.JButton btnProvidePrescription;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
