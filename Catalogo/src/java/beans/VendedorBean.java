/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Vendedor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Utilizador
 */
@Stateless
public class VendedorBean {

    @PersistenceContext
    EntityManager em;

    public List<Vendedor> getVendedor() {
        return (List<Vendedor>) em.createNamedQuery("Vendedor.findAll").getResultList();
    }

    public Vendedor addVendedor(Vendedor v) {
        em.persist(v);
        return (v);
    }

    public List<Vendedor> removeVendedor(Vendedor v) {
        String query = "SELECT v FROM VENDEDOR v WHERE v.nome = :" + v.getNome();
        return (List<Vendedor>) em.createNativeQuery(query).getResultList();
    }
}
