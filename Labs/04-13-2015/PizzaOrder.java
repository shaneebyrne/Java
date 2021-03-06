
public class PizzaOrder
{
	private Pizza pizza1, pizza2, pizza3;
	private int numPizzas;

	public PizzaOrder()
	{
		numPizzas = 0;
		pizza1 = null;
		pizza2 = null;
		pizza3 = null;
	}
	
	public PizzaOrder(PizzaOrder order)
	{
		//make copies of the PizzaObjects
	Pizza orig = order.getPizza1();
	if(orig != null)
	{
		pizza1 = new Pizza(orig)
	}
	orig = order.getPizza2();
	if(orig != null)
	{
		pizza2 = new Pizza(orig);
	}
	orig = order.getPizza3();
	if(orig != null)
	{
		pizza3 = new Pizza(orig);
	}
	
	}
	
	public PizzaOrder(PizzaOrder p)
	{
		numPizzas =  p.numPizzas;
		pizza1 = new Pizza(p.pizza1);
	}

	public void setNumPizzas(int num)
	{
		numPizzas = num;
	}

	public void setPizza1(Pizza pizza)
	{
			pizza1 = pizza;
	}

	public void setPizza2(Pizza pizza)
	{
		pizza2 = pizza;
	}

	public void setPizza3(Pizza pizza)
	{
		pizza3 = pizza;
	}

	public double calcTotal()
	{
		double total = 0;
		if (numPizzas >= 1)
			total += pizza1.calcCost();
		if (numPizzas >= 2)
			total += pizza2.calcCost();
		if (numPizzas >= 3)
			total += pizza3.calcCost();
		return total;
	}
	
	public int getNumPizzas()
	{
		return numPizzas;
	}
	
	public Pizza getPizza1()
	{
		return pizza1;
	}

	public Pizza getPizza2()
	{
		return pizza2;
	}
	
	public Pizza getPizza3()
	{
		return pizza3;
	}
	
	
	// Sample main
	public static void main(String[] args)
	{
		Pizza pizza1 = new Pizza("Large",1,1,0);
		Pizza pizza2 = new Pizza("Medium",2,0,2);
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);			// 2 pizzas in the order
		order.setPizza1(pizza1);		// Set first pizza
		order.setPizza2(pizza2);		// Set second pizza
		double total = order.calcTotal();	// Should be 18+20 = 38
		System.out.println("The order total is " + total);
	}
} // Question 12
