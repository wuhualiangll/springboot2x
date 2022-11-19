package com.example.filterdemo.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "myUserFilter",urlPatterns = "/*")
public class MyUserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*过滤方法 主要是对request和response进行一些处理，然后交给下一个过滤器或Servlet处理*/
        /*。例如实现URL级别的权限访问控制、过滤敏感词汇、压缩响应信息等一些高级功能。*/

        //getParameter无法获取restful 风格的参数  @RequestParam 可以通过下面这样获取
        //想要通过下面获取参数，需要的请求url 为    http://localhost:8088/user？name=wuhualiang
        String username = servletRequest.getParameter("name");
       //http://localhost:8088/user/name=wuhualiang  这是restful 风格的请求，参数是绑定在url的
        System.out.println("参数是"+username);
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("请求路径"+requestURL.toString());
        //获取url 对角色所拥有的url 进行匹配，达到权限控制的目的
        String token = req.getHeader("token");
        //这里可以对请求头携带的token 进行处理
        System.out.println(token);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
