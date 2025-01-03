import Bookings.Bookings;
import Customer.Customer;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.text.SimpleDateFormat;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer[] cust=new Customer[5];
        cust[0]=new Customer("akshay", 9998786, "mangaluru", "27/01/2025", "sullia", 9);
        cust[1]=new Customer("vijay", 65678654, "mangaluru", "27/01/2025", "puttur", 7);
        cust[2]=new Customer("Harshit", 07557, "belgavi", "30/01/2025", "vitla", 5);

        Bookings booking=new Bookings();
        booking.viewAvailableSeats();

        bookTicket(booking);

        cust[0].checkSeat(cust);
    }
    public static void bookTicket(Bookings booking){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();

        System.out.println("enter your loc-from");
        String locFrom=sc.nextLine();

        System.out.println("enter Destination-To");
        String locTo=sc.nextLine();

        System.out.println("Enter departure date in dd/MM/yyyy:");
        String dateInput = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date departureDate = dateFormat.parse(dateInput);
            System.out.println("Date entered: " + departureDate);

            System.out.println("Enter seat number to book:");
            int seatNumber = sc.nextInt();

            boolean success = booking.bookSeat(seatNumber);
            if (success) {
                System.out.println("Booking successful for " + name + " from " + locFrom + " to " + locTo);
            }

        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        }





    }
}