package com.nordea.cloud;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Enumeration;

public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException
    {
    	
    	resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("SimpleApp app v1\n\n");
		out.println("Headers:<hr/>");
		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			out.print("Header Name: <em>" + headerName);
			String headerValue = req.getHeader(headerName);
			out.print("</em>, Header Value: <em>" + headerValue);
			out.println("</em><br/>");
		}
    }
}
