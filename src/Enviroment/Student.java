package Enviroment;


public class Student extends Person {

	/**
	 * @uml.property  name="pin"
	 */
	private int pin;

	/**
	 * Getter of the property <tt>pin</tt>
	 * @return  Returns the pin.
	 * @uml.property  name="pin"
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * Setter of the property <tt>pin</tt>
	 * @param pin  The pin to set.
	 * @uml.property  name="pin"
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

}
