package polindromecontrol;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class PolindromeControl {
    public static void main(String[] args) {
        //Finding if a sentence has polindrome features
        Stack<Character> p_stack= new Stack<>();
        ListIterator iterator= p_stack.listIterator();
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence=scan.nextLine();
        for(int i=0;i<sentence.length();i++){
            p_stack.push(sentence.charAt(i));
        }
        while(iterator.hasNext()){
            if(p_stack.lastElement().equals(p_stack.firstElement())){
                p_stack.pop();
                if(iterator.hasNext()){
                p_stack.remove(0);    
                }
            }
            else{
                System.out.println("The sentence you entered isn't polindrome...");
                break;
            }
                
        }
        if(!iterator.hasNext())
        System.out.println("The sentence you entered ("+ sentence+") are polindrome...");
        
    }
    
}
