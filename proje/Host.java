package proje;
public class Host extends Kullanici{
    
    private String mekan_adi;
    private String mekan_adresi;
    private int kontenjan;
//    public Host(String kullanici_adi, String parola, String ad, String soyad, String email, String telefon_no, String mekan_adi,String mekan_adresi,int kontenjan) {
//        super(kullanici_adi, parola, ad, soyad, email, telefon_no);
//        this.mekan_adi=mekan_adi;
//        this.mekan_adresi=mekan_adresi;
//        this.kontenjan=kontenjan;
//    }

    public String getMekan_adi() {
        return mekan_adi;
    }

    public void setMekan_adi(String mekan_adi) {
        this.mekan_adi = mekan_adi;
    }

    public String getMekan_adresi() {
        return mekan_adresi;
    }

    public void setMekan_adresi(String mekan_adresi) {
        this.mekan_adresi = mekan_adresi;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }
    
}
