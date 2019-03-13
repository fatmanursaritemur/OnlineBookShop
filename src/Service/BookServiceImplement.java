/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// 
package Service;

import Model.B_dictionary;
import Model.Book;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class BookServiceImplement implements BookService {

    static String dictionary=" ";
   static  String liteature=" ";
   static  String textbook=" ";
    static String dictionary_bookname = "Book Name";
    static String dictionary_bookwriter = "Book Writer";
    static String dictionary_language = "Translated Language";
    static String d_price = "Price";
    static ArrayList<B_dictionary> arraydictionary=new ArrayList<B_dictionary>();

    static String l_bookname = "Book Name";
    static String l_bookwriter = "Book Writer";
    static String book_theme = "Book Theme";
    static String l_price = "Price";

    static String t_bookname = "Book Name";
    static String t_bookwriter = "Book Writer";
    static String t_questions = "Number of Questions";
    static String t_price = "Price";
    static boolean ishas=false;
   static int price;

    @Override
    public void getbooklist() {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("book.txt")))) {
            while (scanner.hasNextLine()) {

                String book_info = scanner.nextLine();

                String[] array = book_info.split(",");
                if (array[0].equals("D")) {
                    dictionary_bookname =  array[1];  
                    dictionary_bookwriter =  array[2];
                    dictionary_language =  array[3];
                    d_price =  array[4];
                    dictionary +="\n" + dictionary_bookname + "      " + dictionary_bookwriter + "      " + dictionary_language + "      " + d_price;
                 
                } else if (array[0].equals("L")) { 
                    l_bookname = array[1] ;
                    l_bookwriter =  array[2];
                    book_theme =array[3];
                    l_price = array[4];
                     liteature += "\n" + l_bookname+ "     " + l_bookwriter + "   " + book_theme + "   " + l_price;
                } else if (array[0].equals("T")) {
                    t_bookname =  array[1];
                    t_bookwriter =  array[2];
                    t_questions =   array[3];
                    t_price =  array[4];
                     textbook += "\n" + t_bookname + "     " + t_bookwriter + "       " + t_questions + "          " + t_price;
                }

            }
          //  dictionary = "          SÖZLÜK TÜRÜ" + "\n" + dictionary_kitapismi + "     " + dictionary_kitapyazarı + "     " + çevrildiği_dil + "    " + d_fiyat;
           // System.out.println("         EDEBİ TÜRÜ" + "\n" + l_kitapismi + "     " + l_kitapyazarı + "    " + kitap_teması + "     " + l_fiyat);
         //  textbook = "           TEST  TÜRÜ" + "\n" + t_kitapismi + "     " + t_kitapyazarı + "    " + t_sorusayısı + "     " + t_fiyat;
           
            System.out.println ("*************DICTIONARY***********");
            System.out.println(" Book Name "+" Book Writer  "+ "Traslated Language"+"  Price");
            System.out.println(dictionary);       
           System.out.println("\n ************LITERATURE*************");
             System.out.println(" Book Name "+" Book Writer  "+ "  Theme "+"   Price");
            System.out.println(liteature);
            System.out.println("\n ************TEXT BOOK*************");
             System.out.println(" Book Name "+" Book Writer  "+ " Number of Questions "+"   Price");
            System.out.println(textbook);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookServiceImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean hasbook(String book) {
       String bookv=book;
        int i=0;
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("book.txt")))) {
            while (scanner.hasNextLine() && i==0) {
                
               String book_info = scanner.nextLine();
               
                String[] array = book_info.split(",");
                
                if (array[1].equals(bookv)) {
                    i=5;
                    ishas=true;
                }
                else
                {
                    ishas=false;
                }
                   }
         } catch (FileNotFoundException ex) {
             System.out.println("File not found");
        }
    return ishas;
    }   
    
     public int serachbookprice(String book){
       String bookv=book;
        int i=0;
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("book.txt")))) {
            while (scanner.hasNextLine() && i==0) {
                
               String book_info = scanner.nextLine();
               
                String[] array =book_info.split(",");
                
                if (array[1].equals(bookv)) {
                   String aa=array[4];
                   price=Integer.parseInt(aa);
                }
                   }
         } catch (FileNotFoundException ex) {
             System.out.println("File not found");
        }
    return price;
    } 
    
}
