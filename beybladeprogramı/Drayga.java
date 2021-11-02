package beybladeprogramı;
public class Drayga extends Beyblade{
    private String KutsalCanavar;

    public Drayga(String KutsalCanavar, String beybladeci, int donus_hizi, int saldiri_gucu) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.KutsalCanavar = KutsalCanavar;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar: "+KutsalCanavar);
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println(getBeybladeci()+" "+KutsalCanavar+ "'ı ortaya çıkarıyor...");
        System.out.println(KutsalCanavar+"'ın saldırısı: Kaplan Pençesi");
    }
}
