package com.skilldistillery.lordoftheobjects;

public class Beer extends Alcohol {
	private static int remainingHealth = 5;
	
	public static int getremainingHealth() {
		return remainingHealth;
	}
	public static void setremainingHealth(int remainingHealth) {
		Beer.remainingHealth = remainingHealth;
	}
}
