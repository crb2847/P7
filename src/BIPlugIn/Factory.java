/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BIPlugIn;


public class Factory extends Framework.Factory {

    @Override
    public Calc NewCalc() {
        return new Calc();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Gui NewGui() {
        return new Gui("BIPlugIn", this);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
