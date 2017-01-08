/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioniNatalizie.metodi;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilius
 */
public class QuattroPuntoDue {

    /**
     * Esercizio 4.2: Scrivere un programma "TuttiUguali" che chiede all’utente
     * di inserire tre numeri e stampa "Tutti uguali!" se i tre numeri sono
     * tutti uguali, e altrimenti stampa "Almeno uno e’ diverso". Il controllo
     * che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario,
     * mentre il messaggio dovra essere stampato dal metodo main. Il nome del
     * metodo ausiliario può essere sceltoa piacere.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input;
        String ris = "";
        int num1;
        int num2;
        int num3;
        
        input = JOptionPane.showInputDialog("Inserire il primo numero");
        num1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire il secondo numero");
        num2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire il terzo numero");
        num3 = Integer.parseInt(input);
        
        String check = getCheck(num1, num2, num3, ris);
        JOptionPane.showMessageDialog(null, check);
    }
    
    static String getCheck (int num1, int num2, int num3, String ris) {
        ris = "";
        if (num1 == num2 && num1 == num3) {
            ris = "Tutti uguali";
        } else {
            ris = "C'è almeno un numero diverso";
        }
        return ris;
    }
    
}
