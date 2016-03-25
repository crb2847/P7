package DPlugIn;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Don
 */
public class Gui extends Framework.Gui {

public Gui(String name, Factory f) {
        super(name, f);
        initComponents();
    }
    
    public void display() {
        Framework.Gui cg = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cg.setVisible(true);
            }
        });
    }
}
