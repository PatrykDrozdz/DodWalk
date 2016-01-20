/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WalkTheDog;
import java.util.Random;
/**
 *
 * @author Ramzuous
 */
public class Walk extends Thread {
 
   
    private int i;
    private final int toWalk;
    
    public Walk(int toWalk){
        this.toWalk = toWalk;
    }
    
    @Override
    public synchronized void run(){

        i = 0;
        
        while(i!=this.toWalk){
            
           
            StoppingLittle.stop();
            System.out.println(i+" ");
            
            i++;

        }
        
    }
    
}
