package onlineBookStore.data.repository;

import java.util.List;

import onlineBookStore.domain.AudioBook;

// ��������� ��� ���������� ����� ������� � ��������-�������� � �������� ����������, �������� � ��������� ������ ����.
public interface AudioBookRepository {
    public void addBook(AudioBook book);
    public void removeBook(AudioBook book);
    public List<AudioBook> getListBook();
}
