/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.MarketingAgencyManagerRole;

import Business.BiddingPlatform.MarketingStrategyDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Ecosystem.AdExchange;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class MarketingAgencyManagerWorkArea extends javax.swing.JPanel {
private JPanel userProcessContainer;
private AdExchange adExchange;
private MarketingStrategyDirectory marketingStrategyDirectory;
private Enterprise enterprise;

    /**
     * Creates new form MarketingAgencyManagerWorkArea
     */
    public MarketingAgencyManagerWorkArea(JPanel upc,Enterprise e) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=e;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPublisherStratJButton = new javax.swing.JButton();
        viewPubStratJButton = new javax.swing.JButton();

        addPublisherStratJButton.setText("Add Publisher strategy");
        addPublisherStratJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPublisherStratJButtonActionPerformed(evt);
            }
        });

        viewPubStratJButton.setText("View Publisher Strategy");
        viewPubStratJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPubStratJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewPubStratJButton)
                    .addComponent(addPublisherStratJButton))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(addPublisherStratJButton)
                .addGap(31, 31, 31)
                .addComponent(viewPubStratJButton)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPublisherStratJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPublisherStratJButtonActionPerformed
        // TODO add your handling code here:
        AddMarketingStrategyJPanel apsj=new AddMarketingStrategyJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("manageEmployeeJPanel", apsj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPublisherStratJButtonActionPerformed

    private void viewPubStratJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPubStratJButtonActionPerformed
        // TODO add your handling code here:
        ViewMarketingStrategiesJPanel vmsj=new ViewMarketingStrategiesJPanel(userProcessContainer,(PublisherEnterprise)enterprise);
        userProcessContainer.add("manageEmployeeJPanel", vmsj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPubStratJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPublisherStratJButton;
    private javax.swing.JButton viewPubStratJButton;
    // End of variables declaration//GEN-END:variables
}