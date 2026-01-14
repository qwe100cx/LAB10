package university.system;

import java.util.Map;
import java.util.List;

public class ResearchEmployee extends Employee {
	private java.lang.String _researchArea;
	private Map _projects;
	private List _institutes;

	public ResearchEmployee(java.lang.String aParameter, java.lang.String aParameter2, java.lang.String aParameter3, java.lang.String aParameter4) {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getRole() {
		throw new UnsupportedOperationException();
	}

	public void addProject(Project aParameter, int aParameter2) {
		throw new UnsupportedOperationException();
	}

	public void addInstitute(Institute aParameter) {
		throw new UnsupportedOperationException();
	}

	public int getTotalProjectHours() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getResearchArea() {
		return this._researchArea;
	}

	public void setResearchArea(java.lang.String aParameter) {
		this._researchArea = aParameter;
	}

	public Map getProjects() {
		return this._projects;
	}

	public List getInstitutes() {
		return this._institutes;
	}
}