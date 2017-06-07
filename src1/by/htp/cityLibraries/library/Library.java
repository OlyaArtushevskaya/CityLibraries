package by.htp.cityLibraries.library;

import java.io.Serializable;

public abstract class Library implements Librarian, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1815808925651308884L;
	private String nameLibrary;
	private String adressLibrary;

	public Library(String nameLibrary, String adressLibrary) {
		this.setNameLibrary(nameLibrary);
		this.setAdressLibrary(adressLibrary);
	}

	public String getNameLibrary() {
		return nameLibrary;
	}

	public void setNameLibrary(String nameLibrary) {
		this.nameLibrary = nameLibrary;
	}

	public String getAdressLibrary() {
		return adressLibrary;
	}

	public void setAdressLibrary(String adressLibrary) {
		this.adressLibrary = adressLibrary;
	}

	
}
