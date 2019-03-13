/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import static Service.BookServiceImplement.dictionary_bookname;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class PaymentServiceImplement implements PaymentService{
 static int i=0;
 
 
static String line1;
    @Override
    public void showorder(String user ) {
        System.out.println("Siparişleriniz:");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("order.txt")))) {
            int number=1;
            while (scanner.hasNextLine()) {
                
                String order_info = scanner.nextLine();

                String[] array = order_info.split(",");
                if (array[0].equals(user)) {
                    System.out.println("\n"+number+". kitap:"+array[1]);
                    ++number;
                }}} catch (FileNotFoundException ex) {          
         Logger.getLogger(PaymentServiceImplement.class.getName()).log(Level.SEVERE, null, ex);
     }          
    }

    @Override
    public String asktypeofpayment() {
       Scanner scannerr=new Scanner(System.in);
       String sending = "bilinmiyor";
        System.out.println("Nasıl ödemek istersiniz(Kapıda ödeme için 1,Online ödeme için 2'yi tuşlayınız");
        int typeofpayment=scannerr.nextInt();
        if(typeofpayment==1)
        {
            System.out.println("(hatırlatma) Hizmet bedeli 5 TL'dir.");  
            sending="kapıdaödeme";
            
        }
        else if(typeofpayment==2)
        {
             System.out.println("Kullanmak istediğiniz kredi kartı'nı belirtiniz");
             String trick=scannerr.nextLine();
             String kredikartıtürü=scannerr.nextLine();
             sending="onlineödeme"+","+kredikartıtürü;
              
        }
        else
        {
            System.out.println("ödeme yapılamadı");
        }
        return sending;
    }

    public void updatearraylist(String user) throws FileNotFoundException
    {
        ArrayList<String> orderlist = new ArrayList();
        ArrayList<String> paymentlist = new ArrayList();
        BufferedReader in = new BufferedReader(new FileReader("order.txt"));
        String data = null;
    try {
        while ((data = in.readLine()) != null) {
            String[] args = data.split(",");

            if (args[0].equals(user)) {
               
            } else {
                  orderlist.add(data); 
            }
        }
        in.close();

        //Add to file
        FileWriter fw = new FileWriter("order.txt");
        BufferedWriter out = new BufferedWriter(fw);
        for (String line : orderlist) {
            out.write(line + "\n");
        }
        out.flush();
        out.close();
       
    } catch (Exception e){

    }
 
    }
   
}
 