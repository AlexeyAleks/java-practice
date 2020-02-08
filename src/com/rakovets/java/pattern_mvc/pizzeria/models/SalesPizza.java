package com.rakovets.java.pattern_mvc.pizzeria.models;

import java.util.Map;

public class SalesPizza {

	public int sales(Map<String, Integer> ordersPizza) {
		int numberSalesPizza = 0;
		for (int value : ordersPizza.values()) {
			numberSalesPizza += value;
		}
		return numberSalesPizza;
	}
}