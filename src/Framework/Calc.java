/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Framework;

/**
 *
 * @author Don
 */
public abstract class Calc {
    
    public abstract void set(String text);

    public abstract void clear();

    public abstract void add(String text);

    public abstract String get();

    public abstract void sub(String text);

    public abstract void mul(String text);

    public abstract void div(String text);

}
