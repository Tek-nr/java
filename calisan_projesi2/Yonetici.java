package calisan_projesi2;
public class Yonetici extends Calisan{
public Yonetici(String ad,String soyad,String id,String departman,String pozisyon,double maas,int calismasuresi){
    super(ad,soyad,id,departman,pozisyon,maas,calismasuresi);
}
public void bilgileri_goster(){
    super.bilgileri_goster();
}
public void departman_degisimi(String yenidepartman){
    super.departman_degisimi(yenidepartman);
}
public void zam_yap(double zam_miktari){
    super.zam_yap(zam_miktari);
}
    
}
