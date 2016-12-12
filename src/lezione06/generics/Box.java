/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.generics;

/**
 *
 * @author tss
 */
public class Box<T> {   //parametrizzazione del tipo "T"
    
    private T object; 

    public Box(T Object) {
        this.object = Object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
    
}
