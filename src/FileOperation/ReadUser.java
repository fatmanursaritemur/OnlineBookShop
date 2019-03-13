/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

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
public class ReadUser implements ReadFile{

    @Override
    public void read() {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("user.txt")))) {
            
           
                
           
                while(scanner.hasNextLine())
           {
               System.out.println(scanner.nextLine());
           }
                
                
            } catch (FileNotFoundException ex) {
              System.out.println("File not found...");
        }
 
    }
    
}
