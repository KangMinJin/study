package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ctrl + shift + o �ڵ� import
public class RegisterController {
	@RequestMapping(value="/register/add", method={RequestMethod.GET, RequestMethod.POST})
	// GET, POST ��û ��� ����Ѵٴ� ��.
//	@RequestMapping("/register/add") // �ű�ȸ�� ���� ȭ��
//	@GetMapping("/register/add") // GET ������θ�
	public String register() {
		return "registerForm"; // WEB-INF/views/registerForm.jsp
	}
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // POST������θ� ������ �� �ְ�
	@PostMapping("/register/save") // 4.3���� ��� ����!���� ����. �ξ� ª�� ����.
	public String save(User user, Model m) throws Exception {
		// 1.��ȿ�� �˻�
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸� �Է��ϼ̽��ϴ�.", "utf-8");
			
			m.addAttribute("msg", msg); // Model�� �̿��ϴ� ���
			return "forward:/register/add"; // redirect�� ���û�� �ǹ�
//			return "redirect:/register/add?msg="+msg; // URL ���ۼ�(rewriting)
		}
		
		// 2.DB�� �ű�ȸ�� ������ ����
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
	}
}
