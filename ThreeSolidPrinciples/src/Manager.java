/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threesolid;

/**
 *
 * @author Hunter
 */
public class Manager {
    	
	IWorker worker;
    
        public void setWorker(IWorker w) {
		worker = w;
	}
        
       public void manage() {
		worker.work();
        }
}
