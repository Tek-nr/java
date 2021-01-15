package proje;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kullanici {
Baglanti baglanti = new Baglanti();
    static Scanner scan = new Scanner(System.in);
    private String kullanici_adi;
    private String parola;
    private String ad;
    private String soyad;
    private String email;
    private String telefon_no;
    private double puan;
    private static int kullanici_sayisi = 0;

    public Kullanici() {
        this.puan = 0;
    }

    public static int getKullanici_sayisi() {
        return kullanici_sayisi;
    }

    public static void setKullanici_sayisi(int kullanici_sayisi) {
        Kullanici.kullanici_sayisi = kullanici_sayisi;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getAd() {
        return ad;
    }

    public boolean setAd(String kayit_ad) {
        if (kayit_ad.length() > 1) {
            this.ad = kayit_ad;
            return true;
        } else {
            System.out.println("Geçersiz Ad!");
            return false;
        }
    }

    public String getSoyad() {
        return soyad;
    }

    public boolean setSoyad(String kayit_soyad) {
        if (kayit_soyad.length() > 1) {
            this.soyad = kayit_soyad;
            return true;
        } else {
            System.out.println("Geçersiz Soyad!");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String kayit_email) {
        if (kayit_email.contains("@")) {
            this.email = kayit_email;
            return true;
        } else {
            System.out.println("Geçersiz Email!");
            return false;
        }
    }

    public String getTelefon_no() {
        return telefon_no;
    }

    public boolean setTelefon_no(String kayit_telefon_no) {
        if (kayit_telefon_no.length() == 11) {
            this.telefon_no = kayit_telefon_no;
            return true;
        } else {
            System.out.println("Geçersiz Telefon Numarası!");
            return false;
        }
    }

    @Override

    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.kullanici_adi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kullanici other = (Kullanici) obj;
        if (!Objects.equals(this.kullanici_adi, other.kullanici_adi)) {
            return false;
        }
        return true;
    }

    public void bilgileri_goster(Kullanici kullanici) {
        System.out.println("Kullanıcı Adı: " + kullanici.getKullanici_adi());
        System.out.println("Ad: " + kullanici.getAd());
        System.out.println("Soyad: " + kullanici.getSoyad());
        System.out.println("E-mail:" + kullanici.getEmail());
        System.out.println("Telefon No:" + kullanici.getTelefon_no());
    }

    public static boolean kayit() {
        Baglanti baglanti = new Baglanti();
        Kullanici kullanici = new Kullanici();
        kullanici_sayisi++;
        try {
            String kayit_ad, kayit_soyad, kayit_kullanici_adi, kayit_parola, kayit_email, kayit_telefon_no;

            while (true) {
                System.out.print("Ad: ");
                kayit_ad = scan.nextLine();
                kullanici.setAd(kayit_ad);

                System.out.print("Soyad: ");
                kayit_soyad = scan.nextLine();
                //kullanici.setSoyad(kayit_soyad);

                System.out.print("Kullanıcı Adı: ");
                kayit_kullanici_adi = scan.nextLine();
                kullanici.setKullanici_adi(kayit_kullanici_adi);

                System.out.print("Parola: ");
                kayit_parola = scan.nextLine();
                kullanici.setParola(kayit_parola);

                System.out.print("Email: ");
                kayit_email = scan.nextLine();
                //kullanici.setEmail(kayit_email);

                System.out.print("Telefon No: ");
                kayit_telefon_no = scan.nextLine();
                //kullanici.setTelefon_no(kayit_telefon_no);

                if (kullanici.setAd(kayit_ad) && kullanici.setSoyad(kayit_soyad) && kullanici.setTelefon_no(kayit_telefon_no) && kullanici.setEmail(kayit_email)) {
                    System.out.println("Kayıt Başarılı!");
                    baglanti.kullaniciEkle(kayit_ad,kayit_soyad,kayit_kullanici_adi,kayit_parola,kayit_email,kayit_telefon_no,0,kullanici_sayisi);
                    break;
                } else {
                    System.out.println("Kayıt Başarısız!");
                    System.out.println("Lütfen Tekrar Deneyin!");
                }
            }
        } catch (NullPointerException ex) {
            System.out.println("Hata!");
            return false;
        }
        return true;

    }

}
