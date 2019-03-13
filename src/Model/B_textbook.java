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
public class B_textbook extends Book {
    private int number_questions;

     public B_textbook(String book_name, String book_writer, int price) {
        super(book_name, book_writer, price);
    }

    public int getNumber_questions() {
        return number_questions;
    }

    public void setNumber_questions(int number_questions) {
        this.number_questions = number_questions;
    }

    
}
