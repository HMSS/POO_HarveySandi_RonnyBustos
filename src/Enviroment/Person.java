package Enviroment;


public abstract class Person {

	/**
	 * @uml.property  name="identification"
	 */
	private String identification;

	/**
	 * Getter of the property <tt>identification</tt>
	 * @return  Returns the identification.
	 * @uml.property  name="identification"
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * Setter of the property <tt>identification</tt>
	 * @param identification  The identification to set.
	 * @uml.property  name="identification"
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}

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

}
