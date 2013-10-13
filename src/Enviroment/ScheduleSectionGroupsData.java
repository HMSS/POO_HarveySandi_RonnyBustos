package Enviroment;

public class ScheduleSectionGroupsData {

	private ClassRoom classroom = null;
	private Subject subject = null;
	private Professor professor = null;
	private int group = 0;
	
	public ScheduleSectionGroupsData(ClassRoom classRoom, Professor professor, Subject subject, int group) {
		this.classroom = classRoom;
		this.professor = professor;
		this.subject = subject;
		this.group = group;
	}
	
	public ClassRoom getClassRoom() {
		return this.classroom;
	}
	
	public Subject getSubject() {
		return this.subject;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public int getGroup() {
		return this.group;
	}
}
