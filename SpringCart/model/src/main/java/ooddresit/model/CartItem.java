/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author nick
 */

// CartItem
// Represents an individual item in the shopping cart.
// Each cart item stored the product, plus the quantity the user desires.
// Note that this class is different to Product. Product is designed to store information about each
// product in the shop, including its quantity in stock, but CartItem is designed to store an item WHILE IN THE CART
// (so it needs information about how many items of the product the user would like)

// TODO complete this class according to the brief; it's unfinished

@Entity
public class CartItem {
    
    private Product product;
    private int desiredQty;
    private Long id;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
