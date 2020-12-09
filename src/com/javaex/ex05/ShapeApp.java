package com.javaex.ex05;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape r01 = new Ractangle(5, 6);
		Shape r02 = new RactTriangle(6, 2);
		
		List<Shape> sList = new ArrayList<Shape>();
		
		sList.add(r01);
		sList.add(r02);
		
		for(int i=0; i<sList.size(); i++) {
			System.out.println("area: " + sList.get(i).getArea());
			System.out.println("perimeter: " + sList.get(i).getPerimeter());
			
			if(sList.get(i) instanceof Resizable) {
				((Ractangle)sList.get(i)).resize(0.5);
				
				System.out.println("new area: " + sList.get(i).getArea());
				System.out.println("new perimeter: " + sList.get(i).getPerimeter());
				
			}
		}
		

	}


}
