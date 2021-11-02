package singers;

import java.util.ArrayList;
import java.util.Scanner;

public class Singer{
    
    ArrayList<String> singers= new ArrayList<>();

   public void printList(){
       System.out.println("There are "+singers.size()+" singers on the list.");
       for(int i=0;i<singers.size();i++){
           System.out.println((i+1)+". singer: "+ singers.get(i));
       }
   }
   
   public void addSinger(){
       Scanner scan=new Scanner(System.in);
       System.out.print("Please enter singer's name : ");
       String name=scan.nextLine();
       singers.add(name);
       System.out.println("The name has been added...");
       
   }
   
   public void deleteSinger(){
       Scanner scan=new Scanner(System.in);
       System.out.print("Please enter the name you want to remove: ");
       String name=scan.nextLine();
       singers.remove(name);
       System.out.println("The name has been removed...");
   }
   
   public void updateList(){
       Scanner scan=new Scanner(System.in);
       System.out.print("Please enter new name: ");
       String newName=scan.nextLine();
       System.out.print("Please enter new index: ");
       int index=scan.nextInt();
       
       singers.set(index-1, newName);
       System.out.println("The list has been updated...");
   }
   
   public void searchSinger(){
       Scanner scan=new Scanner(System.in);
       System.out.print("Please enter the name you want to search: ");
       String name=scan.nextLine();
       if(singers.indexOf(name)>=0){
           System.out.println("The entered name is in "+(singers.indexOf(name)+1)+". index.");
       }
       else
           System.out.println("There is no name such this.");
    }
}
    

