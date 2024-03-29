/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.Admin;
import Model.Person;
import Model.Encounter;
import Model.Resident;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prathmesh Pardeshi
 */
public class DoctorLoginPage extends javax.swing.JPanel {
    Admin admin;
    private ArrayList<Person> personDir;
    private ArrayList<Person> patientDir;
    JPanel lowerPanel;

    /**
     * Creates new form DoctorLoginPage
     */
    public DoctorLoginPage(JPanel lowerPanel,Admin admin) {
        initComponents();
        this.lowerPanel=lowerPanel;
        this.admin=admin;
        personDir = admin.getPersonDirectory();
        patientDir = admin.getPatientDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SystemLbl = new javax.swing.JLabel();
        CredentialsPanel = new javax.swing.JPanel();
        UsernameTxt = new javax.swing.JTextField();
        UserLbl = new javax.swing.JLabel();
        PasswordLbl = new javax.swing.JLabel();
        BackBttn = new javax.swing.JButton();
        LoginBttn = new javax.swing.JButton();
        PasswordTxt = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 255, 255));

        SystemLbl.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        SystemLbl.setText("              DOCTOR LOGIN");

        CredentialsPanel.setBackground(new java.awt.Color(204, 255, 255));

        UsernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTxtActionPerformed(evt);
            }
        });

        UserLbl.setBackground(new java.awt.Color(0, 153, 153));
        UserLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserLbl.setText("USERNAME");

        PasswordLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLbl.setText("PASSWORD");

        BackBttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackBttn.setText("BACK");
        BackBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBttnActionPerformed(evt);
            }
        });

        LoginBttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBttn.setText("LOGIN");
        LoginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CredentialsPanelLayout = new javax.swing.GroupLayout(CredentialsPanel);
        CredentialsPanel.setLayout(CredentialsPanelLayout);
        CredentialsPanelLayout.setHorizontalGroup(
            CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CredentialsPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(PasswordTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CredentialsPanelLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(LoginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BackBttn)
                .addGap(130, 130, 130))
        );

        CredentialsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BackBttn, LoginBttn});

        CredentialsPanelLayout.setVerticalGroup(
            CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CredentialsPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CredentialsPanelLayout.createSequentialGroup()
                        .addComponent(UserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(CredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBttn))
                .addGap(45, 45, 45))
        );

        CredentialsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BackBttn, LoginBttn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(CredentialsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(SystemLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(SystemLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(CredentialsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTxtActionPerformed

    private void BackBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBttnActionPerformed
        // TODO add your handling code here:
        CommonScreen homePanel = new CommonScreen(lowerPanel, admin, patientDir, personDir);
        lowerPanel.add("HomePanel",homePanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.show(lowerPanel,"HomePanel");
    }//GEN-LAST:event_BackBttnActionPerformed

    private void LoginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBttnActionPerformed
        // TODO add your handling code here:
        if(UsernameTxt.getText().matches("") || PasswordTxt.getText().matches("")){
            JOptionPane.showMessageDialog(this,"Please enter crendentials to proceed");
        }else if(UsernameTxt.getText().matches("good") && PasswordTxt.getText().matches("good")){
            DoctorMainScreen DoctorMainScreen = new DoctorMainScreen(lowerPanel, admin);
            lowerPanel.add("doctorViewPatientsPanel", DoctorMainScreen);
            CardLayout layout = (CardLayout)lowerPanel.getLayout();
            layout.next(lowerPanel);
        }else{
            JOptionPane.showMessageDialog(this,"Incorrect Credentials. Please try again");
        }
    }//GEN-LAST:event_LoginBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBttn;
    private javax.swing.JPanel CredentialsPanel;
    private javax.swing.JButton LoginBttn;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JLabel SystemLbl;
    private javax.swing.JLabel UserLbl;
    private javax.swing.JTextField UsernameTxt;
    // End of variables declaration//GEN-END:variables
}
