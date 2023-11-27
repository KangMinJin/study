package com.springboot.ch2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*") // 모든 요청에 PerformanceFilter 적용
public class PerformanceFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 1. 전처리 작업
        long startTime = System.currentTimeMillis();

        // 2. 서블릿(컨트롤러) 또는 다음 필터
        chain.doFilter(request, response);

        // 3. 후처리 작업
        long endTime = System.currentTimeMillis();
        System.out.print("[" + ((HttpServletRequest)request).getRequestURI() + "]");
        // 어디서 호출되었는지 출력
        System.out.println(" time = "+(endTime-startTime));
        // 작업이 실행되는데 걸리는 시간 계산
    }
}
