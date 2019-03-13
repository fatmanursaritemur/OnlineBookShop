/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Book;
import Model.Order;


/**
 *
 * @author asus
 */
public interface OrderService  {
   public void addpayment(String user);
    int calculate_payment_total(String user);
}
