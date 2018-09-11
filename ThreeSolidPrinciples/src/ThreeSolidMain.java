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
public class ThreeSolidMain {
    
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }
      
      Member Bob = new Member("Bob", 12345);
      System.out.println("The members name is " + Bob.getName()); 
      System.out.println("The members ID is " + Bob.getID());
      System.out.println();
      
      Robot RB1 = new Robot("Metagross", 86); 
      System.out.println("The Robot's name is " + RB1.getName()); 
      System.out.println("The members ID is " + RB1.getID());
      RB1.work();
      System.out.println();
      
      Worker Peasant = new Worker(); 
      Peasant.work();
      Peasant.eat(); 
      System.out.println();
      
      SuperWorker Tryhard = new SuperWorker();
      Tryhard.work();
      Tryhard.eat(); 
      System.out.println();
      
      
      Manager Paulie = new Manager();
      Paulie.setWorker(Peasant);
      Paulie.manage(); 
      System.out.println();
      
      {
            try 
      {
         System.out.format("Stopping ... \n");               
      } 
            
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);
      }
   }
}
   
 
