package by.htp.cityLibraries.printEdition;

public class Author {
	private String surname;
	private String name;
	private String patronymic;
	private String dateBirthday;

	public Author(String surname, String name, String patronymic, String dateBirthday) {
		this.setSurname(surname);
		this.setName(name);
		this.setPatronymic(patronymic);
		this.setDateBirthday(dateBirthday);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(String dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateBirthday == null) ? 0 : dateBirthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Author other = (Author) obj;
		if (dateBirthday == null) {
			if (other.dateBirthday != null)
				return false;
		} else if (!dateBirthday.equals(other.dateBirthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", dateBirthday="
				+ dateBirthday + "]";
	}

}
