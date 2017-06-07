package by.htp.cityLibraries.library;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import by.htp.cityLibraries.comparator.SomeParametersComparator;
import by.htp.cityLibraries.comparator.TitleComparator;
import by.htp.cityLibraries.printEdition.Author;
import by.htp.cityLibraries.printEdition.ChildrenBook;
import by.htp.cityLibraries.printEdition.PrintEdition;

public class ChildrenLibrary extends Library implements Librarian {
	private LinkedList<ChildrenBook> printEdition;

	public ChildrenLibrary(String nameLibrary, String adressLibrary, LinkedList<ChildrenBook> printEdition) {
		super(nameLibrary, adressLibrary);
		this.setPrintEdition(printEdition);
	}

	public LinkedList<ChildrenBook> getPrintEdition() {
		return printEdition;
	}

	public void setPrintEdition(LinkedList<ChildrenBook> printEdition) {
		this.printEdition = printEdition;
	}

	Scanner scanner = new Scanner(System.in);

	// добавление нового издания
	public void fillChildrenLibrary1() {
		printEdition = new LinkedList<ChildrenBook>();
		printEdition
				.add(new ChildrenBook(new Author("Абгарян", "Наринэ", null, "14 января 1971"), "\"Манюня\"", "2013"));
		printEdition.add(new ChildrenBook(new Author("Роулинг", "Джоан", null, "31 июля 1965"),
				"\"Сказки барда Бидля\"", "2015"));
		printEdition.add(new ChildrenBook(new Author("Драгунский", "Виктор", "Юзефович", "1 декабря 1913"),
				"\"Денискины рассказы\"", "2015"));
		printEdition.add(
				new ChildrenBook(new Author("Пушкин", "Александр", "Сергеевич", "6 июня 1799"), "\"Сказки \"", "2012"));
		printEdition.add(new ChildrenBook(new Author("Драгунский", "Виктор", "Юзефович", "1 декабря 1913"),
				"\"Денискины рассказы\"", "2015"));
		printEdition.add(
				new ChildrenBook(new Author("Пушкин", "Александр", "Сергеевич", "6 июня 1799"), "\"Сказки \"", "2005"));
		printEdition
				.add(new ChildrenBook(new Author("Линдгрен", "Астрид", null, "14 ноября 1907"), "\"Сказки \"", "2003"));
	}

	// ChildrenLibrary childrenLibrary1=new ChildrenLibrary("Детская библиотека
	// № 3 им. А.Гайдара", "г. Минск, ул. Бачило, 2", printEdition);

	// добавление нового издания
	public void fillChildrenLibrary2() {
		printEdition = new LinkedList<ChildrenBook>();
		printEdition.add(
				new ChildrenBook(new Author("Пушкин", "Александр", "Сергеевич", "6 июня 1799"), "\"Сказки \"", "2012"));
		printEdition.add(new ChildrenBook(new Author("Мозалева", "Ольга", null, null),
				"\"В деревне. Зверушки-раскладушки\"", "2016"));
		printEdition.add(new ChildrenBook(new Author("Раскин", "Александр", "Борисович", "1914"),
				"\"Как папа был маленьким\"", "2011"));
		printEdition.add(new ChildrenBook(new Author("Раскин", "Александр", "Борисович", "1914"),
				"\"Как папа учился в школе\"", "2005"));
	}

	// ChildrenLibrary childrenLibrary2=new ChildrenLibrary("Детская библиотека
	// № 9", "г. Минск, ул. Уборевича, 44", printEdition);

	// просмотр каталога изданий
	@Override
	public void viewEdition() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary() + "\nСписок изданий:");
		for (ChildrenBook view : printEdition) {
			System.out.println(view);
		}
	}

	// поиск издания по названию
	@Override
	public void searchTitleEdition() {
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getTitle().equals(title)) {
				System.out.println("Полная информация об издании:");
				System.out.println(childrenBook);
			} /*
				 * else { System.out
				 * .println("Изданий с указанным названием в библиотеке нет. Введите другое название в кавычках."
				 * );
				 * 
				 * }
				 */

		}

	}

	// поиск издания по автору
	@Override
	public void searchAuthorEdition() {
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите фамилию автора издания:");
		String author = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getAuthor().getSurname().equals(author)) {
				System.out.println("Полная информация об издании:");
				System.out.println(childrenBook);
			} /*
				 * else { System.out.
				 * println("Изданий с указанной фамилией автора в библиотеке нет. Введите другую фамилию."
				 * ); }
				 */

		}

	}

	// поиск издания по автору и названию
	@Override
	public void searchAuthorTitleEdition() {
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите фамилию автора издания:");
		String author = scanner.nextLine();
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getAuthor().getSurname().equals(author) && childrenBook.getTitle().equals(title)) {
				System.out.println("Полная информация об издании:");
				System.out.println(childrenBook);
			} /*
				 * else {
				 * System.out.println("Указанных изданий в библиотеке нет. "); }
				 */

		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scanner == null) ? 0 : scanner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildrenLibrary other = (ChildrenLibrary) obj;
		if (scanner == null) {
			if (other.scanner != null)
				return false;
		} else if (!scanner.equals(other.scanner))
			return false;
		return true;
	}

	// сортировка списка изданий по названию издания
	@Override
	public void sortTitleEdition() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Список, отсортированный по названию издания:");
		Set<PrintEdition> sortPrintEdition = new TreeSet<PrintEdition>(new TitleComparator());
		sortPrintEdition.addAll(printEdition);
		for (PrintEdition view : sortPrintEdition) {
			System.out.println(view);
		}

	}

	// сортировка списка изданий по названию издания, дате публикации, фамилии
	// автора
	@Override
	public void sortSomeParameters() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Список, отсортированный по названию издания, дате публикации, фамилии автора:");
		Set<PrintEdition> sortPrintEdition = new TreeSet<PrintEdition>(new SomeParametersComparator());
		sortPrintEdition.addAll(printEdition);
		for (PrintEdition view : sortPrintEdition) {
			System.out.println(view);
		}

	}

	// удаление конкретного издания
	@Override
	public void removeEdition() {
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getTitle().equals(title)) {
				iterator.remove();
			} /*
				 * else { System.out
				 * .println("Изданий с указанным названием в библиотеке нет. Введите другое название в кавычках."
				 * ); }
				 */

		}
		System.out.println("Список после удаления издания:");
		for (ChildrenBook view : printEdition) {
			System.out.println(view);
		}

	}

}
