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
public class Bicycle {
    
    private int speed;
    private int gear;
    private static int numeroDiIstanze = 0;

    public Bicycle() {
        this(1, 1);
    }
    
    public Bicycle(int speed) {
        this(speed, 1);
    }
    
    public Bicycle(int speed, int gear) { //questo è il nostro costruttore che ci servirà per creare nuovi oggetti, al quale diamo dei parametri
        this.speed = speed;             //vincolanti che vogliamo siano "obbligatoriamente" presenti all'atto della creazione
        this.gear = gear;
        numeroDiIstanze++;
    }
    
    public int getSpeed() {   //questo metodo serve per "leggere" il contenuto di una variabile (speed)
        return speed;
    }
    
    public void setSpeed(int valore) { //questo metodo serve per cambiare il contenuto di una variabile (speed)
        speed = valore;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    
    public static int getNumeroIstanzeCreate () {
        return numeroDiIstanze;
    }
    
}
