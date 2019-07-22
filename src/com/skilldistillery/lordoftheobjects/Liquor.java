package com.skilldistillery.lordoftheobjects;

public class Liquor extends Alcohol {
	private static int remainingHealth = 15 ;

	public static int getremainingHealth() {
		return remainingHealth;
	}
	public static void setremainingHealth(int remainingHealth) {
		Liquor.remainingHealth = remainingHealth;
	}
}
