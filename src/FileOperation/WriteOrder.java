/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import static FileOperation.WriteBook.book_file;
import static FileOperation.WritePayment.payment_file;
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
public class WriteOrder {

    static File order_file = new File("order.txt");
   
    public static void main(String[] args) {

        if (!order_file.exists()) {
            try {
                order_file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(WriteUser.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}

   
    public void add(String user, String book) {//bir aksilik durumunda(kullanıcı ekleyemez ise) sistemden eklenebilir
        FileOutputStream bookstream = null;
        try {
            bookstream = new FileOutputStream(order_file, true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        String order = "\n"+user + "," + book;
        try {
        bookstream.write(order.getBytes());
        
            
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void add() {//overload   // kitap ve kullanıcı almada sorun oluşması durumunda onu da sistemden girmek gerekebilir.
        FileOutputStream bookstream = null;
        try {
            bookstream = new FileOutputStream(order_file, true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter user name");
         String user=scanner.nextLine();
          System.out.println("Enter book name");
         String book=scanner.nextLine();
        String order = "\n"+user + "," + book;
        try {
        bookstream.write(order.getBytes());
        
            
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
