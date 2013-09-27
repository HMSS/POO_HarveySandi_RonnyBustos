

import java.util.Collection;
import java.util.Iterator;

public class Schedule {

	/**
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="suggestedSchedule:Subject"
	 */
	private Subject subject = null;

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

	/**
	 * @uml.property  name="schedule"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="suggestedSchedule:Schedule"
	 */
	private Collection schedule;

	/**
	 * Getter of the property <tt>schedule</tt>
	 * @return  Returns the schedule.
	 * @uml.property  name="schedule"
	 */
	public Collection getSchedule() {
		return schedule;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="schedule"
	 */
	public Iterator scheduleIterator() {
		return schedule.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="schedule"
	 */
	public boolean isScheduleEmpty() {
		return schedule.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="schedule"
	 */
	public boolean containsSchedule(Lesson schedule) {
		return this.schedule.contains(schedule);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="schedule"
	 */
	public boolean containsAllSchedule(Collection schedule) {
		return this.schedule.containsAll(schedule);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="schedule"
	 */
	public int scheduleSize() {
		return schedule.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="schedule"
	 */
	public Lesson[] scheduleToArray() {
		return (Lesson[]) schedule.toArray(new Lesson[schedule.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="schedule"
	 */
	public Lesson[] scheduleToArray(Lesson[] schedule) {
		return (Lesson[]) this.schedule.toArray(schedule);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="schedule"
	 */
	public boolean addSchedule(Lesson schedule) {
		return this.schedule.add(schedule);
	}

	/**
	 * Setter of the property <tt>schedule</tt>
	 * @param schedule  the schedule to set.
	 * @uml.property  name="schedule"
	 */
	public void setSchedule(Collection schedule) {
		this.schedule = schedule;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="schedule"
	 */
	public boolean removeSchedule(Lesson schedule) {
		return this.schedule.remove(schedule);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="schedule"
	 */
	public void clearSchedule() {
		this.schedule.clear();
	}

	/**
	 * @uml.property  name="lesson"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="schedule1:Lesson"
	 */
	private Collection lesson;

	/**
	 * Getter of the property <tt>lesson</tt>
	 * @return  Returns the lesson.
	 * @uml.property  name="lesson"
	 */
	public Collection getLesson() {
		return lesson;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="lesson"
	 */
	public Iterator lessonIterator() {
		return lesson.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="lesson"
	 */
	public boolean isLessonEmpty() {
		return lesson.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="lesson"
	 */
	public boolean containsLesson(Lesson lesson) {
		return this.lesson.contains(lesson);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="lesson"
	 */
	public boolean containsAllLesson(Collection lesson) {
		return this.lesson.containsAll(lesson);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="lesson"
	 */
	public int lessonSize() {
		return lesson.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="lesson"
	 */
	public Lesson[] lessonToArray() {
		return (Lesson[]) lesson.toArray(new Lesson[lesson.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="lesson"
	 */
	public Lesson[] lessonToArray(Lesson[] lesson) {
		return (Lesson[]) this.lesson.toArray(lesson);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesson"
	 */
	public boolean addLesson(Lesson lesson) {
		return this.lesson.add(lesson);
	}

	/**
	 * Setter of the property <tt>lesson</tt>
	 * @param lesson  the lesson to set.
	 * @uml.property  name="lesson"
	 */
	public void setLesson(Collection lesson) {
		this.lesson = lesson;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesson"
	 */
	public boolean removeLesson(Lesson lesson) {
		return this.lesson.remove(lesson);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="lesson"
	 */
	public void clearLesson() {
		this.lesson.clear();
	}

}
