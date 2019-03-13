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
public class B_dictionary extends Book {
    private String translate_language;

    public B_dictionary(String book_name, String book_writer, int price) {
        super(book_name, book_writer, price);
    }

    public String getTranslate_language() {
        return translate_language;
    }

    public void setTranslate_language(String translate_language) {
        this.translate_language = translate_language;
    }

   
  
}
