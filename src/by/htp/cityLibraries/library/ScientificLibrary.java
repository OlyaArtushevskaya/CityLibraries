package by.htp.cityLibraries.library;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import by.htp.cityLibraries.comparator.SomeParametersComparator;
import by.htp.cityLibraries.comparator.TitleComparator;
import by.htp.cityLibraries.printEdition.Author;
import by.htp.cityLibraries.printEdition.PrintEdition;
import by.htp.cityLibraries.printEdition.ScientificWork;

public class ScientificLibrary extends Library {
	private HashSet<ScientificWork> printEdition;

	public ScientificLibrary(String nameLibrary, String adressLibrary, HashSet<ScientificWork> printEdition) {
		super(nameLibrary, adressLibrary);
		this.setPrintEdition(printEdition);
	}

	public HashSet<ScientificWork> getPrintEdition() {
		return printEdition;
	}

	public void setPrintEdition(HashSet<ScientificWork> printEdition) {
		this.printEdition = printEdition;
	}

	Scanner scanner = new Scanner(System.in);

	public void fillScientificLibrary1() {
		printEdition = new HashSet<ScientificWork>();
		printEdition.add(new ScientificWork(new Author("Сидоров", "Игорь", "Дмитриевич", "17 января 1975"),
				"\"Безопасность виртуальной машины Java\"", "2004"));
		printEdition.add(new ScientificWork(new Author("Валова", "Ольга", "Александровна", "25 августа 1979"),
				"\"Банковская система Респубилики Беларусь и перспективы её развития\"", "2017"));
		printEdition.add(new ScientificWork(new Author("Василенко", "Жанна", "Витальевна", "12 декабря 1974"),
				"\"Некоторые свойства полиномиальных оценок спектральной плотности\"", "2004"));
		printEdition.add(new ScientificWork(new Author("Ярош", "Жанна", "Витальевна", "12 декабря 1974"),
				"\"Некоторые свойства полиномиальных оценок спектральной плотности\"", "2001"));
		printEdition.add(new ScientificWork(new Author("Василенко", "Жанна", "Сергеевна", "12 декабря 1974"),
				"\"Некоторые свойства полиномиальных оценок спектральной плотности\"", "2004"));
	}

	/*
	 * ScientificLibrary scientificLibrary1 = new
	 * ScientificLibrary("Научно-техническая библиотека \"Интеграл\"",
	 * "г. Минск, ул. Казинца, 121а", printEdition);
	 */

	public void fillScientificLibrary2() {
		printEdition = new HashSet<ScientificWork>();
		printEdition.add(new ScientificWork(new Author("Кремень", "Маркс", "Аронович", "6 июня 1945"),
				"\"Психология страха\"", "1997"));
		printEdition.add(new ScientificWork(new Author("Елюбаева", "Жанна", null, "25 июля 1985"),
				"\"Разработка приложения для Android на Java\"", "2015"));
		printEdition.add(new ScientificWork(new Author("Шустов", "Владимир", "Геннадьевич", "25 аперля 1957"),
				"\"Основные модели местного самоуправления\"", "2011"));
		printEdition.add(new ScientificWork(new Author("Шустов", "Владимир", "Геннадьевич", "25 аперля 1957"),
				"\"Основные модели местного управления\"", "2013"));
	}

	/*
	 * ScientificLibrary scientificLibrary2 = new
	 * ScientificLibrary("Научная библиотека БНТУ",
	 * "г. Минск, ул. Я.Колоса, 16, корп. 5", printEdition);
	 */

	// просмотр каталога изданий
	@Override
	public void viewEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary() + "\nСписок изданий:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// поиск издания по названию
	@Override
	public void searchTitleEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getTitle().equals(title)) {
				System.out.println("Полная информация об издании:");
				System.out.println(scientificWork);
			} /*
				 * else { System.out
				 * .println("Изданий с указанным названием в библиотеке нет. Введите другое название в кавычках."
				 * ); }
				 */

		}

	}

	// поиск издания по автору
	@Override
	public void searchAuthorEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите фамилию автора издания:");
		String author = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getAuthor().getSurname().equals(author)) {
				System.out.println("Полная информация об издании:");
				System.out.println(scientificWork);
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
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите фамилию автора издания:");
		String author = scanner.nextLine();
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getAuthor().getSurname().equals(author) && scientificWork.getTitle().equals(title)) {
				System.out.println("Полная информация об издании:");
				System.out.println(scientificWork);
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
		ScientificLibrary other = (ScientificLibrary) obj;
		if (printEdition == null) {
			if (other.printEdition != null)
				return false;
		} else if (!printEdition.equals(other.printEdition))
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
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("Введите название издания:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getTitle().equals(title)) {
				iterator.remove();
			} /*
				 * else { System.out
				 * .println("Изданий с указанным названием в библиотеке нет. Введите другое название в кавычках."
				 * ); }
				 */
		}
		System.out.println("Список после удаления издания:");
		for (ScientificWork view : printEdition) {
			System.out.println(view);
		}

	}

}
