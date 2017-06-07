package by.htp.cityLibraries.city;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import by.htp.cityLibraries.library.ChildrenLibrary;

public class ChildrenLibrarylmpl {
	private LinkedHashSet<ChildrenLibrary> cityChildrenLibrary;

	public ChildrenLibrarylmpl(LinkedHashSet<ChildrenLibrary> cityChildrenLibrary) {
		this.cityChildrenLibrary = cityChildrenLibrary;
	}

	public LinkedHashSet<ChildrenLibrary> getCityChildrenLibrary() {
		return cityChildrenLibrary;
	}

	public void setCityChildrenLibrary(LinkedHashSet<ChildrenLibrary> cityChildrenLibrary) {
		this.cityChildrenLibrary = cityChildrenLibrary;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "ChildrenLibrarylmpl [cityChildrenLibrary="
				+ (cityChildrenLibrary != null ? toString(cityChildrenLibrary, maxLen) : null) + "]";
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
	public void addChildrenLibrary(ChildrenLibrary childrenLibrary) {
		cityChildrenLibrary = new LinkedHashSet<ChildrenLibrary>();
		cityChildrenLibrary.add(childrenLibrary);
	}

	// просмотр библиотек
	public void viewChildrenLibrary() {
		Iterator<ChildrenLibrary> iterator = cityChildrenLibrary.iterator();
		System.out.println("");
		System.out.println("Список детских библиотек:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
