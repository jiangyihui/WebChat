package com.example;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class HttpHeaderFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        //设置跨域
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        System.out.println(request.getRequestURL());
        System.out.println(request.getHeader("Origin"));
        System.out.println(request.getHeader("cookie"));
        System.out.println("=======");

        response.setHeader("cookie",request.getHeader("cookie"));
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.addHeader("Access-Control-Allow-Credentials","true");
        //System.out.println("*********************************过滤器被使用**************************");
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}
