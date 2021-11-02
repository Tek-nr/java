package beybladeprogramı;
public class Dranza extends Beyblade {
    private String KutsalCanavar;

    public Dranza(String KutsalCanavar, String beybladeci, int donus_hizi, int saldiri_gucu) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.KutsalCanavar = KutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar: "+KutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+KutsalCanavar+"'nu ortaya çıkarıyor...");
        System.out.println(KutsalCanavar+"'nun saldırısı: Alev Kılıcı");
    }
    
}
