package com.skilldistillery.lordoftheobjects;

public class Hero {
	private static String name;
	private static String sex;
	public static int remainingHealth = 19;
	
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		Hero.name = name;
	}
	public static String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		Hero.sex = sex;
	}
	public static int getremainingHealth() {
		return remainingHealth;
	}
	public static void setremainingHealth(int remainingHealth) {
		Hero.remainingHealth = remainingHealth;
	}
	
}