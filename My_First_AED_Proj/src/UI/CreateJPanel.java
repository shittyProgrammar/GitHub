/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

//attach the business package to access product variables 
import Business.Product;
// import jOptionPane for prompt
import javax.swing.JOptionPane;


/**
 *
 * @author sneha
 */
public class CreateJPanel extends javax.swing.JPanel {
// declare product variable
    private Product product; 
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Product product) {
        initComponents();
        this.product= product;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createJLabel = new javax.swing.JLabel();
        createProductNameLabel = new javax.swing.JLabel();
        createPriceLabel = new javax.swing.JLabel();
        createAvailabilityLabel = new javax.swing.JLabel();
        createDescriptionLabel = new javax.swing.JLabel();
        createProductNameJTextField = new javax.swing.JTextField();
        createPriceJTextField = new javax.swing.JTextField();
        createAvailabilityJTextField = new javax.swing.JTextField();
        createDescriptionJTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();

        createJLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        createJLabel.setText("Create a Product");

        createProductNameLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createProductNameLabel.setText("Product Name : ");

        createPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createPriceLabel.setText("Price : ");

        createAvailabilityLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createAvailabilityLabel.setText("Availability : ");

        createDescriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createDescriptionLabel.setText("Description : ");

        createProductNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductNameJTextFieldActionPerformed(evt);
            }
        });

        createPriceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPriceJTextFieldActionPerformed(evt);
            }
        });

        createAvailabilityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAvailabilityJTextFieldActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .addComponent(createJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createProductNameLabel)
                            .addComponent(createPriceLabel)
                            .addComponent(createAvailabilityLabel)
                            .addComponent(createDescriptionLabel))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createProductNameJTextField)
                            .addComponent(createPriceJTextField)
                            .addComponent(createAvailabilityJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(createDescriptionJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(564, 564, 564)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(createJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProductNameLabel)
                    .addComponent(createProductNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPriceLabel)
                    .addComponent(createPriceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createAvailabilityLabel)
                    .addComponent(createAvailabilityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createDescriptionLabel)
                    .addComponent(createDescriptionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(createButton)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createProductNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProductNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createProductNameJTextFieldActionPerformed

    private void createPriceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPriceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createPriceJTextFieldActionPerformed

    private void createAvailabilityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAvailabilityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAvailabilityJTextFieldActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        
        // fill the values in the text boxes into the Product variables
        product.setProductName(createProductNameJTextField.getText());
        product.setProductPrice(Integer.parseInt(createPriceJTextField.getText()));
        product.setProdctAvailability(Integer.parseInt(createAvailabilityJTextField.getText()));
        product.setProductDescription(createDescriptionJTextField.getText());
        
        // Prompt that the product was created successfully
        JOptionPane.showMessageDialog(null, "The Product was created Successfully");
        
        
    }//GEN-LAST:event_createButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField createAvailabilityJTextField;
    private javax.swing.JLabel createAvailabilityLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField createDescriptionJTextField;
    private javax.swing.JLabel createDescriptionLabel;
    private javax.swing.JLabel createJLabel;
    private javax.swing.JTextField createPriceJTextField;
    private javax.swing.JLabel createPriceLabel;
    private javax.swing.JTextField createProductNameJTextField;
    private javax.swing.JLabel createProductNameLabel;
    // End of variables declaration//GEN-END:variables
}
