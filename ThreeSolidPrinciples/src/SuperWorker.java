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
class SuperWorker implements IWorker, IFeedable{
        @Override
	public void work() {
		System.out.println("I have a better work ethic than you do :]");
	}
        
        @Override
	public void eat() {
		System.out.println("I eat Wheaties every morning :]");
	}
}
