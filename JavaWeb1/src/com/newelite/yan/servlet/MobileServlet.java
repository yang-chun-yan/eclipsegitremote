package com.newelite.yan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MobileServlet")
public class MobileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MobileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("utf-8");
          response.setCharacterEncoding("utf-8");
          response.setContentType("text/html;charset=UTF-8");
          String mobile=request.getParameter("mobile");
          //假设数据库只有一个号码：1888888888
            
          PrintWriter out=response.getWriter();
          if("188888888".equals(mobile)){
        	  out.print("true");//以输出流的方式将信息返回给客户端
          }else{
        	  out.print("false");
          }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
