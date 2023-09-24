package deocratorDesignPattern.toppings;

import deocratorDesignPattern.basePizza.BasePizza;

public class ExtraCheeze extends Toppings{

	BasePizza pizza;
	
	public ExtraCheeze(BasePizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		
		return pizza.cost() + 50;
	}
	
}
