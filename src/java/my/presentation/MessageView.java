/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.MessageFacade;
import entities.Message;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author charlie
 */
@Named(value = "MessageView")
@RequestScoped
public class MessageView {

    @EJB
    private MessageFacade messageFacade;
    
    //Creates a new field
    private Message message;
    
    //Calls getMessae to retrieve the message
    public Message getMessage(){
        return message;
    }
    
    // Returns the total number of messages
    public int getNumberOfMessages(){
       return messageFacade.findAll().size();
    }
    
    // Saves the message and then returns the string "theend"
    public String postMessage(){
       System.out.println("el mensaje es: " + message.getMessage());
       this.messageFacade.create(message);
       return "theend";
    }

    /**
     * Creates a new instance of MessageView
     */
    public MessageView() {
        this.message = new Message();
    }
    
}
