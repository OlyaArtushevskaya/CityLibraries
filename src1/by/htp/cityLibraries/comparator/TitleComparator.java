package by.htp.cityLibraries.comparator;

import java.util.Comparator;

import by.htp.cityLibraries.printEdition.PrintEdition;

public class TitleComparator implements Comparator<PrintEdition> {

	@Override
	public int compare(PrintEdition o1, PrintEdition o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
