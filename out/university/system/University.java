package university.system;

import java.util.List;

public class University {
	private java.lang.String _name;
	private int _numberOfEmployees;
	private List _faculties;

	public University(java.lang.String aParameter) {
		throw new UnsupportedOperationException();
	}

	public void addFaculty(Faculty aParameter) {
		throw new UnsupportedOperationException();
	}

	public int calculateTotalEmployees() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getName() {
		return this._name;
	}

	public void setName(java.lang.String aParameter) {
		this._name = aParameter;
	}

	public int getNumberOfEmployees() {
		return this._numberOfEmployees;
	}

	public void setNumberOfEmployees(int aParameter) {
		this._numberOfEmployees = aParameter;
	}

	public List getFaculties() {
		return this._faculties;
	}
}