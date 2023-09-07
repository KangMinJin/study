package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ctrl + shift + o 자동 import
public class RegisterController {
	@RequestMapping(value="/register/add", method={RequestMethod.GET, RequestMethod.POST})
	// GET, POST 요청 모두 허용한다는 뜻.
//	@RequestMapping("/register/add") // 신규회원 가입 화면
//	@GetMapping("/register/add") // GET 방식으로만
	public String register() {
		return "registerForm"; // WEB-INF/views/registerForm.jsp
	}
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // POST방식으로만 가입할 수 있게
	@PostMapping("/register/save") // 4.3부터 사용 가능!위와 동일. 훨씬 짧고 간단.
	public String save(User user, Model m) throws Exception {
		// 1.유효성 검사
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못 입력하셨습니다.", "utf-8");
			
			m.addAttribute("msg", msg); // Model을 이용하는 방법
			return "forward:/register/add"; // redirect는 재요청의 의미
//			return "redirect:/register/add?msg="+msg; // URL 재작성(rewriting)
		}
		
		// 2.DB에 신규회원 정보를 저장
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
	}
}
