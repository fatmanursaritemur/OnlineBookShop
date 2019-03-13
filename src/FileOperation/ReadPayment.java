/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;


import static FileOperation.WritePayment.payment_file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class ReadPayment implements ReadFile{

    @Override
    public void read() {    // proje genişletildiğinde gerekli olabilir.
      FileInputStream orderstream = null;
        try {
            orderstream = new FileInputStream(payment_file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
