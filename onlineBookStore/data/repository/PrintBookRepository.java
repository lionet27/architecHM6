package onlineBookStore.data.repository;


import java.util.List;

import onlineBookStore.domain.PrintBook;

// Интерфейс для управления печатными книгами в интернет-магазине с методами добавления, удаления и получения списка книг.

public interface  PrintBookRepository {
    public void addBook(PrintBook book);
    public void removeBook(PrintBook book);
    public List<PrintBook> getListBook();
}
