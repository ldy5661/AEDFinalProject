/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongyueli
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {
    private JPanel container;
    private Enterprise enterprise;
    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        
        popOrganizationComboBox();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        if (organization instanceof PatientOrganization) {
            for (Patient patient : organization.getPatientDirectory().getPatientList()) {
                employeeJComboBox.addItem(patient);
            }
        }else{
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
            }
        }
        
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }
    
    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
//        if (organization instanceof PatientOrganization) {
//
//            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
//                Object row[] = new Object[3];
//                row[0] = ua.getPatient().getPatientName();
//                row[1] = ua.getUsername();
//                row[2] = ua.getRole();
//                ((DefaultTableModel) userJTable.getModel()).addRow(row);
//
//            }
//        }else{
          
          
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                
                String name= employeeJComboBox.getSelectedItem().toString();
                
                Object row[] = new Object[3];
                row[0] = name;
                row[1] = ua.getUsername();
                row[2] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }

//        }
        
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        createUserAccountJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Manage User Account");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 27, -1, -1));

        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 357, 233, -1));

        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 362, -1, -1));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 75, 569, 135));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 406, -1, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 401, 233, -1));

        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 277, -1, -1));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 273, 233, -1));

        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 232, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 228, 233, -1));

        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 322, -1, -1));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 318, 233, -1));

        createUserAccountJButton.setText("Create Account");
        createUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountJButtonActionPerformed(evt);
            }
        });
        add(createUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 453, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 488, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
            popData();
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void createUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountJButtonActionPerformed
        // TODO add your handling code here:
//        String userName = nameJTextField.getText();
//        String password = passwordJTextField.getText();
//        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
//        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
//        Role role = (Role) roleJComboBox.getSelectedItem();
//        
//        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
//        
//        popData();
        
        Organization org = (Organization) organizationJComboBox.getSelectedItem();
        
        String name= employeeJComboBox.getSelectedItem().toString();

        if (org.getUserAccountDirectory().checkExit(nameJTextField.getText(), org) == null) {
            UserAccount ua = org.getUserAccountDirectory().createUserAccount();
            ua.setUsername(nameJTextField.getText());
            ua.setPassword(passwordJTextField.getText());
            ua.setName(name);
            
            if (org instanceof PatientOrganization) {
                ua.setPatient((Patient) employeeJComboBox.getSelectedItem());
                ua.setRole((Role) roleJComboBox.getSelectedItem());
            }
            else{
                ua.setEmployee((Employee) employeeJComboBox.getSelectedItem());
                ua.setRole((Role) roleJComboBox.getSelectedItem());
            }
            popData();
            
        }else {
            JOptionPane.showMessageDialog(null, "Sorry, this usename has already exist");
        }
    }//GEN-LAST:event_createUserAccountJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUserAccountJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}