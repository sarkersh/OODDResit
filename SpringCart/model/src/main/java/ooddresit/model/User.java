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
    private long id;
    public enum UserClass { CUSTOMER, ADMIN };
    
    private UserClass userClass;
   
    public long getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public UserClass getUserClass() {
        return userClass;
    }
    
    public void setUsername(String u) {
        username = u;
    }
    
    public void setPassword(String p) {
        password = p;
    }
    
    public void setUserClass(UserClass uc) {
        userClass = uc;
    }
    
}
