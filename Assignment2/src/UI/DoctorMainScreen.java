/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import Model.Resident;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prathmesh Pardeshi
 */
public class DoctorMainScreen extends javax.swing.JPanel {
Person person;
    Admin admin;
    JPanel lowerPanel;
    private ArrayList<Person> patientDir;
    /**
     * Creates new form DoctorMainScreen
     */
    public DoctorMainScreen(JPanel lowerPanel, Admin admin) {
        initComponents();
        this.lowerPanel =lowerPanel;
        this.admin = admin;
        loadpatientTable();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        viewEncounterButton = new javax.swing.JButton();
        updatePatientButton = new javax.swing.JButton();
        deletePatientButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        deletePatientButton1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("GLOBAL HEALTH HOSPITAL PATIENT DIRECTORYD");

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Age", "Gender", "Illness", "Pulse", "BP", "Past Illness", "Residence", "isPatient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientTable);

        viewEncounterButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewEncounterButton.setText("VIEW ENCOUNTERS");
        viewEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEncounterButtonActionPerformed(evt);
            }
        });

        updatePatientButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        updatePatientButton.setText("UPDATE ENTRY");
        updatePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientButtonActionPerformed(evt);
            }
        });

        deletePatientButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        deletePatientButton.setText("DELETE ENTRY");
        deletePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deletePatientButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        deletePatientButton1.setText("BACK");
        deletePatientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updatePatientButton)
                                .addGap(45, 45, 45)
                                .addComponent(viewEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(deletePatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(deletePatientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePatientButton)
                    .addComponent(jButton1)
                    .addComponent(viewEncounterButton)
                    .addComponent(deletePatientButton))
                .addGap(40, 40, 40)
                .addComponent(deletePatientButton1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncounterButtonActionPerformed
        // TODO add your handling code here:
        int row = patientTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a patient record!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person)patientTable.getValueAt(row, 1);
        DoctorViwEncounter viewEncounterJPanel = new DoctorViwEncounter(lowerPanel, person,admin);
        lowerPanel.add("EncounterPanel",viewEncounterJPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_viewEncounterButtonActionPerformed

    private void updatePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = patientTable.getSelectedRow();
        if (!(selectedRow < 0)) {
            Person person = (Person) patientTable.getValueAt(selectedRow, 1);
            DoctorUpdate DoctorUpdate = new DoctorUpdate(lowerPanel, person, admin);
            lowerPanel.add("EditPersonPanel", DoctorUpdate);
            CardLayout cardLayout = (CardLayout) lowerPanel.getLayout();
            cardLayout.next(lowerPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Select a record!");
        }
    }//GEN-LAST:event_updatePatientButtonActionPerformed

    private void deletePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = patientTable.getSelectedRow();
        if (!(selectedRow < 0)) {
            Person person = (Person) patientTable.getValueAt(selectedRow, 1);
            this.admin.deletePatient(person);
            person.setIsPatient(false);
            //loadpersonTable();
            loadpatientTable();
        }
    }//GEN-LAST:event_deletePatientButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DoctorPatientAdd PatientAdd = new DoctorPatientAdd(lowerPanel, admin);
        lowerPanel.add("Createpatientdata",PatientAdd);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deletePatientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientButton1ActionPerformed
        DoctorLoginPage DoctorLoginPage = new DoctorLoginPage(lowerPanel, admin);
        lowerPanel.add("personWindow",DoctorLoginPage);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);   // TODO add your handling code here:
    }//GEN-LAST:event_deletePatientButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletePatientButton;
    private javax.swing.JButton deletePatientButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton updatePatientButton;
    private javax.swing.JButton viewEncounterButton;
    // End of variables declaration//GEN-END:variables

    private void loadpatientTable() {
int rowCount = patientTable.getRowCount();
        ArrayList<Person> patientDirectory = new ArrayList<>();

        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Person p : admin.getPersonDirectory()) {
        if (p.isIsPatient()==true){
        System.out.println(p.isIsPatient());
            patientDirectory.add(p);
            }
        }
        admin.setPatientDirectory(patientDirectory);

        for (Person p : admin.getPatientDirectory()) {
            Object row[] = new Object[10];
            row[0] = p.getId();
            row[1] = p;
            row[2]= p.getGender();
            row[3] = p.getAge();
            row[4]= p.getIllness();
            row[5] = p.getHB();
            row[6]=p.getBloodPressure();
            row[7]= p.getPastIllness();
            Resident residence = p.getResidence();
            row[8] = residence.getHouse()+" "+residence.getCommunity()+", "+residence.getCity();
            row[9] = p.isIsPatient();
            model.addRow(row);
}
    }  }     

    

    

