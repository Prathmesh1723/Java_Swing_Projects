/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class SystemDirectory extends javax.swing.JFrame {
Person person;
    Admin admin;
    JPanel lowerPanel;
    /**
     * Creates new form SystemDirectory
     */
    public SystemDirectory(JPanel lowerPanel, Admin admin) {
        initComponents();
         this.lowerPanel=lowerPanel;
        this.admin=admin;
        this.person=person;
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
        personPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        createPersonButton = new javax.swing.JButton();
        updatePersonButton = new javax.swing.JButton();
        deletePersonButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewEncounterButton = new javax.swing.JButton();
        updatePatientButton = new javax.swing.JButton();
        deletePatientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personPanel.setBackground(new java.awt.Color(255, 255, 255));

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Illness", "Pulse", "BP", "Past Illness", "Residence", "isPatient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personTable);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("GLOBAL HEALTH HOSPITAL PERSON DIRECTORY");

        createPersonButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        createPersonButton.setText("CREATE NEW ENTRY");
        createPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonButtonActionPerformed(evt);
            }
        });

        updatePersonButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        updatePersonButton.setText("UPDATE ENTRY");
        updatePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonButtonActionPerformed(evt);
            }
        });

        deletePersonButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        deletePersonButton.setText("DELETE ENTRY");
        deletePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("GLOBAL HEALTH HOSPITAL PATIENT DIRECTORY");

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

        javax.swing.GroupLayout personPanelLayout = new javax.swing.GroupLayout(personPanel);
        personPanel.setLayout(personPanelLayout);
        personPanelLayout.setHorizontalGroup(
            personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addComponent(createPersonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatePersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletePersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(28, 28, 28)
                        .addComponent(viewEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatePatientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletePatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(156, 156, 156)))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
        );
        personPanelLayout.setVerticalGroup(
            personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletePersonButton)
                    .addComponent(updatePersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPersonButton))
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewEncounterButton)
                            .addComponent(backButton)))
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletePatientButton)
                            .addComponent(updatePatientButton))))
                .addGap(195, 195, 195))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonButtonActionPerformed
        // TODO add your handling code here:
        SystemAddPerson addPersonJPanel = new SystemAddPerson(lowerPanel, admin,person);
        lowerPanel.add("AddPersonJPanel",addPersonJPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_createPersonButtonActionPerformed

    private void updatePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = personTable.getSelectedRow();
        if (!(selectedRow < 0)) {
            Person person = (Person) personTable.getValueAt(selectedRow, 1);
            UpdatePersonDirectory editPersonPanel = new UpdatePersonDirectory(lowerPanel, person, admin);
            lowerPanel.add("EditPersonPanel", editPersonPanel);
            CardLayout cardLayout = (CardLayout) lowerPanel.getLayout();
            cardLayout.next(lowerPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Select a record!");
        }
    }//GEN-LAST:event_updatePersonButtonActionPerformed

    private void deletePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = personTable.getSelectedRow();
        if (!(selectedRow < 0)) {
            Person person = (Person) personTable.getValueAt(selectedRow, 1);
            this.admin.deletePerson(person);
            loadPersonTable();
            loadpatientTable();
        }
    }//GEN-LAST:event_deletePersonButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        AdminLanding adminWindow = new AdminLanding(lowerPanel, admin);
        lowerPanel.add("AdminWindow",adminWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncounterButtonActionPerformed
        // TODO add your handling code here:
        int row = patientTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a patient record!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person)patientTable.getValueAt(row, 1);
        PatientEncounter viewEncounterJPanel = new PatientEncounter(lowerPanel, person);
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
            SystemUpdatePatient editPersonPanel = new SystemUpdatePatient(lowerPanel, person, admin);
            lowerPanel.add("EditPersonPanel", editPersonPanel);
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
            loadPersonTable();
            loadpatientTable();
        }
    }//GEN-LAST:event_deletePatientButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SystemDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SystemDirectory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createPersonButton;
    private javax.swing.JButton deletePatientButton;
    private javax.swing.JButton deletePersonButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientTable;
    private javax.swing.JPanel personPanel;
    private javax.swing.JTable personTable;
    private javax.swing.JButton updatePatientButton;
    private javax.swing.JButton updatePersonButton;
    private javax.swing.JButton viewEncounterButton;
    // End of variables declaration//GEN-END:variables

    public void loadPersonTable() {
        int rowCount = personTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Person p : admin.getPersonDirectory()) {
            Object row[] = new Object[10];
        
            row[0] = p.getId();
            row[1] = p;
            row[2]= p.getGender();
            row[3] = p.getAge();
            row[4]= p.getIllness();
            row[5] = p.getHB();
            row[6]= p.getBloodPressure();
            row[7]= p.getPastIllness();
            Resident residence = p.getResidence();
            row[8] = residence.getHouse()+", "+residence.getCommunity()+", "+residence.getCity();
            row[9] = p.isIsPatient();
            model.addRow(row);
        }
        
    }

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

