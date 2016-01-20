/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WalkTheDog;

/**
 *
 * @author Ramzuous
 */
public class DogWalkigTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numberOfWalking = 8;
        int toWalk = 5;
        
        Walk[] walk = new Walk[numberOfWalking];
        
        for(int i=0; i<numberOfWalking; i++){
            walk[i] = new Walk(toWalk);
            walk[i].start();
        }
        

            for(int i=0; i<toWalk; i++){
               try {
                    walk[i].join();
               } catch (InterruptedException e) {}
            
            }

        
    }

    
}
