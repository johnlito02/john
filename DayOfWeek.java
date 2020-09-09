import java.util.Scanner;
import java.util.InputMismatchException;
public class DayOfWeek
{
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int dayNumber;
       try
{
System.out.print("Enter an integer: ");
       dayNumber = input.nextInt();
       switch(dayNumber){
       case 0:System.out.println("Sunday");
               break;
       case 1:System.out.println("Monday");
               break;
       case 2:System.out.println("Tuesday");
               break;
       case 3:System.out.println("Wednesday");
               break;   
       case 4:System.out.println("Thursday");
               break;   
       case 5:System.out.println("Friday");   
               break;
       case 6:System.out.println("Saturday");
               break;
       default :System.out.println("Invalid input. Please enter a value from 0-6");
   }
}
catch (InputMismatchException e)
{
System.out.print("Error! please input an integer!");
}
   }
}