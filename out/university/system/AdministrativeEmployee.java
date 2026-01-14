package university.system;

public class AdministrativeEmployee extends Employee {
	private java.lang.String _department;

	public AdministrativeEmployee(java.lang.String aParameter, java.lang.String aParameter2, java.lang.String aParameter3, java.lang.String aParameter4) {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getRole() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getDepartment() {
		return this._department;
	}

	public void setDepartment(java.lang.String aParameter) {
		this._department = aParameter;
	}
}