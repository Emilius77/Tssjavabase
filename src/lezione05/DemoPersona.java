/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

/**
 *
 * @author tss
 */
public class DemoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Autista a = new Autista("Mauro", "Pipperino", "B");
        Persona p = new Persona("Valentino", "Rossi");
        
        Object[] persone = new Object[2];
        persone[0] = a;
        persone[1] = p;
        stampa(persone);
        
        System.out.println(p);
        
        Object o = new Persona("Gianni", "Rivera"); //il tipo di variabile indica ciò che la variabile può vedere
                                    //una variabile di tipo "Object" può vedere ed utilizzare solo i metodi contenuti in Object
                                    //una variabile di tipo "Persona" può vedere ed utilizzare i metodi contenuti in Persona ed in Object
                                    //qualunque classe eredita i metodi di Object
        
        System.out.println(o.toString());
        
        Object k = new Autista("Mauro", "Pipperino", "B");
        System.out.println(k.toString());
        
        
        
        
    }
    
    public static void stampa (Object[] anagrafica) {
        for (Object o : anagrafica) {       //questo tipo di costrutto corrisponde al ciclo for scritto così:
            
            System.out.println(o.toString());
        }
    }
}
