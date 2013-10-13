package Enviroment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Group {

	/**
	 * @uml.property  name="lesson"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="schedule:Enviroment.Lesson"
	 * @uml.property  name="subject"
	 */
	private ArrayList<Lesson> lessons = new ArrayList<Lesson>();
	private Subject subject;
	private int groupNumber;
	
	public Group(Subject subject) {
		this.subject = subject;
	}

	/**
	 * Getter of the property <tt>subject</tt>
	 * @return  Returns the subject.
	 * @uml.property  name="subject"
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * Setter of the property <tt>subject</tt>
	 * @param subject  The subject to set.
	 * @uml.property  name="subject"
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void addLesson(Lesson lesson) {
		this.lessons.add(lesson);
	}
	
	public void removeLesson(char day, char block) {
		for (int i = 0; i < lessons.size(); i++) {
			if ((lessons.get(i).getDay() == day)&&(lessons.get(i).getBlock() == block))
				lessons.remove(i);
		}
	}
	
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public int getGroupNumber() {
		return this.groupNumber;
	}

}
