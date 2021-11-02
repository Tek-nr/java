package beybladeprogramı;
public class Dragon extends Beyblade{
    private String KutsalCanavar;
    private String gizliYetenek;

    public Dragon(String KutsalCanavar, String gizliYetenek, String beybladeci, int donus_hizi, int saldiri_gucu) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.KutsalCanavar = KutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar: "+KutsalCanavar);
        System.out.println("Gizli Yetenek: "+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+ KutsalCanavar+"'i ortaya çıkarıyor...");
        System.out.println(KutsalCanavar+"'in saldırısı: Hayalet Kasırgası ");
        
    }
    
    
}
