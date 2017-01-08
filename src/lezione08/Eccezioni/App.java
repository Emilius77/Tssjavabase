/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.Eccezioni;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {

//        try {
//            FileReader f = new FileReader("/tmp/test.txt");
//            System.out.println("File trovato e aperto");
//        } catch (FileNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "File non trovato");
//            System.out.println(ex.getMessage());
//        }
//        GestoreFile.apri("/tmp/test.txt");
//        FileReader file = GestoreFile.apri2("/tmp/test.txt");
        String[] righe = {"ciao a tutti", "pausa caffè", "non ci sto capendo nulla"};

        try {
            GestoreFile.scrivi1("/tmp/prova/scrivi.txt", Arrays.asList(righe));
        } catch (Exception ex) {
            System.out.println("Qualcosa è andato storto ...");
            System.out.println(ex.getMessage());

        }

    }
}
