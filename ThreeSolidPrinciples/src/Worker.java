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
class Worker implements IWorker, IFeedable{
    @Override
    public void work() {
      System.out.println("All work and no play make worker a dull boi");
    }
    
    @Override
    public void eat() {
      System.out.println("Worker eats sandwich. Critical damage to sandwich");
    }
}
