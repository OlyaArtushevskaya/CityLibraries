package by.htp.cityLibraries.city;

import java.util.ArrayList;
import java.util.HashMap;

import by.htp.cityLibraries.library.Library;

public class City {
	private HashMap<Library, ArrayList<Library>> cityLibrary;

	public HashMap<Library, ArrayList<Library>> getCityLibrary() {
		return cityLibrary;
	}

	public void setCityLibrary(HashMap<Library, ArrayList<Library>> cityLibrary) {
		this.cityLibrary = cityLibrary;
	}

}
