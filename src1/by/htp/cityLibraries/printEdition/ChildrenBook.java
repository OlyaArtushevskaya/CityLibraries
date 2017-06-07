package by.htp.cityLibraries.printEdition;

import java.io.Serializable;

public class ChildrenBook extends PrintEdition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 852989855921763869L;

	public ChildrenBook(Author author, String title, String datePublishing) {
		super(author, title, datePublishing);
	}

}
