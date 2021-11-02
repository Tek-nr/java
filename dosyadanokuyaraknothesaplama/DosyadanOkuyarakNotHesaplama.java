package dosyadanokuyaraknothesaplama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DosyadanOkuyarakNotHesaplama {

    /*
        Öğrenci ismi varsa not,yoksa önce isim sonra not 
        Öğrenci ve Öğretmen profilleri oluştur (interface,inheritence vs)
        
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = new File("notlar.txt");
        File file2 = new File("harfnotu.txt");
        System.out.println("Hoşgeldiniz!");
        String secenekler = "1: Not Yaz\n"
                + "2: Kişi Göster\n"
                + "3: Tüm Notları Göster\n"
                + "*: Sistemden Çık";
        while (true) {
            System.out.println("****************************************************");
            System.out.println(secenekler);
            System.out.println("****************************************************");
            System.out.print("Gerçekleştirmek istediğiniz işlemi seçiniz: ");
            String secim = scan.nextLine();
            if (secim.equals("1")) {
                notYaz();
            } else if (secim.equals("2")) {
                while (true) {
                    System.out.println();
                    System.out.println("Çıkmak için q ya basın");
                    System.out.println();
                    System.out.println("Öğrencinin;");
                    System.out.print("İsmi: ");
                    String isim = scan.nextLine();
                    if (isim.equals("q")) {
                        break;
                    }
                    System.out.print("Soyismi: ");
                    String soyisim = scan.nextLine();
                    if (soyisim.equals("q")) {
                        break;
                    }
                    kisiGoster(isim, soyisim);
                }

            } else if (secim.equals("3")) {
                tumBelgeyiGoster();
            } else if (secim.equals("*")) {
                System.out.println("Sistemden Çıkılıyor...");
                System.out.println("İyi Günler Dileriz!");
                break;
            } else {
                System.out.println("Geçersiz işlem yaptınız.");
                System.out.println("Lütfen tekrar deneyiniz...");
            }
        }
    }

    public static void notYaz() {
        Scanner scan = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notlar.txt", true))) {
            while (true) {
                System.out.println("Çıkmak için -1 e basın");
                System.out.println();
                System.out.println("Öğrencinin;");
                System.out.print("İsmi: ");
                String isim = scan.nextLine();
                if (isim.equals("-1")) {
                    System.out.println("Notlar yazılıyor...");
                    System.out.println("Lütfen dosyayı kontrol edin!");
                    break;
                }
                System.out.print("Soyismi: ");
                String soyisim = scan.nextLine();
                if (!soyisim.equals("-1")) {
                    writer.write(isim + " ");
                    writer.write(soyisim + " --> ");
                } else {
                    System.out.println("Notlar yazılıyor...");
                    System.out.println("Lütfen dosyayı kontrol edin!");
                    break;
                }
                System.out.println();
                System.out.println("Notları;");
                System.out.print("Not 1: ");
                int not1 = scan.nextInt();
                if ((not1 != -1)) {
                    if ((not1 >= 0) && (not1 <= 100)) {
                        writer.write(not1 + ",");
                    } else {
                        writer.write("***");
                    }
                } else {
                    System.out.println();
                    System.out.println("Notlar yazılıyor...");
                    System.out.println("Lütfen dosyayı kontrol edin!");
                    break;
                }

                System.out.print("Not 2: ");
                int not2 = scan.nextInt();
                if ((not2 != -1)) {
                    if ((not2 >= 0) && (not2 <= 100)) {
                        writer.write(not2 + ",");
                    } else {
                        writer.write("***");
                    }
                } else {
                    System.out.println("Notlar yazılıyor...");
                    System.out.println("Lütfen dosyayı kontrol edin!");
                    break;
                }

                System.out.print("Not 3: ");
                int not3 = scan.nextInt();
                scan.nextLine();
                if ((not3 != -1)) {
                    if ((not3 >= 0) && (not3 <= 100)) {
                        writer.write(not3 + "\t");
                    } else {
                        writer.write("***");
                    }
                    double ortalama = ((not1 * 3 / 10.0) + (not2 * 3 / 10.0) + (not3 * 4 / 10.0));
                    writer.write(ortalama + "\t" + harfNotuHesapla(ortalama) + "\n");
                } else {
                    System.out.println("Notlar yazılıyor...");
                    System.out.println("Lütfen dosyayı kontrol edin!");
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println("Dosya Açılırken Hata Oluştu!");
        }
    }

    public static void kisiGoster(String isim, String soyisim) {
        int m = 0;
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader("notlar.txt")))) {
            while (scan.hasNextLine()) {
                String not = scan.nextLine();
                String[] dizi = not.split(" --> ");
                if (dizi[0].equals(isim + " " + soyisim)) {
                    System.out.println();
                    System.out.println("Öğrenci Bilgileri;");
                    System.out.println(dizi[0] + "  " + dizi[1]);
                    m++;
                }
            }
            if (m == 0) {
                System.out.println("Aradığınız bilgilere sahip bir öğrenci profili bulunamamıştır.");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Aradığınız dosya bulunamadı!");
        }
    }

    public static void tumBelgeyiGoster() {

        try (Scanner scan = new Scanner(new BufferedReader(new FileReader("notlar.txt")))) {
            System.out.println();
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Aradığınız dosya bulunamadı!");
        }
        System.out.println();
    }

    public static String harfNotuHesapla(double ortalama) {
        if ((ortalama >= 90) && (ortalama <= 100)) {
            return "AA";
        } else if ((ortalama >= 85) && (ortalama <= 89)) {
            return "BA";
        } else if ((ortalama >= 80) && (ortalama <= 84)) {
            return "BB";
        } else if ((ortalama >= 75) && (ortalama <= 79)) {
            return "CB";
        } else if ((ortalama >= 70) && (ortalama <= 74)) {
            return "CC";
        } else if ((ortalama >= 65) && (ortalama <= 69)) {
            return "DC";
        } else if ((ortalama > 55) && (ortalama <= 64)) {
            return "DD";
        } else if ((ortalama >= 0) && (ortalama <= 55)) {
            return "FF";
        } else {
            return "***";
        }
    }
//    public static boolean notKontrol(int not){
//        try{
//            
//        } 
//        catch(HataliGiris e){
//            e.printStackTrace();
//        }
//    }
}
