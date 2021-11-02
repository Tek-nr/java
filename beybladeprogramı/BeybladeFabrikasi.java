package beybladeprogramı;
public class BeybladeFabrikasi {
    public Beyblade beyblade_uret(String beyblade_turu){
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Mavi Ejder","Kutsal Canavarla Konuşma","Takao",800,300);
        }
        else if(beyblade_turu.equals("Dranza")){
            return new Dranza("Kırmızı Anka Kuşu","Kai",600,400);
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Drayga("Beyaz Kaplan","Rei",850,250);
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Drayga("Kara Kaplumbağa","Max",400,1000);
        }
        else 
            return null;
    }
}
