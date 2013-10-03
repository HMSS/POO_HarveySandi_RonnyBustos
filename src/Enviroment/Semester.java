package Enviroment;


import java.util.Collection;
import java.util.Iterator;

public class Semester {

	/**
	 * @uml.property  name="number"
	 */
	private byte number;

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

	/**
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="semester:Enviroment.Subject"
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

}
