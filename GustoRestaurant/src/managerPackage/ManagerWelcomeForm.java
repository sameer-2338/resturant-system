/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerPackage;

import menuItems.Menu;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import menuItems.InventoryForm;
import menuItems.MainMenu;
import starting.HomepageForm;

/**
 *
 * @author PC
 */
public class ManagerWelcomeForm extends javax.swing.JFrame
{

    Manager manager;

    /**
     * Creates new form ManagerWelcomeForm
     */
    public ManagerWelcomeForm()
    {
        initComponents();
        this.setLocationRelativeTo(null); //center form in screen
        
    }

    public ManagerWelcomeForm(Manager m)
    {
        initComponents();
        this.setLocationRelativeTo(null); //center form in screen
        this.manager = m;
        String[] name = m.getName().split(" ");
        lblWelcome.setText("Welcome " + name[0] + ",");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pHeader = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        btnInventoryManager = new javax.swing.JButton();
        btnMakeAnnouncement = new javax.swing.JButton();
        btnMenuManager = new javax.swing.JButton();
        pnlWelcomeMang = new javax.swing.JPanel();
        lblmessage = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1217, 871));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pHeader.setBackground(new java.awt.Color(255, 255, 255));
        pHeader.setName("pHeader"); // NOI18N
        pHeader.setPreferredSize(new java.awt.Dimension(1062, 70));
        pHeader.setLayout(null);

        btnLogout.setBackground(new java.awt.Color(255, 213, 0));
        btnLogout.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(127, 72, 101));
        btnLogout.setText("Log out");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setName(""); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });
        pHeader.add(btnLogout);
        btnLogout.setBounds(1103, 26, 101, 29);

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 52)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("FOODIE");
        lbLogo.setToolTipText("");
        pHeader.add(lbLogo);
        lbLogo.setBounds(43, 0, 120, 62);

        btnInventoryManager.setBackground(new java.awt.Color(255, 213, 0));
        btnInventoryManager.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnInventoryManager.setForeground(new java.awt.Color(127, 72, 101));
        btnInventoryManager.setText("Track Inventory");
        btnInventoryManager.setBorder(null);
        btnInventoryManager.setBorderPainted(false);
        btnInventoryManager.setContentAreaFilled(false);
        btnInventoryManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventoryManager.setPreferredSize(new java.awt.Dimension(87, 29));
        btnInventoryManager.setRequestFocusEnabled(false);
        btnInventoryManager.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInventoryManagerActionPerformed(evt);
            }
        });
        pHeader.add(btnInventoryManager);
        btnInventoryManager.setBounds(900, 30, 184, 29);

        btnMakeAnnouncement.setBackground(new java.awt.Color(255, 213, 0));
        btnMakeAnnouncement.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnMakeAnnouncement.setForeground(new java.awt.Color(127, 72, 101));
        btnMakeAnnouncement.setText("Make Announcement");
        btnMakeAnnouncement.setBorder(null);
        btnMakeAnnouncement.setBorderPainted(false);
        btnMakeAnnouncement.setContentAreaFilled(false);
        btnMakeAnnouncement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeAnnouncement.setPreferredSize(new java.awt.Dimension(87, 29));
        btnMakeAnnouncement.setRequestFocusEnabled(false);
        btnMakeAnnouncement.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMakeAnnouncementActionPerformed(evt);
            }
        });
        pHeader.add(btnMakeAnnouncement);
        btnMakeAnnouncement.setBounds(620, 30, 255, 29);

        btnMenuManager.setBackground(new java.awt.Color(255, 213, 0));
        btnMenuManager.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnMenuManager.setForeground(new java.awt.Color(127, 72, 101));
        btnMenuManager.setText("Main Menu");
        btnMenuManager.setBorder(null);
        btnMenuManager.setBorderPainted(false);
        btnMenuManager.setContentAreaFilled(false);
        btnMenuManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuManager.setPreferredSize(new java.awt.Dimension(87, 29));
        btnMenuManager.setRequestFocusEnabled(false);
        btnMenuManager.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMenuManagerActionPerformed(evt);
            }
        });
        pHeader.add(btnMenuManager);
        btnMenuManager.setBounds(460, 30, 153, 29);

        getContentPane().add(pHeader);
        pHeader.setBounds(0, 0, 1220, 80);

        pnlWelcomeMang.setLayout(null);

        lblmessage.setFont(new java.awt.Font("Rockwell Condensed", 1, 50)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 255, 255));
        lblmessage.setText("See Foodie's latest updates");
        lblmessage.setName(""); // NOI18N
        pnlWelcomeMang.add(lblmessage);
        lblmessage.setBounds(310, 110, 540, 90);

        lblWelcome.setFont(new java.awt.Font("Rockwell Condensed", 1, 50)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome");
        lblWelcome.setName(""); // NOI18N
        pnlWelcomeMang.add(lblWelcome);
        lblWelcome.setBounds(310, 20, 520, 90);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managerPackage/Welcome bg.jpg"))); // NOI18N
        pnlWelcomeMang.add(lblImage);
        lblImage.setBounds(0, 0, 1220, 810);

        getContentPane().add(pnlWelcomeMang);
        pnlWelcomeMang.setBounds(0, 70, 1220, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        HomepageForm homepage = new HomepageForm(true);
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnInventoryManagerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInventoryManagerActionPerformed
    {//GEN-HEADEREND:event_btnInventoryManagerActionPerformed
        try
        {
            // TODO add your handling code here:
            InventoryForm inv = new InventoryForm(manager);
            inv.setVisible(true);
            this.dispose();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManagerWelcomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInventoryManagerActionPerformed

    private void btnMakeAnnouncementActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeAnnouncementActionPerformed
    {//GEN-HEADEREND:event_btnMakeAnnouncementActionPerformed
        try
        {
            // TODO add your handling code here:
            ManagerAnnouncementsForm ann = new ManagerAnnouncementsForm(manager);
            ann.setVisible(true);
            this.dispose();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManagerWelcomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMakeAnnouncementActionPerformed

    private void btnMenuManagerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMenuManagerActionPerformed
    {//GEN-HEADEREND:event_btnMenuManagerActionPerformed
        // TODO add your handling code here:
         Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnMenuManagerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ManagerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ManagerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ManagerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ManagerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ManagerWelcomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventoryManager;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakeAnnouncement;
    private javax.swing.JButton btnMenuManager;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblmessage;
    public static javax.swing.JPanel pHeader;
    private javax.swing.JPanel pnlWelcomeMang;
    // End of variables declaration//GEN-END:variables
}
