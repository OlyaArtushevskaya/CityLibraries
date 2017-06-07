package by.htp.cityLibraries.printEdition;

public class Newspaper extends PrintEdition {
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
