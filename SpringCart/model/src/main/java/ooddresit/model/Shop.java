/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nick
 */

// Class representing the shop as a whole
// Contains methods for retrieving prodcuts by name, by ID, etc.

// TODO complete this class according to the brief; it's unfinished

public class Shop {
    
    String name;
    private List<Product> products = new ArrayList<Product>();
    
    public Shop(String nameIn) {
        this.name = nameIn;
    }
   
}
