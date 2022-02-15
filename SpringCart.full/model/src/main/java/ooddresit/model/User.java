/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.model;

/**
 *
 * @author nick
 */

// Class representing a user.
// TODO complete this class
public class User {
    
    private String username, password;
    public enum UserClass { CUSTOMER, ADMIN };
    
    private UserClass userClass;
    
    public User (String u, String p, UserClass uc) {
        username = u;
        password = p;
        userClass = uc;
    }
    
}
