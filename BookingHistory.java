import java.io.Serializable;
import java.util.*;

public class BookingHistory implements Serializable{
    private List<Booking> bookingList;

    public BookingHistory() {
        this.bookingList = new ArrayList<Booking>();
    }

    public List<Booking> getList() {
        return bookingList;
    }

    public void addBooking(Booking b) {
        bookingList.add(b);
    }

   
}
