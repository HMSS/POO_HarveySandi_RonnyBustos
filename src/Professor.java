

import java.util.Collection;
import java.util.Iterator;

public class Professor extends Person {

	/** 
	 * @uml.property name="department"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="professor:Department"
	 */
	private Department department = null;

	/** 
	 * Getter of the property <tt>department</tt>
	 * @return  Returns the department.
	 * @uml.property  name="department"
	 */
	public Department getDepartment() {
		return department;
	}

	/** 
	 * Setter of the property <tt>department</tt>
	 * @param department  The department to set.
	 * @uml.property  name="department"
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="professor:Subject"
	 */
	private Collection subject;

	/**
	 * Getter of the property <tt>subject</tt>
	 * @return  Returns the subject.
	 * @uml.property  name="subject"
	 */
	public Collection getSubject() {
		return subject;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="subject"
	 */
	public Iterator subjectIterator() {
		return subject.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="subject"
	 */
	public boolean isSubjectEmpty() {
		return subject.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="subject"
	 */
	public boolean containsSubject(Subject subject) {
		return this.subject.contains(subject);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="subject"
	 */
	public boolean containsAllSubject(Collection subject) {
		return this.subject.containsAll(subject);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="subject"
	 */
	public int subjectSize() {
		return subject.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="subject"
	 */
	public Subject[] subjectToArray() {
		return (Subject[]) subject.toArray(new Subject[subject.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="subject"
	 */
	public Subject[] subjectToArray(Subject[] subject) {
		return (Subject[]) this.subject.toArray(subject);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="subject"
	 */
	public boolean addSubject(Subject subject) {
		return this.subject.add(subject);
	}

	/**
	 * Setter of the property <tt>subject</tt>
	 * @param subject  the subject to set.
	 * @uml.property  name="subject"
	 */
	public void setSubject(Collection subject) {
		this.subject = subject;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="subject"
	 */
	public boolean removeSubject(Subject subject) {
		return this.subject.remove(subject);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="subject"
	 */
	public void clearSubject() {
		this.subject.clear();
	}

	/** 
	 * @uml.property name="suggestedSchedule"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="professor:Schedule"
	 */
	private Collection suggestedSchedule;

	/** 
	 * Getter of the property <tt>suggestedSchedule</tt>
	 * @return  Returns the suggestedSchedule.
	 * @uml.property  name="suggestedSchedule"
	 */
	public Collection getSuggestedSchedule() {
		return suggestedSchedule;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="suggestedSchedule"
	 */
	public Iterator suggestedScheduleIterator() {
		return suggestedSchedule.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="suggestedSchedule"
	 */
	public boolean isSuggestedScheduleEmpty() {
		return suggestedSchedule.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="suggestedSchedule"
	 */
	public boolean containsSuggestedSchedule(Schedule schedule) {
		return suggestedSchedule.contains(schedule);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="suggestedSchedule"
	 */
	public boolean containsAllSuggestedSchedule(Collection suggestedSchedule) {
		return this.suggestedSchedule.containsAll(suggestedSchedule);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="suggestedSchedule"
	 */
	public int suggestedScheduleSize() {
		return suggestedSchedule.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="suggestedSchedule"
	 */
	public Schedule[] suggestedScheduleToArray() {
		return (Schedule[]) suggestedSchedule
				.toArray(new Schedule[suggestedSchedule.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="suggestedSchedule"
	 */
	public Schedule[] suggestedScheduleToArray(Schedule[] suggestedSchedule) {
		return (Schedule[]) this.suggestedSchedule.toArray(suggestedSchedule);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="suggestedSchedule"
	 */
	public boolean addSuggestedSchedule(Schedule schedule) {
		return suggestedSchedule.add(schedule);
	}

	/** 
	 * Setter of the property <tt>suggestedSchedule</tt>
	 * @param suggestedSchedule  The suggestedSchedule to set.
	 * @uml.property  name="suggestedSchedule"
	 */
	public void setSuggestedSchedule(Collection suggestedSchedule) {
		this.suggestedSchedule = suggestedSchedule;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="suggestedSchedule"
	 */
	public boolean removeSuggestedSchedule(Schedule schedule) {
		return suggestedSchedule.remove(schedule);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="suggestedSchedule"
	 */
	public void clearSuggestedSchedule() {
		suggestedSchedule.clear();
	}

	/**
	 * @uml.property  name="establishedSchedule"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="professor:Schedule"
	 */
	private Collection establishedSchedule;

	/**
	 * Getter of the property <tt>establishedSchedule</tt>
	 * @return  Returns the establishedSchedule.
	 * @uml.property  name="establishedSchedule"
	 */
	public Collection getEstablishedSchedule() {
		return establishedSchedule;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="establishedSchedule"
	 */
	public Iterator establishedScheduleIterator() {
		return establishedSchedule.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="establishedSchedule"
	 */
	public boolean isEstablishedScheduleEmpty() {
		return establishedSchedule.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="establishedSchedule"
	 */
	public boolean containsEstablishedSchedule(Schedule schedule) {
		return establishedSchedule.contains(schedule);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="establishedSchedule"
	 */
	public boolean containsAllEstablishedSchedule(Collection establishedSchedule) {
		return this.establishedSchedule.containsAll(establishedSchedule);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="establishedSchedule"
	 */
	public int establishedScheduleSize() {
		return establishedSchedule.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="establishedSchedule"
	 */
	public Schedule[] establishedScheduleToArray() {
		return (Schedule[]) establishedSchedule
				.toArray(new Schedule[establishedSchedule.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="establishedSchedule"
	 */
	public Schedule[] establishedScheduleToArray(Schedule[] establishedSchedule) {
		return (Schedule[]) this.establishedSchedule
				.toArray(establishedSchedule);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="establishedSchedule"
	 */
	public boolean addEstablishedSchedule(Schedule schedule) {
		return establishedSchedule.add(schedule);
	}

	/**
	 * Setter of the property <tt>establishedSchedule</tt>
	 * @param establishedSchedule  the establishedSchedule to set.
	 * @uml.property  name="establishedSchedule"
	 */
	public void setEstablishedSchedule(Collection establishedSchedule) {
		this.establishedSchedule = establishedSchedule;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="establishedSchedule"
	 */
	public boolean removeEstablishedSchedule(Schedule schedule) {
		return establishedSchedule.remove(schedule);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="establishedSchedule"
	 */
	public void clearEstablishedSchedule() {
		establishedSchedule.clear();
	}

		
		/**
		 */
		public void test(){
		}

}
