/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Hunter
 */
public class Manager {
    	
	BaseWorker worker;
    
        public void setWorker(BaseWorker w) {
		worker = w;
	}
        
       public void manage() {
		System.out.println("Here's the typical manager function");
                System.out.println("Just doing boring manager stuff. Why do you seem surprised?"); 
        }
}
