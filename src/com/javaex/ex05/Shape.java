package com.javaex.ex05;

public abstract class Shape {
	
	//필드
	private int countSide;
	
	//생성자
	public Shape() {}
	public Shape(int countSide) {
		this.countSide = countSide;
	}
    
    //getter
	public int getCountSide() {
		return countSide;
	}
	
	//메소드 일반
	public abstract double getArea();	//넓이
	public abstract double getPerimeter();	//둘레길

}
