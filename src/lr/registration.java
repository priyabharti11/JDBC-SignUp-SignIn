/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lr;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Priya
 */
public class registration extends javax.swing.JFrame {

    //objects of Connection interface and PreparedStatement interface
   Connection c = null;
   Statement s = null;
   
    public registration() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        mob = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        user.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 56, 0, 0);
        jPanel1.add(user, gridBagConstraints);

        mob.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mob.setText("Mobile No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 56, 0, 0);
        jPanel1.add(mob, gridBagConstraints);

        pass.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pass.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 162, 0, 0);
        jPanel1.add(pass, gridBagConstraints);

        mail.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 167, 0, 0);
        jPanel1.add(mail, gridBagConstraints);

        submit.setBackground(new java.awt.Color(204, 255, 204));
        submit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(124, 94, 222, 0);
        jPanel1.add(submit, gridBagConstraints);

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(124, 175, 222, 0);
        jPanel1.add(reset, gridBagConstraints);

        Username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 195;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 39, 0, 0);
        jPanel1.add(Username, gridBagConstraints);

        Mobile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 195;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 39, 0, 0);
        jPanel1.add(Mobile, gridBagConstraints);

        Password.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 201;
        gridBagConstraints.ipady = -16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 12, 0, 64);
        jPanel1.add(Password, gridBagConstraints);

        Email.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 17, 0, 64);
        jPanel1.add(Email, gridBagConstraints);

        heading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        heading.setText("REGISTRATION FORM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 101, 0, 0);
        jPanel1.add(heading, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try
        {
            //Registering/loading the jdbc driver using "forName" method of java.lang.Class
           Class.forName("com.mysql.cj.jdbc.Driver");
    
           //building connection of the application program with the database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationform","root","");
            s=c.createStatement();
            String r1 = Username.getText();
            String r2 = Password.getText();
            String r3 = Mobile.getText();
            String r4 = Email.getText();
           //setting up the communication with the database
           // giving the sql query to insert the data into the respective database as an argument in the method
            String q= "insert into register values ('"+r1+"','"+r2+"','"+r3+"','"+r4+"')";
            s.execute(q);
            cln();
        
            JOptionPane.showMessageDialog(null,"Register Successfully");
            
            // if objects of connection and statement is not null , means connection is live
            // since the work is done we need to close the connection with the DB to ensure security
            if(c!=null && s!=null)
            {
                c.close();
                s.close();
            }
                  
        }
         
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e);
                   
        }
       
    }//GEN-LAST:event_submitActionPerformed
       public void cln()
       {
        Username.setText(null);
        Password.setText(null);
        Mobile.setText(null);
        Email.setText(null);
        }
    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        Username.setText("");
        Password.setText("");
        Mobile.setText("");
        Email.setText("");
        
    }//GEN-LAST:event_resetActionPerformed

    
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Mobile;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel mob;
    private javax.swing.JLabel pass;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
