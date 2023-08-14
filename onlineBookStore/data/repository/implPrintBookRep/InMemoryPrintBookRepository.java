package onlineBookStore.data.repository.implPrintBookRep;


import java.util.List;

import onlineBookStore.data.bookStore.PrintedBookStore;
import onlineBookStore.data.repository.PrintBookRepository;
import onlineBookStore.domain.PrintBook;

// ����� ��� ���������� ��������� ������� � ��������-�������� � �������� ����������, �������� � ��������� ������ ����.
public class InMemoryPrintBookRepository implements PrintBookRepository {
    public PrintedBookStore bookStore;

    public InMemoryPrintBookRepository(PrintedBookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void addBook(PrintBook book) {
        bookStore.addBook(book);
        
    }

    @Override
    public List<PrintBook> getListBook() {
        return bookStore.getAllBooks();
        
    }

    @Override
    public void removeBook(PrintBook book) {
        bookStore.removeBook(book);
        
    }

    
    
}
