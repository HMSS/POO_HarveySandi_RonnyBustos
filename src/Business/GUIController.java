package Business;

import Enviroment.ClassRoom;
import Enviroment.Department;
import Enviroment.Professor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import Enviroment.*;

/**
 * 
 * @author Ronny
 *
 */
public class GUIController {
	
	private ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private ArrayList<Semester> semesters = new ArrayList<Semester>();
	private ArrayList<Person> users = new ArrayList<Person>();
	private ArrayList<Department> departments = new ArrayList<Department>();
	private ArrayList<TechnicalEquipment> technicalEquipment = new ArrayList<TechnicalEquipment>();
	private ArrayList<SupportMaterial> supportMaterial = new ArrayList<SupportMaterial>();
	private Person userSession;

	/**
	 * Method to add a new practical classroom to the classRooms database.
	 * @param operatingSystem Operating system installed in the machines.
	 * @param name Specific name for the classroom.
	 * @param location Specific location inside the campus.
	 * @param capacity Amount of students it can attend.
	 * @param number Number of the classroom.
	 */
	public void addClassRoom(String operatingSystem, String name,
			String location, String capacity, String number) {
		this.classRooms.add(new PracticalClassroom(name, location, Integer
				.parseInt(capacity), Integer.parseInt(number)));
	}

	/**
	 * Method to add a new theoretical classroom to the classRooms database.
	 * @param airConditioning Indicates whether it has air conditioning or not.
	 * @param multimedia Indicates whether it has multimedia equipment or not.
	 * @param name Specific name for the classroom.
	 * @param location Specific location inside the campus.
	 * @param capacity Amount of students it can attend.
	 * @param number Number of the classroom.
	 */
	public void addClassRoom(Boolean airConditioning, Boolean multimedia,
			String name, String location, String capacity, String number) {
		this.classRooms.add(new TheoreticalClassroom(airConditioning,
				multimedia, name, location, Integer.parseInt(capacity), Integer
						.parseInt(number)));
	}

	/**
	 * Method that adds a new practical subject to the subjects database.
	 * @param operatingSystem Operating system to be used in the subject.
	 * @param name name of the subject.
	 * @param credits Credits of the subject.
	 */
	public void addPracticalSubject(String operatingSystem, String name,
			String credits) {
		this.subjects.add(new Practical(operatingSystem, name, Byte
				.valueOf(credits)));
	}

	/**
	 * Method that adds a new theoretical subject to the subjects database.
	 * @param webPage Webpage of the subject.
	 * @param name Name of the subject.
	 * @param credits Credits of the subject.
	 */
	public void addTheoreticalSubject(String webPage, String name,
			String credits) {
		this.subjects.add(new Theoretical(webPage, name, Byte.valueOf(credits)));
	}

	/**
	 * Method that adds a new department to the departments database.
	 * @param name Name of the department.
	 */
	public void addDepartment(String name) {
		this.departments.add(new Department(name));
	}

	/**
	 * Method that adds a new semester to the semesters.
	 * @param number Number of the semester.
	 */
	public void addSemester(String number) {
		this.semesters.add(new Semester(Byte.valueOf(number)));
	}

	/**
	 * Method that adds a new subject to the semester.
	 * @param subject Subject to be added.
	 * @param semester Semester where the subject will be added.
	 */
	public void addSubjectToSemester(String subject, String semester) {
		searchSemester(Byte.valueOf(semester)).addSubject(searchSubject(subject));
	}
	
	/**
	 * Method that adds a new student to users database.
	 * @param identification Identification of the new student.
	 * @param name Name of the student.
	 * @param password Password to access the student
	 */
	public void addStudent(String identification, String name, String password) {
		this.users.add(new Student(identification, name, password));
	}

	/**
	 * Method that adds a new professor to users database.
	 * @param password Password to access the professor.
	 * @param identification Identification of the student.
	 * @param name Name of the student.
	 * @param department Department which professor belongs.
	 */
	public void addProfessor(String password, String identification,
			String name, String department) {
		this.users.add(new Professor(password, identification, name,
				searchDepartment(department)));
	}

	/**
	 * Method that adds a new coordinator to users database.
	 * @param password Password to access the coordinator.
	 * @param identification identification of the coordinator.
	 * @param name Name of the coordinator.
	 */
	public void addCoordinator(String password, String identification,
			String name) {
		this.users.add(new Coordinator(password, identification, name));
	}

	/**
	 * Method that assigns a new group of the subject to the professor and assigns the professor to the subject.
	 * @param professor Professor identification.
	 * @param subject Subject name.
	 * @param groupNumber Number of the group.
	 */
	public void assignGroup(String professor, String subject, String groupNumber) {
		Professor professorResult = searchProfessor(professor);
		Subject subjectResult = searchSubject(subject);
		professorResult.addGroup(searchSubject(subject),Integer.parseInt(groupNumber));
		subjectResult.addProfessor(professorResult);
	}

	/**
	 * Method that adds a new lesson to a specific professor group.
	 * @param day  Day to receive the lesson.
	 * @param begin Time to start lesson.
	 * @param end  Time  to end lesson.
	 * @param group Number of the group.
	 * @param subject Name of the subject.
	 */
	public void addLesson(String day, String begin, String end, String group, String subject) {
		((Professor) userSession).addLesson(day.charAt(0), begin.charAt(0), end.charAt(0),
				Integer.parseInt(group),subject);
	}

	/**
	 * Method that adds a new lesson to a specific professor group.
	 * @param professor Identification of the professor.
	 * @param day Day to receive the lesson.
	 * @param begin Time to start lesson.
	 * @param end Time to end lesson.
	 * @param group Number of the group.
	 * @param subject Name of the subject.
	 */
	public void addLesson(String professor, String day, String begin, String end, 
			String group, String subject) {
		searchProfessor(professor).addLesson(day.charAt(0),begin.charAt(0),end.charAt(0),
				Integer.parseInt(group),subject);
	}

	/**
	 * Method that removes one lesson.
	 * @param day Day that receive the lesson.
	 * @param begin Time that start the lesson.
	 * @param end Time of the end lesson.
	 * @param group Number of the group.
	 * @param subject Name of the subject.
	 */
	public void removeLesson(String day, String begin, String end, String group, String subject) {
		((Professor) userSession).removeLesson(day.charAt(0),begin.charAt(0),end.charAt(0),
				Integer.parseInt(group),subject);
	}
	
	/**
	 * Method that removes one lesson from a professor group.
	 * @param professor Identification of the professor
	 * @param day Day of the lesson.
	 * @param begin Time that the lesson starts.
	 * @param end Time that the lesson ends.
	 * @param group Number of the group.
	 * @param subject Name of the subject.
	 */
	public void removeLesson(String professor, String day, String begin, String end,
			String group, String subject) {
		searchProfessor(professor).removeLesson(day.charAt(0),begin.charAt(0),end.charAt(0),
				Integer.parseInt(group),subject);
	}
	
	/**
	 * Method that generate the schedule for a specified semester
	 * @param semester Number of the semester.
	 * @return Returns the errors found during the building of the schedule
	 */
	public ArrayList<String> buildSemesterSchedule(String semester) {
		return searchSemester(Byte.valueOf(semester)).buildSchedule(classRooms);
	}
	
	/**
	 * Method that adds a technical equipment to a classroom.
	 * @param technicalEquipment One or more technical equipment to add to the classroom.
	 * @param classRoom Name of the classroom.
	 */
	public void addTechnicalEquipmentToClassRoom(String[] technicalEquipment, String classRoom) {
		PracticalClassroom resultClassRoom = ((PracticalClassroom)searchClassRoom(classRoom));
		for (int t = 0; t < technicalEquipment.length; t++) {
			resultClassRoom.addTechnicalEquipment(searchTechnicalEquipment(technicalEquipment[t]));
		}
	}
	
	/**
	 * Method that adds a support material to a subject.
	 * @param supportMaterial One or more support material to add to the subject.
	 * @param subject Name of the subject.
	 */
	public void addSupportMaterialToSubject(String[] supportMaterial, String subject) {
		Practical resultSubject = ((Practical)searchSubject(subject));
		for (int s = 0; s < supportMaterial.length; s++) {
			resultSubject.addSupportMaterial(searchSupportMaterial(supportMaterial[s]));
		}
	}

	/**
	 * Method that validates an identification and password of an user.
	 * @param login Identification of the user.
	 * @param password Password of the user.
	 * @return Returns the user.
	 */
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

	/**
	 * Method that searchs for a department.
	 * @param department Name of the department.
	 * @return Returns the department.
	 */
	public Department searchDepartment(String department) {
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getName().equals(department))
				return departments.get(i);
		}
		return null;
	}

	/**
	 * Method that searchs for a classroom.
	 * @param classRoom Name of the classroom.
	 * @return Return the classroom.
	 */
	public ClassRoom searchClassRoom(String classRoom) {
		for (int i = 0; i < classRooms.size(); i++) {
			if (classRooms.get(i).getName().equals(classRoom))
				return classRooms.get(i);
		}
		return null;
	}

	/**
	 * Method that searchs for a professor by identification.
	 * @param professor Identification of the professor.
	 * @return Returns the professor.
	 */
	public Professor searchProfessor(String professor) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdentification().equals(professor))
				return (Professor) users.get(i);
		}
		return null;
	}
	
	/**
	 * Method that searchs for a professor by name.
	 * @param professor Name of the professor.
	 * @return Returns the professor.
	 */
	public Professor searchProfessorbyName(String professor) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals(professor))
				return (Professor) users.get(i);
		}
		return null;
	}

	/**
	 * Method that searchs for a semester.
	 * @param semester Number of the semester.
	 * @return Return the semester.
	 */
	public Semester searchSemester(byte semester) {
		for (int i = 0; i < semesters.size(); i++) {
			if (semesters.get(i).getNumber() == semester)
				return semesters.get(i);
		}
		return null;
	}

	/**
	 * Method that searchs for a subject.
	 * @param subject Name of the subject.
	 * @return Returns the subject.
	 */
	public Subject searchSubject(String subject) {
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getName().equals(subject))
				return subjects.get(i);
		}
		return null;
	}
	
	/**
	 * Method that searchs a technical equipment.
	 * @param technicalEquipment Name of the technical equipment.
	 * @return Returns the equipment.
	 */
	public TechnicalEquipment searchTechnicalEquipment(String technicalEquipment) {
		for (int i = 0; i < this.technicalEquipment.size(); i++) {
			if (this.technicalEquipment.get(i).getName().equals(technicalEquipment))
				return this.technicalEquipment.get(i);
		}
		return null;
	}
	
	/**
	 * Method that searchs a support material. 
	 * @param supportMaterial Name of the support material.
	 * @return Returns the support material.
	 */
	public SupportMaterial searchSupportMaterial(String supportMaterial) {
		for (int i = 0; i < this.supportMaterial.size(); i++) {
			if (this.supportMaterial.get(i).getName().equals(supportMaterial))
				return this.supportMaterial.get(i);
		}
		return null;
	}
	
	/**
	 * Method that adds new technical equipment to the database. 
	 * @param name Name of the technical equipment.
	 * @param amount Amount of the technical equipment.
	 */
	public void addTechnicalEquipment(String name, String amount) {
		this.technicalEquipment.add(new TechnicalEquipment(name,Integer.parseInt(amount)));
	}
	
	/**
	 * Method that adds a new support material to the database.
	 * @param name Name of the support material.
	 */
	public void addSupportMaterial(String name) {
		this.supportMaterial.add(new SupportMaterial(name));
	}
	
	/**
	 * Method that gets the classroom database.
	 * @return Returns the classroom database.
	 */
	public ArrayList<ClassRoom> getClassRooms() {
		return this.classRooms;
	}
	
	/**
	 * Method that gets the semester database.
	 * @return Returns the semester database.
	 */
	public ArrayList<Semester> getSemesters() {
		return this.semesters;
	}
	
	/**
	 * Method that gets the subject database.
	 * @return Returns the subject database.
	 */
	public ArrayList<Subject> getSubjects() {
		return this.subjects;
	}
	
	/**
	 * Method that gets the department database.
	 * @return Returns the department database.
	 */
	public ArrayList<Department> getDepartments() {
		return this.departments;
	}
	
	/**
	 * Method that gets the technical equipment database.
	 * @return Returns the technical equipment database.
	 */
	public ArrayList<TechnicalEquipment> getTechnicalEquipment() {
		return this.technicalEquipment;
	}
	
	/**
	 * Method that gets the support material database.
	 * @return Returns the support material database.
	 */
	public ArrayList<SupportMaterial> getSupportMaterial() {
		return this.supportMaterial;
	}
	
	/**
	 * Method that gets the users database.
	 * @return Returns the users database.
	 */
	public ArrayList<Person> getPerson(){
		return this.users;
	}

	/**
	 * Method that adds new information to the database.
	 */
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
