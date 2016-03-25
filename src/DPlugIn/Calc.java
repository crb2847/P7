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
    
    public void set(String t){value = new Double(t);}
    public void clear(){ value = 0.0; }
    public String get(){ return value.toString(); }
    public void add(String t){value = value+Double.parseDouble(t);}
    public void sub(String t){value = value-Double.parseDouble(t);}
    public void mul(String t){value = value*Double.parseDouble(t);}
    public void div(String t){value = value/Double.parseDouble(t);}
}
