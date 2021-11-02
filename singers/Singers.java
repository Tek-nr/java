package singers;

import java.util.Scanner;

public class Singers {
    private static Singer singer =new Singer();
    private static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        printProcess();
        
    }
    public static void printProcess(){
        String process="0: Print Processes\n"
                     + "1: Add Singer\n"
                     + "2: Remove Singer\n"
                     + "3: Search Singer\n"
                     + "4: Update List\n"
                     + "5: Print Singer List\n"
                     + "Q: Quit\n";
        System.out.println("WELCOME!");
        while(true){
            System.out.println("\n"+process);
            System.out.print("Please Enter Your Process: ");
            String choose= scan.nextLine();
            if(choose.equals("0"))
                System.out.println(process);
            else if(choose.equals("1"))
                singer.addSinger();
            else if(choose.equals("2"))
                singer.deleteSinger();
            else if(choose.equals("3"))
                singer.searchSinger();
            else if(choose.equals("4"))
                singer.updateList();
            else if(choose.equals("5"))
                singer.printList();
            else if(choose.equals("q")||choose.equals("Q")){
                System.out.println("HAVE A NICE DAY!");
                break;
            }
                
        }
    }
}
