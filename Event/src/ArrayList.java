import java.time.LocalDate;
import java.util.ArrayList;

class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    // Getters and Setters
    public String getEventID() { return eventID; }
    public void setEventID(String eventID) { this.eventID = eventID; }

    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public String getEventVenue() { return eventVenue; }
    public void setEventVenue(String eventVenue) { this.eventVenue = eventVenue; }

    public LocalDate getEventDate() { return eventDate; }
    public void setEventDate(LocalDate eventDate) { this.eventDate = eventDate; }

    public ArrayList<String> getEventAttendees() { return eventAttendees; }
    public void setEventAttendees(ArrayList<String> eventAttendees) { this.eventAttendees = eventAttendees; }


    public void organizeEvent() {
        System.out.println("Total number of attendees: " + eventAttendees.size());
    }


    // Adding attendees
    public void addAttendee(String attendee) {
        eventAttendees.add(attendee);
    }

    // Removing attendees
    public void removeAttendee(String attendee) {
        eventAttendees.remove(attendee);
    }

    // Updating attendees
    public void updateAttendee(String oldAttendee, String newAttendee) {
        int index = eventAttendees.indexOf(oldAttendee);
        if (index != -1) {
            eventAttendees.set(index, newAttendee);
        }
    }


    public boolean findAttendee(String attendee) {
        return eventAttendees.contains(attendee);
    }

    @Override
    public String toString() {
        return "Event ID: " + eventID +
               "\nEvent Name: " + eventName +
               "\nEvent Venue: " + eventVenue +
               "\nEvent Date: " + eventDate +
               "\nAttendees: " + String.join(", ", eventAttendees);
    }
}