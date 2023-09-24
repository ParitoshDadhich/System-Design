package deocratorDesignPattern.toppings;

import deocratorDesignPattern.basePizza.BasePizza;

public class Mushroom extends Toppings{

	BasePizza pizza;
	
	public Mushroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 40;
	}

}
