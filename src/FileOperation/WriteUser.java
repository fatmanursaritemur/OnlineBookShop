/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;


import Service.UserServiceImplement;
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
public class WriteUser implements WriteFile{
     static File user_file = new File("user.txt");
     UserServiceImplement userservice=new UserServiceImplement();
    
   
    public static void main(String[] args) {
        
 
if (!user_file.exists()) 
  {
         try {
             user_file.createNewFile();
         } catch (IOException ex) {
             Logger.getLogger(WriteUser.class.getName()).log(Level.SEVERE, null, ex);
         }
         
}

   
}

    @Override
    public void add() {
        FileOutputStream userstream = null;
         String user_name = null;
        int i=0;
        try {
            userstream = new FileOutputStream(user_file,true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter name you want.");
        user_name=scanner.nextLine();
          while(i==0)
       { 
         if(userservice.member_confirmation(user_name))
         {
             i=5;   
         }
         else
         {
             System.out.println("Please enter name you want");
              user_name=scanner.nextLine();
         } 
       }
         System.out.println("Please enter password you want.");
        String password=","+scanner.nextLine();
        String user_namee="\n"+user_name;
        try {
           userstream.write(user_namee.getBytes());
            userstream.write(password.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(WriteBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
