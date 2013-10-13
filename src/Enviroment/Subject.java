package Enviroment;

import java.util.ArrayList;


public abstract class Subject {

	private String name;
	private byte credits;
	private ArrayList<Professor> professors = new ArrayList<Professor>();
	private ClassRoom classRoom;
	
	public Subject(String name, byte credits, ClassRoom classRoom) {
		this.name = name;
		this.credits = credits;
		this.classRoom = classRoom;
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
		this.professors.add(professor);
	}

	/**
	 * Getter of the property <tt>classRoom</tt>
	 * @return  Returns the classRoom.
	 * @uml.property  name="classRoom"
	 */
	public ClassRoom getClassRoom() {
		return classRoom;
	}

	/**
	 * Setter of the property <tt>classRoom</tt>
	 * @param classRoom  The classRoom to set.
	 * @uml.property  name="classRoom"
	 */
	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}

	public ArrayList<Professor> getProfessors() {
		return this.professors;
	}
	
}
