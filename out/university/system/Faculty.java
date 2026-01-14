package university.system;

import java.util.List;

public class Faculty {
	private java.lang.String _name;
	private List _institutes;
	private Employee _dean;
	private List _employees;

	public Faculty(java.lang.String aParameter) {
		throw new UnsupportedOperationException();
	}

	public void addInstitute(Institute aParameter) {
		throw new UnsupportedOperationException();
	}

	public void setDean(Employee aParameter) {
		this._dean = aParameter;
	}

	public List getCourses() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getName() {
		return this._name;
	}

	public void setName(java.lang.String aParameter) {
		this._name = aParameter;
	}

	public List getInstitutes() {
		return this._institutes;
	}

	public Employee getDean() {
		return this._dean;
	}

	public List getEmployees() {
		return this._employees;
	}
}