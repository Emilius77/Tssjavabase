/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Messaggio implements Comparable<Messaggio>{
    
    private String testo;

    public Messaggio(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Messaggio{" + "testo=" + testo + '}';
    }

    @Override
    public int compareTo(Messaggio o) {
        return this.testo.compareTo(o.getTesto());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.testo);
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
        final Messaggio other = (Messaggio) obj;
        if (!Objects.equals(this.testo, other.testo)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
