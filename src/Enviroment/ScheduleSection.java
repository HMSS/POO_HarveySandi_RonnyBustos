package Enviroment;

import java.util.ArrayList;

public class ScheduleSection {
	
	char begin, end, day;
	ArrayList<ScheduleSectionGroupsData> groups = new ArrayList<ScheduleSectionGroupsData>();
	
	public ScheduleSection(char day, char begin, char end) {
		this.day = day;
		this.begin = begin;
		this.end = end;
	}
	
	public void addGroupData(ClassRoom classRoom, Professor professor, Subject subject, int group) {
		this.groups.add(new ScheduleSectionGroupsData(classRoom,professor,subject,group));
	}
	
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
	 * Getter of the property <tt>block</tt>
	 * @return  Returns the block.
	 * @uml.property  name="block"
	 */
	public char getBegin() {
		return begin;
	}

	/**
	 * Setter of the property <tt>block</tt>
	 * @param block  The block to set.
	 * @uml.property  name="block"
	 */
	public void setBegin(char begin) {
		this.begin = begin;
	}
	
	public char getEnd() {
		return end;
	}

	/**
	 * Setter of the property <tt>block</tt>
	 * @param block  The block to set.
	 * @uml.property  name="block"
	 */
	public void setEnd(char end) {
		this.end = end;
	}
	
	public ScheduleSection verifyProfessorAvailabilityInSection(String professorName) {
		for (int g = 0; g < groups.size(); g++) {
			if (groups.get(g).getProfessor().getName().equals(professorName))
				return null;
		}
		return this;
	}
}
