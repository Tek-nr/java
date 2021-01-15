public class DVDCollection {
    private int count=0;
    private double totalCost=0;
    Object[] collection = new Object[100];
    

    public DVDCollection() {
        
    }
    
    public void addDVD(String title, String director, int year, double cost, boolean bluray){
        DVD dvd = new DVD(title,director,year,cost,bluray);
        collection[count]=dvd;
        count++;
        totalCost+=cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Object[] getCollection() {
        return collection;
    }

    public void setCollection(Object[] collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                +"\nNumber of DVD's: "+count
                +"\nTotal Cost: "+"$"+totalCost
                +"\nAverage Cost: "+"$"+(totalCost/count)
                +"\n\nDVD List:";
                /*+Arrays.toString(collection);*/
    }
}
