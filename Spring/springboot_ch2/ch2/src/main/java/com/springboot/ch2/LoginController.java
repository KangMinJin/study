package com.springboot.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping("/login")
    public String showLogin() {
        return "login"; // templates/login.html
    }

    @PostMapping("/login")
    public String login(HttpServletRequest req, String id, String pwd, RedirectAttributes m) throws Exception {
        // 1. id, pwd를 확인
        if(loginCheck(id, pwd)){
        // 2. 일치하면, userInfo.html
            m.addAttribute("id", id);
            m.addAttribute("pwd", pwd);
            return "userInfo"; // templates/userInfo.html
        } else {
        //    일치하지 않으면, login.html로 이동
//            String msg = URLEncoder.encode( "id또는 pwd가 일치하지 않습니다.", "utf-8");
            String msg = "id또는 pwd가 일치하지 않습니다.";
            m.addAttribute("msg", msg);
            m.addFlashAttribute("msg", "일회용 메시지");
            // addFlashAttribute는 세션에 저장
            req.setAttribute("msg", "request에 저장된 메시지");
//            return "redirect:/login/login?msg="+msg; // GET - URL 재작성
            return "redirect:/"; // /login/login POST
        }
    }
    // 하나의 메서드로 GET, POST를 둘 다 처리하는 경우
//    @RequestMapping(value = "/login/login", method = {RequestMethod.GET, RequestMethod.POST})

    private boolean loginCheck(String id, String pwd) {
        return id.equals("asdf") && pwd.equals("1234");
    }
}
