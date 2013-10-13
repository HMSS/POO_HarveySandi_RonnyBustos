package Enviroment;

public class ScheduleSection {
	
	char begin, end, day;
	ClassRoom classroom;
	Subject subject;
	Professor professor;
	int group;
	
	public ScheduleSection(char day, char begin, char end, ClassRoom classRoom, Subject subject, Professor professor, int group) {
		this.day = day;
		this.begin = begin;
		this.end = end;
		this.classroom = classRoom;
		this.subject = subject;
		this.professor = professor;
		this.group = group;
	}
}
