public class Main {
    public static void main(String[] args) {
        AutoGallery a1 = new AutoGallery();
        a1.addVehicle();
        System.out.println("");
        //a1.addVehicle();
        //System.out.println("");
        /*for (Object collection : a1.vehicleList) {
            if (collection != null) {
                System.out.println(collection);
            }
        }*/
        
        for(int i=0; i<a1.vehicleArrayList.size();i++ ){
            System.out.println(a1.vehicleArrayList.get(i));
        }
    }
}
