package rocketseat.com.passin.domain.attendee.exception;

public class AttendeeNotFoundException  extends RuntimeException{
    public AttendeeNotFoundException(String message) {
        super(message);
    }
}
