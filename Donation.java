

import java.util.Scanner;
public class Donation {
    public static void main(String[] args){

        System.out.print("Enter your age here :");          //printing for enter age here
        Scanner scan = new Scanner(System.in);                  //using scanner class
        int age = scan.nextInt();                               //providing age as a first variable
        System.out.print("Enter your weight here :");       //printing for enter weight here
        int weight = scan.nextInt();                            //providing weight as a second variable here

        if(age>25 && weight>45){                                            //logic for getting result
            System.out.println("He's eligible for blood donate.");      //printing the result
        }else{
            System.out.println("He's not eligible for blood donate.");  //printing the result
        }
    }
}
