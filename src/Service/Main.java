// Fatma Nur Sarıtemur


package Service;

import Service.UserService;
import FileOperation.ReadBook;
import FileOperation.ReadUser;
import FileOperation.WriteBook;
import FileOperation.WriteOrder;
import FileOperation.WritePayment;
import FileOperation.WriteUser;
import Model.B_textbook;
import Model.Book;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
 
    static boolean membership = false;
    static String user_name = null;

    public static void main(String[] args) throws FileNotFoundException {
        ReadBook readbook = new ReadBook();
        WriteBook writebook = new WriteBook();
        ReadUser readuser = new ReadUser();
        WriteOrder writeorder = new WriteOrder();
        WriteUser writeuser = new WriteUser();
        WritePayment writepayment=new WritePayment();
        UserServiceImplement userservice = new UserServiceImplement();
        BookServiceImplement bookservice = new BookServiceImplement();
        OrderServiceImplement orderservice = new OrderServiceImplement();
        PaymentServiceImplement paymentservice=new PaymentServiceImplement();
        Book kitap1=new B_textbook("deneme1","deneme2",34);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String type_of_payment=null;

        /*writebook.ekle();
         writebook.ekle();
         writebook.ekle();
         writebook.ekle();*/
        while (choice != 6) {

            System.out.println("\n*** *** ***\n" + "\n İslem seciniz:"
                    + "\n üye girişi için 1'i tuşlayınız."
                    + "\n kitap listesini görmek için 2'yi tuşlayınız"
                    + "\n sipariş eklemek için 3'ü tuşlayınız"
                    + "\n ödeme yapmak için 4'ü tuşlayınız(ödenecek tutarı söyle)"
                    + "\n Çıkış için 5'i tuşlayınız"
                    + "\n*** *** ***\n");
            System.out.println("Seçinizi giriniz:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if(membership==false)
                    {
                        System.out.println("Lütfen kullanıcı adınızı giriniz.");
                    scanner.nextLine();
                    user_name = scanner.nextLine();
                    System.out.println("Lütfen şifreyi giriniz.");
                    String password = scanner.nextLine();

                    if (userservice.ismember(user_name, password)) {
                        System.out.println("Merhaba  " + user_name + "! başarılı bir şekilde giriş yaptınız.");
                        membership = true;
                    } else {
                        System.out.println("giriş başarısız oldu..");
                        System.out.println("Üye olmak ister misiniz?(Cevabnız evet ise 1 , Hayır ise 2'ye tuşlayınız)");
                        int answer = scanner.nextInt();
                        
                        if (answer==1) {
                            writeuser.add();
                            System.out.println("Başarılı bir şekilde üye oldunuz.");
                            
                        } else {
                            System.out.println("üye olmadınız.");
                        }

                    }
                    }
                    else{
                        System.out.println("Şuan başka bir üyelik açık ltfen onu kapatınız.Bunun için 5'i tuşlayınız.");
                             
                    }
                    break;
                case 2:
                    bookservice.getbooklist();
                    break;
                case 3:
                    if (membership == true) {
                        orderservice.addpayment(user_name);
                       
                    }
                    else
                    {
                        System.out.println("giriş yapmadan sipariş ekleyemezsiniz.Lütfen giriniş yapınız"+
                                "\n\n");
                    }
                    break;
                case 4:
                    
                    if (membership == true) {
                        paymentservice.showorder(user_name);
                      int aa=orderservice.calculate_payment_total(user_name);
                      if(aa==0)
                      {
                          System.out.println("siparişiniz yok ödeme yapılamıyor.");
                          break;
                      }
                      else{
                      System.out.println("Ödemeyi yapmak ister misiniz?(Evet=1 , Hayır=2");
                   
                    int payment=scanner.nextInt();
                    if(payment==1)
                    {    
                      
                        paymentservice.updatearraylist(user_name);
                       // orderservice.ödenecek_tutari_hesapla(kullanı_adi);
                        type_of_payment=paymentservice.asktypeofpayment();
                        writepayment.add(user_name,type_of_payment);   
                    } 
                    }
                    }
                    else
                    {
                         System.out.println("giriş yapmadan ödeme yapamazsınız.Lütfen giriniş yapınız"+
                                "\n\n");
                    }
                   break;
                case 5:
                    if(membership==true)
                    {
                        System.out.println("Çıkış yapıyorsunuz..");
                    membership=false;
                    user_name=null;
                    }
                    else
                    {
                         System.out.println("Zaten giriş yapmamıştınız."+
                                "\n\n");
                    }
                    break;
                    
                default:
                    System.out.println("Hatalı tuşlama..");
              
            }  
            

        }
    }

}
