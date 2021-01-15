package proje;

import static proje.Kullanici.scan;

public class GirisIslemleri {
    public boolean giris_kontrol(Kullanici kullanici){
        System.out.print("Kullanıcı Adı:");
        String kul_ad_giris =scan.nextLine();
        System.out.print("Parola:");
        String parola_giris =scan.nextLine();
        if((kul_ad_giris.equals(kullanici.getKullanici_adi()))&&(parola_giris.equals(kullanici.getParola()))){
            System.out.println("Giriş Yapılıyor...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted Exception!");
            }
            return true;
        }
        else{
            System.out.println("Giriş İşlemi Başarısız...");
            System.out.println("Lütfen Bilgilerinizi Gözden Geçirin...");
            return false;
        }
    }
}
