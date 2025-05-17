package ticketTrainbookingSystem;
import java.util.Scanner;

public class TrainTicketBookingSystem {
    public void start() {
    }

//QUESTION:
// Simulate a train ticket booking system for 10 seats. Each time a user "books", assign a seat number. Once full, show message: "Train is full." Include input validation and seat availability checks.

    // 10 seats available ( need to track how many have been booked and those available)
    // When user books a seat number should be assigned.
    // When full display message: "Train is full"
    // Include input validation
    // Have seat availability checks

    public static void main (String[] args){
        int totalNumberOfSeats = 10;
        boolean[] seatsBooked = new boolean[totalNumberOfSeats];
        Scanner scanner = new Scanner(System.in);
        int bookedSeats = 0;

        boolean bookingProcess = true;

//        for (int i = 0; i < totalNumberOfSeats; i ++) seats[i] = false;

        while (bookingProcess) {

            System.out.println("\n The Train Ticket Booking System ");
            System.out.println("1. Book a seat");
            System.out.println("2. View available seats");
            System.out.println("3. View booked seats");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    if (bookedSeats == totalNumberOfSeats){
                        System.out.println ("Train is Full");
                        break;
                    }

                    System.out.println ("Enter seat number");
                    int seatNumber = scanner.nextInt();

                    if (seatNumber < 1 || seatNumber > totalNumberOfSeats ){
                        System.out.println ("Please enter seat number");

                    } else if (seatsBooked[seatNumber - 1]){
                        System.out.println ("Seat is booked");

                    } else {
                        seatsBooked[seatNumber - 1] = true;
                        bookedSeats++;
                        System.out.println ("Seat number:" + " " + seatNumber + " " + "Successfully booked");
                    }

                    break;

                case 2:
                    System.out.println ("Available seats:");
                    int availableSeats = 0;

                    for (int i = 0; i < totalNumberOfSeats; i++){
                        if (!seatsBooked[i]) {
                            System.out.println ((i + 1) + " ");
                            availableSeats ++;
                        }
                    }
                    if (availableSeats == 0) {
                        System.out.println ("No seats available");
                    }

                    else {
                        System.out.println ("Available seats:" + " " + availableSeats);
                    }

                    break;

                case 3:
                    System.out.println ("View booked seats:");
                    bookedSeats = 0;

                    for (int i = 0; i < totalNumberOfSeats; i++){
                        if (seatsBooked[i]){
                            System.out.println ((i + 1) + " ");
                            bookedSeats++;
                        }
                    }

                    if (bookedSeats == 0) {
                        System.out.println ("No booked seat");
                    }

                    else {
                        System.out.println ("Booked seats:" + " " + bookedSeats);
                    }

                    break;

                case 4:
                    System.out.println("Exiting. Thank you!");
                    bookingProcess = false;
                    break;

            }
        }
        scanner.close();
    }

}
