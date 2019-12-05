/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "InsertRecord", urlPatterns = {"/InsertRecord"})
public class InsertRecord extends HttpServlet {

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
        
        String address = "/Successfull.jsp";
        try {
                         
           // HttpSession session = request.getSession(true);
            
            int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String sortCode = request.getParameter("sortCode");
            Double balance = Double.parseDouble(request.getParameter("balance"));
           
            Accounts insertAccount = new Accounts();           
//            request.setAttribute("insertAccount", insertAccount);
            insertAccount.setAccountNumber(accountNumber);
            insertAccount.setFirstName(firstName);
            insertAccount.setLastName(lastName);
            insertAccount.setSortCode(sortCode);
            insertAccount.setBalance(balance);
            
            AccountsDB.insertAccount(insertAccount);
           
//            session.setAttribute("customer", c);
        
          }
        catch(NumberFormatException ex) {
             address = "/Error.jsp";
        }//end catch
       
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
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
