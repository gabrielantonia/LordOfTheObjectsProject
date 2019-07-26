package com.skilldistillery.lordoftheobjects;

public class Hero {
	protected String name;
	protected String sex;
	protected int remainingHealth;
	
	
	public Hero(String name, String sex, int remainingHealth) {
		super();
		this.name = name;
		this.sex = sex;
		this.remainingHealth = remainingHealth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getremainingHealth() {
		return remainingHealth;
	}
	public void setremainingHealth(int remainingHealth) {
		this.remainingHealth = remainingHealth;
	}
	
}