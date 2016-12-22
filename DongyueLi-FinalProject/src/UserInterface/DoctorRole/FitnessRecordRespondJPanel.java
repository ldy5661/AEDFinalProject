/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class FitnessRecordRespondJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
//    private DoctorOrganization organization;
//    private EcoSystem ecoSystem;
    private Enterprise enterprise;
//    private UserAccount userAccount;
    private PatientDoctorWorkRequest patientDoctorWorkRequest;
    /**
     * Creates new form FitnessRecordRespondJPanel
     */
    public FitnessRecordRespondJPanel(JPanel userProcessContainer, Enterprise enterprise,PatientDoctorWorkRequest patientDoctorWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
//        this.organization = (DoctorOrganization)organization;
        this.enterprise = enterprise;
//        this.userAccount = account;
//        this.ecoSystem = ecoSystem;
        this.patientDoctorWorkRequest = patientDoctorWorkRequest;
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        respondJTextArea = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Respond To Patient");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 41, 280, -1));

        respondJTextArea.setColumns(20);
        respondJTextArea.setRows(5);
        jScrollPane1.setViewportView(respondJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 89, 306, 119));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 261, -1, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 226, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorHomePageJPanel dwjp = (DoctorHomePageJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       //PatientDoctorWorkRequest request = new PatientDoctorWorkRequest();
  
        patientDoctorWorkRequest.setResponMessage(respondJTextArea.getText());
        patientDoctorWorkRequest.setRespondStatus("Complete");
        patientDoctorWorkRequest.setDoctorResponseMessage(respondJTextArea.getText());
        JOptionPane.showMessageDialog(null, "Success! ");
        
         
        
        Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof PatientOrganization) {
                    org = organization;
                    break;
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(patientDoctorWorkRequest);
               // userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea respondJTextArea;
    // End of variables declaration//GEN-END:variables
}
