package by.htp.cityLibraries.printEdition;

import java.io.Serializable;

public abstract class PrintEdition implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6285842311303411552L;
	protected Author author;
	private String title;
	private String datePublishing;

	public PrintEdition(Author author, String title, String datePublishing) {
		this.author = author;
		this.setTitle(title);
		this.setDatePublishing(datePublishing);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDatePublishing() {
		return datePublishing;
	}

	public void setDatePublishing(String datePublishing) {
		this.datePublishing = datePublishing;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((datePublishing == null) ? 0 : datePublishing.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrintEdition other = (PrintEdition) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (datePublishing == null) {
			if (other.datePublishing != null)
				return false;
		} else if (!datePublishing.equals(other.datePublishing))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrintEdition [author=" + author + ", title=" + title + ", datePublishing=" + datePublishing + "]";
	}

}
