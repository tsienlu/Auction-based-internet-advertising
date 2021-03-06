/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.BiddingPlatform.AdvertisingStrategy;
import Business.BiddingPlatform.MarketingStrategy;
import Business.Employee.Employee;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Ecosystem.AdExchange;
import Ecosystem.AdvertiserProduct;
import Ecosystem.Customer;
import Ecosystem.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private MarketingStrategy ms;
    private UserAccount userAccount;
    float temp;

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel upc, EcoSystem system, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = upc;
        this.system = system;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        ms = new MarketingStrategy();
        Customer c = (Customer) userAccount.getEmployee();
        populateUserInterest();

    }

    private void populateUserInterest() {
        Customer c = (Customer) userAccount.getEmployee();
        interestComboBox.removeAllItems();
        for (String cat : c.getInterestList()) {
            
            interestComboBox.addItem(cat);

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        interestComboBox = new javax.swing.JComboBox();
        goJButton = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        viewOrderHistoryButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Browse content");

        jLabel2.setText("Select page:");

        interestComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        goJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goJButton.setText("Go");
        goJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goJButtonActionPerformed(evt);
            }
        });

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        viewOrderHistoryButton.setText("View Order History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2)
                        .addGap(88, 88, 88)
                        .addComponent(interestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(goJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(backjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(viewOrderHistoryButton)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(interestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(goJButton)
                .addGap(18, 18, 18)
                .addComponent(viewOrderHistoryButton)
                .addGap(60, 60, 60)
                .addComponent(backjButton1)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void goJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goJButtonActionPerformed
        // TODO add your handling code here:
        String filename = null;
        Customer c = (Customer) userAccount.getEmployee();
        String s = (String) interestComboBox.getSelectedItem();
        AdvertiserEnterprise ae=null;
        for (Network n : system.getNetworkList()) {
            for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent instanceof AdvertiserEnterprise) {
                    ae = (AdvertiserEnterprise) ent;
                    for (AdvertiserProduct ap : ae.getAdProList()) {
                        if (s.equalsIgnoreCase("Sports") && ap.getCategoryList().contains("Sports")) 
                        {
                            filename = ap.getFILENAME();
                        }else if (s.equalsIgnoreCase("Movies") && ap.getCategoryList().contains("Movies") && c.getAge()==10) 
                        {
                            filename = ap.getFILENAME();
                        } 
                        else if (s.equalsIgnoreCase("Movies") && ap.getCategoryList().contains("Movies") && c.getAge()==20) 
                        {
                            filename = ap.getFILENAME();
                        }else if (s.equalsIgnoreCase("Movies") && ap.getCategoryList().contains("Movies")) 
                        {
                            filename = ap.getFILENAME();
                        }
                  
                        else if (s.equalsIgnoreCase("Books") && ap.getCategoryList().contains("Books")) 
                        {
                            filename = ap.getFILENAME();
                        } else if (s.equalsIgnoreCase("Cars") && ap.getCategoryList().contains("Cars")) 
                        {
                            filename = ap.getFILENAME();
                        }
                    }

                }
            }
        }
        if (enterprise instanceof PublisherEnterprise) {
            PublisherEnterprise pe = (PublisherEnterprise) enterprise;
            AdvertisingStrategy as = system.getAdExchangeList().callBidding(c.getLocation(), c.getAge(), c.getGender(), c.getInterestList(), pe.getName());
            //System.out.println(as);
            
            if (as == null) {

                DisplayPublisherContent dp = new DisplayPublisherContent(userProcessContainer, system, ae,enterprise, userAccount, s, as, filename);
                userProcessContainer.add("DisplayPublisherContent", dp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {

                DisplayPublisherContent dp = new DisplayPublisherContent(userProcessContainer, system, ae,enterprise, userAccount, s, as,filename);
                userProcessContainer.add("DisplayPublisherContent", dp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }


    }//GEN-LAST:event_goJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton goJButton;
    private javax.swing.JComboBox interestComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewOrderHistoryButton;
    // End of variables declaration//GEN-END:variables
}
