package onlineBookStore.domain;

// ����� �������������� ������������ �����,, ��������� ������������ ������ Book

public class PrintBook extends Book {
    
    private int numberPages;

    public PrintBook(String id, String title, Author author, double price, int numberPages) {
            super(id, title, author, price);
            this.numberPages = numberPages;
        }
    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
    @Override
    public String toString() {
        return "������������ �����: " + getTitle() + ", �����: " + getAuthor() + ", ����: $" + getPrice() + ", ���-�� �������: "+ getNumberPages();
    }

    
    
    
}




 

