/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.UserSiteFacade;
import entities.UserSite;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author charlie
 */
@Named(value = "UserSiteView")
@RequestScoped
public class UserSiteView {

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    //Injects the UserFacade session bean using the @EJB annotation
    @EJB
    private UserSiteFacade userFacade;
    private UserSite user;
    private String pass1;
    private String pass2;

    /**
     * Creates a new instance of UserView
     */
    public UserSiteView() {
       this.user = new UserSite();
    }
    
    //Creates getUser to retrieve the user
    public UserSite getUser(){
        return user;
    }
    
    //Returns the total number of Users
    public int getNumberOfUsers(){
        return userFacade.findAll().size();
    }
    
    public boolean samePass(){
        return this.pass1.equals(this.pass2);
    }
    
    //Saves the User and then returns the string "welcome"
    public String postUser(){
        System.out.println("entra al proceso postUser");
        if(samePass()){
               System.out.println(user.getEmail());
               System.out.println(user.getUsername());
//               user.setActive(true);
//               user.setAuxText("hola");
//               user.setEncryptedPass(pass1);
               this.userFacade.create(user);
//               System.out.println("ya tenemos varios users: "+this.getNumberOfUsers());
               return "welcome";
        }
        return "check";
        
    }
    
}
