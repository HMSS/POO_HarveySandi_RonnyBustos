package Enviroment;

import java.util.ArrayList;

public class Schedule {
	
	private ArrayList<ScheduleSection> sections = new ArrayList<ScheduleSection>();

	public Schedule() {
		initialize();
	}
	
	public void initialize() {
		char[] days = new char[] { 'L','K','M','J','V' };
		char[] blocks = new char[] { 'A','B','C','D','E','F','G','H','I','J','K','L','M' };
		for (int i = 0; i < days.length; i++) {
			for (int a = 0; a < blocks.length; a++) {
				if (a == 4) {
					continue;
				}
				else if (a < 4) {
					this.sections.add(new ScheduleSection(days[i],blocks[a],blocks[a+1]));
				}
				else {
					this.sections.add(new ScheduleSection(days[i],blocks[a],blocks[a+1]));
					a++;
				}
			}
		}
	}
	
	public void addGroupLessonToSection(char day, char begin, char end, int group, Professor professor, Subject subject, ClassRoom classRoom) {
		for (int s = 0; s < sections.size(); s++) {
			if ((sections.get(s).getBegin() == begin)&&(sections.get(s).getEnd() == end)&&(sections.get(s).getDay() == day)) {
				sections.get(s).addGroupData(classRoom, professor, subject, group);
				break;
			}
		}
	}
	
	public ArrayList<ScheduleSection> getSections() {
		return this.sections;
	}
}
