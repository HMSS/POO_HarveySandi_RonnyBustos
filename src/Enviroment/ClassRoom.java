package Enviroment;


public abstract class ClassRoom {

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
	 * @uml.property  name="location"
	 */
	private String location;

	/**
	 * Getter of the property <tt>location</tt>
	 * @return  Returns the location.
	 * @uml.property  name="location"
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Setter of the property <tt>location</tt>
	 * @param location  The location to set.
	 * @uml.property  name="location"
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @uml.property  name="number"
	 */
	private int number;

	/**
	 * Getter of the property <tt>number</tt>
	 * @return  Returns the number.
	 * @uml.property  name="number"
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Setter of the property <tt>number</tt>
	 * @param number  The number to set.
	 * @uml.property  name="number"
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @uml.property  name="capacity"
	 */
	private int capacity;

	/**
	 * Getter of the property <tt>capacity</tt>
	 * @return  Returns the capacity.
	 * @uml.property  name="capacity"
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Setter of the property <tt>capacity</tt>
	 * @param capacity  The capacity to set.
	 * @uml.property  name="capacity"
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
