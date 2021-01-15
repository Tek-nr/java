public class Truck extends Vehicle{
    
    private boolean isPickup;

    public Truck(boolean isPickup, String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost) {
        super(brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
        this.isPickup = isPickup;
    }

    public Truck(boolean isPickup) {
        this.isPickup = isPickup;
    }

    public Truck() {
    }
    
    @Override
    public void voiceOfVehicle(){
        System.out.println("Trus trus Truck");
    }
    
    @Override
    public String toString() {
        return "Truck{" + "Pickup: " + isPickup + " Brand: "+ super.getBrand()+ " Model: "+super.getModel()+" Year: "+
                super.getYear()+" Door: "+super.getNoOfDoors()+ " Seat: "+super.getNoOfSeats()+" Wheels: "+ super.getNoOfWheels()+'}';
    }

    public boolean isIsPickup() {
        return isPickup;
    }

    public void setIsPickup(boolean isPickup) {
        this.isPickup = isPickup;
    }

}
