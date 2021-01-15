
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List_Queue lq = new List_Queue(100);
        /*lq.enqueue(new Node(10,20,"A"));
        lq.enqueue(new Node(20,30,"B"));
        lq.enqueue(new Node(30,40,"C"));
        lq.dequeue();*/
        Scanner scan = new Scanner(System.in);
        String choose;
        boolean hagd=true;
        while(hagd){
            String menu="\n1: Enqueue a node\n"
                    +"2: Dequeue a node\n"
                    +"0: Exit\n";
            System.out.println(menu);
            choose=scan.nextLine();
            switch(choose){
                case "1":
                    try{
                    System.out.print("Enter x (int): ");
                    int x= scan.nextInt();
                    System.out.print("Enter y (double): ");
                    double y= scan.nextDouble();
                    scan.nextLine();
                    System.out.print("Enter z (String): ");
                    String z= scan.nextLine();
                    lq.enqueue(new Node(x,y,z));
                    }
                    catch(Exception e){
                        System.out.println("Invalid value(s)!");
                    }
                    break;
                case "2":
                    lq.dequeue();
                    break;
                case "0":
                    System.out.println("Have a good day!");
                    hagd=false;
                    break;
                default:
                    System.out.println("Invalid value!");
                    break;
            }
        }
        
    }
    
}
