
/**
 * Sprinkles class that extends ToppingsDecorator
 * @author henryvy
 *
 */
public class Sprinkles extends ToppingsDecorator
{
	IceCream iceCream;
	
	/**
	 * Constructor
	 * @param iceCream
	 */
	public Sprinkles(IceCream iceCream)
	{
		this.iceCream = iceCream;
	}
	
	/**
	 * Returns the sprinkle description string
	 */
	public String toString()
	{
		return iceCream.toString() + " + sprinkles";
	}
	
	/**
	 * Returns the added up cost of the sprinkles
	 */
	public double getCost()
	{
		return iceCream.getCost() + 0.2;
	}
}
