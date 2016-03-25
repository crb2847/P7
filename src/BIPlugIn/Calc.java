/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BIPlugIn;

import java.math.BigInteger;


public class Calc extends Framework.Calc  {
    final static BigInteger zero = new BigInteger("0");
    BigInteger bi = zero;
    
    void set(String t){ bi = new BigInteger(t); }
    void clear(){ bi = zero; }
    void add(String t){ bi = bi.add(new BigInteger(t)); }
    String get(){ return bi.toString(); }
    void sub(String t){ bi = bi.subtract(new BigInteger(t)); }
    void mul(String t){ bi = bi.multiply(new BigInteger(t)); }
    void div(String t){ bi = bi.divide(new BigInteger(t)); }

}

