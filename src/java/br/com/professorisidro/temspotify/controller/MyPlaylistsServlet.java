/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.professorisidro.temspotify.controller;

import br.com.professorisidro.temspotify.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyPlaylistsServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String paginaRetorno;
        Usuario usuario = (Usuario) request.getSession().getAttribute("Usuario");
        if (usuario == null) {
            paginaRetorno="/index.html";
        } else {
            paginaRetorno="/myPlaylists.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaRetorno);
        dispatcher.forward(request, response);
        
        
       
    }

   

}
