package com.fastcampus.ch2;

import java.io.FileNotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.fastcampus.ch3")// ������ ��Ű������ �߻��� ���ܸ� ó��
//@ControllerAdvice // ��� ��Ű���� ����
// @ControllerAdvice�� @Controller ������̼��� �ִ� ��� �������� ���ܸ� ���� �� �ֵ��� ���ش�.
public class GlobalCatcher {
	@ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
	// �ϳ��� ExceptionHandler�� 2�� �̻��� ���ܸ� ó���ϰ� ������ �迭�� �ִ´�
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
