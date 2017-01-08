/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.InputOutput_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author tss
 */
public class WriteFile7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String source = "Che figata \nmi piace questo 7 \nChe te lo dico a fare ...";
        
        Files.write(Paths.get("/tmp/newScrivi.txt"), 
                source.getBytes(),
                StandardOpenOption.CREATE);
        
    }
    
}
