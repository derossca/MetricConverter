//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Declaring variables
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        boolean done = false;

        //do while loop for the meters variable that requires user input
        do
        {
            System.out.println("Enter the measurement in meters");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                if(meters >= 0)
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid positive number not " +trash);
            }
        }
        while(!done);

        //computing the conversions of meters to the other measurement variables
        miles = meters * 0.00062137;
        System.out.println(meters + " meters is " + miles + " miles");
        feet = meters * 3.2808399;
        System.out.println(meters + " meters is " + feet + " feet");


    }
}