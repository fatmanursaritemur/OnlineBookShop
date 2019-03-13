/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import static FileOperation.WriteOrder.order_file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class ReadOrder implements ReadFile {

    @Override
    public void read() {
        FileInputStream orderstream = null;
        try {
            orderstream = new FileInputStream(order_file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
