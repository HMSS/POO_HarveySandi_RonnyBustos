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
			String credits, String professor, String classRoom) {
		this.subjects.add(new Practical(operatingSystem, name, Byte
				.valueOf(credits), searchClassRoom(classRoom)));
	}

	public void addTheoreticalSubject(String webPage, String name,
			String credits, String professor, String classRoom) {
		this.subjects.add(new Theoretical(webPage, name, Byte.valueOf(credits),
				searchClassRoom(classRoom)));
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
			String name, String department) {
		this.users.add(new Coordinator(password, identification, name));
	}

	public void addSubject(String semester, String subject) {
		searchSemester(Byte.valueOf(semester)).addSubject(
				searchSubject(subject));
	}

	public void assignGroup(String professor, String subject) {
		Professor professorResult = searchProfessor(professor);
		Subject subjectResult = searchSubject(subject);
		professorResult.addGroup(searchSubject(subject));
		subjectResult.addProfessor(professorResult);
	}

	public void addLesson(String day, String block, String group) {
		((Professor) userSession).addLesson(day.charAt(0), block.charAt(0),
				Integer.parseInt(group));
	}

	public void addLesson(String professor, String day, String block,
			String group) {
		searchProfessor(professor).addLesson(day.charAt(0), block.charAt(0),
				Integer.parseInt(group));
	}

	public void removeLesson(String day, String block, String group) {
		((Professor) userSession).removeLesson(day.charAt(0), block.charAt(0),
				Integer.parseInt(group));
	}

	public void removeLesson(String professor, String day, String block,
			String group) {
		searchProfessor(professor).removeLesson(day.charAt(0), block.charAt(0),
				Integer.parseInt(group));
	}

	public void clearSemester(int semester) {

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

}
