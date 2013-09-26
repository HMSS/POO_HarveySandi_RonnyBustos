

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
	 * @uml.property  name="credits"
	 */
	private int credits;

	/**
	 * Getter of the property <tt>credits</tt>
	 * @return  Returns the credits.
	 * @uml.property  name="credits"
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * Setter of the property <tt>credits</tt>
	 * @param credits  The credits to set.
	 * @uml.property  name="credits"
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

}
