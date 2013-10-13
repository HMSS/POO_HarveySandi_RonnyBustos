package Enviroment;


public abstract class Person {

	/**
	 * @uml.property  name="identification"
	 * @uml.property  name="name"
	 * @uml.property  name="password"
	 */
	
	private String identification;
	private String name, password;
	
	public Person(String password, String identification, String name) {
		this.identification = identification;
		this.name = name;
		this.password = password;
	}

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
	 * Getter of the property <tt>password</tt>
	 * @return  Returns the password.
	 * @uml.property  name="password"
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of the property <tt>password</tt>
	 * @param userName  The password to set.
	 * @uml.property  name="password"
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
