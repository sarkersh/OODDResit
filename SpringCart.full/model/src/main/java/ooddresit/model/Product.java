/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddresit.model;


import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author cgallen / nickw
 */

// Product class
// Represents a single product sold by the shop
// Each product has an ID, a name, a manufacturer, a price, and a current quantity in stock.

// TODO complete this class according to the brief; it's unfinished
@Entity
public class Product {
    
    private Long id;
    private String name, manufacturer, productType;
    double price;
    int qtyInStock;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
        price = newPrice;
    }
}
