public class DVD{
    private String title; 
    private String director; 
    private int year; 
    private double cost; 
    private boolean bluray;

    public DVD(String title, String director, int year, double cost, boolean bluray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.bluray = bluray;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isBluray() {
        return bluray;
    }

    public void setBluray(boolean bluray) {
        this.bluray = bluray;
    }

    @Override
    public String toString() {
        String blurayTF;
        if(bluray==true){
            blurayTF="BluRay";
        }
        else{
            blurayTF="";
        }
        return title + "     " + director + "     " + year + "     " +"$"+ cost + "     " +blurayTF;
    } 
}
