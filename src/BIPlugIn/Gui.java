package BIPlugIn;

public class Gui extends Framework.Gui {
    /** Creates new form calcGui */
    public Gui(String name, Factory f) {
        super(name, f);
        initComponents();
    }

    javax.swing.JTextField Result;
    
    public void display() {
        Framework.Gui cg = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cg.setVisible(true);
            }
        });
    }
}
