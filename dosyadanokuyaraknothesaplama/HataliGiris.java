package dosyadanokuyaraknothesaplama;

import java.util.InputMismatchException;

public class HataliGiris extends InputMismatchException{
    public HataliGiris(){
        System.out.println("Hata!");
    }

    @Override
    public void printStackTrace() {
        System.out.println("Lütfen geçerli bir değer giriniz!");
    }
    
}
