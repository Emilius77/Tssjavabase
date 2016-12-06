/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Date;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class Persona {

    private String nome, cognome;
    private Date dataNascita;
    private String sesso;

    public Persona() {  //costruttore VUOTO, viene richiesto "sempre" in caso di utlizzo di un DB!
    }                   //se non si utilizzano DB, si può anche non utilizzare questo tipo di costruttore

    //public Persona(String nome, String cognome) {  //costruttore con soli due campi
    //    this.nome = nome;
    //    this.cognome = cognome;
    //}
    public Persona(String nome, String cognome) {  //costruttore con soli due campi che richiamo quello più completo!
        this(nome, cognome, null, null);
    }

    public Persona(String nome, String cognome, Date dataNascita, String sesso) { //costruttore completo (con tutti i campi richiesti)
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        if (!sesso.equals("F") | !sesso.equals("M")) {
            return;
        }
        this.sesso = sesso;
    }

    @Override
    public String toString() {          //l'override viene fatto sempre verso il "padre", in questo caso è il metodo "toString" contenuto in OBJECT
        return nome + ", " + cognome;
    }
    
    /*
    @Override
    public boolean equals(Object obj) {   //in italiano questa sintassi rappresente: se l'oggetto da confrontare è vuoto, restituisci FALSO
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != Persona.class) {  //in italiano questa sintassi rappresente: se l'oggetto da confrontare NON appartiene alla classe PERSONA, restituisci FALSO
            return false;
        }

        Persona p = (Persona) obj;      //casting di tipo di variabile
        if (this.getNome().equals(p.getNome())
                && this.getCognome().equals(p.getCognome())) {
            return true;
        } else {
            return false;
        }
    }
    */
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }
}
