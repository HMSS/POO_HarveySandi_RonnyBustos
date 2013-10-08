package Enviroment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Semester {

	/**
	 * @uml.property  name="number"
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="semester:Enviroment.Subject"
	 */
	private byte number;
	private ArrayList<Subject> subjects = new ArrayList<Subject>();

	/** 
	 * Getter of the property <tt>numeroSemestre</tt>
	 * @return  Returns the numeroSemestre.
	 * @uml.property  name="number"
	 */
	public byte getNumber() {
		return number;
	}

	/** 
	 * Setter of the property <tt>numeroSemestre</tt>
	 * @param numeroSemestre  The numeroSemestre to set.
	 * @uml.property  name="number"
	 */
	public void setNumber(byte number) {
		this.number = number;
	}

}
