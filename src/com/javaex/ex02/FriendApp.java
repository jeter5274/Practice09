package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	List<Friend> frdList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	//세번반복
    	for(int i=0; i<3; i++) {
    		//친구정보를 입력받음
    		String frdInfo = sc.nextLine();
    		
    		//공백을 기준으로 문자열 배열로 나눔
    		String[] frdInfoSplit = frdInfo.split(" ");
    		
    		//문자열 배열의 방 순서대로 Friend형의 frd변수에 값 할당
    		Friend frd = new Friend(frdInfoSplit[0], frdInfoSplit[1], frdInfoSplit[2]);
    		
    		//리스트에 추가
    		frdList.add(frd);	
    	}
    	
    	for(int i=0; i<frdList.size();i++) {
    		frdList.get(i).showInfo();
    	}
    	
    	sc.close();
    }

}
