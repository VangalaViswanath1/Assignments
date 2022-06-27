
import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        
        System.out.print("Enter the person age to check vote eligibility : ");
        Scanner scan = new Scanner(System.in);                                  //import Scanner class syntax
        int a = scan.nextInt();                                                 //usin a variable here
        
        if(a>=18){                                                         //using a logic here with if else condition
            System.out.println("He's eligible for vote..");                   //printing the result here.
        }else{
            System.out.println("He's not eligible for vote..");
        }
    }   
}
