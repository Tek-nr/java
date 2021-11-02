package calisan_projesi;
public class Yonetici extends Calisan {
    private int sorumlu_kisi;
    public Yonetici(String isim,double maas,String departman,String pozisyon,int sirkette_calisma_süresi,int sorumlu_kisi){
        super(isim,maas,departman,pozisyon,sirkette_calisma_süresi);
        this.sorumlu_kisi=sorumlu_kisi;
        
    }

    public void zam_yap(int zam_miktari) {
        super.zam_yap(zam_miktari); 
    }
    
    public void bilgileri_goster(){
        //super.bilgileri_goster();
        //System.out.println("Pozisyonu: Yönetici");
        System.out.println("Çalışanın; ");
        System.out.println("Adı: "+getIsim());
        System.out.println("Departmanı: "+getDepartman());
        System.out.println("Pozisyonu: "+getPozisyon());
        System.out.println("Maaşı: "+getMaas());
        System.out.println("Şirkette çalışma süresi: "+getSirkette_calisma_süresi());
        System.out.println("Sorumlu olduğu kişi sayısı: "+ sorumlu_kisi);
    }
}
