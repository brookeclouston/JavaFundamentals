/* Base class for hierarchy. 
 * Author: Brooke Clouston
 * NetID: 15bec1
 * Student Number: 20001003
 */
import java.io.Serializable;

public abstract class Fastener implements Serializable{

	private static final long serialVersionUID = 4864191834212845800L;
	private double unitPrice;
	private int numberPerUnit;

	// Constructor class for Fastener 
	public Fastener(double up, int npu) throws IllegalFastener {
		unitPrice = up;
		numberPerUnit = npu;
	} // end Fastener 
	
	// returns the total cost of the order
	public double getOrderCost(int orderSize) {
		return (unitPrice * orderSize);
	} // end getOrderCost

	// sets unitPrice attribute, checks for legal values
	public void setUnitPrice(double unitPrice) throws IllegalFastener{
		if (unitPrice < 0) {
			throw new IllegalFastener("Unit price must be greater than zero");
		}
		this.unitPrice = unitPrice;
	} // end setUnitPrice
	
	// sets numberPerUnit attribute, checks for legal values
	public void setNumberPerUnit( int numberPerUnit) throws IllegalFastener {
		if (! (numberPerUnit >= 1 && numberPerUnit <= 10000)) {
			throw new IllegalFastener("Numper per unit must be between 0 and 10,000");
		}
		this.numberPerUnit = numberPerUnit;
	}// end setNumberPerUnit
	
	// toString method
	@Override
	public String toString() {
		return (numberPerUnit + " in a unit, $" + unitPrice + " per unit.");	
	}// end toString
	
} // end Fastener Class
