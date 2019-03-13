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
public abstract class Payment {
      private int payment_totali;

    public Payment(int payment_totali) {
        this.payment_totali = payment_totali;
    }

    public int getPayment_totali() {
        return payment_totali;
    }

    public void setPayment_totali(int payment_totali) {
        this.payment_totali = payment_totali;
    }

    
}
