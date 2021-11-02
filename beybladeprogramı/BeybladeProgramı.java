package beybladeprogramı;

import java.util.Scanner;

public class BeybladeProgramı {

    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("(Çıkış için q'ya basınız...)");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Üretmek İstediğiniz Beyblade'i Yazınız: ");
            String islem=scanner.nextLine();
            if(islem.equals("q")||islem.equals("Q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika= new BeybladeFabrikasi();
                Beyblade beyblade= fabrika.beyblade_uret(islem);
                if(beyblade==null){
                    System.out.println("Lutfen Geçerli Bir Beyblade İsmi Girin...");
                }
                else{
                    System.out.println();
                    beyblade.bilgileriGoster();
                    System.out.println();
                    beyblade.saldir();
                    System.out.println();
                    beyblade.kutsalCanavarOrtayaCikar();
                    System.out.println();
                }
            }
        }
    }
    
}
