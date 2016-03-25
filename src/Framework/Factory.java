/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Framework;

/**
 *
 * @author Don
 */
public abstract class Factory {
    public Factory() {
    }

    public abstract Calc NewCalc();
    public abstract Gui  NewGui();
}
