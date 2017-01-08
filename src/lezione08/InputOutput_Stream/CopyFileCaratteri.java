/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.InputOutput_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tss
 */
public class CopyFileCaratteri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        FileReader r = null;
        FileWriter w = null;

        try {
            r = new FileReader("/tmp/copia.txt");
            w = new FileWriter("/tmp/copiaCaratteri.txt");
            int dato;
            while ((dato = r.read()) != -1) {
                w.write(dato);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (r != null) {
                r.close();
            }
            if (w != null) {
                w.close();
            }
        }

    }

}
