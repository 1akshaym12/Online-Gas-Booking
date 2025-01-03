package TrainAgency;



public interface Train1 extends Trains{
    String getName();

    String getLocFrom();

    String getLocTo();

    String getDepartureTime();


    default void getList() {
        System.out.println("Train Name: " + getName());
        System.out.println("From: " + getLocFrom());
        System.out.println("To: " + getLocTo());
        System.out.println("Departure Time: " + getDepartureTime());
    }
}
