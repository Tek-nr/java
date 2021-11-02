package calisan_projesi;
public class Calisan { // Superclass/Baseclass
    private String isim;
    private double maas;
    private String departman;
    private String pozisyon;
    private int sirkette_calisma_süresi;
    public Calisan(String isim,double maas,String departman,String pozisyon,int sirkette_calisma_süresi){
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
        this.pozisyon=pozisyon;
        this.sirkette_calisma_süresi=sirkette_calisma_süresi;
    }
    public void bilgileri_goster(){
        System.out.println("Çalışanın; ");
        System.out.println("Adı: "+isim);
        System.out.println("Departmanı: "+departman);
        System.out.println("Pozisyonu: "+pozisyon);
        System.out.println("Maaşı: "+maas);
        System.out.println("Şirkette çalışma süresi: "+sirkette_calisma_süresi);
    }
    public void departman_degistir(String yeni_departman){
        this.departman=yeni_departman;
        System.out.println("Departman değişimi: "+ yeni_departman);
    }

    public void zam_yap(int zam_miktari){
        if (sirkette_calisma_süresi>=3){
            System.out.println("Maaşına "+ zam_miktari+ " tl zam yapılmıştır.");
            this.maas+=zam_miktari;
            System.out.println("Yeni maaş: "+maas);
        }
    }
    public int getSirkette_calisma_süresi() {
        return sirkette_calisma_süresi;
    }

    public void setSirkette_calisma_süresi(int sirkette_calisma_süresi) {
        this.sirkette_calisma_süresi = sirkette_calisma_süresi;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
