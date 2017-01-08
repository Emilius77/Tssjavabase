/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.InputOutput_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author tss
 */
public class CopyFile7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Files.copy(
                Paths.get("/tmp/scrivi.txt"),
                Paths.get("/tmp/copia1.txt"),
                StandardCopyOption.REPLACE_EXISTING);
        
    }

}
