package calisan_projesi2;
public class Calisan {
    private String ad;
    private String soyad;
    private String id;
    private String departman;
    private String pozisyon;
    private double maas;
    private int calismasuresi;
    public Calisan(String ad,String soyad,String id,String departman,String pozisyon,double maas,int calismasuresi){
        ad(ad);
        soyad(soyad);
        id(id);
        calismasuresi(calismasuresi);
        this.departman=departman;
        this.pozisyon=pozisyon;
        this.maas=maas;
        
    }
    private void ad(String ad){
        int lengthOfname=ad.length();
        if (lengthOfname<2){
            System.out.println("Geçersiz isim...");
        }
        else
            this.setAd(ad);
    }
    private void soyad(String soyad){
        int lengthOfsurname=soyad.length();
        if (lengthOfsurname<2){
            System.out.println("Geçersiz soyisim...");
        }
        else
            this.setSoyad(soyad);
    }
    private void calismasuresi(int calismasuresi){
        if (calismasuresi<0){
            System.out.println("Geçersiz çalışma süresi...");
        }
        else
            this.setCalismasuresi(calismasuresi);
    }
    private void id(String id){
        int lengthOfid=id.length();
        if (lengthOfid==6){
            this.setId(id);
        }
        else
        System.out.println("Geçersiz ID...");
    }
    
    public void bilgileri_goster(){
        System.out.println("Çalışanın; ");
        System.out.println("Adı: "+ad);
        System.out.println("Soyadı: "+getSoyad());
        System.out.println("ID: "+getId());
        System.out.println("Departmanı: "+getDepartman());
        System.out.println("Pozisyonu: "+getPozisyon());
        System.out.println("Maaşı: "+getMaas());
        System.out.println("Şirkette Çalışma Süresi: "+getCalismasuresi());
    }
    public void departman_degisimi(String yenidepartman){
        setDepartman(yenidepartman);
        System.out.println("Yeni departmanınız: "+getDepartman());
        System.out.println();
        bilgileri_goster();
    }
    
    public void zam_yap(double zam_miktari){
        if(getCalismasuresi()>=3){
            System.out.println(getAd()+" "+getSoyad()+" isimli kişiye "+zam_miktari+" tl zam yapılmıştır.");
            maas+=zam_miktari;
            System.out.println("Yeni maaş: "+maas+ " TL");
            
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getCalismasuresi() {
        return calismasuresi;
    }

    public void setCalismasuresi(int calismasuresi) {
        this.calismasuresi = calismasuresi;
    }
    
}
