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
public class DemoEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p = new Persona("Franco", "Ruffini");
        Persona a = new Persona("Gianni", "Foti");
        System.out.println(p.equals(a));

        Persona k = new Persona("Luca", "Cadalora");
        System.out.println(k.equals(a));

        Persona r = new Persona("Gianni", "Foti");
        System.out.println(r.equals(a));

        Autista t = new Autista("Gianni", "Foti", "C");
        System.out.println(t.equals(a));

        Autista s = new Autista("Gianni", "Foti", "C");
        System.out.println(s.equals(t));
        
        Autista d = new Autista("Franco", "Ruffini", "A");
        Autista e = new Autista("Gianni", "Foti", "K");
        
        Autista daCercare = new Autista("Gianni", "Foti", "K");
                
        Object[] persone = new Object[2];
        persone[0] = d;
        persone[1] = e;
        
        int ris = cerca(persone, daCercare);
        System.out.println(ris);
    }

    /**
     * Ricerca un elemento all'interno di un vettore e ritorna l'indice della
     * prima occorrenza trovata
     *
     * @param anagrafica: "vettore" dove eseguire la ricerca
     * @param elemento: elemento da cercare all'interno del vettore
     * @return: indice dell'elemento se trovato, altrimenti -1
     */
    
    public static int cerca(Object[] anagrafica, Object elemento) {

        for (int i = 0; i < anagrafica.length; i++) {
            if (anagrafica[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

}
