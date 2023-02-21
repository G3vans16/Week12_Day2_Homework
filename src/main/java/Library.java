import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private Integer capacity;

    public Library(Integer capacity){
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (getBookCount() < this.capacity) {
            this.bookCollection.add(book);
        }
    }
}
