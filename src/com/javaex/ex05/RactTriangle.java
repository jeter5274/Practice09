package com.javaex.ex05;

public class RactTriangle extends Shape {
	
	//필드
	private double width, height;
	
	//생성자
	public RactTriangle() {}
	public RactTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//메소드 getter/setter
	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반

	@Override
	public double getArea() {
		return width*height/2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt( width*width + height*height );
	}

	@Override
	public String toString() {
		return "RacTriangle [width=" + width + ", height=" + height + "]";
	}

	
}
