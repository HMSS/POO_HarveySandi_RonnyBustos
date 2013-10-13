package Enviroment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Professor extends Person {

	/** 
	 * @uml.property name="schedule"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="professor:Enviroment.Schedule"
	 * @uml.property  name="department"
	 * @uml.associationEnd  inverse="professor:Enviroment.Department"
	 */
	private ArrayList<Group> groups = new ArrayList<Group>();
	private Department department;
	
	public Professor(String password, String identification, String name, Department department) {
		super(password,identification,name);
		this.department = department;
	}

	/**
	 * Getter of the property <tt>department</tt>
	 * @return  Returns the department.
	 * @uml.property  name="department"
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * Setter of the property <tt>department</tt>
	 * @param department  The department to set.
	 * @uml.property  name="department"
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void addGroup(Subject subject, int groupNumber) {
		this.groups.add(new Group(subject,groupNumber));
	}
	
	public void addLesson(char day, char begin, char end, int group, String subject) {
		for (int i = 0; i < groups.size(); i++) {
			if ((groups.get(i).getGroupNumber() == group)&&(groups.get(i).getSubject().getName().equals(subject)))
				groups.get(i).addLesson(new Lesson(day,begin,end));
		}
	}
	
	public void removeLesson(char day, char begin, char end, int group, String subject) {
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupNumber() == group&&(groups.get(i).getSubject().getName().equals(subject)))
				groups.get(i).removeLesson(day,begin,end);
		}
	}
	
	public ArrayList<Group> getGroups() {
		return this.groups;
	}
	
}
