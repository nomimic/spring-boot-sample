package nomimic.springboot.starter.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Lucas Yonghee Lee on 2016. 9. 9..
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter : " + request.getRemoteAddr());

        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
