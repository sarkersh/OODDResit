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

// Class representing a user.
// TODO complete this class
@Entity
public class User {
    
    private String username, password;
    private Long id;
    public enum UserClass { CUSTOMER, ADMIN };
    
    private UserClass userClass;
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
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
