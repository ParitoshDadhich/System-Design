package deocratorDesignPattern;

import deocratorDesignPattern.basePizza.VegDelight;
import deocratorDesignPattern.toppings.ExtraCheeze;

public class Main {

	public static void main(String[] args) {
		/* 
		 * Deocrator design pattern follows both "is-a" and "has-a" pattern.
		 * */
		
		
		
		// I want VegDelight + extraCheeze pizza
		ExtraCheeze cheeze = new ExtraCheeze(new VegDelight());
		
		System.out.println("Price of VegDelight pizza: " + (new VegDelight()).cost());
		System.out.println("Price of Extra cheeze: " + (new ExtraCheeze(new VegDelight()).cost() - (new VegDelight()).cost()));
		
		System.out.println("Total cost of VegDelight + Cheeze pizza: " + cheeze.cost());
	}

}
