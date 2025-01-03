package Bookings;

import Customer.Customer;
import TrainAgency.Train1;

import java.util.ArrayList;

public class Bookings {
    public boolean[] seats=new boolean[10];

    public void viewAvailableSeats(){
        System.out.println("Available seats");
        for(int i=0; i<seats.length; i++){
            if(!seats[i]){
                System.out.println("Seat" + (i+1));
            }
        }
    }

    public boolean bookSeat(int seatNumber){
        if(seatNumber<1 || seatNumber>seats.length ||seats[seatNumber-1]){
            System.out.println("The seat is not available");
            return false;
        }
        seats[seatNumber-1]=true;
        System.out.println("The seat " + seatNumber +"Booked succesfully" );
        return true;
    }



}
