package by.htp.cityLibraries.printEdition;

import java.io.Serializable;

public class Newspaper extends PrintEdition implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7212938757496565135L;
	private int numberEdition;

	public Newspaper(Author author, String title, String datePublishing, int numberEdition) {
		super(author, title, datePublishing);
		this.numberEdition = numberEdition;
	}

	public int getNumberEdition() {
		return numberEdition;
	}

	public void setNumberEdition(int numberEdition) {
		this.numberEdition = numberEdition;
	}

}
