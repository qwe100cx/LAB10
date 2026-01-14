package university.system;

public abstract class Employee {
	protected java.lang.String _socialSecurityNumber;
	protected java.lang.String _name;
	protected java.lang.String _email;

	public Employee(java.lang.String aParameter, java.lang.String aParameter2, java.lang.String aParameter3) {
		throw new UnsupportedOperationException();
	}

	public abstract java.lang.String getRole();

	public void displayInfo() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getSocialSecurityNumber() {
		return this._socialSecurityNumber;
	}

	public void setSocialSecurityNumber(java.lang.String aParameter) {
		this._socialSecurityNumber = aParameter;
	}

	public java.lang.String getName() {
		return this._name;
	}

	public void setName(java.lang.String aParameter) {
		this._name = aParameter;
	}

	public java.lang.String getEmail() {
		return this._email;
	}

	public void setEmail(java.lang.String aParameter) {
		this._email = aParameter;
	}
}