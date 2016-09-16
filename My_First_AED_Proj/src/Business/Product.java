/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sneha
 */
public class Product {
    
    private String productName;    
    private int productPrice;
    private int prodctAvailability;
    private String productDescription; 

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProdctAvailability() {
        return prodctAvailability;
    }

    public void setProdctAvailability(int prodctAvailability) {
        this.prodctAvailability = prodctAvailability;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    
    
    
}
