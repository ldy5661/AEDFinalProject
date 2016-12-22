/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongyueli
 */
public class DoctorRespondJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private EcoSystem ecoSystem;

    /**
     * Creates new form DoctorRespondJPanel
     */
    public DoctorRespondJPanel(JPanel userProcessContainer, UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization) patientOrganization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
            for (WorkRequest request : patientOrganization.getWorkQueue().getWorkRequestList()) {
                if (request != null) {
                    PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;

                    Object[] row = new Object[2];

                    row[0] = patientDoctorWorkRequest;
                    row[1] = patientDoctorWorkRequest.getDoctorResponseMessage();

                    model.addRow(row);

                }
            }
        }
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
        jTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        viewDetailsJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Respond From Doctor");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 280, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 115));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        viewDetailsJButton.setText("View Detatils");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.");
        } else {
            PatientDoctorWorkRequest request = (PatientDoctorWorkRequest) jTable1.getValueAt(selectedRow, 0);
            //Patient patient =(Patient) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
            ViewResponseFromDoctorJPanel vfdj = new ViewResponseFromDoctorJPanel(userProcessContainer, userAccount, request, enterprise, ecoSystem);
            userProcessContainer.add("ViewResponseFromDoctorJPanel", vfdj);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }

    }//GEN-LAST:event_viewDetailsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}