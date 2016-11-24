/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *  Leggo un numero in input e stampo il suo fattoriale
 *
 * @author tss
 */
public class Fattoriale {
    
    
    public static void main(String[] args) {
        
        // dichiaro le variabili che mi serviranno
        int numero = 0;
        int fattoriale = 1;
        String input;
        
        // chiedo l'input all'utente
        input = JOptionPane.showInputDialog("Dammi un numero");
        numero = Integer.parseInt(input);
        
        // faccio la mia elaborazione
        for (int i=1; i <= numero; i=i+1) {
            fattoriale = fattoriale * i;
        }
        
        // restituisco un output all'utente
        JOptionPane.showMessageDialog(null, fattoriale);
    }
    
}
