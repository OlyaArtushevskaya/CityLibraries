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

	// ���������� ������ �������
	public void fillChildrenLibrary1() {
		printEdition = new LinkedList<ChildrenBook>();
		printEdition
				.add(new ChildrenBook(new Author("�������", "������", null, "14 ������ 1971"), "\"������\"", "2013"));
		printEdition.add(new ChildrenBook(new Author("�������", "�����", null, "31 ���� 1965"),
				"\"������ ����� �����\"", "2015"));
		printEdition.add(new ChildrenBook(new Author("����������", "������", "��������", "1 ������� 1913"),
				"\"��������� ��������\"", "2015"));
		printEdition.add(
				new ChildrenBook(new Author("������", "���������", "���������", "6 ���� 1799"), "\"������ \"", "2012"));
		printEdition.add(new ChildrenBook(new Author("����������", "������", "��������", "1 ������� 1913"),
				"\"��������� ��������\"", "2015"));
		printEdition.add(
				new ChildrenBook(new Author("������", "���������", "���������", "6 ���� 1799"), "\"������ \"", "2005"));
		printEdition
				.add(new ChildrenBook(new Author("��������", "������", null, "14 ������ 1907"), "\"������ \"", "2003"));
	}

	// ChildrenLibrary childrenLibrary1=new ChildrenLibrary("������� ����������
	// � 3 ��. �.�������", "�. �����, ��. ������, 2", printEdition);

	// ���������� ������ �������
	public void fillChildrenLibrary2() {
		printEdition = new LinkedList<ChildrenBook>();
		printEdition.add(
				new ChildrenBook(new Author("������", "���������", "���������", "6 ���� 1799"), "\"������ \"", "2012"));
		printEdition.add(new ChildrenBook(new Author("��������", "�����", null, null),
				"\"� �������. ��������-�����������\"", "2016"));
		printEdition.add(new ChildrenBook(new Author("������", "���������", "���������", "1914"),
				"\"��� ���� ��� ���������\"", "2011"));
		printEdition.add(new ChildrenBook(new Author("������", "���������", "���������", "1914"),
				"\"��� ���� ������ � �����\"", "2005"));
	}

	// ChildrenLibrary childrenLibrary2=new ChildrenLibrary("������� ����������
	// � 9", "�. �����, ��. ���������, 44", printEdition);

	// �������� �������� �������
	@Override
	public void viewEdition() {
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary() + "\n������ �������:");
		for (ChildrenBook view : printEdition) {
			System.out.println(view);
		}
	}

	// ����� ������� �� ��������
	@Override
	public void searchTitleEdition() {
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� �������� �������:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getTitle().equals(title)) {
				System.out.println("������ ���������� �� �������:");
				System.out.println(childrenBook);
			} /*
				 * else { System.out
				 * .println("������� � ��������� ��������� � ���������� ���. ������� ������ �������� � ��������."
				 * );
				 * 
				 * }
				 */

		}

	}

	// ����� ������� �� ������
	@Override
	public void searchAuthorEdition() {
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� ������� ������ �������:");
		String author = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getAuthor().getSurname().equals(author)) {
				System.out.println("������ ���������� �� �������:");
				System.out.println(childrenBook);
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
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� ������� ������ �������:");
		String author = scanner.nextLine();
		System.out.println("������� �������� �������:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getAuthor().getSurname().equals(author) && childrenBook.getTitle().equals(title)) {
				System.out.println("������ ���������� �� �������:");
				System.out.println(childrenBook);
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
		Iterator<ChildrenBook> iterator = printEdition.iterator();
		System.out.println("");
		System.out.println(getNameLibrary() + getAdressLibrary());
		System.out.println("������� �������� �������:");
		String title = scanner.nextLine();
		while (iterator.hasNext()) {
			ChildrenBook childrenBook = iterator.next();

			if (childrenBook.getTitle().equals(title)) {
				iterator.remove();
			} /*
				 * else { System.out
				 * .println("������� � ��������� ��������� � ���������� ���. ������� ������ �������� � ��������."
				 * ); }
				 */

		}
		System.out.println("������ ����� �������� �������:");
		for (ChildrenBook view : printEdition) {
			System.out.println(view);
		}

	}

}
