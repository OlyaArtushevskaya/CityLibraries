package by.htp.cityLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

//import by.htp.cityLibraries.city.ChildrenLibrarylmpl;
//import by.htp.cityLibraries.city.ScientificLibrarylmpl;
import by.htp.cityLibraries.library.ChildrenLibrary;
import by.htp.cityLibraries.library.CityLibrary;
import by.htp.cityLibraries.library.ScientificLibrary;
import by.htp.cityLibraries.printEdition.Author;
import by.htp.cityLibraries.printEdition.ChildrenBook;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fos;
		ObjectOutputStream oos;
		FileInputStream fis;
		ObjectInputStream ois;

		try {
			fos = new FileOutputStream("C:\\Users\\User\\workspace\\ChildrenLibrary.txt");
			oos = new ObjectOutputStream(fos);

			fis = new FileInputStream("C:\\Users\\User\\workspace\\ChildrenLibrary.txt");
			ois = new ObjectInputStream(fis);

			// ChildrenLibrary
			
			ChildrenLibrary childrenLibrary1 = new ChildrenLibrary("\"Детская библиотека № 3 им. А.Гайдара\" ",
					"г. Минск, ул. Бачило, 2", null);
			childrenLibrary1.fillChildrenLibrary1();

			ChildrenLibrary childrenLibrary2 = new ChildrenLibrary("\"Детская библиотека № 9\" ",
					"г. Минск, ул. Уборевича, 44", null);
			childrenLibrary2.fillChildrenLibrary2();

			oos.writeObject(childrenLibrary1);
			oos.writeObject(childrenLibrary2);

			ChildrenLibrary childrenLibrary11 = (ChildrenLibrary) ois.readObject();
			System.out.println(childrenLibrary11);

			ChildrenLibrary childrenLibrary22 = (ChildrenLibrary) ois.readObject();
			System.out.println(childrenLibrary22);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// ScientificLibrary
		ScientificLibrary scientificLibrary1 = new ScientificLibrary("\"Научно-техническая библиотека \"Интеграл\" ",
				"г. Минск, ул. Казинца, 121а", null);
		scientificLibrary1.fillScientificLibrary1();

		ScientificLibrary scientificLibrary2 = new ScientificLibrary("\"Научная библиотека БНТУ\" ",
				"г. Минск, ул. Я.Колоса, 16, корп. 5", null);
		scientificLibrary2.fillScientificLibrary2();

		// CityLibrary
		CityLibrary cityLibrary1 = new CityLibrary("\"Библиотека № 4 им. Н.В. Гоголя\" ", "г. Минск, ул. Лобанка, 22",
				null);
		cityLibrary1.fillHashMap1();

		CityLibrary cityLibrary2 = new CityLibrary("\"Библиотека № 14\" ", "г. Минск, ул. Притыцкого, 42", null);
		cityLibrary2.fillHashMap2();

		// ChildrenLibrary
		/*
		 * childrenLibrary1.viewEdition(); childrenLibrary2.viewEdition();
		 * 
		 * childrenLibrary1.searchTitleEdition();
		 * childrenLibrary2.searchTitleEdition();
		 * 
		 * childrenLibrary1.searchAuthorEdition();
		 * childrenLibrary2.searchAuthorEdition();
		 * 
		 * childrenLibrary1.searchAuthorTitleEdition();
		 * childrenLibrary2.searchAuthorTitleEdition();
		 * 
		 * childrenLibrary1.sortTitleEdition();
		 * childrenLibrary2.sortTitleEdition();
		 * 
		 * childrenLibrary1.sortSomeParameters();
		 * childrenLibrary2.sortSomeParameters();
		 * 
		 * childrenLibrary1.removeEdition(); childrenLibrary2.removeEdition();
		 * 
		 * // ScientificLibrary scientificLibrary1.viewEdition();
		 * scientificLibrary2.viewEdition();
		 * 
		 * scientificLibrary1.searchTitleEdition();
		 * scientificLibrary2.searchTitleEdition();
		 * 
		 * scientificLibrary1.searchAuthorEdition();
		 * scientificLibrary2.searchAuthorEdition();
		 * 
		 * scientificLibrary1.searchAuthorTitleEdition();
		 * scientificLibrary2.searchAuthorTitleEdition();
		 * 
		 * scientificLibrary1.sortTitleEdition();
		 * scientificLibrary2.sortTitleEdition();
		 * 
		 * scientificLibrary1.sortSomeParameters();
		 * scientificLibrary2.sortSomeParameters();
		 * 
		 * scientificLibrary1.removeEdition();
		 * scientificLibrary2.removeEdition();
		 * 
		 * // CityLibrary cityLibrary1.viewEdition();
		 * cityLibrary2.viewEdition();
		 * 
		 * cityLibrary1.searchTitleEdition(); cityLibrary2.searchTitleEdition();
		 * 
		 * cityLibrary1.searchAuthorEdition();
		 * cityLibrary2.searchAuthorEdition();
		 * 
		 * cityLibrary1.searchAuthorTitleEdition();
		 * cityLibrary2.searchAuthorTitleEdition();
		 * 
		 * cityLibrary1.sortTitleEdition(); cityLibrary2.sortTitleEdition();
		 * 
		 * cityLibrary1.sortSomeParameters(); cityLibrary2.sortSomeParameters();
		 * 
		 * cityLibrary1.removeEdition(); cityLibrary2.removeEdition();
		 */

		// CityChildrenLibrary

		/*
		 * ChildrenLibrarylmpl cityChildrenLibrary= new
		 * ChildrenLibrarylmpl(null);
		 * cityChildrenLibrary.addChildrenLibrary(childrenLibrary1);
		 * cityChildrenLibrary.addChildrenLibrary(childrenLibrary2);
		 * 
		 * cityChildrenLibrary.viewChildrenLibrary();
		 */

		// CityScientificLibrary
		/*
		 * ScientificLibrarylmpl cityScientificLibrary=new
		 * ScientificLibrarylmpl(null);
		 * cityScientificLibrary.addScientificLibrary(scientificLibrary1);
		 * cityScientificLibrary.addScientificLibrary(scientificLibrary2);
		 * 
		 * cityScientificLibrary.viewScientificLibrary();
		 */

	}

}
