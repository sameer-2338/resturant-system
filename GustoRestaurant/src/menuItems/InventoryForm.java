/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuItems;

import menuItems.Menu;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import managerPackage.Manager;
import managerPackage.ManagerAnnouncementsForm;
import managerPackage.ManagerWelcomeForm;
import starting.HomepageForm;

/**
 *
 * @author Mubarak
 */
public class InventoryForm extends javax.swing.JFrame
{

    /**
     * Creates new form InventoryForm
     */
    //HashMap<String, Double > orderMap = new HashMap<String,Double>(); //reem
    String choice;
    public static DefaultTableModel model;
    Manager manager; //to access inventory items

    public InventoryForm() throws SQLException
    {
        initComponents();
        initializeComp();
    }

    public InventoryForm(Manager m) throws SQLException
    {
        initComponents();
        this.manager = m;
        initializeComp();

    }

    private void initializeComp()
    {
        this.setLocationRelativeTo(null); //center form in screen
        // inventory.rateItem(orderMap);
        model = (DefaultTableModel) tbl_viewItems.getModel();
        tbl_viewItems.setVisible(false);
        tbl_viewItems.getTableHeader().setFont(new Font("Rockwell", Font.BOLD, 20));
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

        pnl_bg = new javax.swing.JPanel();
        btn_addItem = new javax.swing.JButton();
        btn_DeleteItem = new javax.swing.JButton();
        txt_itemQuantity = new javax.swing.JTextField();
        lbl_itemQuantity = new javax.swing.JLabel();
        lbl_deleteItemId = new javax.swing.JLabel();
        txt_deleteitemid = new javax.swing.JTextField();
        txt_itemPrice = new javax.swing.JTextField();
        lbl_itemPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_itemName = new javax.swing.JTextField();
        lbl_itemName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbx_viewitem = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_viewItems = new javax.swing.JTable();
        lbl_bg = new javax.swing.JLabel();
        pHeader = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        btnInventoryManager = new javax.swing.JButton();
        btnMakeAnnouncement = new javax.swing.JButton();
        btnMenuManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_bg.setLayout(null);

        btn_addItem.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btn_addItem.setForeground(new java.awt.Color(102, 0, 102));
        btn_addItem.setText("Add ");
        btn_addItem.setPreferredSize(new java.awt.Dimension(169, 37));
        btn_addItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addItemActionPerformed(evt);
            }
        });
        pnl_bg.add(btn_addItem);
        btn_addItem.setBounds(240, 730, 150, 40);

        btn_DeleteItem.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btn_DeleteItem.setForeground(new java.awt.Color(102, 0, 102));
        btn_DeleteItem.setText("Delete");
        btn_DeleteItem.setPreferredSize(new java.awt.Dimension(169, 37));
        btn_DeleteItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_DeleteItemActionPerformed(evt);
            }
        });
        pnl_bg.add(btn_DeleteItem);
        btn_DeleteItem.setBounds(770, 730, 191, 40);
        pnl_bg.add(txt_itemQuantity);
        txt_itemQuantity.setBounds(350, 670, 200, 30);

        lbl_itemQuantity.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        lbl_itemQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lbl_itemQuantity.setText("Enter Item Quantity");
        pnl_bg.add(lbl_itemQuantity);
        lbl_itemQuantity.setBounds(70, 670, 260, 34);

        lbl_deleteItemId.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        lbl_deleteItemId.setForeground(new java.awt.Color(255, 255, 255));
        lbl_deleteItemId.setText("Enter Item ID");
        pnl_bg.add(lbl_deleteItemId);
        lbl_deleteItemId.setBounds(670, 600, 180, 34);

        txt_deleteitemid.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_deleteitemidActionPerformed(evt);
            }
        });
        pnl_bg.add(txt_deleteitemid);
        txt_deleteitemid.setBounds(880, 600, 200, 30);
        pnl_bg.add(txt_itemPrice);
        txt_itemPrice.setBounds(350, 600, 200, 30);

        lbl_itemPrice.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        lbl_itemPrice.setForeground(new java.awt.Color(255, 255, 255));
        lbl_itemPrice.setText("Enter Item Price");
        pnl_bg.add(lbl_itemPrice);
        lbl_itemPrice.setBounds(80, 600, 220, 34);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Delete Item");
        pnl_bg.add(jLabel2);
        jLabel2.setBounds(780, 460, 210, 36);
        pnl_bg.add(txt_itemName);
        txt_itemName.setBounds(350, 530, 200, 30);

        lbl_itemName.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        lbl_itemName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_itemName.setText("Enter Item Name");
        pnl_bg.add(lbl_itemName);
        lbl_itemName.setBounds(80, 520, 230, 40);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Add Item");
        pnl_bg.add(jLabel1);
        jLabel1.setBounds(172, 460, 220, 40);

        cbx_viewitem.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        cbx_viewitem.setForeground(new java.awt.Color(102, 0, 102));
        cbx_viewitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose your Category", "Appetizers", "Pasta", "Burger", "Pizza", "Drinks", "Desserts" }));
        cbx_viewitem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbx_viewitemActionPerformed(evt);
            }
        });
        pnl_bg.add(cbx_viewitem);
        cbx_viewitem.setBounds(410, 160, 386, 35);

        tbl_viewItems.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tbl_viewItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Item ID", "Item Name", "Item Rank", "Units Sold", "Quantity Avaliable"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tbl_viewItems.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_viewItems.setOpaque(false);
        jScrollPane1.setViewportView(tbl_viewItems);
        if (tbl_viewItems.getColumnModel().getColumnCount() > 0)
        {
            tbl_viewItems.getColumnModel().getColumn(0).setMinWidth(90);
            tbl_viewItems.getColumnModel().getColumn(0).setMaxWidth(120);
            tbl_viewItems.getColumnModel().getColumn(1).setMinWidth(270);
            tbl_viewItems.getColumnModel().getColumn(1).setMaxWidth(280);
            tbl_viewItems.getColumnModel().getColumn(2).setMinWidth(120);
            tbl_viewItems.getColumnModel().getColumn(2).setMaxWidth(150);
            tbl_viewItems.getColumnModel().getColumn(3).setMinWidth(100);
            tbl_viewItems.getColumnModel().getColumn(3).setMaxWidth(150);
            tbl_viewItems.getColumnModel().getColumn(4).setMinWidth(150);
            tbl_viewItems.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        pnl_bg.add(jScrollPane1);
        jScrollPane1.setBounds(130, 220, 896, 200);

        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuItems/Food-Inventory-Management-What-It-Is-and-How-to-Do-It-Well-1.jpg"))); // NOI18N
        lbl_bg.setText("jLabel1");
        pnl_bg.add(lbl_bg);
        lbl_bg.setBounds(0, 80, 1220, 710);

        pHeader.setBackground(new java.awt.Color(255, 213, 0));
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
        btnLogout.setBounds(1090, 30, 101, 29);

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 52)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("GUSTO");
        lbLogo.setToolTipText("");
        pHeader.add(lbLogo);
        lbLogo.setBounds(40, 10, 120, 62);

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
        btnMakeAnnouncement.setBounds(630, 30, 255, 29);

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
        btnMenuManager.setBounds(470, 30, 153, 29);

        pnl_bg.add(pHeader);
        pHeader.setBounds(0, 0, 1220, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_viewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_viewitemActionPerformed
        // TODO add your handling code here:
        tbl_viewItems.setVisible(true);
        //Clear table rows
        model.setRowCount(0);
        //Get choosen category from combobox
        choice = (String) cbx_viewitem.getSelectedItem();
        //Calling function to diplay items on table
        manager.viewInventoryItem(choice);
    }//GEN-LAST:event_cbx_viewitemActionPerformed

    private void btn_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addItemActionPerformed
        // TODO add your handling code here:

        //Calling function to add new item in database and new row in table 
        System.out.println(txt_itemName.getText());
        manager.addInventoryItem(txt_itemName.getText(), Integer.valueOf(txt_itemPrice.getText()), choice, Integer.valueOf(txt_itemQuantity.getText()));
        
        //clear all text fields 
        txt_itemName.setText("");
        txt_itemPrice.setText("");
        txt_itemQuantity.setText("");

    }//GEN-LAST:event_btn_addItemActionPerformed

    private void btn_DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteItemActionPerformed

        //Calling function to delete item from database and remove item row from table
        

        if (txt_deleteitemid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all text fields");
        }
        else
        {
            int itemId = Integer.valueOf(txt_deleteitemid.getText());
            Boolean found = false;
          
            for(int i=0; i<MainMenu.categoryList.get(choice).size(); ++i)
            {
                if(MainMenu.categoryList.get(choice).get(i).getItemId()==itemId)
                {
                    manager.deleteInventoryItem(itemId, choice);
                    found=true;
                    break;
                }
            }
               if(!found)
               {
                  JOptionPane.showMessageDialog(null, "This item id doesn't exist");   
               }
           
        }

        //clear text field
        txt_deleteitemid.setText("");

    }//GEN-LAST:event_btn_DeleteItemActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        HomepageForm homepage = new HomepageForm();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnInventoryManagerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInventoryManagerActionPerformed
    {//GEN-HEADEREND:event_btnInventoryManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryManagerActionPerformed

    private void btnMakeAnnouncementActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeAnnouncementActionPerformed
    {//GEN-HEADEREND:event_btnMakeAnnouncementActionPerformed
        // TODO add your handling code here:
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
        this.dispose();
    }//GEN-LAST:event_btnMenuManagerActionPerformed

    private void txt_deleteitemidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_deleteitemidActionPerformed
    {//GEN-HEADEREND:event_txt_deleteitemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deleteitemidActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new InventoryForm().setVisible(true);
                } catch (SQLException ex)
                {
                    Logger.getLogger(InventoryForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventoryManager;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakeAnnouncement;
    private javax.swing.JButton btnMenuManager;
    private javax.swing.JButton btn_DeleteItem;
    private javax.swing.JButton btn_addItem;
    private javax.swing.JComboBox<String> cbx_viewitem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_deleteItemId;
    private javax.swing.JLabel lbl_itemName;
    private javax.swing.JLabel lbl_itemPrice;
    private javax.swing.JLabel lbl_itemQuantity;
    public static javax.swing.JPanel pHeader;
    private javax.swing.JPanel pnl_bg;
    public static javax.swing.JTable tbl_viewItems;
    private javax.swing.JTextField txt_deleteitemid;
    private javax.swing.JTextField txt_itemName;
    private javax.swing.JTextField txt_itemPrice;
    private javax.swing.JTextField txt_itemQuantity;
    // End of variables declaration//GEN-END:variables
}
