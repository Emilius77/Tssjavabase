/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.InputOutput_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author tss
 */
public class CopyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream("/tmp/scrivi.txt");
            os = new FileOutputStream("/tmp/copia.txt");
            int dato;
            while ((dato = is.read()) != -1) {
                os.write(dato);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (is != null) {
                is.close();
                os.close();
            }
        }
    }

}
