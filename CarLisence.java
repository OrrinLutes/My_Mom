import java.util.Stack;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
/**
 * Write a description of class CarLisence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarLisence
{
    public static void main(String args[])
    {
        Stack<Integer> Drive = new Stack<>();
        Stack<Integer> Street = new Stack<>();
        Stack<Integer> InDrive = new Stack<>();
        int send = 10;
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("What's the license plate");
        send = Scan.nextInt();
        while (send != 0)
        {
            //get rid of that car
            if (send>0)
            {
                if(InDrive.contains(send*-1))
                {
                    while(Drive.peek() != send *-1)
                    {
                        System.out.println(Street.push(Drive.pop()));
                        System.out.println(Street);
                        System.out.println(Drive);
                    }
                    System.out.println("Remove" +Drive.pop());
                    while(!Street.isEmpty())
                    {
                        Drive.push(Street.pop());
                        System.out.println(Drive);
                        System.out.println(Street);
                    }
                }
            }
            //get that car back in here
            else
            {
                if(InDrive.contains(send))
                {
                   Drive.push(send);
                   InDrive.add(send);
                }
                else
                {
                    System.out.println("The car is already in the driveway");
                }
            }
             System.out.println("What's the license plate");
             send = Scan.nextInt();
        }
    }
}
