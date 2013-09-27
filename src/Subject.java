

public abstract class Subject {

	/**
	 * @uml.property  name="name"
	 */
	private String name;

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
	 * @uml.property name="credits"
	 */
	private byte credits;

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
	 * @uml.property name="department"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="subject:Department"
	 */
	private Department department = null;

	/** 
	 * Getter of the property <tt>department</tt>
	 * @return  Returns the department.
	 * @uml.property  name="department"
	 */
	public Department getDepartment() {
		return department;
	}

	/** 
	 * Setter of the property <tt>department</tt>
	 * @param department  The department to set.
	 * @uml.property  name="department"
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

}
