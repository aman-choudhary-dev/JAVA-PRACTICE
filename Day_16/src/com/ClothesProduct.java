package com;

public class ClothesProduct extends Product{
	int size ;
	String color;
	public ClothesProduct(String name , int price , String id , int size , String color) {
	// TODO Auto-generated constructor stub
		super(name , price , id);
		this.size = size;
		this.color = color;
		
	}
}
