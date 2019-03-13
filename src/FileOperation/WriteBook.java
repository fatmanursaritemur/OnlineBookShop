/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

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
public class WriteBook implements WriteFile {

    static File book_file = new File("book.txt");
   public static void main(String[] args) {
        
         

if (!book_file.exists()) 
  {
         try {
             book_file.createNewFile();
         } catch (IOException ex) {
             Logger.getLogger(WriteUser.class.getName()).log(Level.SEVERE, null, ex);
         }
         
}

   
}

    @Override
    public void add() {
    FileOutputStream bookstream = null;
    String book_name;
    String book_writer;
    String price;
    String translate_language;
        try {
            bookstream = new FileOutputStream(book_file,true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the type of book you want seçiniz(\n 1 for dictionary  \n 2 for literatureiçin  \n 3 for textbook)");
        int book_type=scanner.nextInt();
        System.out.println("seçtiğiniz kitaptürü:"+book_type);
        if(book_type==1)
        {
            String aaa;
        aaa = scanner.nextLine();
            System.out.println("Please enter dictionary name");
            book_name=scanner.nextLine();
            System.out.println("Please enter dictionary's writer name");
           book_writer=scanner.nextLine();
            System.out.println("Please enter dictionary language");
            translate_language=scanner.nextLine();
            System.out.println("Please enter price");
            price=scanner.nextLine();
           String d_book="\nD "+","+book_name+","+book_writer+","+translate_language+","+price;
        try {
            bookstream.write(d_book.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(book_type==2)
        {
            String aaa;
        aaa = scanner.nextLine();
            System.out.println("Please enter book name");
            book_name=scanner.nextLine();
            System.out.println("Please enter book writer name");
            book_writer=scanner.nextLine();
            System.out.println("Please enter books topicz");
        String  book_theme = scanner.nextLine();
            System.out.println("Enter price");
            price=scanner.nextLine();
           String l_book="\nL "+","+book_name+","+book_writer+","+book_theme+","+price;
        try {
            bookstream.write(l_book.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         if(book_type==3)
        {
            String aaa;
        aaa = scanner.nextLine();
            System.out.println("Please enter book name");
            book_name=scanner.nextLine();
            System.out.println("Please enter book writer name");
            book_writer=scanner.nextLine();
            System.out.println("Please enter number of questions");
       String number_questions = scanner.nextLine();
            System.out.println("Enter price");
            price=scanner.nextLine();
            String t_book="\nT"+","+book_name+","+book_writer+","+number_questions+","+price;
        try {
            bookstream.write(t_book.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
    }
     
}
