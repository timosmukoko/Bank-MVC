/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.servlet;

import java.io.IOException;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.db.AccountsDB;
import src.entities.Accounts;

/**
 *
 * @author MTimos
 */
@WebServlet(name = "Servlet_1", urlPatterns = {"/Servlet_1"})
public class Servlet_1 extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
   try{         
    
//    Accounts a = AccountsDB.getAcountByID(new Integer(5));
//    
//    out.println(a.getFirstName() );
      out.println("Yes");
//    out.println(a.getLastName());
    
    
    List<Accounts> allAcountsList = AccountsDB.getAllAccounts();
    
    request.setAttribute("allAcountsList", allAcountsList);
                        
    RequestDispatcher rd = request.getRequestDispatcher("showAllAccounts.jsp");
            
    rd.forward(request, response);
   }
  catch(Exception ex) {
            log("ERROR: " + ex);
        }
//    out.println(" <br> <b> Details For All Accounts</b> " + allAcountsList.size() + "<br>");
//    
//    for(Accounts anAcount: allAcountsList){
//        out.println("<br>" + anAcount.getFirstName() + " " + anAcount.getLastName());
//        }
            
//     }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
