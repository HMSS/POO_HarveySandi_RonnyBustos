package Enviroment;


public class Theoretical extends Subject {

	/**
	 * @uml.property  name="webpage"
	 */
	private String webpage;
	
	public Theoretical(String webpage, String name, byte credits, ClassRoom classRoom) {
		super(name,credits,classRoom);
		this.webpage = webpage;
	}

	/**
	 * Getter of the property <tt>webpage</tt>
	 * @return  Returns the webpage.
	 * @uml.property  name="webpage"
	 */
	public String getWebpage() {
		return webpage;
	}

	/**
	 * Setter of the property <tt>webpage</tt>
	 * @param webpage  The webpage to set.
	 * @uml.property  name="webpage"
	 */
	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}

}
