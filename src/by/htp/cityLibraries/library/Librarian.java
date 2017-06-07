package by.htp.cityLibraries.library;

public interface Librarian {
	// просмотр каталога изданий
	public void viewEdition();

	// поиск издания по названию
	public void searchTitleEdition();

	// поиск издания по автору
	public void searchAuthorEdition();

	// поиск издания по автору и названию
	public void searchAuthorTitleEdition();

	// сортировка списка изданий по названию издания
	public void sortTitleEdition();

	// сортировка списка изданий по названию издания, дате публикации, фамилии автора
	public void sortSomeParameters();

	// удаление конкретного издания
	public void removeEdition();

}
