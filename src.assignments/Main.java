import atmSystem.AtmSystem;
import parkingSystem.ParkingSystemFees;
import ticketTrainbookingSystem.TrainTicketBookingSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        TrainTicketBookingSystem trainTicketBookingSystem = new TrainTicketBookingSystem();
        trainTicketBookingSystem.start();

        AtmSystem atmSystem = new AtmSystem();
        atmSystem.calculate();

        ParkingSystemFees parkingSystemFees = new ParkingSystemFees();
        parkingSystemFees.publicSystem();

    }
}