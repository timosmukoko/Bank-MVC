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
import javax.servlet.http.HttpSession;
import src.db.AccountsDB;
import src.entities.Accounts;

/**
 *
 * @author MTimos
 */
@WebServlet(name = "UpdateRecord", urlPatterns = {"/UpdateRecord"})
public class UpdateRecord extends HttpServlet {

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
        try  {  
            
        int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String sortCode = request.getParameter("sortCode");
        Double balance = Double.parseDouble(request.getParameter("balance"));
        
        Accounts updateAccounts = AccountsDB.getAccountByID(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("update", updateAccounts);
        //Accounts account = new Accounts(accountNumber, firstName, lastName, sortCode, balance);
       
        
        
            
//             HttpSession session = request.getSession(true);
            
           
//            Accounts update = new Accounts();           
            //request.setAttribute("insertAccount", insertAccount);
            updateAccounts.setAccountNumber(accountNumber);
            updateAccounts.setFirstName(firstName);
            updateAccounts.setLastName(lastName);
            updateAccounts.setSortCode(sortCode);
            updateAccounts.setBalance(balance);
            AccountsDB.updateAccount(updateAccounts);
//            
//            session.setAttribute("update", update);
            
        
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
