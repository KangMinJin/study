package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int in = 10;
	static int cv = 20;
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello")
	private void main() { // 인스턴스 메서드 - iv, cv 둘 다 사용가능
		System.out.println("Hello - private"); // Tomcat 콘솔에 출력
		System.out.println(cv); // OK
//		System.out.println(iv); // OK
	} // 인스턴스 메서드는 객체 생성 후 호출 가능. Tomcat 내부에서 객체 생성을 하여 static 안 붙여도 바로 호출 가능
	
	public static void main2() { // static 메서드 - cv만 사용가능
		System.out.println(cv); // OK
//		System.out.println(iv); // 에러
	}
}
