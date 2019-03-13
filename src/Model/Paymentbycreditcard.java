/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asus
 */
public class Paymentbycreditcard extends Payment{
    private String credit_card;

    public Paymentbycreditcard(String credit_card, int payment_totali) {
        super(payment_totali);
        this.credit_card = credit_card;
    }

  
    
}
