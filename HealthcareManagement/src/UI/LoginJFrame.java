package UI;

import Doctor.Doctor;
import Driver.Driver;
import Nurse.Nurse;
import Patient.Patient;
import System.HMSystem;
import User.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ganesh 
 * @author Sai Dutt
 */
public class LoginJFrame extends javax.swing.JFrame {
    
    public HMSystem system;
    public String role;
    
    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        
        system = HMSystem.getInstance();
        initComponents();        
        disableEverything();
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
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        fldUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fldPassword = new javax.swing.JPasswordField();
        lblSelectRole = new javax.swing.JLabel();
        comboSelectRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsername.setText("Username");

        lblPassword.setText("Password");

        fldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUsernameActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblSelectRole.setText("Select Role");

        comboSelectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Patient", "Nurse", "Driver", "Insurance agent", "Policeman", "Pharmacist", "Seller", "System admin", "ME admin", "GE admin", "PE admin", "SE admin" }));
        comboSelectRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectRoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldUsername)
                                    .addComponent(fldPassword)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboSelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnLogin))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUsernameActionPerformed
    
    private void disableEverything() {
        
        fldUsername.setEnabled(false);
        fldPassword.setEnabled(false);
        btnRegister.setEnabled(false);
        btnLogin.setEnabled(false);
    }
    
    private void enableEverything() {
        
        fldUsername.setEnabled(true);
        fldPassword.setEnabled(true);
        btnRegister.setEnabled(true);
        btnLogin.setEnabled(true);
    }
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        JFrame userFrame=new JFrame();    
        JPanel userPanel = new JPanel();
        
        // going to the relevant registration panels                    
        switch (this.role) {
            
            case "Doctor" -> {
                
                userPanel = new RegisterDoctorJPanel();                
            }
            case "Patient" -> {
                
                userPanel = new RegisterPatientJPanel();                
            }
            case "Driver" -> {
                
                userPanel = new RegisterDriverJPanel();
            }
            case "Nurse" -> {
                
                userPanel = new RegisterNurseJPanel();
            }
            
            case "Pharmacist" ->{
                
                userPanel = new RegisterPharmacistJPanel();
            }
            
            case "Seller" ->{
                
                userPanel = new RegisterSellerJPanel();
            }
            
            case "Insurance agent" ->{
                
                userPanel = new RegisterAgentInsuranceJPanel();
            }
            
            default -> {
                
                return;
            }
        }                      
           
        userFrame.getContentPane().add(userPanel);                
        
        // Window opens in full size mode
        userFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);             
        userFrame.setVisible(true);                            
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        // Since getPassword() returns a character array we convert it to String using String.valueOf()
        String pwd = String.valueOf(fldPassword.getPassword());
        User user = null;
       
        for(User u : system.getUserDirectory().getUserList()) {
            
            if (u.getUserName().equals(fldUsername.getText()) && u.isPassword(pwd))
            {
                user = u;
                break;
            }
        }
        
        if(user != null) {                        
            
            JFrame userFrame=new JFrame();    
            JPanel userPanel = new JPanel();
            
            // going to the relevant panels            
            if (user.getProfile() instanceof Doctor) { 
                                
                userPanel = new DoctorJPanel((Doctor)user.getProfile());                
                
            } else if (user.getProfile() instanceof Patient) {
                                
                userPanel = new PatientJPanel((Patient)user.getProfile());                
                
            } else if (user.getProfile() instanceof Nurse) {
                
                userPanel = new NurseJPanel((Nurse)user.getProfile());               
                
            } else if (user.getProfile() instanceof Driver) {
                                
                userPanel = new DriverJPanel((Driver)user.getProfile());                                   
            }
            
            userFrame.getContentPane().add(userPanel); // link panel to frame
            
            // Window opens in full size mode
            userFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);             
            userFrame.setVisible(true); // display frame           
            
        } else {
            
            // Show error message
            JOptionPane.showMessageDialog(null, "Incorrect username/password. Please try again later.");
        }
        
        clearPasswordField();     
    }//GEN-LAST:event_btnLoginActionPerformed

    private void comboSelectRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectRoleActionPerformed
        
        this.role = (String)comboSelectRole.getSelectedItem();
        enableEverything();        
    }//GEN-LAST:event_comboSelectRoleActionPerformed
    
    private void clearPasswordField() {
        
        fldPassword.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> comboSelectRole;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSelectRole;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
