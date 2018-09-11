package servlets;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.interfaces.UserDao;
import dao.jdbc.ConnectionProvider;
import dao.jdbc.UserDaoImpl;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;





public class Login extends HttpServlet {



    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	final String emailid = request.getParameter("emailid");
        final String Password = request.getParameter("password");
          UserDaoImpl impl = new UserDaoImpl();
          impl.authenticateUser(emailid, Password);
          PrintWriter out=response.getWriter();
          response.setContentType("text/html");
        
          if(true)
          {
        	  response.sendRedirect("/home.jsp");
          }
          else
          {
        	  out.println("invalid details");
        	  request.getRequestDispatcher("/login.jsp").forward(request, response);
          }
    }
}

  /*  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
        
        
    }
       

    private void showError(String errorMessage, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setAttribute("errorMessage", errorMessage);
        
    }

}*/