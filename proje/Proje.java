package proje;

import java.util.Scanner;

public class Proje {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoşgeldiniz!");
        String secenekler = "1: KAYIT OL\n"
                + "2: GİRİŞ YAP\n"
                + "*: SİSTEMDEN ÇIK";
        System.out.println("****************************************************");
        System.out.println(secenekler);
        System.out.println("****************************************************");
        System.out.print("Gerçekleştirmek istediğiniz işlemi seçiniz: ");
        String islem = scan.nextLine();
        if (islem.equals("1")) {
            if (Kullanici.kayit()) {
                System.out.println("");
                System.out.println("HOŞGELDİNİZ!");
            }
        } else if (islem.equals("2")) {
            GirisIslemleri giris = new GirisIslemleri();

        } else if (islem.equals("*")) {
            System.out.println("Sistemden Çıkılıyor...");
            System.out.println("İyi Günler Dileriz!");
        } else {
            System.out.println("Geçersiz İşlem");
        }

    }

}
