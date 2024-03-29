package com.fastcampus.ch2;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
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
		// 1. 세션을 종료
		session.invalidate();
		// 2. 홈으로 이동
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login(String id, String pwd, String toURL, boolean rememberId,
			HttpServletResponse response, HttpServletRequest request) throws Exception {
//		System.out.println("id="+id);
//		System.out.println("pwd="+pwd);
//		System.out.println("rememberId="+rememberId); // 매개타입 변수를 boolean으로 해서 true, false 로 들어온다.
		// 1.id와 pw를 확인
		if(!loginCheck(id, pwd)) {
			// 2-1.일치하지 않으면 loginForm으로 이동
			String msg = URLEncoder.encode("id또는 pwd가 일치하지 않습니다.", "utf-8");
			
			return "redirect:/login/login?msg="+msg;
		}
		// 2-2. id와 pw가 일치하면,
		// 세션 객체를 얻어오기
		HttpSession session = request.getSession();
		// 세션 객체에 id를 저장
		session.setAttribute("id", id);
		
		if(rememberId) {
			// 쿠키를 생성
			Cookie cookie = new Cookie("id", id); // ctrl + shift + o 자동 import
			// 응답에 저장
			response.addCookie(cookie);
			
		} else {
			// 쿠키를 삭제
			Cookie cookie = new Cookie("id", id); // ctrl + shift + o 자동 import
			cookie.setMaxAge(0); // 쿠키를 삭제
			// 응답에 저장
			response.addCookie(cookie);
			// 체크가 안 되어 있을 시 혹시 있을지도 모르는 쿠키를 삭제하는 것.
		}
		// 홈으로 이동
		toURL = toURL == null || toURL.equals("") ? "/" : toURL;
		// toURL이 빈 값이거나 빈 문자열이면 그냥 home으로 보내고 toURL에 주소값이 있으면 그 주소로 보냄
		return "redirect:"+toURL;
	}
	private boolean loginCheck(String id, String pwd) {
		// TODO Auto-generated method stub
		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
