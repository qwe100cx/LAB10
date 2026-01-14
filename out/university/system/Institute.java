package university.system;

import java.util.List;

public class Institute {
	private java.lang.String _name;
	private java.lang.String _address;
	private List _employees;

	public Institute(java.lang.String aParameter, java.lang.String aParameter2) {
		throw new UnsupportedOperationException();
	}

	public void addEmployee(Employee aParameter) {
		throw new UnsupportedOperationException();
	}

	public List getResearchAreas() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getName() {
		return this._name;
	}

	public void setName(java.lang.String aParameter) {
		this._name = aParameter;
	}

	public java.lang.String getAddress() {
		return this._address;
	}

	public void setAddress(java.lang.String aParameter) {
		this._address = aParameter;
	}

	public List getEmployees() {
		return this._employees;
	}
}