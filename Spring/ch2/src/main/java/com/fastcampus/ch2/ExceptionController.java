package com.fastcampus.ch2;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController {
	
	@ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
	// 하나의 ExceptionHandler로 2개 이상의 예외를 처리하고 싶으면 배열로 넣는다
	public String catcher2(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	// return "error"해서 error view로 이동하면 예외가 일어났는데도 상태코드가 200이므로
	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)를 사용해서 코드를 500으로 바꿔준다
	public String catcher(Exception ex, Model m) {
		System.out.println("catcher in ExceptionController");
		System.out.println("m="+m);
		m.addAttribute("ex", ex);
		
		return "error";
	}
	// 중복된 코드 합치기
	
	@RequestMapping("/ex")
	public String main(Model m) throws Exception {
//		try {
		m.addAttribute("msg", "message from ExceptionController.main");
		throw new Exception("예외가 발생했습니다.");
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			return "error";
//		}
	}
	
	@RequestMapping("/ex2")
	public String main2() throws Exception {
//		try {
		throw new NullPointerException("예외가 발생했습니다.");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			return "error";
//		}
	}
	@RequestMapping("/ex3")
	public String main3() throws Exception {
		throw new FileNotFoundException("해당 파일을 찾지 못했습니다.");
	}
}
