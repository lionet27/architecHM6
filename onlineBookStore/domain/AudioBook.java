package onlineBookStore.domain;

// ����� �������������� ����������, ��������� ������������ ������ Book

public class AudioBook extends Book {
   
    private int numberMinutes;

     public AudioBook(String id, String title, Author author, double price, int numberMinutes) {
        super(id, title, author, price);
        this.numberMinutes = numberMinutes;
    }

    public int getNumberMinutes() {
        return numberMinutes;
    }

    public void setNumberMinutes(int numberMinutes) {
        this.numberMinutes = numberMinutes;
    }

    @Override
    public String toString() {
        return "�����: " + getTitle() + ", �����: " + getAuthor() + ", ����: $" + getPrice() + ", ������������(� ���.): "+ getNumberMinutes();
    }

     
    
    
 
}    