
public class PepperoniDecorator extends ToppingDecorator {

	public PepperoniDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String getDescription()
    {
        return pizza.getDescription() + ", pepperoni";
    }

	@Override
	public double getCost()
	{
		return pizza.getCost() + 1.50;
	}

}
