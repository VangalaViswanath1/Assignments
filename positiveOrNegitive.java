import java.util.Scanner;                                       //import scanner package here

public class positiveOrNegitive {

    public static void main(String[] args){
        
        System.out.print("Enter the number to check it's Positive or Negative : ");
        Scanner scan = new Scanner(System.in);                                  //import Scanner class syntax
        int num1 = scan.nextInt();                                                 //usin a variable here

        if(num1<0){                                                     //Logic for getting number is Negative or Positive
            System.out.println("It's a Negative number");               //Printing this result if condition is true
        }else{
            System.out.println("It's a Positive number");                //Printing this result if condition is false
        }
    
    }   
}


