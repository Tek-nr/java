package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {

    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "ruwithme";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;

    public Baglanti() {
        //           "jdbc:mysql://localhost:3306/ruwithme"
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı!");
        }
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı Başarılı!");
        } catch (SQLException ex) {
            // ex.printStackTrace();
            System.out.println("Bağlantı Başarısız!");
        }
    }

    public void kullanicilariYazdir() {
        String sorgu = "Select * From kullanici";
        //Select * From kullanici where id>2
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {
                int kullanici_id = rs.getInt("kullanici_id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                String telefon_numarasi = rs.getString("telefon_numarasi");
                String kullanici_adiyazdir = rs.getString("kullanici_adi");
                String parolayazdir = rs.getString("parola");
                System.out.println("");
                System.out.println("ID: " + kullanici_id + "\nKullanıcı Adı: " + kullanici_adi
                        + "\nParola: " + parola + "\nAd: " + ad + "\nSoyad: " + soyad
                        + "\nEmail: " + email + "\nTelefon Numarası: " + telefon_numarasi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kullaniciEkle(String ad, String soyad,String kullanici_adi,String parola,String email,String telefon_numarasi,int puan,int kullanici_id) {
        try {
            statement = con.createStatement();
            //INSERT INTO kullanici (ad,soyad,email) VALUES("","","")
            String sorgu = "INSERT INTO kullanici (ad,soyad,kullanici_adi,parola,email,telefon_numarasi,puan,kullanici_id) VALUES(" + "'" + ad + "'," + "'" + soyad + "'," +
                                                    "'" + kullanici_adi + "',"+"'" + parola +"',"+"'" + email + "',"+ "'"+telefon_numarasi+ "',"+"'" + puan + "',"+"'" + kullanici_id + "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kullaniciSil() {
        try {
            statement = con.createStatement();
            String sorgu = "Delete from kullanici where id=3";
            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger + " tane veri etkilendi.");
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kullaniciGuncelle() {
        try {
            statement = con.createStatement();
            String sorgu = "Update kullanici Set email = 'example@gmail.com' where id=3";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void main(String[] args) {
//        Baglanti b=new Baglanti();
//        b.kullanicilariYazdir();
//    }
}
