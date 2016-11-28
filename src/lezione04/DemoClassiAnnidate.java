/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class DemoClassiAnnidate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona("Mario", "Rossi");
        System.out.println(p.getCognome() + "," + p.getNome());
    }
    
}

class Persona {
    
    private String nome, cognome;
    private Indirizzo indirizzo;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    class Indirizzo {
        
        private String indirizzi;
        private int numero, cap;
        private String citta;

        public Indirizzo(String indirizzi, int numero, int cap, String citta) {
            this.indirizzi = indirizzi;
            this.numero = numero;
            this.cap = cap;
            this.citta = citta;
        }

        public String getIndirizzi() {
            return indirizzi;
        }

        public void setIndirizzi(String indirizzi) {
            this.indirizzi = indirizzi;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCap() {
            return cap;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }

        public String getCitta() {
            return citta;
        }

        public void setCitta(String citta) {
            this.citta = citta;
        }
        
        
    }
    
}
