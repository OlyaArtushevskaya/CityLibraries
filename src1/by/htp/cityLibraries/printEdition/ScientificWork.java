package by.htp.cityLibraries.printEdition;

import java.io.Serializable;

public class ScientificWork extends PrintEdition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4187628561005748232L;

	public ScientificWork(Author author, String title, String datePublishing) {
		super(author, title, datePublishing);
	}
	
		

}
