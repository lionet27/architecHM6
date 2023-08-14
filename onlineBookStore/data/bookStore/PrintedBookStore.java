package onlineBookStore.data.bookStore;

import java.util.ArrayList;
import java.util.List;

import onlineBookStore.domain.PrintBook;

// �����, ����������� ��������� ������������ ���� � �������������� ���������

public class PrintedBookStore {
    private List<PrintBook> printBooks;

    public PrintedBookStore() {
        printBooks = new ArrayList<>();
    }

    
    public void addBook(PrintBook printBook) {
        printBooks.add(printBook);
        
    }

    
    public List<PrintBook> getAllBooks() {
        
        return printBooks;
    }

    
    public void removeBook(PrintBook printBook) {
        printBooks.remove(printBook);
        
    }

}
