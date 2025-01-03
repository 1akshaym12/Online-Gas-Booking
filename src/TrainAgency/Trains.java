package TrainAgency;

import java.util.*;
public interface Trains {
    String name="Vande Bharath";
    String locFrom="Mangaluru";
    String locTo="Goa";
    int railNo=117;
    int platformNo=02;
    String time="2:00PM";
   String Date="27/01/2025";

    default void getList(){
        System.out.println("The train is=" +name);
        System.out.println("the Train Starts from="+ locFrom);
        System.out.println("t0 where??="+locTo);
        System.out.println("the train number="+railNo);
        System.out.println("the platform No="+platformNo);
        System.out.println("the departure time="+time);
        System.out.println("the date of departure"+Date);

    }
    
}
