package Customer;

import Bookings.Bookings;
import TrainAgency.Train1;
import java.util.ArrayList;
import TrainAgency.Trains;

public class Customer {
    private String customerName;
    private int mobileNo;
    private String address;
    private String departureDate;
    private String loc;
    private int seatNo;

    public Customer(String customerName, int mobileNo, String address, String departureDate, String loc, int seatNo) {
        this.customerName = customerName;
        this.mobileNo = mobileNo;
        this.address = address;
        this.departureDate = departureDate;
        this.loc = loc;
        this.seatNo = seatNo;
    }


    public void checkSeat(Customer[] cust){
        for(Customer num:cust){
            if(num==null){
                System.out.println("The seat is not available");
            }
            else{
                System.out.println("The seat" + num.seatNo + "is booked by" + num.customerName);
            }
        }

    }
    public void getCustomerDetails(){
        System.out.println("name"+ customerName + "Contact no" + mobileNo + "address" + address);
    }
}
