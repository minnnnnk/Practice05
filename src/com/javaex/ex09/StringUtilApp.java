package com.javaex.ex09;

public class StringUtilApp {

    public static void main(String[] args) {

        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
       
        
        String resultStr = StringUtil.concatString(strArray[0], strArray[1], strArray[2]);
        System.out.print("결과 문자열:" + resultStr);
        
        
    }

}
