/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import FileOperation.WriteOrder;
import Model.Book;
import Model.Order;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class OrderServiceImplement implements OrderService{
Scanner scanner=new Scanner(System.in);

    BookServiceImplement bookservice=new BookServiceImplement();
    WriteOrder writeorder=new WriteOrder();
   
    
    @Override
    public int calculate_payment_total(String user) {
     int i=0;
     int  total=0;
    try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("order.txt")))) { 
         while (scanner.hasNextLine() && i==0) {
                 String order_info = scanner.nextLine();
                 String[] array = order_info.split(",");
                 if(array[0].equals(user))
                   {
                   total+=bookservice.serachbookprice(array[1]);      
                   }
               
         }
         
     } catch (FileNotFoundException ex) { 
        Logger.getLogger(OrderServiceImplement.class.getName()).log(Level.SEVERE, null, ex);
    } 
        System.out.println(user+"'nın toplam ödenecek tutar:"+total);
        return total;
    }

    @Override
    public void addpayment(String user) {
        System.out.println("Eklemek istediğiniz kitabi giriniz.");
        String book=scanner.nextLine();
        if(bookservice.hasbook(book))
        {
            writeorder.add(user,book);
            System.out.println("Kitap ekleniyor");         
        }
        else
        {
            System.out.println("Kitap eklenemiyor");
        }
       
    }
    
}
