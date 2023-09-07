package com.fastcampus.ch2;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/login")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		// 1. ������ ����
		session.invalidate();
		// 2. Ȩ���� �̵�
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login(String id, String pwd, boolean rememberId,
			HttpServletResponse response, HttpServletRequest request) throws Exception {
//		System.out.println("id="+id);
//		System.out.println("pwd="+pwd);
//		System.out.println("rememberId="+rememberId); // �Ű�Ÿ�� ������ boolean���� �ؼ� true, false �� ���´�.
		// 1.id�� pw�� Ȯ��
		if(!loginCheck(id, pwd)) {
			// 2-1.��ġ���� ������ loginForm���� �̵�
			String msg = URLEncoder.encode("id�Ǵ� pwd�� ��ġ���� �ʽ��ϴ�.", "utf-8");
			
			return "redirect:/login/login?msg="+msg;
		}
		// 2-2. id�� pw�� ��ġ�ϸ�,
		// ���� ��ü�� ������
		HttpSession session = request.getSession();
		// ���� ��ü�� id�� ����
		session.setAttribute("id", id);
		
		if(rememberId) {
			// ��Ű�� ����
			Cookie cookie = new Cookie("id", id); // ctrl + shift + o �ڵ� import
			// ���信 ����
			response.addCookie(cookie);
			
		} else {
			// ��Ű�� ����
			Cookie cookie = new Cookie("id", id); // ctrl + shift + o �ڵ� import
			cookie.setMaxAge(0); // ��Ű�� ����
			// ���信 ����
			response.addCookie(cookie);
			// üũ�� �� �Ǿ� ���� �� Ȥ�� �������� �𸣴� ��Ű�� �����ϴ� ��.
		}
		// Ȩ���� �̵�
		return "redirect:/";
	}
	private boolean loginCheck(String id, String pwd) {
		// TODO Auto-generated method stub
		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
