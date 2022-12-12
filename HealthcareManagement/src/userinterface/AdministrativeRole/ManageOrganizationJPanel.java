/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Organization.Organization.Type;
import model.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sai Dutt
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory, Enterprise enterprise) {
        initComponents();
        
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Credit card.gif"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);
        
        
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;

        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        for (Type orgType : enterprise.getAllOrganizationTypes()) {
            organizationJComboBox.addItem(orgType);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizations()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization;

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        organizationJTable.setRowSorter(sorter);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnAddOrg = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        btnDeleteOrg = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(22, 27, 34));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(188, 188, 188));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MANAGE ORGANIZATIONS");

        btnAddOrg.setBackground(new java.awt.Color(22, 27, 34));
        btnAddOrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddOrg.setForeground(new java.awt.Color(188, 188, 188));
        btnAddOrg.setText("Add Organization");
        btnAddOrg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAddOrgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAddOrgFocusLost(evt);
            }
        });
        btnAddOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddOrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddOrgMouseExited(evt);
            }
        });
        btnAddOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrgActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(188, 188, 188));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("You can manage organizations below.");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(188, 188, 188));
        jLabel10.setText("Organization Type:");

        organizationJTable.setBackground(new java.awt.Color(22, 27, 34));
        organizationJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(188, 188, 188));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Id", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        organizationJComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDeleteOrg.setBackground(new java.awt.Color(22, 27, 34));
        btnDeleteOrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteOrg.setForeground(new java.awt.Color(188, 188, 188));
        btnDeleteOrg.setText("Delete Organization");
        btnDeleteOrg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnDeleteOrgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnDeleteOrgFocusLost(evt);
            }
        });
        btnDeleteOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteOrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteOrgMouseExited(evt);
            }
        });
        btnDeleteOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnAddOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Credit card.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
    }// </editor-fold>//GEN-END:initComponents

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
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddOrgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddOrgFocusGained
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(255, 255, 255));
        btnAddOrg.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAddOrgFocusGained

    private void btnAddOrgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddOrgFocusLost
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(188, 188, 188));
        btnAddOrg.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAddOrgFocusLost

    private void btnAddOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrgMouseEntered
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(255, 255, 255));
        btnAddOrg.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAddOrgMouseEntered

    private void btnAddOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrgMouseExited
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(188, 188, 188));
        btnAddOrg.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAddOrgMouseExited

    private void btnAddOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrgActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        ArrayList<String> orgName = new ArrayList<String>();
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            orgName.add(model.getValueAt(i, 1).toString());
        }

        if (orgName.contains(type.getValue())) {
            JOptionPane.showMessageDialog(null, "Organization already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            directory.createOrganization(type);
        }

        populateTable();


    }//GEN-LAST:event_btnAddOrgActionPerformed

    private void btnDeleteOrgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteOrgFocusGained
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(255, 255, 255));
        btnAddOrg.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnDeleteOrgFocusGained

    private void btnDeleteOrgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteOrgFocusLost
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(188, 188, 188));
        btnAddOrg.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnDeleteOrgFocusLost

    private void btnDeleteOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteOrgMouseEntered
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(255, 255, 255));
        btnAddOrg.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnDeleteOrgMouseEntered

    private void btnDeleteOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteOrgMouseExited
        // TODO add your handling code here:
        btnAddOrg.setForeground(new Color(188, 188, 188));
        btnAddOrg.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnDeleteOrgMouseExited

    private void btnDeleteOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrgActionPerformed
        // TODO add your handling code here:

        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select an organization to be deleted", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);
            enterprise.getOrganizationDirectory().getOrganizations().remove(organization);
            JOptionPane.showMessageDialog(null, "Organization deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        }

    }//GEN-LAST:event_btnDeleteOrgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddOrg;
    private javax.swing.JButton btnDeleteOrg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
