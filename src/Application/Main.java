/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Application;

public class Main {
    
    
    public static void main(String args[]) {
        Framework.Factory instance;
        
        instance = new DPlugIn.Factory(); // new BIPlugIn.Factory
        instance.NewGui().display();
    }
}
