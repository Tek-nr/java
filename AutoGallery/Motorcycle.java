public class Motorcycle extends Vehicle{
    
    private boolean isOffRoad;

    public Motorcycle(boolean isOffRoad) {
        this.isOffRoad = isOffRoad;
    }

    public Motorcycle() {
    }

    public Motorcycle(boolean isOffRoad, String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost) {
        super(brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
        this.isOffRoad = isOffRoad;
    }

    public boolean isIsOffRoad() {
        return isOffRoad;
    }

    public void setIsOffRoad(boolean isOffRoad) {
        this.isOffRoad = isOffRoad;
    }
    
    @Override
    public void voiceOfVehicle(){
        System.out.println("Fiyuv fiyuv");
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCost() {
        return super.getCost(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNoOfWheels(int noOfWheels) {
        super.setNoOfWheels(noOfWheels); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNoOfWheels() {
        return super.getNoOfWheels(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNoOfSeats(int noOfSeats) {
        super.setNoOfSeats(noOfSeats); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNoOfSeats() {
        return super.getNoOfSeats(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNoOfDoors(int noOfDoors) {
        super.setNoOfDoors(noOfDoors); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNoOfDoors() {
        return super.getNoOfDoors(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setYear(int year) {
        super.setYear(year); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getYear() {
        return super.getYear(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setModel(String model) {
        super.setModel(model); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getModel() {
        return super.getModel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBrand() {
        return super.getBrand(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "OffRoad: " + isOffRoad + " Brand: "+ super.getBrand()+ " Model: "+super.getModel()+" Year: "+
                super.getYear()+" Door: "+super.getNoOfDoors()+ " Seat: "+super.getNoOfSeats()+" Wheels: "+ super.getNoOfWheels()+'}';
    }
}
