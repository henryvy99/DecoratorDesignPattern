
/**
 * Abstract class IceCream that will be extended upon other classes
 * @author henryvy
 *
 */
public abstract class IceCream 
{
	protected String description;
	
	public String toString()
	{
		return description;
	}
	
	public abstract double getCost();
}
