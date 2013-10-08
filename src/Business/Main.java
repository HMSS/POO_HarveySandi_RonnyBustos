package Business;

import Enviroment.ClassRoom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import Enviroment.*;


public class Main {

	/**
	 * @uml.property  name="classRooms"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="main:Enviroment.ClassRoom"
	 * @uml.property  name="semesters"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="main:Enviroment.Semester"
	 * @uml.property  name="users"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="main:Enviroment.Person"
	 * @uml.property  name="subjects"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="main:Enviroment.Subject"
	 */
	private ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private ArrayList<Semester> semesters = new ArrayList<Semester>();
	private ArrayList<Person> users = new ArrayList<Person>();
	
	public void addClassRoom(String operatingSystem, String name, String location, int capacity, int number) {
		this.classRooms.add(new PracticalClassroom(name,location,capacity,number));
	}
	
	public void addClassRoom(Boolean airConditioning, Boolean multimedia, String name, String location, int capacity, int number) {
		this.classRooms.add(new TheoreticalClassroom(airConditioning,multimedia,name,location,capacity,number));
	}
	
	public void addSubject() {
		
	}
}
