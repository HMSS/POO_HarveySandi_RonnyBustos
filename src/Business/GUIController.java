package Business;

import Enviroment.ClassRoom;
import Enviroment.Department;
import Enviroment.Professor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import Enviroment.*;

public class GUIController {

	/**
	 * @uml.property name="classRooms"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 *                     inverse="main:Enviroment.ClassRoom"
	 * @uml.property name="semesters"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 *                     inverse="main:Enviroment.Semester"
	 * @uml.property name="users"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 *                     inverse="main:Enviroment.Person"
	 * @uml.property name="subjects"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 *                     inverse="main:Enviroment.Subject"
	 */
	private ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private ArrayList<Semester> semesters = new ArrayList<Semester>();
	private ArrayList<Person> users = new ArrayList<Person>();
	private ArrayList<Department> departments = new ArrayList<Department>();
	private Person userSession;

	public void addClassRoom(String operatingSystem, String name,
			String location, String capacity, String number) {
		this.classRooms.add(new PracticalClassroom(name, location, Integer
				.parseInt(capacity), Integer.parseInt(number)));
	}

	public void addClassRoom(Boolean airConditioning, Boolean multimedia,
			String name, String location, String capacity, String number) {
		this.classRooms.add(new TheoreticalClassroom(airConditioning,
				multimedia, name, location, Integer.parseInt(capacity), Integer
						.parseInt(number)));
	}

	public void addPracticalSubject(String operatingSystem, String name,
			String credits) {
		this.subjects.add(new Practical(operatingSystem, name, Byte
				.valueOf(credits)));
	}

	public void addTheoreticalSubject(String webPage, String name,
			String credits) {
		this.subjects.add(new Theoretical(webPage, name, Byte.valueOf(credits)));
	}

	public void addDepartment(String name) {
		this.departments.add(new Department(name));
	}

	public void addSemester(String number) {
		this.semesters.add(new Semester(Byte.valueOf(number)));
	}

	public void addSubjectToSemester(String subject, String semester) {
		searchSemester(Byte.valueOf(semester)).addSubject(searchSubject(subject));
	}

	public void addStudent(String identification, String name, String password) {
		this.users.add(new Student(identification, name, password));
	}

	public void addProfessor(String password, String identification,
			String name, String department) {
		this.users.add(new Professor(password, identification, name,
				searchDepartment(department)));
	}

	public void addCoordinator(String password, String identification,
			String name) {
		this.users.add(new Coordinator(password, identification, name));
	}

	public void assignGroup(String professor, String subject, String groupNumber) {
		Professor professorResult = searchProfessor(professor);
		Subject subjectResult = searchSubject(subject);
		professorResult.addGroup(searchSubject(subject),Integer.parseInt(groupNumber));
		subjectResult.addProfessor(professorResult);
	}

	public void addLesson(String day, String begin, String end, String group, String subject) {
		((Professor) userSession).addLesson(day.charAt(0), begin.charAt(0), end.charAt(0),
				Integer.parseInt(group),subject);
	}

	public void addLesson(String professor, String day, String begin, String end, 
			String group, String subject) {
		searchProfessor(professor).addLesson(day.charAt(0),begin.charAt(0),end.charAt(0),
				Integer.parseInt(group),subject);
	}

	public void removeLesson(String day, String begin, String end, String group, String subject) {
		((Professor) userSession).removeLesson(day.charAt(0),begin.charAt(0),end.charAt(0),
				Integer.parseInt(group),subject);
	}

	public void removeLesson(String professor, String day, String begin, String end,
			String group, String subject) {
		searchProfessor(professor).removeLesson(day.charAt(0),begin.charAt(0),end.charAt(0),
				Integer.parseInt(group),subject);
	}

	public void clearSemester(String semester) {

	}
	
	public ArrayList<String> buildSemesterSchedule(String semester) {
		return searchSemester(Byte.valueOf(semester)).buildSchedule(classRooms);
	}

	public Person login(String login, String password) {
		for (int i = 0; i < users.size(); i++) {
			if ((users.get(i).getIdentification().equals(login))
					&& (users.get(i).getPassword().equals(password))) {
				this.userSession = users.get(i);
				return users.get(i);
			}
		}
		return null;
	}

	public Department searchDepartment(String department) {
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getName().equals(department))
				return departments.get(i);
		}
		return null;
	}

	public ClassRoom searchClassRoom(String classRoom) {
		for (int i = 0; i < classRooms.size(); i++) {
			if (classRooms.get(i).getName().equals(classRoom))
				return classRooms.get(i);
		}
		return null;
	}

	public Professor searchProfessor(String professor) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdentification().equals(professor))
				return (Professor) users.get(i);
		}
		return null;
	}

	public Semester searchSemester(byte semester) {
		for (int i = 0; i < semesters.size(); i++) {
			if (semesters.get(i).getNumber() == semester)
				return semesters.get(i);
		}
		return null;
	}

	public Subject searchSubject(String subject) {
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getName().equals(subject))
				return subjects.get(i);
		}
		return null;
	}

	public void initialize() {
		this.addClassRoom("Windows", "Prac1", "Este", "30", "1");
		this.addClassRoom("Windows", "Prac2", "Este", "30", "2");
		this.addClassRoom("Linux", "Prac3", "Este", "30", "3");
		this.addClassRoom("Linux", "Prac4", "Este", "30", "4");
		this.addClassRoom(true, true, "Theo1", "Sur", "25", "5");
		this.addClassRoom(true, true, "Theo2", "Sur", "25", "6");
		this.addClassRoom(true, true, "Theo3", "Sur", "25", "7");
		this.addClassRoom(true, true, "Theo4", "Sur", "25", "8");
		this.addDepartment("Computación");
		this.addDepartment("Ciencias y Letras");
		this.addProfessor("12345", "206890680", "Ronny", "Computación");
		this.addProfessor("12345", "206890681", "Libardo", "Computación");
		this.addProfessor("12345", "206890682", "Harvey", "Computación");
		this.addProfessor("12345", "206890683", "Mauricio", "Computación");
		this.addProfessor("12345", "206890684", "Leonardo", "Computación");
		this.addProfessor("12345", "206890685", "Óscar", "Computación");
		this.addProfessor("12345", "206890686", "Lorena", "Computación");
		this.addCoordinator("123456", "206890684", "Leonardo");
		this.addPracticalSubject("Windows", "PracS1", "4");
		this.addPracticalSubject("MAC", "PracS2", "4");
		this.addPracticalSubject("Windows", "PracS3", "4");
		this.addTheoreticalSubject("http://www.myTheoreticalSubject1.com", "TheoS1", "4");
		this.addTheoreticalSubject("http://www.myTheoreticalSubject2.com", "TheoS2", "4");
		this.addTheoreticalSubject("http://www.myTheoreticalSubject3.com", "TheoS3", "4");
		this.addSemester("1");
		this.addSemester("2");
		this.addSemester("3");
		this.addSubjectToSemester("PracS1", "1");
		this.addSubjectToSemester("PracS2", "1");
		this.addSubjectToSemester("PracS3", "1");
		this.addSubjectToSemester("TheoS1", "1");
		this.addSubjectToSemester("TheoS2", "1");
		this.addSubjectToSemester("TheoS3", "1");
		this.assignGroup("206890680", "PracS1", "1");
		this.assignGroup("206890680", "PracS1", "2");
		this.assignGroup("206890681", "PracS2", "1");
		this.assignGroup("206890681", "TheoS2", "1");
		this.assignGroup("206890682", "PracS2", "2");
		this.assignGroup("206890682", "PracS1", "3");
		this.assignGroup("206890686", "PracS3", "1");
		this.assignGroup("206890686", "TheoS1", "1");
		this.assignGroup("206890685", "TheoS1", "2");
		this.assignGroup("206890685", "TheoS3", "1");
		this.assignGroup("206890685", "PracS2", "3");
		this.addLesson("206890680", "L", "A", "B", "1", "PracS1");
		this.addLesson("206890680", "K", "B", "C", "1", "PracS1");
		this.addLesson("206890680", "M", "A", "B", "2", "PracS1");
		this.addLesson("206890680", "M", "B", "C", "2", "PracS1");
		this.addLesson("206890681", "L", "A", "B", "1", "PracS2");
		this.addLesson("206890681", "L", "B", "C", "1", "PracS2");
		this.addLesson("206890681", "M", "C", "D", "1", "TheoS2");
		this.addLesson("206890681", "K", "C", "D", "1", "TheoS2");
		this.addLesson("206890682", "L", "A", "B", "2", "PracS2");
		this.addLesson("206890682", "K", "B", "C", "2", "PracS2");
		this.addLesson("206890682", "L", "A", "B", "3", "PracS1");
		this.addLesson("206890682", "M", "B", "C", "3", "PracS1");
		this.addLesson("206890686", "L", "A", "B", "1", "PracS3");
		this.addLesson("206890686", "M", "B", "C", "1", "PracS3");
		this.addLesson("206890686", "M", "A", "B", "1", "TheoS1");
		this.addLesson("206890686", "V", "A", "B", "1", "TheoS1");
		this.addLesson("206890685", "M", "B", "C", "2", "TheoS1");
		this.addLesson("206890685", "K", "B", "C", "2", "TheoS1");
		this.addLesson("206890685", "M", "B", "C", "1", "TheoS3");
		this.addLesson("206890685", "J", "B", "C", "1", "TheoS3");
		this.addLesson("206890685", "L", "A", "B", "3", "PracS2");
		this.addLesson("206890685", "M", "B", "C", "3", "PracS2");
	}
}
