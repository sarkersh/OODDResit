/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddresit.model;


import java.util.UUID;

/**
 *
 * @author cgallen / nickw
 */

// Product class
// Represents a single product sold by the shop
// Each product has an ID, a name, a manufacturer, a price, and a current quantity in stock.

// TODO complete this class according to the brief; it's unfinished
public class Product {
    
    int id;
    private String name, manufacturer, productType;
    double price;
    int qtyInStock;
    
    public Product (int idIn, String nameIn, String manufacturerIn, String typeIn, double priceIn, int qtyIn) {
        name = nameIn;
        manufacturer = manufacturerIn;
        price = priceIn;
        qtyInStock = qtyIn;
        productType = typeIn;
        id = idIn;
    }
    
    public int getId() {
        return id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
        price = newPrice;
    }
}
