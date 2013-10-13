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
	private ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	
	public Semester(byte number) {
		this.number = number;
	}

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
	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public void removeSubject(String subject) {
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getName().equals(subject))
				subjects.remove(i);
		}
	}
	
	public ArrayList<String> buildSchedule(ArrayList<ClassRoom> classRooms) {
		this.schedules.add(new Schedule());
		ArrayList<String> errors = new ArrayList<String>();
		for (int s = 0; s < subjects.size(); s++) {
			Subject subject = subjects.get(s);
			for (int p = 0; p < subject.getProfessors().size(); p++) {
				Professor professor = subject.getProfessors().get(p);
				for (int g = 0; g < professor.getGroups().size(); g++) {
					if (professor.getGroups().get(g).getSubject().getName().equals(subject.getName())) {
						errors = checkForSchedule(professor.getGroups().get(g),classRooms);
						if (resultCheckForSchedule.equals(""))
							continue;
						else
							errors.add(resultCheckForSchedule);
					}	
				}
			}
		}
		return errors;
	}
	
	private boolean verifySectionAvailability(char begin, char end, char day) {
		return true;
	}
	
	private ArrayList<String> checkForSchedule(Group group, ArrayList<ClassRoom> classRooms) {
		ArrayList<String> errors = new ArrayList<String>();
		for (int l = 0; l < group.getLessons().size(); l++) {
			Lesson lesson = group.getLessons().get(l);
			if (verifySectionAvailability(lesson.getBegin(),lesson.getEnd(),lesson.getDay())) {
				if (checkForClassRoom(group.getSubject().getClass().getSimpleName(),classRooms,lesson.getBegin(),lesson.getEnd(),lesson.getDay()) == null) {
					String resultExpandSearch = expandSearch(classRooms);
					if (resultExpandSearch.equals(""))
						continue;
					else
						errors.add(resultExpandSearch);
				}
				else
					continue;
			}
			String resultExpandSearch = expandSearch(classRooms);
			if (resultExpandSearch.equals(""))
				continue;
			else
				errors.add(resultExpandSearch);
		}
		return null;
	}
	
	private ClassRoom checkForClassRoom(String classRoomType, ArrayList<ClassRoom> classRooms, char begin, char end, char day) {
		for (int c = 0; c < classRooms.size(); c++) {
			ClassRoom classRoom = classRooms.get(0);
			if (classRoom.getClass().getSimpleName().equals(classRoomType)) {
				if (isClassRoomAvailable(classRoom.getAvailability(),begin,end,day)) 
					return classRoom;
				else
					continue;
			}
		}
		return null;
	}
	
	private boolean isClassRoomAvailable(ArrayList<Lesson> availability, char begin, char end, char day) {
		for (int a = 0; a < availability.size(); a++) {
			Lesson sectionAvailable = availability.get(a);
			if ((sectionAvailable.getDay() == day)&&(sectionAvailable.getBegin() == begin)&&(sectionAvailable.getEnd() == end))
				return true;
			else
				continue;
			
		}
		return false;
	}
	
	private String expandSearch(ArrayList<ClassRoom> classRooms) {
		return "";
	}
}
