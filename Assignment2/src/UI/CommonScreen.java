/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.Admin;
import Model.Encounter;
import Model.Person;
import Model.Person;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author Prathmesh Pardeshi
 */
public class CommonScreen extends javax.swing.JPanel {
JPanel lowerPanel;
Admin admin;
Person person;
private ArrayList<Person> personDir;
private ArrayList<Person> patientDir;
    /**
     * Creates new form CommanScreen
     */
    public CommonScreen(JPanel lowerPanel ,Admin admin) {
        initComponents();
        this.lowerPanel =lowerPanel;
        this.admin = admin;
        this.person=person;
//        admin.setPersonDirectory(personDirectory); 
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setBounds(0,0,screenSize.width, screenSize.height);
//        setVisible(true);
    }
    
    public CommonScreen(JPanel lowerPanel, Admin admin, ArrayList<Person> patientDir, ArrayList<Person> personDir){
        initComponents();
        this.lowerPanel =lowerPanel;
        this.admin = admin;
        this.person=person; 
        this.personDir = personDir;
        this.patientDir = patientDir;
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setBounds(0,0,screenSize.width, screenSize.height);
//        setVisible(true);
        
    }
    
    public CommonScreen(JPanel lowerPanel ,ArrayList<Person> patientDir){
        initComponents();
        this.lowerPanel =lowerPanel;
        this.patientDir = patientDir;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        MainPanelScreen = new javax.swing.JPanel();
        SystemAdmin = new javax.swing.JButton();
        Patient = new javax.swing.JButton();
        Doctor = new javax.swing.JButton();
        CommunityAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NewUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        MainPanelScreen.setBackground(new java.awt.Color(204, 255, 255));

        SystemAdmin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SystemAdmin.setText("SYSTEM ADMIN");
        SystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAdminActionPerformed(evt);
            }
        });

        Patient.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Patient.setText("PATIENT");
        Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientActionPerformed(evt);
            }
        });

        Doctor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Doctor.setText("DOCTOR");
        Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorActionPerformed(evt);
            }
        });

        CommunityAdmin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        CommunityAdmin.setText("COMMUNITY ADMIN");
        CommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityAdminActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Please select a user login type - ");

        NewUser.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        NewUser.setText("NEW USER");
        NewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelScreenLayout = new javax.swing.GroupLayout(MainPanelScreen);
        MainPanelScreen.setLayout(MainPanelScreenLayout);
        MainPanelScreenLayout.setHorizontalGroup(
            MainPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelScreenLayout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addGroup(MainPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(MainPanelScreenLayout.createSequentialGroup()
                        .addComponent(SystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(CommunityAdmin))
                    .addGroup(MainPanelScreenLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(NewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        MainPanelScreenLayout.setVerticalGroup(
            MainPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelScreenLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(MainPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(MainPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(471, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAdminActionPerformed
        // TODO add your handling code here:
        
            SystemLoginPage adminLoginPage = new SystemLoginPage(lowerPanel, admin);
            lowerPanel.add("AdminWindow", adminLoginPage);
            CardLayout layout = (CardLayout)lowerPanel.getLayout();
            layout.next(lowerPanel);
    }//GEN-LAST:event_SystemAdminActionPerformed

    private void PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientActionPerformed
        PatientLogin PatientLoginPage = new PatientLogin(lowerPanel,admin);
        lowerPanel.add("PatientAdmin",PatientLoginPage);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);        // TODO add your handling code here:
    }//GEN-LAST:event_PatientActionPerformed

    private void DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorActionPerformed
        DoctorLoginPage DoctorLoginPage = new DoctorLoginPage(lowerPanel,admin);
        lowerPanel.add("DoctorAdmin",DoctorLoginPage);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);             // TODO add your handling code here:
    }//GEN-LAST:event_DoctorActionPerformed

    private void CommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityAdminActionPerformed
        CommunityAdminLogin CommunityLoginPage = new CommunityAdminLogin(lowerPanel,admin);
        lowerPanel.add("CommunityAdmin",CommunityLoginPage);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);         // TODO add your handling code here:
    }//GEN-LAST:event_CommunityAdminActionPerformed

    private void NewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserActionPerformed
        // TODO add your handling code here:
        NewUser newUserPage = new NewUser(lowerPanel,admin);
        lowerPanel.add("PatientAdmin",newUserPage);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_NewUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommunityAdmin;
    private javax.swing.JButton Doctor;
    private javax.swing.JPanel MainPanelScreen;
    private javax.swing.JButton NewUser;
    private javax.swing.JButton Patient;
    private javax.swing.JButton SystemAdmin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
