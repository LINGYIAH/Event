import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the event ID:");
        String eventID = scanner.nextLine();

        System.out.println("Enter the event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter the event venue:");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter the event date (yyyy-mm-dd):");
        LocalDate eventDate = null;
        while (eventDate == null) {
            String dateInput = scanner.nextLine();
            try {
                eventDate = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in the format yyyy-mm-dd:");
            }
        }
        
        Event event = new Event(eventID, eventName, eventVenue, eventDate);

        // Adding attendees
        System.out.println("Enter the number of attendees:");
        int numberOfAttendees = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfAttendees; i++) {
            System.out.println("Enter the name of attendee " + (i + 1) + ":");
            String attendee = scanner.nextLine();
            event.addAttendee(attendee);
        }

        // Organizing event
        event.organizeEvent();

        // Print event details
        System.out.println(event);

        scanner.close();
    }
}