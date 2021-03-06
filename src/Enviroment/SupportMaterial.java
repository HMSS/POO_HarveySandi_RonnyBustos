package Enviroment;


public class SupportMaterial {

	/**
	 * @uml.property  name="name"
	 */
	private String name;

	public SupportMaterial(String name){
		this.name = name;
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

}
