/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import src.entities.Accounts;

/**
 *
 * @author MTimos
 */
public class AccountDB2 {
    
     @PersistenceContext private EntityManager em;
    
    public void addAccount(Accounts account) {
        em.persist(account);
    }
    public void editAccount(Accounts account){
        em.merge(account);
    }
    public void deleteAccountt(String id){
        Accounts account = em.find(Accounts.class, id);
        em.remove(account);
    }
    public Accounts getAccount(String id){
        return em.find(Accounts.class, id);
    }
    public List getAllAccounts(){
        return em.createNamedQuery("Student.getAll").getResultList();
    }
    
}
