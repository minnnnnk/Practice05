package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Friend f1 = new Friend();
        Friend f2 = new Friend();
        Friend f3 = new Friend();
        
        Friend[] friendArray = new Friend[3];
        
        
        friendArray[0] = f1;
        friendArray[1] = f2;
        friendArray[2] = f3;
        
        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        for (int i = 0; i < friendArray.length; i++) {
        	 System.out.print("이름: ");
        	 friendArray[i].setName(sc.nextLine());
        	 System.out.print("전화번호: ");
        	 friendArray[i].setHp(sc.nextLine());
        	 System.out.print("학교: ");
        	 friendArray[i].setSchool(sc.nextLine());
        	 System.out.println("-------------------------");
        	  
        }
      
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

	

}
