package by.htp.cityLibraries.library;

public interface Librarian {
	// �������� �������� �������
	public void viewEdition();

	// ����� ������� �� ��������
	public void searchTitleEdition();

	// ����� ������� �� ������
	public void searchAuthorEdition();

	// ����� ������� �� ������ � ��������
	public void searchAuthorTitleEdition();

	// ���������� ������ ������� �� �������� �������
	public void sortTitleEdition();

	// ���������� ������ ������� �� �������� �������, ���� ����������, ������� ������
	public void sortSomeParameters();

	// �������� ����������� �������
	public void removeEdition();

}
