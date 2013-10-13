package Enviroment;

import java.util.ArrayList;


public abstract class Subject {

	private String name;
	private byte credits;
	private ArrayList<Professor> professors = new ArrayList<Professor>();
	
	public Subject(String name, byte credits) {
		this.name = name;
		this.credits = credits;
	}

	/**
	 * Getter of the property <tt>name</tt>
	 * @return  Returns the name.
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * @param name  The name to set.
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Getter of the property <tt>credits</tt>
	 * @return  Returns the credits.
	 * @uml.property  name="credits"
	 */
	public byte getCredits() {
		return credits;
	}

	/** 
	 * Setter of the property <tt>credits</tt>
	 * @param credits  The credits to set.
	 * @uml.property  name="credits"
	 */
	public void setCredits(byte credits) {
		this.credits = credits;
	}

	/**
	 * Setter of the property <tt>professor</tt>
	 * @param professor  The professor to set.
	 * @uml.property  name="professor"
	 */
	public void addProfessor(Professor professor) {
		for (int p = 0; p < professors.size(); p++) {
			if (professor.getIdentification().equals(professors.get(p).getIdentification()))
				return;
		}
		this.professors.add(professor);
	}

	public ArrayList<Professor> getProfessors() {
		return this.professors;
	}
	
}
