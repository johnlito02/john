import java.util.Scanner;
import java.util.InputMismatchException;
public class SmallestNumber
{
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int first,second,third,small = 0;
       try
{
System.out.print("Enter first number: ");
       first = input.nextInt();
       System.out.print("Enter second number: ");
       second = input.nextInt();
       System.out.print("Enter third number: ");
       third = input.nextInt();
       if(first < second && first < third)
small = first;
else if(second < first && second < third)
small = second;
else if(third < first && third < second)
small = third;
System.out.println("The smallest number is "+small);
}
catch (InputMismatchException e)
{
System.out.print("Error! please input an integer!");
}
   }
}