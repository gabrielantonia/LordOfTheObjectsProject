package com.skilldistillery.lordoftheobjects;

public class Alcohol {
	protected int remainingHealth;
	protected int alcoholDamage;

	public int getAlcoholDamage() {
		return alcoholDamage;
	}

	public void setAlcoholDamage(int alcoholDamage) {
		this.alcoholDamage = alcoholDamage;
	}

	public int getremainingHealth() {
		return remainingHealth;
	}

	public void setremainingHealth(int remainingHealth) {
		this.remainingHealth = remainingHealth;
	}

	public Alcohol(int remainingHealth, int alcoholDamage) {
		this.remainingHealth = remainingHealth;
		this.alcoholDamage = alcoholDamage;
	}

	public Alcohol() {
		// TODO Auto-generated constructor stub
	}

}