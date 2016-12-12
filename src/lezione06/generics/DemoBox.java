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
public class DemoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Box box = new Box(new Persona("Mario", "Rossi"));
        System.out.println(box.getObject().getClass());
        
        Persona object = (Persona) box.getObject();
        System.out.println(object.getCognome());
        
        if (box.getObject() instanceof Persona) {
            Persona p = (Persona) box.getObject();
            p.setCognome("xxXxx");
            System.out.println(box.getObject());
        }
        
        Box <Persona> box2 = new Box<> (new Persona("Gianni", "Ameri"));
        Persona p = box2.getObject();
        
        System.out.println(p);
        
    }
    
}
