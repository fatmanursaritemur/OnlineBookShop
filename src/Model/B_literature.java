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
public class B_literature extends Book{
    private String book_theme;

    public B_literature(String book_name, String book_writer, int price) {
        super(book_name, book_writer, price);
    }

    public String getBook_theme() {
        return book_theme;
    }

    public void setBook_theme(String book_theme) {
        this.book_theme = book_theme;
    }

   
   
    
}
