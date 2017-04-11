package com.bridgelabz.servletFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.ipl.model.User;

public class AuthenticationFilter implements Filter {
	public void destroy() {
	
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession sesion = req.getSession();
		User user = (User) sesion.getAttribute("user");

		if (user == null) {
			resp.sendRedirect("signin");
			return;
		}
		arg2.doFilter(request, response);
	}

}
