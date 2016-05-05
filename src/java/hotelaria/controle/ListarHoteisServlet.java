/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31550525
 */
import hotelaria.modelo.Hotel;
import hotelaria.persistencia.HotelBd;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarHoteisServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HotelBd hotelBd = new HotelBd();
        List<Hotel> hoteis = hotelBd.ler();
        request.setAttribute("hoteis", hoteis);
        RequestDispatcher rd = request.getRequestDispatcher("/lista_hoteis.jsp");
        rd.forward(request, response);
    }
}
