package by.htp.cityLibraries.city;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import by.htp.cityLibraries.library.ScientificLibrary;

public class ScientificLibrarylmpl {
	private TreeSet<ScientificLibrary> cityScientificLibrary;

	public ScientificLibrarylmpl(TreeSet<ScientificLibrary> cityscientificLibrary) {
		this.setCityscientificLibrary(cityscientificLibrary);
	}

	public TreeSet<ScientificLibrary> getCityscientificLibrary() {
		return cityScientificLibrary;
	}

	public void setCityscientificLibrary(TreeSet<ScientificLibrary> cityscientificLibrary) {
		this.cityScientificLibrary = cityscientificLibrary;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "ScientificLibrarylmpl [cityscientificLibrary="
				+ (cityScientificLibrary != null ? toString(cityScientificLibrary, maxLen) : null) + "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
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
