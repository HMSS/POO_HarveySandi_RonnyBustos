package Enviroment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Semester {

	/**
	 * @uml.property  name="number"
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="semester:Enviroment.Subject"
	 */
	private byte number;
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	
	public Semester(byte number) {
		this.number = number;
	}

	/** 
	 * Getter of the property <tt>numeroSemestre</tt>
	 * @return  Returns the numeroSemestre.
	 * @uml.property  name="number"
	 */
	public byte getNumber() {
		return number;
	}

	/** 
	 * Setter of the property <tt>numeroSemestre</tt>
	 * @param numeroSemestre  The numeroSemestre to set.
	 * @uml.property  name="number"
	 */
	public void setNumber(byte number) {
		this.number = number;
	}
	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public void removeSubject(String subject) {
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getName().equals(subject))
				subjects.remove(i);
		}
	}
	
	public ArrayList<String> buildSchedule() {
		ArrayList<String> errors = new ArrayList<String>();
		for (int s = 0; s < subjects.size(); s++) {
			for (int p = 0; p < subjects.get(s).getProfessors().size(); p++) {
				
			}
		}
		return errors;
	}
	
	private boolean verifySectionAvailability() {
		return true;
	}
}
