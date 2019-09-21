
/**
 * Cherry class that extends ToppingsDecorator
 * @author henryvy
 *
 */
public class Cherry extends ToppingsDecorator
{
	IceCream iceCream;
	
	/**
	 * Constructor
	 * @param iceCream
	 */
	public Cherry(IceCream iceCream)
	{
		this.iceCream = iceCream;
	}
	
	/**
	 * Returns the cherry description string
	 */
	public String toString()
	{
		return iceCream.toString() + " + a cherry on top";
	}
	
	/**
	 * Returns the added up cost of the cherry
	 */
	public double getCost()
	{
		return iceCream.getCost() + 0.4;
	}
}
