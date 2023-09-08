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
	// �ϳ��� ExceptionHandler�� 2�� �̻��� ���ܸ� ó���ϰ� ������ �迭�� �ִ´�
	public String catcher2(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	// return "error"�ؼ� error view�� �̵��ϸ� ���ܰ� �Ͼ�µ��� �����ڵ尡 200�̹Ƿ�
	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)�� ����ؼ� �ڵ带 500���� �ٲ��ش�
	public String catcher(Exception ex, Model m) {
		System.out.println("catcher in ExceptionController");
		System.out.println("m="+m);
		m.addAttribute("ex", ex);
		
		return "error";
	}
	// �ߺ��� �ڵ� ��ġ��
	
	@RequestMapping("/ex")
	public String main(Model m) throws Exception {
//		try {
		m.addAttribute("msg", "message from ExceptionController.main");
		throw new Exception("���ܰ� �߻��߽��ϴ�.");
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			return "error";
//		}
	}
	
	@RequestMapping("/ex2")
	public String main2() throws Exception {
//		try {
		throw new NullPointerException("���ܰ� �߻��߽��ϴ�.");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			return "error";
//		}
	}
	@RequestMapping("/ex3")
	public String main3() throws Exception {
		throw new FileNotFoundException("�ش� ������ ã�� ���߽��ϴ�.");
	}
}
