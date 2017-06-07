package by.htp.cityLibraries.printEdition;

import java.io.Serializable;

public class Magazine extends PrintEdition implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4184629232315905993L;
	private int numberEdition;
	private String publishingHouse;

	public Magazine(Author author, String publishingHouse, String title, String datePublishing, int numberEdition) {
		super(author, title, datePublishing);
		this.numberEdition = numberEdition;
		this.setPublishingHouse(publishingHouse);
	}

	public int getNumberEdition() {
		return numberEdition;
	}

	public void setNumberEdition(int numberEdition) {
		this.numberEdition = numberEdition;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

}
