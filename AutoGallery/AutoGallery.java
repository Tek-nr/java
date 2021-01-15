
import java.util.ArrayList;
import java.util.Scanner;

public class AutoGallery {
    
    Object[] vehicleList = new Object[100];
    ArrayList<Object> vehicleArrayList = new ArrayList<>();
    private int count=0;
    Scanner scan=new Scanner(System.in);

    public AutoGallery() {
    }
    
    public void addVehicle () {
        System.out.print("Type [ Truck: 1 | Car: 2 | Motorcycle: 3 ]: ");
        int type= scan.nextInt();
        scan.nextLine();
        System.out.print("Brand: ");
        String brand= scan.nextLine();
        System.out.print("Model: ");
        String model= scan.nextLine();
        System.out.print("Year: ");
        int year= scan.nextInt();
        System.out.print("No of doors: ");
        int noOfDoors= scan.nextInt();
        System.out.print("No of seats: ");
        int noOfSeats= scan.nextInt();
        System.out.print("No of wheels: ");
        int noOfWheels= scan.nextInt();
        System.out.print("Cost: ");
        double cost= scan.nextDouble();

        switch (type) {
            case 1:
                System.out.print("PickUp [Yes:1 , No:0]: ");
                int pu=scan.nextInt();
        switch (pu) {
            case 1:
                {
                    Truck truck = new Truck(true, brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
                    vehicleArrayList.add(truck);
                    /*vehicleList[count]=truck;
                    count++;*/
                    break;
                }
            case 0:
                {
                    Truck truck = new Truck(false, brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
                    vehicleArrayList.add(truck);
                    /*vehicleList[count]=truck;
                    count++;*/
                    break;
                }
            default:
                System.out.println("Invalid value");
                break;
        }
                break;
            case 2:
                System.out.print("SUV [Yes:1 , No:0]: ");
                int suv=scan.nextInt();
        switch (suv) {
            case 1:
                {
                    Car car = new Car(true, brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
                    
                    vehicleArrayList.add(car);
                    /*vehicleList[count]=car;
                    count++;*/
                    break;
                }
            case 0:
                {
                    Car car = new Car(false, brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
                    vehicleArrayList.add(car);
                    /*vehicleList[count]=car;
                    count++;*/
                    break;
                }
            default:
                System.out.println("Invalid value");
                break;
        }
                break;
            case 3:
                System.out.print("Off Road [Yes:1 , No:0]: ");
                int or=scan.nextInt();
        switch (or) {
            case 1:
                {
                    Motorcycle motorcycle = new Motorcycle(true, brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
                    vehicleArrayList.add(motorcycle);
                    /*vehicleList[count]=motorcycle;
                    count++;*/
                    break;
                }
            case 0:
                {
                    Motorcycle motorcycle = new Motorcycle(false, brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
                    vehicleArrayList.add(motorcycle);
                    /*vehicleList[count]=motorcycle;
                    count++;*/
                    break;
                }
            default:
                System.out.println("Invalid value");
                break;
        }
                break;
            default:
                System.out.println("Invalid value!");
                break;
        }
    }

    public Object[] getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(Object[] vehicleList) {
        this.vehicleList = vehicleList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
