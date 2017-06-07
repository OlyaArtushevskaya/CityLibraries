package by.htp.cityLibraries.city;

//import java.util.Iterator;
import java.util.PriorityQueue;
//import java.util.TreeSet;

import by.htp.cityLibraries.library.CityLibrary;
//import by.htp.cityLibraries.library.ScientificLibrary;

public class CityLibrarylmpl {
	private PriorityQueue<CityLibrary> cityLibrary;

	public CityLibrarylmpl(PriorityQueue<CityLibrary> cityLibrary) {
		this.cityLibrary = cityLibrary;
	}

	public PriorityQueue<CityLibrary> getCityLibrary() {
		return cityLibrary;
	}

	public void setCityLibrary(PriorityQueue<CityLibrary> cityLibrary) {
		this.cityLibrary = cityLibrary;
	}

	@Override
	public String toString() {
		return "CityLibrarylmpl [cityLibrary=" + cityLibrary + "]";
	}

	// добавление новой библиотеки
	/*public void addScientificLibrary(ScientificLibrary scientificLibrary) {
		cityScientificLibrary = new TreeSet<ScientificLibrary>();
		cityScientificLibrary.add(scientificLibrary);
	}

	// просмотр библиотек
	public void viewScientificLibrary() {
		Iterator<ScientificLibrary> iterator = cityScientificLibrary.iterator();
		System.out.println("");
		System.out.println("Список научных библиотек:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}*/

}
