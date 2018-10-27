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
public class ThreeSolidMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProjectManager BillLumberg = new ProjectManager();
        BillLumberg.manage();
        BillLumberg.schedulework();
        System.out.println(); 
        
        ProductManager TrevorP = new ProductManager();
        TrevorP.manage();
        TrevorP.defineproduct();
        System.out.println(); 
        
        Worker RandyM = new Worker("Randy", 12345) {}; 
        RandyM.sick();
        RandyM.eat(); 
        System.out.println(); 
        
        SuperWorker PCPrincipal = new SuperWorker("PC Principal", 123) {}; 
        PCPrincipal.sick();
        PCPrincipal.eat(); 
        PCPrincipal.work(); 
        System.out.println(); 
        
        TempWorker Peasant = new TempWorker("Leeroy", 0) {}; 
        Peasant.work();
        Peasant.sick();
        Peasant.eat();
        System.out.println(); 
        
        Robot AWESOMO = new Robot("AWESOM-O", 4000) {}; 
        AWESOMO.reboot();
    }
    
}
