

public class Practical extends Subject {

	/**
	 * @uml.property  name="operatingSystem"
	 */
	private String operatingSystem;

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
	 */
	private SupportMaterial supportMaterial;

	/**
	 * Getter of the property <tt>supportMaterial</tt>
	 * @return  Returns the supportMaterial.
	 * @uml.property  name="supportMaterial"
	 */
	public SupportMaterial getSupportMaterial() {
		return supportMaterial;
	}

	/**
	 * Setter of the property <tt>supportMaterial</tt>
	 * @param supportMaterial  The supportMaterial to set.
	 * @uml.property  name="supportMaterial"
	 */
	public void setSupportMaterial(SupportMaterial supportMaterial) {
		this.supportMaterial = supportMaterial;
	}

}
