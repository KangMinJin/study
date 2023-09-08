package com.fastcampus.ch2;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.BAD_REQUEST) // 500 -> 400
class MyException extends RuntimeException { // 사용자 지정 예외
	MyException(String msg) { // 생성자
		super(msg);
	}
	MyException() { this(""); } // 기본생성자
}

@Controller
public class ExceptionController2 {

	@RequestMapping("/ex4")
	public String main() throws Exception {
//		try {
		throw new MyException("예외가 발생했습니다.");
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			return "error";
//		}
	}
	
	@RequestMapping("/ex5")
	public String main2() throws Exception {
//		try {
		throw new NullPointerException("예외가 발생했습니다.");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			return "error";
//		}
	}
}
