/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.InputOutput_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author tss
 */
public class ReadFile7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        List<String> righe = Files.readAllLines(Paths.get("/tmp/scrivi.txt"));
        for (String riga : righe) {
            System.out.println(riga);
            
        }
        Files.deleteIfExists(Paths.get("/tmp/newScrivi"));
    }
    
}
