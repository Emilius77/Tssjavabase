/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import lezione06.ordinamento.Persona;
import java.util.Objects;

/**
 *
 * @author tss
 */

public class Autista extends Persona {

    private String patente;
    
    public Autista(String nome, String cognome, String patente) {
        super(nome, cognome);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {      //l'override viene fatto sempre verso il "padre", in questo caso è il metodo "toString" contenuto in PERSONA e lo si riconosce dal suffisso "super"
        return super.toString() + ", Patente: " + patente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.patente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
    
        final Autista other = (Autista) obj;
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return true;
    }

    
 

}
