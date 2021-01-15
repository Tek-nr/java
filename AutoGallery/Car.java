public class Car extends Vehicle{
    
    private boolean isSUV;

    public Car(boolean isSUV) {
        this.isSUV = isSUV;
    }

    public Car() {
    }

    public Car(boolean isSUV, String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost) {
        super(brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
        this.isSUV=isSUV;
    }
    
    @Override
    public void voiceOfVehicle(){
        System.out.println("Vın vın");
    }

    @Override
    public String toString() {
        return "Car{" + "SUV: " + isSUV + " Brand: "+ super.getBrand()+ " Model: "+super.getModel()+" Year: "+
                super.getYear()+" Door: "+super.getNoOfDoors()+ " Seat: "+super.getNoOfSeats()+" Wheels: "+ super.getNoOfWheels()+'}';
    }

    public boolean isIsSUV() {
        return isSUV;
    }

    public void setIsSUV(boolean isSUV) {
        this.isSUV = isSUV;
    }
}
