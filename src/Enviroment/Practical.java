package Enviroment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Practical extends Subject {

	/**
	 * @uml.property  name="operatingSystem"
	 */
	private String operatingSystem;
	
	public Practical(String operatingSystem, String name, byte credits, ClassRoom classRoom) {
		super(name,credits,classRoom);
		this.operatingSystem = operatingSystem;
	}

	/**
	 * Getter of the property <tt>operatingSystem</tt>
	 * @return  Returns the operatingSystem.
	 * @uml.property  name="operatingSystem"
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * Setter of the property <tt>operatingSystem</tt>
	 * @param operatingSystem  The operatingSystem to set.
	 * @uml.property  name="operatingSystem"
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @uml.property  name="supportMaterial"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="practical:Enviroment.SupportMaterial"
	 */
	private ArrayList<SupportMaterial> supportMaterial = new ArrayList<SupportMaterial>();

}
