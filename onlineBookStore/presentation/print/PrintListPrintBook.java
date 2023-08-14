package onlineBookStore.presentation.print;

import java.util.List;

import onlineBookStore.domain.PrintBook;

// класс для вывода в консоль списка напечатанных книг
public class PrintListPrintBook {

    public List<PrintBook> printBooks; 

    public PrintListPrintBook(List<PrintBook> printBooks) {
    this.printBooks = printBooks;
    }

    public void printListPrintBooks() {
        for (PrintBook book : printBooks) {
            System.out.println("Напечатанная книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", цена: $" + book.getPrice() + ", Кол-во страниц: "+ book.getNumberPages());
        }
    }

   
    
}
