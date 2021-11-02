package calisan_projesi;
class Calisan_Projesi {

    public static void main(String[] args) {
        Yonetici yonetici1= new Yonetici("Beyza Koçars",15500,"Satış ve Pazarlama","Yönetici",3,5000);
        yonetici1.bilgileri_goster();
        System.out.println();
        yonetici1.departman_degistir("IT");
        System.out.println();
        yonetici1.bilgileri_goster();
        System.out.println();
        yonetici1.zam_yap(500);
        System.out.println();
        yonetici1.bilgileri_goster();
        System.out.println();
        
        
        Calisan calisan1=new Calisan("Ahmet Gündüz",5000,"IT","Bilgi İşlem",3);
        calisan1.bilgileri_goster();
        System.out.println();
        calisan1.zam_yap(100);
        System.out.println();
        calisan1.bilgileri_goster();
        System.out.println();
        
    }
    
}
