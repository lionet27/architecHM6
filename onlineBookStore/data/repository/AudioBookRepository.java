package onlineBookStore.data.repository;

import java.util.List;

import onlineBookStore.domain.AudioBook;

// Интерфейс для управления аудио книгами в интернет-магазине с методами добавления, удаления и получения списка книг.
public interface AudioBookRepository {
    public void addBook(AudioBook book);
    public void removeBook(AudioBook book);
    public List<AudioBook> getListBook();
}
