package com.javaex.ex04;

public class Base {
	//필드
	private String service;
	//생성자
	
	//메소드 GS
	 public String getService() {
			return service;
		}

		public void setService(String service) {
			this.service = service;
		}

		
		
	//메소드 일반
    public void service(String state) {
        
        //코드작성할것
    	this.service = state;
    	System.out.println(service);
    	if (state == "낮") {
    	        System.out.println(state+"에는 열심히 수업듣자");
    	} else if (state =="밤") {
    		System.out.println(state+"에는 숙면");
    	} else {
    		 System.out.println(state+"도 낮과 마찬가지로 공부해야 합니다.");
    	}
    }

   
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

