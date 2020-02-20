import java.util.ArrayList;

public class Library {
    ArrayList<Integer> bookList;
    int time;
    int scannableBooks;
    boolean isSignedUp;
    Library (ArrayList<Integer> bookList, int time, int scannableBooks, boolean isSignedUp) {
        this.bookList = bookList;
        this.time = time;
        this.scannableBooks = scannableBooks;
        this.isSignedUp = isSignedUp;
    }
}
