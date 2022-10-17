/**  app to compare numbers
 * @author Mouloud El guellab
 * @version 13/10/2022
 * */
import java.util.Scanner;

public class CompareApp
   {
    public static void main(String[] args)
     {
         // declaring two variables that holds whole numbers
       int num1 ,num2;
       //  importing the scanner method to allow user to input numbers
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter First Whole Number  ");

        num1 = input.nextInt();

        System.out.print("Please Enter Second Whole Number  ");
        num2 = input.nextInt();
           //using the if statement to check his inputs and displaying a message
        if (num1==num2)
        {
            System.out.println("Numbers are Equal ");
        }
        else
        {
        System.out.println("Numbers are not Equal ");
        }
         System.out.println(" End of Programme ");
     }
   }