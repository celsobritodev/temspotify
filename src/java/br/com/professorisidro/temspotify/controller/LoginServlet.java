/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.professorisidro.temspotify.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;


/**
 *
 * @author Usuario
 */
public class LoginServlet extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String email=request.getParameter("txtEmail");
          String senha=request.getParameter("txtSenha");
          String pagina;
          if (email.equals("isidro@professorisidro.com.br") && senha.equals("1234")) {
              pagina="/myAccount.jsp";
          } else {
              request.setAttribute("erroSTR","Email / Senha não encontrados!");
              pagina="/error.jsp";
          }
          RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
          dispatcher.forward(request, response);
          
          
    }

  

}
