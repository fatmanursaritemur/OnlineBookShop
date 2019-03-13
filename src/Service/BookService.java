/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Book;

/**
 *
 * @author asus
 */
public interface BookService {
  public void getbooklist();
  public boolean hasbook(String book);
  public int serachbookprice(String book);
}
