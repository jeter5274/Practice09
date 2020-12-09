package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       List<Goods> gList = new ArrayList<Goods>();
       int sum = 0;
       
	   System.out.println("상품을 입력해주세요(종료 q)");
       while(true){
    	   //상품정보 입력
    	   String input = sc.nextLine();
    	   
    	   //입력값이 q이면 입력완료 및 선출력 후 무한루프종료
    	   if(input.equals("q")) {
    		   System.out.println("[입력완료]");
    		   System.out.println("=========================");
    		   break;
    	   }
    	   
    	   //입력값은 ,기준으로 나누어 문자열 배열에 할당
    	   String[] inputSplit = input.split(",");
    	   
    	   //문자열 방번호 순으로 Goods형 g변수에 할당 이때, 매개변수의 자료형을 맞춰줌 (문자열 -> 정수형)
    	   Goods g = new Goods(inputSplit[0], Integer.parseInt(inputSplit[1]), Integer.parseInt(inputSplit[2]));
    	   
    	   //리스트에 g주소값 할당
    	   gList.add(g);
    	   
       }
       
       //리스트의 모든 내용을 출력하고, 물품갯수를 합산
       for(int i=0; i<gList.size(); i++) {
    	   gList.get(i).showInfo();
    	   sum += gList.get(i).getCount(); 
       }
       
       //물품 갯수 출력
       System.out.println("모든 상품의 갯수는" +sum+ "개입니다.");
       
       sc.close();
    }

}
