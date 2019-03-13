/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author asus
 */
public interface UserService {
   boolean ismember(String username , String password);  
   boolean member_confirmation(String username);
}

