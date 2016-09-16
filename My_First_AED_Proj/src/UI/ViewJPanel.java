/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

// import business packge to access Product variables
import Business.Product;


/**
 *
 * @author sneha
 */
public class ViewJPanel extends javax.swing.JPanel {

    

    /**
     * Creates new form ViewJPanel
     */
   
    public ViewJPanel(Product product) {
        initComponents();
        displayProduct(product);
        
        
    }
    
    private void displayProduct(Product product){
        
        String productName = product.getProductName();
        viewProductNameJLabel.add(productName, this);
        int productPrice = product.getProductPrice();
        viewPriceJLabel.add(String.valueOf(productPrice), this);
        int productAvailability = product.getProdctAvailability();
        viewAvailabilityJLabel.add(String.valueOf(productAvailability), this);
        String productDescription = product.getProductDescription();
        viewProductNameJLabel.add(productDescription, this);
        
            
        
        
        
    
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
        createProductNameLabel = new javax.swing.JLabel();
        createPriceLabel = new javax.swing.JLabel();
        createAvailabilityLabel = new javax.swing.JLabel();
        createDescriptionLabel = new javax.swing.JLabel();
        viewProductNameJLabel = new javax.swing.JLabel();
        viewPriceJLabel = new javax.swing.JLabel();
        viewAvailabilityJLabel = new javax.swing.JLabel();
        viewDescriptionJLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("View Product Details");

        createProductNameLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createProductNameLabel.setText("Product Name : ");

        createPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createPriceLabel.setText("Price : ");

        createAvailabilityLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createAvailabilityLabel.setText("Availability : ");

        createDescriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        createDescriptionLabel.setText("Description : ");

        viewProductNameJLabel.setText("  ");

        viewPriceJLabel.setText("  ");

        viewAvailabilityJLabel.setText("  ");

        viewDescriptionJLabel.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(383, 383, 383))
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createProductNameLabel)
                    .addComponent(createPriceLabel)
                    .addComponent(createAvailabilityLabel)
                    .addComponent(createDescriptionLabel))
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewDescriptionJLabel)
                    .addComponent(viewAvailabilityJLabel)
                    .addComponent(viewPriceJLabel)
                    .addComponent(viewProductNameJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProductNameLabel)
                    .addComponent(viewProductNameJLabel))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPriceLabel)
                    .addComponent(viewPriceJLabel))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAvailabilityLabel)
                    .addComponent(viewAvailabilityJLabel))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDescriptionLabel)
                    .addComponent(viewDescriptionJLabel))
                .addContainerGap(390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAvailabilityLabel;
    private javax.swing.JLabel createDescriptionLabel;
    private javax.swing.JLabel createPriceLabel;
    private javax.swing.JLabel createProductNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel viewAvailabilityJLabel;
    private javax.swing.JLabel viewDescriptionJLabel;
    private javax.swing.JLabel viewPriceJLabel;
    private javax.swing.JLabel viewProductNameJLabel;
    // End of variables declaration//GEN-END:variables
}
