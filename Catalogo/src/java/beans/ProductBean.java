/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Produto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pedro
 */
@Stateless
public class ProductBean {

    @PersistenceContext
    EntityManager em;

    public List<Produto> getProducts(){
        return (List<Produto>) em.createNamedQuery("Produto.findAll").getResultList();
    }

    public Produto addProduct(Produto p) {
        em.persist(p);
        return p;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
