

public class Lesson {

	/** 
	 * Getter of the property <tt>Start</tt>
	 * @return  Returns the start.
	 * @uml.property  name="start"
	 */
	public byte getStart() {
		return start1;
	}

	/** 
	 * Setter of the property <tt>Start</tt>
	 * @param Start  The start to set.
	 * @uml.property  name="start"
	 */
	public void setStart(byte start) {
		start1 = start;
	}

	/** 
	 * Getter of the property <tt>End</tt>
	 * @return  Returns the end.
	 * @uml.property  name="end"
	 */
	public byte getEnd() {
		return end1;
	}

	/** 
	 * Setter of the property <tt>End</tt>
	 * @param End  The end to set.
	 * @uml.property  name="end"
	 */
	public void setEnd(byte end) {
		end1 = end;
	}

	/**
	 * @uml.property  name="day"
	 */
	private char day;

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
	 * @uml.property  name="start"
	 */
	private byte start1;
	/**
	 * @uml.property  name="end"
	 */
	private byte end1;

}
