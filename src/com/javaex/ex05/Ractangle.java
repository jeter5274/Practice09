package com.javaex.ex05;

public class Ractangle extends Shape implements Resizable {

	//필드
	private double width, height;

	//생성자
	public Ractangle() {}
	public Ractangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//메소드 getter/setter
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//메소드 일반
	
	@Override
	public double getArea() {
		return width*height;
	}
	@Override
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	public void resize(double d) {
		width = width*d;
		height = height*d;
	}
	
	
	
}
