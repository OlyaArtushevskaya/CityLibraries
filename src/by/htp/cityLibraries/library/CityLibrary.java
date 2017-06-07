package by.htp.cityLibraries.library;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import by.htp.cityLibraries.comparator.SomeParametersComparator;
import by.htp.cityLibraries.comparator.TitleComparator;
import by.htp.cityLibraries.printEdition.Author;
import by.htp.cityLibraries.printEdition.Book;
import by.htp.cityLibraries.printEdition.Magazine;
import by.htp.cityLibraries.printEdition.Newspaper;
import by.htp.cityLibraries.printEdition.PrintEdition;

public class CityLibrary extends Library implements Librarian {
	private HashMap<PrintEdition, Integer> printEdition;

	public CityLibrary(String nameLibrary, String adressLibrary, HashMap<PrintEdition, Integer> printEdition) {
		super(nameLibrary, adressLibrary);
		this.setPrintEdition(printEdition);
	}

	public HashMap<PrintEdition, Integer> getPrintEdition() {
		return printEdition;
	}

	public void setPrintEdition(HashMap<PrintEdition, Integer> printEdition) {
		this.printEdition = printEdition;
	}

	Scanner scanner = new Scanner(System.in);

	public void fillHashMap1() {
		printEdition = new HashMap<PrintEdition, Integer>();
		printEdition.put(
				new Book(new Author("Гончаров", "Иван", "Александрович", "18 июня 1812"), "\"Обломов\"", "1859"), 2);
		printEdition.put(new Book(new Author("Оруэлл", "Джордж", null, "25 июня 1903"), "\"1984\"", "1949"), 1);
		printEdition.put(new Book(new Author("Быков", "Василь", "Владимирович", "19 июня 1924"),
				"\"Альпийская баллада\"", "1963"), 3);
		printEdition.put(new Newspaper(new Author(null, null, null, null), "\"Компьютерные вести\"", "Апрель 2017", 15),
				10);
		printEdition.put(new Magazine(new Author(null, null, null, null), "Министерство архитектуры и строительства РБ",
				"\"Архитектура и строительство\"", "Февраль 2017", 1), 5);
		printEdition.put(new Magazine(new Author(null, null, null, null),
				"ООО \"Редакция газеты \"Компьютерные вести\"", "\"Мой интернет\"", "Август 2014", 8), 4);
	}

	/*
	 * CityLibrary cityLibrary1 = new
	 * CityLibrary("Библиотека № 4 им. Н.В. Гоголя",
	 * "г. Минск, ул. Лобанка, 22", printEdition);
	 */

	public void fillHashMap2() {
		printEdition = new HashMap<PrintEdition, Integer>();
		printEdition.put(
				new Book(new Author("Шамякин", "Иван", "Петрович", "30 января 1921"), "\"Тревожное счастье\"", "1964"),
				2);
		printEdition.put(
				new Book(new Author("Остин", "Джейн", null, "16 декабря 1775"), "\"Гордость и предубеждение\"", "1813"),
				1);
		printEdition.put(
				new Book(new Author("Тургенев", "Иван", "Сергеевич", "9 ноября 1818"), "\"Отцы и дети\"", "1862"), 3);
		printEdition.put(new Newspaper(new Author(null, null, null, null), "\"Республиканская строительная газета\"",
				"Февраль 2016", 7), 5);
		printEdition.put(new Newspaper(new Author(null, null, null, null), "\"Звязда\"", "Август 2014", 126), 7);
		printEdition.put(new Magazine(new Author(null, null, null, null), "ООО \"АГЕНТСТВО ВЛАДИМИРА ГРЕВЦОВА\"",
				"\"Главный Бухгалтер\"", "Июнь 2016", 6), 8);
	}

	// CityLibrary cityLibrary2 = new CityLibrary("Библиотека № 14", "г. Минск,
	// ул. Притыцкого, 42", printEdition);

	// просмотр каталога изданий
	@Override
	public void viewEdition() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary() + "\nСписок изданий:");
		for (PrintEdition key : printEdition.keySet()) {
			System.out.println(key + ": " + printEdition.get(key));
		}
	}

	// поиск издания по названию
	@Override
	public void searchTitleEdition() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		for (Entry<PrintEdition, Integer> entry : printEdition.entrySet()) {
			if (entry.getKey().getTitle().equals(title)) {
				System.out.println("Полная информация об издании:");
				System.out.println(entry.getKey().toString() + " - " + entry.getValue());
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
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите фамилию автора издания:");
		String author = scanner.nextLine();
		for (Entry<PrintEdition, Integer> entry : printEdition.entrySet()) {
			if (entry.getKey().getAuthor().getSurname().equals(author)) {
				System.out.println("Полная информация об издании:");
				System.out.println(entry.getKey().toString());
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
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите фамилию автора издания:");
		String author = scanner.nextLine();
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		for (Entry<PrintEdition, Integer> entry : printEdition.entrySet()) {
			if (entry.getKey().getAuthor().getSurname().equals(author) && entry.getKey().getTitle().equals(title)) {
				System.out.println("Полная информация об издании:");
				System.out.println(entry.getKey().toString());
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
		result = prime * result + ((printEdition == null) ? 0 : printEdition.hashCode());
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
		CityLibrary other = (CityLibrary) obj;
		if (printEdition == null) {
			if (other.printEdition != null)
				return false;
		} else if (!printEdition.equals(other.printEdition))
			return false;
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
		Map<PrintEdition, Integer> sortPrintEdition = new TreeMap<PrintEdition, Integer>(new TitleComparator());
		sortPrintEdition.putAll(printEdition);
		for (PrintEdition key : sortPrintEdition.keySet()) {
			System.out.println(key + ": " + sortPrintEdition.get(key));
		}

	}

	// сортировка списка изданий по названию издания, дате публикации, фамилии
	// автора
	@Override
	public void sortSomeParameters() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Список, отсортированный по названию издания, дате публикации, фамилии автора:");
		Map<PrintEdition, Integer> sortPrintEdition = new TreeMap<PrintEdition, Integer>(
				new SomeParametersComparator());
		sortPrintEdition.putAll(printEdition);
		for (PrintEdition key : sortPrintEdition.keySet()) {
			System.out.println(key + ": " + sortPrintEdition.get(key));
		}

	}

	// удаление конкретного издания
	@Override
	public void removeEdition() {
		Iterator<Entry<PrintEdition, Integer>> iterator = printEdition.entrySet().iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			Entry<PrintEdition, Integer> entry = iterator.next();
			if (entry.getKey().getTitle().equals(title)) {
				iterator.remove();
			} /*
				 * else { System.out
				 * .println("Изданий с указанным названием в библиотеке нет. Введите другое название в кавычках."
				 * ); }
				 */
		}
		System.out.println("Список после удаления издания:");
		for (PrintEdition key : printEdition.keySet()) {
			System.out.println(key + ": " + printEdition.get(key));
		}

	}

}
