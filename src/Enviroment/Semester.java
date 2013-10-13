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
		String groupErrors = "";
		for (int s = 0; s < subjects.size(); s++) {
			Subject subject = subjects.get(s);
			for (int p = 0; p < subject.getProfessors().size(); p++) {
				Professor professor = subject.getProfessors().get(p);
				for (int g = 0; g < professor.getGroups().size(); g++) {
					if (professor.getGroups().get(g).getSubject().getName().equals(subject.getName())) {
						groupErrors = checkForSchedule(professor,professor.getGroups().get(g),classRooms);
						if (groupErrors.equals(""))
							continue;
						else
							errors.add(groupErrors);
					}
				}
			}
		}
		return errors;
	}
	
	private ScheduleSection verifyProfessorAvailabilityInSection(ScheduleSection section, String professorName) {
		return section.verifyProfessorAvailabilityInSection(professorName);
	}
	
	private String checkForSchedule(Professor professor, Group group, ArrayList<ClassRoom> classRooms) {
		ArrayList<String> errors = new ArrayList<String>();
		int lessonsAssigmentState = 0;
		for (int l = 0; l < group.getLessons().size(); l++) {
			Lesson lesson = group.getLessons().get(l);
			ScheduleSection sectionAvailability = verifyProfessorAvailabilityInSection(searchSection(lesson.getDay(),lesson.getBegin(),lesson.getEnd()),professor.getName());
			if (sectionAvailability != null) {
				ClassRoom availableClassRoom = checkForClassRoom(group.getSubject().getClass().getSimpleName(),classRooms,lesson.getBegin(),lesson.getEnd(),lesson.getDay());
				if (availableClassRoom != null) {
					sectionAvailability.addGroupData(availableClassRoom, professor, group.getSubject(), group.getGroupNumber());
					availableClassRoom.discardAvailability(lesson.getDay(),lesson.getBegin(),lesson.getEnd());
					if (l == group.getLessons().size() - 1) {
						if (lessonsAssigmentState == 0)
							lessonsAssigmentState = 2;
						else
							lessonsAssigmentState = 4;
					}
					else
						lessonsAssigmentState = 1;
					continue;
				}
			}
			String resultExpandSearch = expandSearch(lesson,group,classRooms,group.getSubject().getClass().getSimpleName(),professor);
			if (resultExpandSearch.equals("")) {
				if (l == group.getLessons().size() - 1) {
					if (lessonsAssigmentState == 0)
						lessonsAssigmentState = 2;
					else
						lessonsAssigmentState = 3;
				}
				else
					lessonsAssigmentState = 1;
				continue;
			}
		}
		switch (lessonsAssigmentState) {
		case 0:
			return "Ninguna de las lecciones del grupo " + group.getGroupNumber() + " de " + group.getSubject().getName() + " pudo ser asignada.";
		case 1:
			return ":La segunda lección del grupo " + group.getGroupNumber() + " de " + group.getSubject().getName() + " no pudo ser asignada.";
		case 2:
			return "La primera lección del grupo " + group.getGroupNumber() + " de " + group.getSubject().getName() + " no pudo ser asignada.";
		case 3:
			return "";
		}
		return "";
	}
	
	private String expandSearch(Lesson lesson, Group group, ArrayList<ClassRoom> classRooms, String classRoomType, Professor professor) {
		Schedule schedule = schedules.get(0);
		ArrayList<ScheduleSection> sections = schedule.getSections();
		for (int s = 0; s < sections.size(); s++) {
			ScheduleSection sectionAvailability = verifyProfessorAvailabilityInSection(sections.get(s),professor.getName());
			if (sectionAvailability != null) {
				ClassRoom availableClassRoom = checkForClassRoom(classRoomType,classRooms,sections.get(s).getBegin(),sections.get(s).getEnd(),sections.get(s).getDay());
				if (availableClassRoom != null) {
					sectionAvailability.addGroupData(availableClassRoom, professor, group.getSubject(), group.getGroupNumber());
					availableClassRoom.discardAvailability(lesson.getDay(),lesson.getBegin(),lesson.getEnd());
					return "";
				}
				else
					continue;
			}
			else
				continue;
		}
		return "error";
	}
	
	private ClassRoom checkForClassRoom(String classRoomType, ArrayList<ClassRoom> classRooms, char begin, char end, char day) {
		for (int c = 0; c < classRooms.size(); c++) {
			ClassRoom classRoom = classRooms.get(c);
			if (classRoom.getClass().getSimpleName().equals(classRoomType)) {
				if (isClassRoomAvailable(classRoom.getAvailability(),begin,end,day)) { 
					classRoom.discardAvailability(day, begin, end);
					return classRoom;
				}
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
	
	private ScheduleSection searchSection (char day, char begin, char end) {
		Schedule schedule = schedules.get(0);
		ArrayList<ScheduleSection> sections = schedule.getSections();
		for (int s = 0; s < sections.size(); s++) {
			if ((sections.get(s).getDay() == day)&&(sections.get(s).getBegin() == begin)&&(sections.get(s).getEnd() == end))
				return sections.get(s);
		}
		return null;
	}
}
