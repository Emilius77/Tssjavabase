/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.InputOutput_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tss
 */
public class CopyFileBuffered {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
//    public static void main(String[] args) throws IOException {
//        // TODO code application logic here
//
//        BufferedReader br = null;
//        BufferedWriter bw = null;
//
//        try {
//            br = new BufferedReader(new FileReader("/tmp/scrivi.txt"));
//            bw = new BufferedWriter(new FileWriter("/tmp/copiaBuffered.txt"));
//            String riga;
//            
//            while ((riga = br.readLine()) != null) {
//                bw.write(riga);
//                bw.newLine();
//            }
//            
//            } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            if (br != null) {
//                br.close();
//            }
//            if (bw != null) {
//                bw.close();
//            }
//        }
//    }
    
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/scrivi.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/copiaBuffered1.txt"))) {
            String riga;

            while ((riga = br.readLine()) != null) {
                bw.write(riga);
                bw.newLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
