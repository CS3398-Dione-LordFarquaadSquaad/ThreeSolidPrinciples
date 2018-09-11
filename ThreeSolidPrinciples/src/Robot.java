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
public class Robot extends Member implements IWorker {
    
    public Robot(String aName, int aID) {
        super(aName, aID);
    }

    @Override
    public void work() {
        System.out.println("Walk in circles");
    }

}
