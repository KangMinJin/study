package com.fastcampus.ch4.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fastcampus.ch4.domain.BoardDto;
import com.fastcampus.ch4.domain.PageHandler;
import com.fastcampus.ch4.domain.SearchCondition;
import com.fastcampus.ch4.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @PostMapping("/modify")
    public String modify(Integer page, Integer pageSize,BoardDto boardDto, HttpSession session, Model m, RedirectAttributes rattr) {
        String writer = (String) session.getAttribute("id"); // getAttribute 리턴은 object라서 (String)형변환 필요.
        boardDto.setWriter(writer);

        try {
            int rowCnt = boardService.modify(boardDto); // insert

            if (rowCnt != 1) {
                throw new Exception("Modify Failed");
            }

            rattr.addFlashAttribute("msg", "MOD_OK");
            m.addAttribute("page", page);
            m.addAttribute("pageSize", pageSize);
            return "redirect:/board/list?page="+page+"&pageSize="+pageSize;

        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute(boardDto);
            m.addAttribute("msg", "MOD_ERR");
            return "board";
        }
    }

    @PostMapping("/write")
    public String write(BoardDto boardDto, HttpSession session, Model m, RedirectAttributes rattr) {
        String writer = (String) session.getAttribute("id"); // getAttribute 리턴은 object라서 (String)형변환 필요.
        boardDto.setWriter(writer);

        try {
            int rowCnt = boardService.write(boardDto); // insert

            if (rowCnt != 1) {
                throw new Exception("Write Failed");
            }

            rattr.addFlashAttribute("msg", "WRT_OK");
            return "redirect:/board/list";

        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute(boardDto);
            m.addAttribute("mode", "new");
            m.addAttribute("msg", "WRT_ERR");
            return "board";
        }
    }

    @GetMapping("/write")
    public String write(Model m) {
        m.addAttribute("mode", "new");
        return "board"; // 읽기, 쓰기 모두 사용. 쓰기화면 보여줄 때는 mode=new
    }

    @PostMapping("/remove")
    public String remove(Integer bno, Integer page, Integer pageSize, Model m, HttpSession session, RedirectAttributes rattr) {
        String writer = (String) session.getAttribute("id");
        try {
            int rowCnt = boardService.remove(bno, writer);

            m.addAttribute("page", page);
            m.addAttribute("pageSize", pageSize);

            if (rowCnt != 1) {
                throw new Exception("board remove error");
            }

            rattr.addFlashAttribute("msg","DEL_OK"); // redirect 할 때 한 번만 뜬다!
            // 세션에 저장했다가 한 번 쓰고 삭제

        } catch (Exception e) {
            e.printStackTrace();
            rattr.addFlashAttribute("msg", "DEL_ERR");
        }
        return "redirect:/board/list";
    }

    @GetMapping("/read")
    public String read(Integer bno, Integer page, Integer pageSize, Model m) {
        try {
            BoardDto boardDto = boardService.read(bno);
//            m.addAttribute("boardDto", boardDto); // 아래 문장과 동일.
            m.addAttribute(boardDto); // 이름 생략 가능
            m.addAttribute("page", page);
            m.addAttribute("pageSize", pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "board";
    }

    @GetMapping("/list")
    public String list(SearchCondition sc, Model m, HttpServletRequest request) {
//    public String list
//    (@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize, Model m, HttpServletRequest request) {
        if(!loginCheck(request))
            return "redirect:/login/login?toURL="+request.getRequestURL();  // 로그인을 안했으면 로그인 화면으로 이동

//        if (page==null) {
//            page = 1;
//        }
//
//        if (pageSize == null) {
//            pageSize = 10;
//        }

        try {

            int totalCnt = boardService.getSearchResultCnt(sc);
//            int totalCnt = boardService.getCount();
            PageHandler pageHandler = new PageHandler(totalCnt, sc);
//            PageHandler pageHandler = new PageHandler(totalCnt, page, pageSize);

//            Map map = new HashMap();
//            map.put("offset", (page - 1) * pageSize);
//            map.put("pageSize", pageSize);

            List<BoardDto> list = boardService.getSearchResultPage(sc);
//            List<BoardDto> list = boardService.getPage(sc);
            m.addAttribute("list", list);
            m.addAttribute("ph", pageHandler);
//            m.addAttribute("page", page);
//            m.addAttribute("pageSize", pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "boardList"; // 로그인을 한 상태이면, 게시판 화면으로 이동
    }

    private boolean loginCheck(HttpServletRequest request) {
        // 1. 세션을 얻어서
        HttpSession session = request.getSession();
        // 2. 세션에 id가 있는지 확인, 있으면 true를 반환
        return session.getAttribute("id")!=null;
    }
}