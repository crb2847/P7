/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DPlugIn;

/**
 *
 * @author Don
 */
public class Calc extends Framework.Calc {
    Double value = 0.0;
    
    void set(String t){value = new Double(t);}
    void clear(){ value = 0.0; }
    String get(){ return value.toString(); }
    void add(String t){value = value+Double.parseDouble(t);}
    void sub(String t){value = value-Double.parseDouble(t);}
    void mul(String t){value = value*Double.parseDouble(t);}
    void div(String t){value = value/Double.parseDouble(t);}
}
