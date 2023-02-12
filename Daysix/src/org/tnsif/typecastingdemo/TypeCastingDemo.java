package org.tnsif.typecastingdemo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Implicit typecasting : conversion of smaller to higher
		int x=15;
		float y=x;
		System.out.println("The value of y is:"+y);
        
		//Explicit typecasting: conversion of higher to smaller so we should passed the long parameter to the value
		double d=12.5;
		long l=(long)d;
		System.out.println("The value of l is:"+l );
	}

}
