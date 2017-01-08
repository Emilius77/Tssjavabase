/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.dadiException;

/**
 *
 * @author tss
 */
public class GiocoDadiException extends RuntimeException {
    
    public GiocoDadiException (String message) {
        super(message);
    }
    
}
