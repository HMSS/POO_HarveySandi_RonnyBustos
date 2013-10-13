package Enviroment;


public class Lesson {

	/**
	 * @uml.property  name="day"
	 */
	private char day;
	
	public Lesson(char day, char block) {
		this.day = day;
		this.block = block;
	}

	/**
	 * Getter of the property <tt>day</tt>
	 * @return  Returns the day.
	 * @uml.property  name="day"
	 */
	public char getDay() {
		return day;
	}

	/**
	 * Setter of the property <tt>day</tt>
	 * @param day  The day to set.
	 * @uml.property  name="day"
	 */
	public void setDay(char day) {
		this.day = day;
	}

	/**
	 * @uml.property  name="block"
	 */
	private char block;

	/**
	 * Getter of the property <tt>block</tt>
	 * @return  Returns the block.
	 * @uml.property  name="block"
	 */
	public char getBlock() {
		return block;
	}

	/**
	 * Setter of the property <tt>block</tt>
	 * @param block  The block to set.
	 * @uml.property  name="block"
	 */
	public void setBlock(char block) {
		this.block = block;
	}

}
