import java.util.*;
class vehicle
    {
        float cost(int vehicle,float hours)
        {
        if(vehicle=='c'||vehicle=='C')
        {
                return hours*20;
                
        }
        else if(vehicle=='b'||vehicle=='B')
        {
                return hours*35;
        }
        else if(vehicle=='t'||vehicle=='T') {
                return hours*50;
        }
        else {
                return 0;
        }
       
                
                        
        }
    }
class Main
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                vehicle v=new vehicle();
        char vehicle;
        float hours;
        System.out.println("car(c)-20.00 perhour \nbus(b)-35.00 perhour \ntruck(t)-50.00 perhour");
        System.out.println("Enter the vehicle type:");
        vehicle=sc.next().charAt(0);
        if(vehicle=='c'||vehicle=='C'||vehicle=='b'||vehicle=='B'||vehicle=='t'||vehicle=='T')
        {
        System.out.println("Enter the number of hours vehicle spent in parking lot :");
        hours=sc.nextFloat();
        float cst=v.cost(vehicle, hours);
                System.out.println("The total cost at parking lot is :"+cst);
        }
        else {
                System.out.println("There is no such type of vehicle please enter correct type");
        }
        }
        
}