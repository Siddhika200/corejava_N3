package org.tnsif.instanceofdemo;

public class Child extends Person {
	public int age;

	//getter and setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//default Constructor

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Child(String name,String address,int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", toString()="
				+ super.toString() + "]";
	}

}
