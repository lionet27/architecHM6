package onlineBookStore.presentation.print;

import java.util.List;

import onlineBookStore.domain.AudioBook;


// класс для вывода в консоль списка аудиокниг

public class PrintListAudioBook{
    public List<AudioBook> printBooks;

    
    public PrintListAudioBook(List<AudioBook> printBooks) {
        this.printBooks = printBooks;
    }


    public void printListAudioBooks() {
        for (AudioBook book : printBooks) {
            System.out.println("Аудиокнига: " + book.getTitle() + ", автор: " + book.getAuthor() + ", цена: $" + book.getPrice() + ", Длительность(в мин.): "+ book.getNumberMinutes());
        }
        
    }
    
}
