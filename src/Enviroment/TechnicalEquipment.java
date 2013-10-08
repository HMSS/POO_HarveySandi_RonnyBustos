package Enviroment;


public class TechnicalEquipment {

	/**
	 * @uml.property  name="name"
	 * @uml.property  name="amount"
	 */
	private String name;
	private int amount;
	
	public TechnicalEquipment(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

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
	 * Getter of the property <tt>amount</tt>
	 * @return  Returns the amount.
	 * @uml.property  name="amount"
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Setter of the property <tt>amount</tt>
	 * @param amount  The amount to set.
	 * @uml.property  name="amount"
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
