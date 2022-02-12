/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.spring;


import javax.servlet.http.HttpSession;
import ooddresit.model.Product;
import ooddresit.model.Shop;
import ooddresit.model.ShoppingCart;
import ooddresit.model.CartItem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author nick
 */

@Controller
@RequestMapping("/")
public class CartController {
    
   
    @RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(Model model) {
        return "redirect:/index.html";
        
    }
   
   
    // TODO complete the /productlist route and add other routes to manage the shopping cart.
    
    @RequestMapping(value="/productlist", method= {RequestMethod.GET, RequestMethod.POST})
    public String productList(Model model, HttpSession session) {
        
     
        return "home";
    }
    
}
