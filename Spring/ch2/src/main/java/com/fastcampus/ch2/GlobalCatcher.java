package com.fastcampus.ch2;

import java.io.FileNotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.fastcampus.ch3")// 지정된 패키지에서 발생한 예외만 처리
//@ControllerAdvice // 모든 패키지에 적용
// @ControllerAdvice는 @Controller 어노테이션이 있는 모든 곳에서의 예외를 잡을 수 있도록 해준다.
public class GlobalCatcher {
	@ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
	// 하나의 ExceptionHandler로 2개 이상의 예외를 처리하고 싶으면 배열로 넣는다
	public String catcher2(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex, Model m) {
		System.out.println("catcher in GlobalCatcher");
		m.addAttribute("ex", ex);
		return "error";
	}
	
}
