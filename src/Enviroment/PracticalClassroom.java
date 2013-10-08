package Enviroment;


import java.util.ArrayList;

public class PracticalClassroom extends ClassRoom {

	/**
	 * @uml.property  name="operatingSystem"
	 * @uml.property  name="technicalEquipment"
	 */
	
	private ArrayList<TechnicalEquipment> technicalEquipment = new ArrayList<TechnicalEquipment>();
	
	public PracticalClassroom(String name, String location, int capacity, int number) {
		super(name,location,capacity,number);
	}
	
	public void addTechnicalEquipment(TechnicalEquipment technicalEquipment) {
		this.technicalEquipment.add(technicalEquipment);
	}
	
}
