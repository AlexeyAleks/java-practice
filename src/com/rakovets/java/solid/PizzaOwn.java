package com.rakovets.java.solid;

public class PizzaOwn implements IngredientsName {
	private String name = "'Свой рецепт'";
	private double price = 15.9;
	private String thin = "Тонкое тесто";
	private String thick = "Толстое тесто";
	private String withSide = "С бортом";
	private String noSide = "Без борта";

	public String getChickenFillet() {
		return chickenFilletName;
	}

	public String getBacon() {
		return baconName;
	}

	public String getMozzarella() {
		return mozzarellaName;
	}

	public String getCheddar() {
		return cheddarName;
	}

	public String getTomatoes() {
		return tomatoesName;
	}

	public String getPepper() {
		return pepperName;
	}

	public String getThin() {
		return thin;
	}

	public String getThick() {
		return thick;
	}

	public String getWithSide() {
		return withSide;
	}

	public String getNoSide() {
		return noSide;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
