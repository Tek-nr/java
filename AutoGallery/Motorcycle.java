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
    public String toString() {
        return "Motorcycle{" + "OffRoad: " + isOffRoad + " Brand: "+ super.getBrand()+ " Model: "+super.getModel()+" Year: "+
                super.getYear()+" Door: "+super.getNoOfDoors()+ " Seat: "+super.getNoOfSeats()+" Wheels: "+ super.getNoOfWheels()+'}';
    }
}
