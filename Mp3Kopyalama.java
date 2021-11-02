package mp3kopyalama;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Mp3Kopyalama {
    private static ArrayList<Integer> icerik=new ArrayList<>();
    
    public static void dosyaOku(){
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("InstantCrush.mp3");
            int i;
            while((i=fis.read())!=-1){
                icerik.add(i);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı!");
        } catch (IOException ex) {
            System.out.println("Dosya Okuma Hatası!");
        }
    }
    public static void kopyala(String dosya_ismi){
        FileOutputStream fos=null;
        try {
            File newFile= new File(dosya_ismi);
            fos = new FileOutputStream(newFile);
            for(int i:icerik){
                fos.write(i);
            }
            System.out.println("Dosya başarıyla kopyalandı!");
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.out.println("Yazım hatası!");
        }
    }
    
    public static void main(String[] args) {
        dosyaOku();
        Scanner scan=new Scanner(System.in);
        System.out.println("Dosya adı giriniz: ");
        String dosya_adi= scan.nextLine();
        kopyala(dosya_adi);
    }
    
}
