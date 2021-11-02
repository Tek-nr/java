package calisan_projesi2;

import java.util.Scanner;

public class Calisan_Projesi2 {

    public static void main(String[] args) {
    
    Calisan calisan1=new Calisan("Ali","Sungur","123456","Basın-Yayın","Kameraman",3500,4);
    Yonetici yonetici1=new Yonetici("Nazlı","Aksakal","123567","Satış","Müdür",7500,2);
    Scanner scanner=new Scanner(System.in);
    System.out.println("İŞLEMLER;");
    String islem="1: Çalışan Sorgulaması\n"
                +"2: Yönetici Sorgulaması\n"
                +"q: Çıkış";
    System.out.println();
    System.out.println(islem);
    while(true){
    System.out.println("\nLütfen yapacağınız işlemi seçiniz: ");
    islem=scanner.nextLine();
    if(islem.equals("1")){
        calisan1.bilgileri_goster();
        calisan1.zam_yap(200);
    }
    else if(islem.equals("2")){
        yonetici1.bilgileri_goster();
        yonetici1.zam_yap(500);
    }
    else if(islem.equals("q")){
        System.out.println("Çıkış yapılıyor...");
        break;
    }
    else 
        System.out.println("Geçersiz işlem.\nLütfen tekrar deneyin...");
    
    }
    }
    
}
