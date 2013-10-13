package Enviroment;

import java.util.ArrayList;


public abstract class ClassRoom {

	/**
	 * @uml.property  name="name"
	 * @uml.property  name="location"
	 * @uml.property  name="number"
	 * @uml.property  name="capacity"
	 */
	private String name;
	private String location;
	private int capacity;
	private int number;
	private ArrayList<Lesson> availability = new ArrayList<Lesson>();
	
	public ClassRoom(String name, String location, int capacity, int number) {
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.number = number;
		char[] days = new char[] { 'L','K','M','J','V' };
		char[] blocks = new char[] { 'A','B','C','D','E','F','G','H','I','J','K','L','M' };
		for (int i = 0; i < days.length; i++) {
			for (int a = 0; a < blocks.length; a++) {
				if (a == 4) {
					continue;
				}
				else if (a < 4) {
					this.availability.add(new Lesson(days[i],blocks[a],blocks[a+1]));
				}
				else {
					this.availability.add(new Lesson(days[i],blocks[a],blocks[a+1]));
					a++;
				}
			}
		}
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
	
	public void discardAvailability(char day, char begin, char end) {
		for (int i = 0; i < availability.size(); i++) {
			if ((availability.get(i).getDay() == day) && (availability.get(i).getBegin() == begin) && (availability.get(i).getEnd() == end)) {
				availability.remove(i);
			}
		}
	}
	
	public ArrayList<Lesson> getAvailability() {
		return this.availability;
	}

}
