

import java.util.Collection;
import java.util.Iterator;

public class PracticalClassRoom extends ClassRoom {

	/** 
	 * @uml.property name="technicalEquipment"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="practicalClassRoom:TechnicalEquipment"
	 */
	private Collection technicalEquipment;

	/** 
	 * Getter of the property <tt>technicalEquipment</tt>
	 * @return  Returns the technicalEquipment.
	 * @uml.property  name="technicalEquipment"
	 */
	public Collection getTechnicalEquipment() {
		return technicalEquipment;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="technicalEquipment"
	 */
	public Iterator technicalEquipmentIterator() {
		return technicalEquipment.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="technicalEquipment"
	 */
	public boolean isTechnicalEquipmentEmpty() {
		return technicalEquipment.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="technicalEquipment"
	 */
	public boolean containsTechnicalEquipment(
			TechnicalEquipment technicalEquipment) {
				return this.technicalEquipment.contains(technicalEquipment);
			}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="technicalEquipment"
	 */
	public boolean containsAllTechnicalEquipment(Collection technicalEquipment) {
		return this.technicalEquipment.containsAll(technicalEquipment);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="technicalEquipment"
	 */
	public int technicalEquipmentSize() {
		return technicalEquipment.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="technicalEquipment"
	 */
	public TechnicalEquipment[] technicalEquipmentToArray() {
		return (TechnicalEquipment[]) technicalEquipment
				.toArray(new TechnicalEquipment[technicalEquipment.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="technicalEquipment"
	 */
	public TechnicalEquipment[] technicalEquipmentToArray(
			TechnicalEquipment[] technicalEquipment) {
				return (TechnicalEquipment[]) this.technicalEquipment
						.toArray(technicalEquipment);
			}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="technicalEquipment"
	 */
	public boolean addTechnicalEquipment(TechnicalEquipment technicalEquipment) {
		return this.technicalEquipment.add(technicalEquipment);
	}

	/** 
	 * Setter of the property <tt>technicalEquipment</tt>
	 * @param technicalEquipment  The technicalEquipment to set.
	 * @uml.property  name="technicalEquipment"
	 */
	public void setTechnicalEquipment(Collection technicalEquipment) {
		this.technicalEquipment = technicalEquipment;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="technicalEquipment"
	 */
	public boolean removeTechnicalEquipment(
			TechnicalEquipment technicalEquipment) {
				return this.technicalEquipment.remove(technicalEquipment);
			}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="technicalEquipment"
	 */
	public void clearTechnicalEquipment() {
		this.technicalEquipment.clear();
	}

}
