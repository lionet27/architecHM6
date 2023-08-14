package onlineBookStore.data.repository;


import java.util.List;

import onlineBookStore.domain.PrintBook;

// ��������� ��� ���������� ��������� ������� � ��������-�������� � �������� ����������, �������� � ��������� ������ ����.

public interface  PrintBookRepository {
    public void addBook(PrintBook book);
    public void removeBook(PrintBook book);
    public List<PrintBook> getListBook();
}
