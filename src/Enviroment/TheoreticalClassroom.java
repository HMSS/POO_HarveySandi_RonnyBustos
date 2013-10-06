package Enviroment;


public class TheoreticalClassroom extends ClassRoom {

	/**
	 * @uml.property  name="airConditioning"
	 */
	private Boolean airConditioning;
	
	public TheoreticalClassroom(Boolean airConditioning, Boolean multimedia, String name, String location, int capacity, int number) {
		super(name,location,capacity,number);
		this.airConditioning = airConditioning;
		this.multimedia = multimedia;
	}

	/**
	 * Getter of the property <tt>airConditioning</tt>
	 * @return  Returns the airConditioning.
	 * @uml.property  name="airConditioning"
	 */
	public Boolean isAirConditioning() {
		return airConditioning;
	}

	/**
	 * Setter of the property <tt>airConditioning</tt>
	 * @param airConditioning  The airConditioning to set.
	 * @uml.property  name="airConditioning"
	 */
	public void setAirConditioning(Boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	/**
	 * @uml.property  name="multimedia"
	 */
	private boolean multimedia;

	/**
	 * Getter of the property <tt>multimedia</tt>
	 * @return  Returns the multimedia.
	 * @uml.property  name="multimedia"
	 */
	public boolean isMultimedia() {
		return multimedia;
	}

	/**
	 * Setter of the property <tt>multimedia</tt>
	 * @param multimedia  The multimedia to set.
	 * @uml.property  name="multimedia"
	 */
	public void setMultimedia(boolean multimedia) {
		this.multimedia = multimedia;
	}

}
