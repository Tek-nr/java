package beybladeprogramı;
public class Draciel extends Beyblade{
    private String KutsalCanavar;
    public Draciel(String beybladeci,int donus_hizi,int saldiri_gucu,String KutsalCanavar){
        super(beybladeci,donus_hizi,saldiri_gucu);
        this.KutsalCanavar=KutsalCanavar;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar: "+KutsalCanavar);
    }
    @Override
    public void kutsalCanavarOrtayaCikar(){
        System.out.println(getBeybladeci()+" "+KutsalCanavar+ "'yı ortaya çıkarıyor...");
        System.out.println(KutsalCanavar+"'nın savunması: Kale Savunması");
    }
}
