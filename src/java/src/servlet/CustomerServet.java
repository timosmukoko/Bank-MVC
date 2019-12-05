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
@WebServlet(name = "CustomerServlet", urlPatterns = {"/CustomerServlet"})
public class CustomerServet extends HttpServlet {

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
        
        String address ="customerInfo.jsp";
        try  {
        int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String sortCode = request.getParameter("sortCode");
        Double balance = Double.parseDouble(request.getParameter("balance"));
        String operation = request.getParameter("operation");

        Accounts account = new Accounts(accountNumber, firstName, lastName,sortCode, balance );

        if (operation.equalsIgnoreCase("Add")) {
            AccountsDB.insertAccount(account);
            request.setAttribute("account", account);
        } else if (operation.equalsIgnoreCase("Edit")) {
            AccountsDB.updateAccount(account);
            Accounts searchedAccount = AccountsDB.getAccountByID(accountNumber);
            request.setAttribute("account", searchedAccount);
        } else if (operation.equalsIgnoreCase("Delete")) {
            AccountsDB.deleteAccount(account);
            Accounts searchedAccount = AccountsDB.getAccountByID(accountNumber);
            request.setAttribute("account", searchedAccount);
        } else if (operation.equalsIgnoreCase("Search")) {
            Accounts searchedAccount = AccountsDB.getAccountByID(accountNumber);
            request.setAttribute("account", searchedAccount);
        }
        
        }
        catch(NumberFormatException ex) {
             address = "/Error.jsp";
        }//end catch
       
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
//        request.getRequestDispatcher("studentinfo.jsp").forward(request, response);
        
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
