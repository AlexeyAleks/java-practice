package com.rakovets.course.challenge.oop.polymorphism_battleGround;

public class Mag extends Hero {
	public Mag(String name, int health, int damage) {
		super(name, health, damage);
		System.out.printf("%s -------- [ %d%% health ] ----- ( alive - %s ) \n", getName(), getHealth(), isAlive());
	}

}
