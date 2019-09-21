
/**
 * ChocolateChips class that extends ToppingsDecorator
 * @author henryvy
 *
 */
public class ChocolateChips extends ToppingsDecorator
{
	IceCream iceCream;
	
	/**
	 * Constructor for ChocolateChips
	 * @param iceCream
	 */
	public ChocolateChips(IceCream iceCream)
	{
		this.iceCream = iceCream;
	}
	
	/**
	 * Returns the chocolate chip description string
	 */
	public String toString()
	{
		return iceCream.toString() + " + chocolate chips";
	}
	
	/**
	 * Returns the added up cost of the chocolate chips
	 */
	public double getCost()
	{
		return iceCream.getCost() + 0.3;
	}
}
