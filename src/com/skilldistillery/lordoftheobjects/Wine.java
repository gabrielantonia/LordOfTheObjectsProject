package com.skilldistillery.lordoftheobjects;

public class Wine extends Alcohol {
	private static int remainingHealth = 10;
	
	public static int getremainingHealth() {
		return remainingHealth;
	}
	public static void setremainingHealth(int remainingHealth) {
		Wine.remainingHealth = remainingHealth;
	}
}
