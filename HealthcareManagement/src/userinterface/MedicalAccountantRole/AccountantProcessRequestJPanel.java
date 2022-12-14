/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalAccountantRole;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.InsuranceEnterprise;
import model.Insurance.Insurance;
import model.InsuranceCustomer.InsuranceCustomer;
import model.Network.HealthcareNetwork;
import model.Organization.AccountantOrganization;
import model.Organization.InsBrokerOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import model.WorkQueue.AccountantBillingRequest;
import model.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sai Dutt & Ganesh
 */
public class AccountantProcessRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AccountantOrganization accountantOrganization;
    private AccountantBillingRequest accountBillingRequest;
    private EcoSystem ecosystem;
    private double payableAmount;

    public AccountantProcessRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, AccountantBillingRequest request, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.accountBillingRequest = request;
        this.ecosystem = ecoSystem;
        populate();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCOllectCash = new javax.swing.JButton();
        btnSendRequestForInsurance = new javax.swing.JButton();
        txtPayableAmount = new javax.swing.JLabel();
        txtInsuranceClaimAmount = new javax.swing.JLabel();
        txtBillAmount = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JLabel();
        txtSSN = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JLabel();
        txtInsurancePolicyName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 17, 23));
        setPreferredSize(new java.awt.Dimension(1190, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 27, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(188, 188, 188));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PROCESS BILLING REQUEST");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 6, 319, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SSN :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 170, 167, 29));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(188, 188, 188));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("FirstName :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 211, 167, 27));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(188, 188, 188));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("LastName :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 250, 167, 27));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(188, 188, 188));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Bill Amount :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 289, 167, 27));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(188, 188, 188));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Insurance Policy Name :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 131, 167, 27));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(188, 188, 188));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Payable Amount :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 367, 167, 29));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(188, 188, 188));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Policy Number :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 92, 167, 27));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(188, 188, 188));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Insurance Claim Amount :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 328, -1, 27));

        btnCOllectCash.setBackground(new java.awt.Color(22, 27, 34));
        btnCOllectCash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCOllectCash.setForeground(new java.awt.Color(188, 188, 188));
        btnCOllectCash.setText("Send Billing Info");
        btnCOllectCash.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCOllectCashFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnCOllectCashFocusLost(evt);
            }
        });
        btnCOllectCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCOllectCashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCOllectCashMouseExited(evt);
            }
        });
        btnCOllectCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOllectCashActionPerformed(evt);
            }
        });
        jPanel1.add(btnCOllectCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 439, 171, 33));

        btnSendRequestForInsurance.setBackground(new java.awt.Color(22, 27, 34));
        btnSendRequestForInsurance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSendRequestForInsurance.setForeground(new java.awt.Color(188, 188, 188));
        btnSendRequestForInsurance.setText("Send request for Claim");
        btnSendRequestForInsurance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSendRequestForInsuranceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSendRequestForInsuranceFocusLost(evt);
            }
        });
        btnSendRequestForInsurance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendRequestForInsuranceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendRequestForInsuranceMouseExited(evt);
            }
        });
        btnSendRequestForInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestForInsuranceActionPerformed(evt);
            }
        });
        jPanel1.add(btnSendRequestForInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 478, -1, 33));

        txtPayableAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPayableAmount.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtPayableAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 367, 138, 29));

        txtInsuranceClaimAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtInsuranceClaimAmount.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtInsuranceClaimAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 328, 138, 27));

        txtBillAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBillAmount.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtBillAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 289, 138, 27));

        txtPolicyNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPolicyNumber.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtPolicyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 138, 27));

        txtSSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSSN.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 172, 138, 27));

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 211, 138, 27));

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 250, 138, 27));

        txtInsurancePolicyName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtInsurancePolicyName.setForeground(new java.awt.Color(188, 188, 188));
        jPanel1.add(txtInsurancePolicyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 131, 138, 27));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Invoice_1.gif"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 500, 500));

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(188, 188, 188));
        jLabel13.setText("PROCESS BILLING REQUEST AREA");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, 380, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestForInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestForInsuranceActionPerformed
        String policyNumber = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurancePolicyNumber();
        String ssn = accountBillingRequest.getPatient().getPatientSSN();
        String policyName = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getPolicyName();
        String insuranceCompany = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getIncCompany();
        double claimAmount = Math.floor(Double.parseDouble(txtInsuranceClaimAmount.getText()));
        double billAmount = accountBillingRequest.getBillingAmount();
        if (("Patient Transaction Completed").equals(accountBillingRequest.getStatus())) {
            JOptionPane.showMessageDialog(null, "Insurance request sent for claim", "Success", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Insurance insurance = new Insurance(policyName, insuranceCompany, claimAmount);
        insurance.setCoverage(accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getCoverage());

        accountBillingRequest.getPatient().getInsuranceCustomer().setCustFirstName(accountBillingRequest.getPatient().getPatientFirstName());
        accountBillingRequest.getPatient().getInsuranceCustomer().setCustLastName(accountBillingRequest.getPatient().getPatientLastName());
        accountBillingRequest.getPatient().getInsuranceCustomer().setCustEmail(accountBillingRequest.getPatient().getPatientEmail());

        InsuranceWorkRequest insuranceWorkRequest = new InsuranceWorkRequest();
        insuranceWorkRequest.setIncCompany(insuranceCompany);
        insuranceWorkRequest.setPolicyNum(policyNumber);
        insuranceWorkRequest.setPolicyName(policyName);
        insuranceWorkRequest.setSsn(ssn);
        insuranceWorkRequest.setClaimAmount(claimAmount);
        insuranceWorkRequest.setBillAmount(billAmount);
        insuranceWorkRequest.setHealthCenter(enterprise.getName());
        insuranceWorkRequest.setSender(userAccount);
        insuranceWorkRequest.setStatus("Sent");
        insuranceWorkRequest.setInsCustomer(accountBillingRequest.getPatient().getInsuranceCustomer());

        Organization org = null;
        InsuranceEnterprise matchedInsuranceCompany = null;

        List<HealthcareNetwork> networks = ecosystem.getNetworks();
        for (HealthcareNetwork network : networks) {
            List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
            for (Enterprise enterprise : enterprises) {
                if (enterprise.getName().equalsIgnoreCase(accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getIncCompany())) {
                    matchedInsuranceCompany = (InsuranceEnterprise) enterprise;
                }
            }
        }

        for (Organization organization : matchedInsuranceCompany.getOrganizationDirectory().getOrganizations()) {
            if (organization instanceof InsBrokerOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequests().add(insuranceWorkRequest);
            userAccount.getWorkQueue().getWorkRequests().add(insuranceWorkRequest);
            accountBillingRequest.setStatus("Patient Transaction Completed");
            String toMail = accountBillingRequest.getPatient().getPatientEmail();
            sendEmail();
            accountBillingRequest.getPatient().setIsTreatmentFinished(true);
            JOptionPane.showMessageDialog(null, "Money received from patient: " + String.valueOf(Math.floor(payableAmount)) + ". Insurance Claim Request Raised Successfully for amount:" + Math.floor(claimAmount), "Success", JOptionPane.INFORMATION_MESSAGE);
            btnSendRequestForInsurance.setEnabled(false);

            jLabel5.setIcon(null);
            jLabel5.revalidate();

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            ProcessMedicalBillingsJPanel awjp = (ProcessMedicalBillingsJPanel) component;
            awjp.populateTable();
            awjp.populateInsuranceClaimTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }


    }//GEN-LAST:event_btnSendRequestForInsuranceActionPerformed

    private void btnCOllectCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOllectCashActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("EmailBillingInformationToPatient", new EmailBillingInformationToPatient(userProcessContainer, accountBillingRequest, txtPayableAmount.getText(), userAccount, enterprise));
        layout.next(userProcessContainer);
        btnCOllectCash.setEnabled(false);

    }//GEN-LAST:event_btnCOllectCashActionPerformed

    private void btnCOllectCashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCOllectCashMouseEntered
        // TODO add your handling code here:
        btnCOllectCash.setForeground(new Color(255, 255, 255));
        btnCOllectCash.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnCOllectCashMouseEntered

    private void btnCOllectCashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCOllectCashMouseExited
        // TODO add your handling code here:
        btnCOllectCash.setForeground(new Color(188, 188, 188));
        btnCOllectCash.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnCOllectCashMouseExited

    private void btnCOllectCashFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCOllectCashFocusGained
        // TODO add your handling code here:
        btnCOllectCash.setForeground(new Color(255, 255, 255));
        btnCOllectCash.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnCOllectCashFocusGained

    private void btnCOllectCashFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCOllectCashFocusLost
        // TODO add your handling code here:
        btnCOllectCash.setForeground(new Color(188, 188, 188));
        btnCOllectCash.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnCOllectCashFocusLost

    private void btnSendRequestForInsuranceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendRequestForInsuranceMouseEntered
        // TODO add your handling code here:
        btnSendRequestForInsurance.setForeground(new Color(255, 255, 255));
        btnSendRequestForInsurance.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnSendRequestForInsuranceMouseEntered

    private void btnSendRequestForInsuranceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendRequestForInsuranceMouseExited
        // TODO add your handling code here:
        btnSendRequestForInsurance.setForeground(new Color(188, 188, 188));
        btnSendRequestForInsurance.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnSendRequestForInsuranceMouseExited

    private void btnSendRequestForInsuranceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSendRequestForInsuranceFocusGained
        // TODO add your handling code here:
        btnSendRequestForInsurance.setForeground(new Color(255, 255, 255));
        btnSendRequestForInsurance.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnSendRequestForInsuranceFocusGained

    private void btnSendRequestForInsuranceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSendRequestForInsuranceFocusLost
        // TODO add your handling code here:
        btnSendRequestForInsurance.setForeground(new Color(188, 188, 188));
        btnSendRequestForInsurance.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnSendRequestForInsuranceFocusLost

    private void backJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseEntered
        // TODO add your handling code here:
        backJButton.setForeground(new Color(0, 0, 0));
        backJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_backJButtonMouseEntered

    private void backJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseExited
        // TODO add your handling code here:
        backJButton.setForeground(new Color(188, 188, 188));
        backJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_backJButtonMouseExited

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jLabel5.setIcon(null);
        jLabel5.revalidate();

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessMedicalBillingsJPanel awjp = (ProcessMedicalBillingsJPanel) component;
        awjp.populateTable();
        awjp.populateInsuranceClaimTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCOllectCash;
    private javax.swing.JButton btnSendRequestForInsurance;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBillAmount;
    private javax.swing.JLabel txtFirstName;
    private javax.swing.JLabel txtInsuranceClaimAmount;
    private javax.swing.JLabel txtInsurancePolicyName;
    private javax.swing.JLabel txtLastName;
    private javax.swing.JLabel txtPayableAmount;
    private javax.swing.JLabel txtPolicyNumber;
    private javax.swing.JLabel txtSSN;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        String policyNumber = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurancePolicyNumber();
        DecimalFormat df2 = new DecimalFormat("#.##");
        double coverage = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getCoverage();
        double billAmount = Math.floor(accountBillingRequest.getBillingAmount());
        String ssn = accountBillingRequest.getPatient().getPatientSSN();
        String policyName = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getPolicyName();
        String insuranceCompany = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getIncCompany();
        double claimAmount = Math.floor((coverage * billAmount) / 100);
        payableAmount = billAmount - claimAmount;

        txtPolicyNumber.setText(policyNumber);
        txtSSN.setText(ssn);
        txtFirstName.setText(accountBillingRequest.getPatient().getPatientFirstName());
        txtLastName.setText(accountBillingRequest.getPatient().getPatientLastName());
        txtBillAmount.setText(String.valueOf(billAmount));
        txtInsurancePolicyName.setText(policyName);
        txtInsuranceClaimAmount.setText(String.valueOf(claimAmount));
        txtPayableAmount.setText(String.valueOf(df2.format(payableAmount)));

        if (claimAmount > 0) {
            btnSendRequestForInsurance.setEnabled(true);
            btnCOllectCash.setEnabled(false);
        } else {
            btnCOllectCash.setEnabled(true);
            btnSendRequestForInsurance.setEnabled(false);
        }

    }

    private void sendEmail() {
        final String username = "aedprojectak@outlook.com";
        final String password = "Kamshetty707$";
        Properties props = new Properties();
       
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");
       
        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("aedprojectak@outlook.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(accountBillingRequest.getPatient().getPatientEmail()));
            message.setSubject("Patient Billing Information");
            // Send the actual HTML message, as big as you like
            message.setContent("<img src=\"http://aquariusmedical.ca/wp-content/themes/aquarius/img/inner-banner1.png\" style=\"width:950px;height:200px;\"><h1><right>" + enterprise.getName() + "</right></h1>"
                    + "<p>Dear " + accountBillingRequest.getPatient().getPatientFirstName() + ",</p>"
                    + "<p>Your treatment was completed. Please find below the final billing details:</p>"
                    + "<p>Total Bill Amount" + "           : $" + txtBillAmount.getText() + "</p>"
                    + "<p>Amount Covered by Insurance : $" + txtInsuranceClaimAmount.getText() + "</p>"
                    + "<p>Total Payable Amount" + "        : $" + txtPayableAmount.getText() + "</p>"
                    + "<p>Regards,</p>"
                    + "<p>" + userAccount.getEmp().getEmpName() + "</p><br/>", "text/html");
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
