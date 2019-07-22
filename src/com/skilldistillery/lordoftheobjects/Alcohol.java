package com.skilldistillery.lordoftheobjects;


public class Alcohol {
	private static int remainingHealth;
	private static int alcoholDamage;
	
	public static int getAlcoholDamage() {
		return alcoholDamage;
	}
	public static void setAlcoholDamage(int alcoholDamage) {
		Alcohol.alcoholDamage = alcoholDamage;
	}
	public static int getremainingHealth() {
		return remainingHealth;
	}
	public static void setremainingHealth(int remainingHealth) {
		Alcohol.remainingHealth = remainingHealth;
	}

}
