public class Main {
    public static void main(String[] args) {
        DVDCollection c1 = new DVDCollection();
        DVDCollection c2 = new DVDCollection();
        c1.addDVD("movie1", "director", 2000, 50, true);
        c1.addDVD("movie2", "director", 2005, 10, true);
        System.out.println(c1.toString());
        for (Object collection : c1.collection) {
            if (collection != null) {
                System.out.println(collection);
            }
        }
        
        System.out.println();
        c2.addDVD("--", "-", 2000, 25, true);
        c2.addDVD("--", "-", 2003, 17.5, false);
        c2.addDVD("--", "-", 2007, 19.5, true);
        System.out.println(c2.toString());
        for (Object collection : c2.collection) {
            if (collection != null) {
                System.out.println(collection);
            }
        }
    }
    
}
