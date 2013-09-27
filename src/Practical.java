

import java.util.Collection;
import java.util.Iterator;

public class Practical extends Subject {

	/**
	 * @uml.property  name="operatingSystem"
	 */
	private String operatingSystem;

	/**
	 * Getter of the property <tt>operatingSystem</tt>
	 * @return  Returns the operatingSystem.
	 * @uml.property  name="operatingSystem"
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * Setter of the property <tt>operatingSystem</tt>
	 * @param operatingSystem  The operatingSystem to set.
	 * @uml.property  name="operatingSystem"
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/** 
	 * @uml.property name="supportMaterial"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="practical:SupportMaterial"
	 */
	private Collection supportMaterial;

	/** 
	 * Getter of the property <tt>supportMaterial</tt>
	 * @return  Returns the supportMaterial.
	 * @uml.property  name="supportMaterial"
	 */
	public Collection getSupportMaterial() {
		return supportMaterial;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="supportMaterial"
	 */
	public Iterator supportMaterialIterator() {
		return supportMaterial.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="supportMaterial"
	 */
	public boolean isSupportMaterialEmpty() {
		return supportMaterial.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="supportMaterial"
	 */
	public boolean containsSupportMaterial(SupportMaterial supportMaterial) {
		return this.supportMaterial.contains(supportMaterial);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="supportMaterial"
	 */
	public boolean containsAllSupportMaterial(Collection supportMaterial) {
		return this.supportMaterial.containsAll(supportMaterial);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="supportMaterial"
	 */
	public int supportMaterialSize() {
		return supportMaterial.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="supportMaterial"
	 */
	public SupportMaterial[] supportMaterialToArray() {
		return (SupportMaterial[]) supportMaterial
				.toArray(new SupportMaterial[supportMaterial.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="supportMaterial"
	 */
	public SupportMaterial[] supportMaterialToArray(
			SupportMaterial[] supportMaterial) {
		return (SupportMaterial[]) this.supportMaterial
				.toArray(supportMaterial);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="supportMaterial"
	 */
	public boolean addSupportMaterial(SupportMaterial supportMaterial) {
		return this.supportMaterial.add(supportMaterial);
	}

	/** 
	 * Setter of the property <tt>supportMaterial</tt>
	 * @param supportMaterial  The supportMaterial to set.
	 * @uml.property  name="supportMaterial"
	 */
	public void setSupportMaterial(Collection supportMaterial) {
		this.supportMaterial = supportMaterial;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="supportMaterial"
	 */
	public boolean removeSupportMaterial(SupportMaterial supportMaterial) {
		return this.supportMaterial.remove(supportMaterial);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="supportMaterial"
	 */
	public void clearSupportMaterial() {
		this.supportMaterial.clear();
	}

}
