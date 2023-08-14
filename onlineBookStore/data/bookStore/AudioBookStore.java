package onlineBookStore.data.bookStore;



import java.util.ArrayList;
import java.util.List;

import onlineBookStore.domain.AudioBook;


// Класс, реализующий хранилище аудиокниг с использованием коллекций
public class AudioBookStore {
    private List<AudioBook> audioBooks;

    public AudioBookStore() {
        audioBooks = new ArrayList<>();
    }

    public void addBook(AudioBook audioBook) {
        audioBooks.add(audioBook);
    }

    public void removeBook(AudioBook audioBook) {
        audioBooks.remove(audioBook);
    }

    public List<AudioBook> getAllBooks() {
        return audioBooks;
    }

}