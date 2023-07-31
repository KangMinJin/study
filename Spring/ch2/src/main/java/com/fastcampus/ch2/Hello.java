package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	int in = 10;
	static int cv = 20;
	// 2. URL�� �޼��带 ����
	@RequestMapping("/hello")
	private void main() { // �ν��Ͻ� �޼��� - iv, cv �� �� ��밡��
		System.out.println("Hello - private"); // Tomcat �ֿܼ� ���
		System.out.println(cv); // OK
//		System.out.println(iv); // OK
	} // �ν��Ͻ� �޼���� ��ü ���� �� ȣ�� ����. Tomcat ���ο��� ��ü ������ �Ͽ� static �� �ٿ��� �ٷ� ȣ�� ����
	
	public static void main2() { // static �޼��� - cv�� ��밡��
		System.out.println(cv); // OK
//		System.out.println(iv); // ����
	}
}
