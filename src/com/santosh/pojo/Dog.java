package com.santosh.pojo;

import java.io.Serializable;

public class Dog implements Serializable{

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Colar getColar() {
		return colar;
	}
	public void setColar(Colar colar) {
		this.colar = colar;
	}
	private boolean isAlive;
	private Colar colar;
	public Dog(String name, boolean isAlive, Colar c) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.isAlive = isAlive;
		this.colar = c;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", isAlive=" + isAlive + ", colar="
				+ colar + "]";
	}

	
	
}
