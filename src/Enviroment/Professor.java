package Enviroment;


import java.util.Collection;
import java.util.Iterator;

public class Professor extends Person {

	/**
	 * @uml.property  name="schedule"
	 * @uml.associationEnd  inverse="professor:Enviroment.Schedule"
	 */
	private Schedule schedule;

	/**
	 * Getter of the property <tt>schedule</tt>
	 * @return  Returns the schedule.
	 * @uml.property  name="schedule"
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * Setter of the property <tt>schedule</tt>
	 * @param schedule  The schedule to set.
	 * @uml.property  name="schedule"
	 */
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	/**
	 * @uml.property  name="department"
	 * @uml.associationEnd  inverse="professor:Enviroment.Department"
	 */
	private Department department;

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

	/**
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="professor:Subject"
	 */

}
