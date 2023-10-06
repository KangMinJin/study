package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // restAPI의 그 rest. view가 아니라 문자를 반환하게 함.
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());
    // 롬복이 제공하는 @Slf4j 사용하면 생략 가능.

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

//        System.out.println("name = " + name); php에서 print나 echo로 확인하는 것과 같음. log사용하는게 더 좋다.

        // 아래로 갈 수록 심각도↑
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

//        log.trace("trace log=" + name);
        // 현재 로그 레벨이 debug여도 trace가 작동을 아예 안 하는게 아니다. 출력만 안 할 뿐.
        // log.trace("trace log=" + name); 이런식으로 쓰면 출력은 안 되도 문자가 합쳐지는 연산이 일어나버려서 리소스낭비가 생김.
        //log.trace("trace log={}", name); 이렇게 쓰면 아무 연산이 일어나지 않는다. trace라서 출력 안 하기 때문.

        return "ok";
    }
}
