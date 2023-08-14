package onlineBookStore.presentation;

import java.util.List;

import onlineBookStore.data.bookStore.AudioBookStore;
import onlineBookStore.data.bookStore.PrintedBookStore;
import onlineBookStore.data.repository.implAudioBookRep.InMemoryAudibookRepository;
import onlineBookStore.data.repository.implPrintBookRep.InMemoryPrintBookRepository;
import onlineBookStore.domain.AudioBook;
import onlineBookStore.domain.Author;
import onlineBookStore.domain.PrintBook;
import onlineBookStore.presentation.print.PrintListAudioBook;
import onlineBookStore.presentation.print.PrintListPrintBook;



public class Main {
    public static void main(String[] args) {
        // «аводим авторов книг
        Author author1= new Author(1, "Martin", "Robert C.", null);
        Author author2= new Author(2, "Bloch", "Joshua", null);

        //создаем коллекцию напечатанных книг
        PrintedBookStore printBookStore = new PrintedBookStore();
        InMemoryPrintBookRepository inMemoryPrintBookRepository=new InMemoryPrintBookRepository(printBookStore);

        // ƒобавл€ем напечатанные книги в магазин
        PrintBook printBook1 = new PrintBook("1", "Clean Code", author1, 34.99,456);
        PrintBook printBook2 = new PrintBook("2", "Effective Java", author2, 29.99,345);
        inMemoryPrintBookRepository.addBook(printBook1);
        inMemoryPrintBookRepository.addBook(printBook2);
              

         // ѕолучаем список всех напечатанных книг в магазине
        List<PrintBook> allPrintBooks = inMemoryPrintBookRepository.getListBook();
        PrintListPrintBook printListPrintBook=new PrintListPrintBook(allPrintBooks);
        printListPrintBook.printListPrintBooks();

        //создаем коллекцию аудио книг
        AudioBookStore audioBookStore = new AudioBookStore(); 
        InMemoryAudibookRepository inMemoryAudibookRepository=new InMemoryAudibookRepository(audioBookStore);

        // ƒобавл€ем аудио книги в магазин           
        AudioBook audioBook1 = new AudioBook("1", "Clean Code", author1, 34.99, 120);
        AudioBook audioBook2 = new AudioBook("2", "Effective Java", author2, 29.99,100);
        inMemoryAudibookRepository.addBook(audioBook1);
        inMemoryAudibookRepository.addBook(audioBook2);
        List<AudioBook> allAudioBooks=inMemoryAudibookRepository.getListBook();
        PrintListAudioBook printListAudioBook=new PrintListAudioBook(allAudioBooks);
        printListAudioBook.printListAudioBooks();





    }
}