package by.htp.cityLibraries.library;

public abstract class Library implements Librarian {
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

	@Override
	public String toString() {
		return "Library [nameLibrary=" + nameLibrary + ", adressLibrary=" + adressLibrary + "]";
	}

}
