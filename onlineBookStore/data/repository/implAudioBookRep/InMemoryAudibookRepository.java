package onlineBookStore.data.repository.implAudioBookRep;


import java.util.List;

import onlineBookStore.data.bookStore.AudioBookStore;
import onlineBookStore.data.repository.AudioBookRepository;
import onlineBookStore.domain.AudioBook;
// Класс для управления аудио книгами в интернет-магазине с методами добавления, удаления и получения списка книг.
public class InMemoryAudibookRepository implements AudioBookRepository{

    public AudioBookStore audioBookStore;

    public InMemoryAudibookRepository(AudioBookStore audioBookStore) {
        this.audioBookStore = audioBookStore;
    }

    @Override
    public void addBook(AudioBook book) {
        audioBookStore.addBook(book);
    }

    @Override
    public void removeBook(AudioBook book) {
        audioBookStore.removeBook(book);;
    }

    @Override
    public List<AudioBook> getListBook() {
        return audioBookStore.getAllBooks();
    }
    
}
