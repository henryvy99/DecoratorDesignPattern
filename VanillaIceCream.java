
/**
 * VanillaIceCream class that extends IceCream
 * @author henryvy
 *
 */
public class VanillaIceCream extends IceCream
{
	/**
	 * Constructor
	 */
	public VanillaIceCream()
	{
		this.description = "Vanilla Ice Cream";
	}
	
	/**
	 * returns the cost of Vanilla Ice Cream
	 */
	public double getCost()
	{
		return 0.75;
	}
}
