

import java.util.Collection;
import java.util.Iterator;

public class Department {

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

	/**
	 * @uml.property  name="curriculums"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="department:Curriculum"
	 */
	private Collection curriculums;

	/**
	 * Getter of the property <tt>curriculums</tt>
	 * @return  Returns the curriculums.
	 * @uml.property  name="curriculums"
	 */
	public Collection getCurriculums() {
		return curriculums;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="curriculums"
	 */
	public Iterator curriculumsIterator() {
		return curriculums.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="curriculums"
	 */
	public boolean isCurriculumsEmpty() {
		return curriculums.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="curriculums"
	 */
	public boolean containsCurriculums(Curriculum curriculum) {
		return curriculums.contains(curriculum);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="curriculums"
	 */
	public boolean containsAllCurriculums(Collection curriculums) {
		return this.curriculums.containsAll(curriculums);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="curriculums"
	 */
	public int curriculumsSize() {
		return curriculums.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="curriculums"
	 */
	public Curriculum[] curriculumsToArray() {
		return (Curriculum[]) curriculums.toArray(new Curriculum[curriculums
				.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="curriculums"
	 */
	public Curriculum[] curriculumsToArray(Curriculum[] curriculums) {
		return (Curriculum[]) this.curriculums.toArray(curriculums);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="curriculums"
	 */
	public boolean addCurriculums(Curriculum curriculum) {
		return curriculums.add(curriculum);
	}

	/**
	 * Setter of the property <tt>curriculums</tt>
	 * @param curriculums  the curriculums to set.
	 * @uml.property  name="curriculums"
	 */
	public void setCurriculums(Collection curriculums) {
		this.curriculums = curriculums;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="curriculums"
	 */
	public boolean removeCurriculums(Curriculum curriculum) {
		return curriculums.remove(curriculum);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="curriculums"
	 */
	public void clearCurriculums() {
		curriculums.clear();
	}

}
