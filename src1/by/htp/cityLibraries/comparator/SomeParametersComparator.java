package by.htp.cityLibraries.comparator;

import java.util.Comparator;

import by.htp.cityLibraries.printEdition.PrintEdition;

public class SomeParametersComparator implements Comparator<PrintEdition> {
	
	@Override
	public int compare(PrintEdition o1, PrintEdition o2) {
		int compareTo = o1.getTitle().compareTo(o2.getTitle());
		if (compareTo != 0) {
			return compareTo;
		} else if (compareTo == 0) {
			return o1.getDatePublishing().compareTo(o2.getDatePublishing());
		}
		return o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
		}
	
}

