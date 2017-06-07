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
		printEdition.add(new ScientificWork(new Author("�������", "�����", "����������", "17 ������ 1975"),
				"\"������������ ����������� ������ Java\"", "2004"));
		printEdition.add(new ScientificWork(new Author("������", "�����", "�������������", "25 ������� 1979"),
				"\"���������� ������� ����������� �������� � ����������� � ��������\"", "2017"));
		printEdition.add(new ScientificWork(new Author("���������", "�����", "����������", "12 ������� 1974"),
				"\"��������� �������� �������������� ������ ������������ ���������\"", "2004"));
		printEdition.add(new ScientificWork(new Author("����", "�����", "����������", "12 ������� 1974"),
				"\"��������� �������� �������������� ������ ������������ ���������\"", "2001"));
		printEdition.add(new ScientificWork(new Author("���������", "�����", "���������", "12 ������� 1974"),
				"\"��������� �������� �������������� ������ ������������ ���������\"", "2004"));
	}

	/*
	 * ScientificLibrary scientificLibrary1 = new
	 * ScientificLibrary("������-����������� ���������� \"��������\"",
	 * "�. �����, ��. �������, 121�", printEdition);
	 */

	public void fillScientificLibrary2() {
		printEdition = new HashSet<ScientificWork>();
		printEdition.add(new ScientificWork(new Author("�������", "�����", "��������", "6 ���� 1945"),
				"\"���������� ������\"", "1997"));
		printEdition.add(new ScientificWork(new Author("��������", "�����", null, "25 ���� 1985"),
				"\"���������� ���������� ��� Android �� Java\"", "2015"));
		printEdition.add(new ScientificWork(new Author("������", "��������", "�����������", "25 ������ 1957"),
				"\"�������� ������ �������� ��������������\"", "2011"));
		printEdition.add(new ScientificWork(new Author("������", "��������", "�����������", "25 ������ 1957"),
				"\"�������� ������ �������� ����������\"", "2013"));
	}

	/*
	 * ScientificLibrary scientificLibrary2 = new
	 * ScientificLibrary("������� ���������� ����",
	 * "�. �����, ��. �.������, 16, ����. 5", printEdition);
	 */

	// �������� �������� �������
	@Override
	public void viewEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary() + "\n������ �������:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// ����� ������� �� ��������
	@Override
	public void searchTitleEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� �������� �������:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getTitle().equals(title)) {
				System.out.println("������ ���������� �� �������:");
				System.out.println(scientificWork);
			} /*
				 * else { System.out
				 * .println("������� � ��������� ��������� � ���������� ���. ������� ������ �������� � ��������."
				 * ); }
				 */

		}

	}

	// ����� ������� �� ������
	@Override
	public void searchAuthorEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� ������� ������ �������:");
		String author = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getAuthor().getSurname().equals(author)) {
				System.out.println("������ ���������� �� �������:");
				System.out.println(scientificWork);
			} /*
				 * else { System.out.
				 * println("������� � ��������� �������� ������ � ���������� ���. ������� ������ �������."
				 * ); }
				 */

		}

	}

	// ����� ������� �� ������ � ��������
	@Override
	public void searchAuthorTitleEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� ������� ������ �������:");
		String author = scanner.nextLine();
		System.out.println("������� �������� �������:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getAuthor().getSurname().equals(author) && scientificWork.getTitle().equals(title)) {
				System.out.println("������ ���������� �� �������:");
				System.out.println(scientificWork);
			} /*
				 * else {
				 * System.out.println("��������� ������� � ���������� ���. "); }
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

	// ���������� ������ ������� �� �������� �������
	@Override
	public void sortTitleEdition() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������, ��������������� �� �������� �������:");
		Set<PrintEdition> sortPrintEdition = new TreeSet<PrintEdition>(new TitleComparator());
		sortPrintEdition.addAll(printEdition);
		for (PrintEdition view : sortPrintEdition) {
			System.out.println(view);
		}
	}

	// ���������� ������ ������� �� �������� �������, ���� ����������, �������
	// ������
	@Override
	public void sortSomeParameters() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������, ��������������� �� �������� �������, ���� ����������, ������� ������:");
		Set<PrintEdition> sortPrintEdition = new TreeSet<PrintEdition>(new SomeParametersComparator());
		sortPrintEdition.addAll(printEdition);
		for (PrintEdition view : sortPrintEdition) {
			System.out.println(view);
		}
	}

	// �������� ����������� �������
	@Override
	public void removeEdition() {
		Iterator<ScientificWork> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� �������� �������:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ScientificWork scientificWork = iterator.next();

			if (scientificWork.getTitle().equals(title)) {
				iterator.remove();
			} /*
				 * else { System.out
				 * .println("������� � ��������� ��������� � ���������� ���. ������� ������ �������� � ��������."
				 * ); }
				 */
		}
		System.out.println("������ ����� �������� �������:");
		for (ScientificWork view : printEdition) {
			System.out.println(view);
		}

	}

}
