package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MyServletFilter
 */
public class MyServletFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyServletFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
        System.out.println("Filter triggered");
        System.out.println("IP " + request.getRemoteAddr() + ", Time "
                     + new Date().toString());
        if (request.getParameter("user")!=null&&!request.getParameter("user").equals("admin")) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<HTML><TITLE> Http Servlet Example</TITLE><BODY>");
            out.println("<H2>You are not authorized to login</H2><HR>");
            out.println("</BODY><HTML>");
            out.close();
     } else {
            chain.doFilter(request, response);

     }	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
