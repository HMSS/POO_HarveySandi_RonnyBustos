

import java.util.Collection;
import java.util.Iterator;

public class Curriculum {

	/**
	 * @uml.property  name="semester"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="curriculum:Semester"
	 */
	private Collection semester;

	/**
	 * Getter of the property <tt>semester</tt>
	 * @return  Returns the semester.
	 * @uml.property  name="semester"
	 */
	public Collection getSemester() {
		return semester;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="semester"
	 */
	public Iterator semesterIterator() {
		return semester.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="semester"
	 */
	public boolean isSemesterEmpty() {
		return semester.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="semester"
	 */
	public boolean containsSemester(Semester semester) {
		return this.semester.contains(semester);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="semester"
	 */
	public boolean containsAllSemester(Collection semester) {
		return this.semester.containsAll(semester);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="semester"
	 */
	public int semesterSize() {
		return semester.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="semester"
	 */
	public Semester[] semesterToArray() {
		return (Semester[]) semester.toArray(new Semester[semester.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="semester"
	 */
	public Semester[] semesterToArray(Semester[] semester) {
		return (Semester[]) this.semester.toArray(semester);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="semester"
	 */
	public boolean addSemester(Semester semester) {
		return this.semester.add(semester);
	}

	/**
	 * Setter of the property <tt>semester</tt>
	 * @param semester  the semester to set.
	 * @uml.property  name="semester"
	 */
	public void setSemester(Collection semester) {
		this.semester = semester;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="semester"
	 */
	public boolean removeSemester(Semester semester) {
		return this.semester.remove(semester);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="semester"
	 */
	public void clearSemester() {
		this.semester.clear();
	}

	/**
	 * @uml.property  name="name"
	 */
	private String name;

	/**
	 * Getter of the property <tt>name</tt>
	 * @return  Returns the name.
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * @param name  The name to set.
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

}
