/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import static FileOperation.WriteBook.book_file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class WritePayment  {
   static File payment_file=new File("payment.txt");

    public static void main(String[] args) {
        
   
       

if (!payment_file.exists()) 
  {
         try {
             payment_file.createNewFile();
         } catch (IOException ex) {
             Logger.getLogger(WriteUser.class.getName()).log(Level.SEVERE, null, ex);
         }
         
}

   
}
 public WritePayment() {
    }

 
    public void add(String user,String payment_type) { //bir aksilik durumunda(kullanıcı ekleyemez ise) sistemden eklenebilir
       FileOutputStream paymentstream = null;
       String payment_order="yapılamadı";
        try {
            paymentstream =new FileOutputStream(payment_file,true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
       String userr=user;
       String payment_typee=payment_type;
       payment_order="\n"+userr+","+payment_type;
        try {
            paymentstream.write(payment_order.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
