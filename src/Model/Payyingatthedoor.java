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
public class Payyingatthedoor extends Payment {
    int service_cost;

    public Payyingatthedoor(int service_cost, int payment_totali) {
        super(payment_totali);
        this.service_cost = service_cost;
    }

    public int getService_cost() {
        return service_cost;
    }

    public void setService_cost(int service_cost) {
        this.service_cost = service_cost;
    }
    
}
