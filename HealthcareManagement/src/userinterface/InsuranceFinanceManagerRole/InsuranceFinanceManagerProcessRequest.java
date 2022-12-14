/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceFinanceManagerRole;

import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;
import model.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Akshita
 */
public class InsuranceFinanceManagerProcessRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private InsuranceWorkRequest insuranceWorkRequest;

    public InsuranceFinanceManagerProcessRequest(JPanel userProcessContainer, UserAccount userAccount, InsuranceWorkRequest insuranceWorkRequest, Enterprise enterprise) {
        initComponents();

        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Financial data.gif"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.insuranceWorkRequest = insuranceWorkRequest;
        txtPolicyNumber.setText(insuranceWorkRequest.getPolicyNum());
        txtSSN.setText(insuranceWorkRequest.getSsn());
        txtPolicyName.setText(insuranceWorkRequest.getPolicyName());
        txtClaimAmount.setText(String.valueOf(insuranceWorkRequest.getClaimAmount()));
        txtBillingAmount.setText(String.valueOf(insuranceWorkRequest.getBillAmount()));
        txtCoverage.setText(String.valueOf(insuranceWorkRequest.getInsCustomer().getInsurance().getCoverage()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCoverage = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPolicyName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtBillingAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        btnDisburse = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 17, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.setBackground(new java.awt.Color(22, 27, 34));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(188, 188, 188));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INSURANCE FINANCE REQUESTS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(188, 188, 188));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("You can manage request below.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(188, 188, 188));
        jLabel8.setText("Policy Number :");

        txtPolicyNumber.setEditable(false);
        txtPolicyNumber.setBackground(new java.awt.Color(22, 27, 34));
        txtPolicyNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPolicyNumber.setForeground(new java.awt.Color(188, 188, 188));
        txtPolicyNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPolicyNumberActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(188, 188, 188));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("SSN :");

        txtSSN.setEditable(false);
        txtSSN.setBackground(new java.awt.Color(22, 27, 34));
        txtSSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSSN.setForeground(new java.awt.Color(188, 188, 188));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(188, 188, 188));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Coverage(%) :");

        txtCoverage.setEditable(false);
        txtCoverage.setBackground(new java.awt.Color(22, 27, 34));
        txtCoverage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCoverage.setForeground(new java.awt.Color(188, 188, 188));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(188, 188, 188));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Policy Name :");

        txtPolicyName.setEditable(false);
        txtPolicyName.setBackground(new java.awt.Color(22, 27, 34));
        txtPolicyName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPolicyName.setForeground(new java.awt.Color(188, 188, 188));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(188, 188, 188));
        jLabel19.setText("Billing Amount($) :");

        txtBillingAmount.setEditable(false);
        txtBillingAmount.setBackground(new java.awt.Color(22, 27, 34));
        txtBillingAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBillingAmount.setForeground(new java.awt.Color(188, 188, 188));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(188, 188, 188));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Claim Amount($) :");

        txtClaimAmount.setEditable(false);
        txtClaimAmount.setBackground(new java.awt.Color(22, 27, 34));
        txtClaimAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClaimAmount.setForeground(new java.awt.Color(188, 188, 188));
        txtClaimAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaimAmountActionPerformed(evt);
            }
        });

        btnDisburse.setBackground(new java.awt.Color(22, 27, 34));
        btnDisburse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDisburse.setForeground(new java.awt.Color(188, 188, 188));
        btnDisburse.setText("Disburse Amount");
        btnDisburse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnDisburseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnDisburseFocusLost(evt);
            }
        });
        btnDisburse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDisburseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDisburseMouseExited(evt);
            }
        });
        btnDisburse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisburseActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(22, 27, 34));
        btnReject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(188, 188, 188));
        btnReject.setText("Reject Claim");
        btnReject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRejectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRejectFocusLost(evt);
            }
        });
        btnReject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRejectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRejectMouseExited(evt);
            }
        });
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel19)))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBillingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisburse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBillingAmount, txtClaimAmount, txtCoverage, txtPolicyName, txtPolicyNumber, txtSSN});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnDisburse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBillingAmount, txtClaimAmount, txtCoverage, txtPolicyName, txtPolicyNumber, txtSSN});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDisburse, btnReject});

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Financial data.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaimAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaimAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaimAmountActionPerformed

    private void txtPolicyNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPolicyNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPolicyNumberActionPerformed

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

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDisburseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisburseMouseEntered
        // TODO add your handling code here:
        btnDisburse.setForeground(new Color(0, 0, 0));
        btnDisburse.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnDisburseMouseEntered

    private void btnDisburseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisburseMouseExited
        // TODO add your handling code here:
        btnDisburse.setForeground(new Color(188, 188, 188));
        btnDisburse.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnDisburseMouseExited

    private void btnDisburseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisburseActionPerformed
        // TODO add your handling code here:

        btnDisburse.setEnabled(true);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceWorkRequest.setStatus("Insurance Claim Approved");
            JOptionPane.showMessageDialog(null, "Claim Approved Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            sendEmail(insuranceWorkRequest.getInsCustomer().getCustEmail(), "approved.");
            btnDisburse.setEnabled(false);
            btnReject.setEnabled(false);

            jLabel5.setIcon(null);
            jLabel5.revalidate();
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            InsuranceFinanceManagerWorkAreaJPanel iwjp = (InsuranceFinanceManagerWorkAreaJPanel) component;
            iwjp.populateTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }

    }//GEN-LAST:event_btnDisburseActionPerformed

    private void btnRejectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectMouseEntered
        // TODO add your handling code here:
        btnReject.setForeground(new Color(0, 0, 0));
        btnReject.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnRejectMouseEntered

    private void btnRejectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectMouseExited
        // TODO add your handling code here:
        btnReject.setForeground(new Color(188, 188, 188));
        btnReject.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnRejectMouseExited

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:

        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceWorkRequest.setStatus("Insurance Claim Rejected");
            btnReject.setEnabled(false);
            btnDisburse.setEnabled(false);
            sendEmail(insuranceWorkRequest.getInsCustomer().getCustEmail(), "declined.");
            
            JOptionPane.showMessageDialog(null, "Request Rejected", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            jLabel5.setIcon(null);
            jLabel5.revalidate();
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            InsuranceFinanceManagerWorkAreaJPanel iwjp = (InsuranceFinanceManagerWorkAreaJPanel) component;
            iwjp.populateTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
            
        }

    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnDisburseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDisburseFocusGained
        // TODO add your handling code here:
        btnDisburse.setForeground(new Color(0, 0, 0));
        btnDisburse.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnDisburseFocusGained

    private void btnDisburseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDisburseFocusLost
        // TODO add your handling code here:
        btnDisburse.setForeground(new Color(188, 188, 188));
        btnDisburse.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnDisburseFocusLost

    private void btnRejectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRejectFocusGained
        // TODO add your handling code here:
        btnReject.setForeground(new Color(0, 0, 0));
        btnReject.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnRejectFocusGained

    private void btnRejectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRejectFocusLost
        // TODO add your handling code here:
        btnReject.setForeground(new Color(188, 188, 188));
        btnReject.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnRejectFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDisburse;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBillingAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCoverage;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables

    private void sendEmail(String email, String decision) {
        Properties properties = new Properties();

        // Setup mail server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.from", "detectivesokka@gmail.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("detectivesokka@gmail.com", "ToTheLibrary123");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("detectivesokka@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Insurance Information");
            message.setContent("<img src=\"https://aaxelinsurance.com/wp-content/uploads/2017/03/banner-life-insurance.png\" style=\"width:950px;height:200px;\"><h1><right>" + enterprise.getName() + "</right></h1>"
                    + "<p>Dear " + insuranceWorkRequest.getInsCustomer().getCustFirstName() + ",</p>"
                    + "<p>Please find below the details regarding your insurance claim:</p>"
                    + "<p>Policy Number" + "        : " + txtPolicyNumber.getText() + "</p>"
                    + "<p>Total Bill Amount" + "        : $" + txtBillingAmount.getText() + "</p>"
                    + "<p>Claim Amount" + "        : $" + txtClaimAmount.getText() + "</p>"
                    + "<p>This is a follow up to our previous email and we want to inform you that your insurance claim has been " + decision + "</p>"
                    + "<p>Regards,</p>"
                    + "<p>" + userAccount.getEmp().getEmpName() + "</p><br/>", "text/html");

            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
