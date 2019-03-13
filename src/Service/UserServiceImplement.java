/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import FileOperation.ReadUser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class UserServiceImplement implements UserService{
    String user_name;
    String passwordd;
    static boolean aa=false;
    static boolean bb=true;
    @Override
    public boolean ismember(String username , String password) {
        user_name=username;
        passwordd=password;
        int i=0;
       
         try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("user.txt")))) {
            while (scanner.hasNextLine() && i==0) {
                
               String membership_info = scanner.nextLine();
               
                String[] array = membership_info.split(",");
                
                if (array[0].equals(user_name)) {
                
                    if(array[1].equals(passwordd))
                    {
                    i=5;
                    aa=true;
                    }   
                    
                }
                else 
                {
                    aa=false;
                }    
    }
         } catch (FileNotFoundException ex) {
             System.out.println("Dosya bulunamadı");
        }
    return aa;
}

    @Override
    public boolean member_confirmation(String username) {
        int i=0;
     user_name=username;
     
      try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("user.txt")))) {
            while (scanner.hasNextLine() && i==0) {
                
               String membership_info = scanner.nextLine();
               
                String[] array = membership_info.split(",");
                
                if (array[0].equals(user_name)) {
                
                    System.out.println("Bu kullanıcı adını alamazsınız, zaten kayıtlı");
                    i=5;
                    bb=false;
                }
                else 
                {
                    bb=true;
                }    
    }
    }   catch (FileNotFoundException ex) { 
            Logger.getLogger(UserServiceImplement.class.getName()).log(Level.SEVERE, null, ex);
        } 
     return bb; 
    }
}
