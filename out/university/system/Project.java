package university.system;

import java.time.LocalDate;
import java.util.Map;

public class Project {
	private java.lang.String _name;
	private LocalDate _startingDate;
	private LocalDate _endDate;
	private Map _participants;

	public Project(java.lang.String aParameter, LocalDate aParameter2, LocalDate aParameter3) {
		throw new UnsupportedOperationException();
	}

	public void addParticipant(ResearchEmployee aParameter, int aParameter2) {
		throw new UnsupportedOperationException();
	}

	public int getTotalHours() {
		throw new UnsupportedOperationException();
	}

	public long getDurationDays() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getName() {
		return this._name;
	}

	public void setName(java.lang.String aParameter) {
		this._name = aParameter;
	}

	public LocalDate getStartingDate() {
		return this._startingDate;
	}

	public void setStartingDate(LocalDate aParameter) {
		this._startingDate = aParameter;
	}

	public LocalDate getEndDate() {
		return this._endDate;
	}

	public void setEndDate(LocalDate aParameter) {
		this._endDate = aParameter;
	}

	public Map getParticipants() {
		return this._participants;
	}
}