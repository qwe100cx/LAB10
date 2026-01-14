package university.system;

public class Course {
	private java.lang.String _uniqueNumber;
	private java.lang.String _name;
	private int _weeklyDuration;
	private Lecturer _lecturer;

	public Course(java.lang.String aParameter, java.lang.String aParameter2, int aParameter3) {
		throw new UnsupportedOperationException();
	}

	public void assignLecturer(Lecturer aParameter) {
		throw new UnsupportedOperationException();
	}

	public void displayInfo() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUniqueNumber() {
		return this._uniqueNumber;
	}

	public void setUniqueNumber(java.lang.String aParameter) {
		this._uniqueNumber = aParameter;
	}

	public java.lang.String getName() {
		return this._name;
	}

	public void setName(java.lang.String aParameter) {
		this._name = aParameter;
	}

	public int getWeeklyDuration() {
		return this._weeklyDuration;
	}

	public void setWeeklyDuration(int aParameter) {
		this._weeklyDuration = aParameter;
	}

	public Lecturer getLecturer() {
		return this._lecturer;
	}
}