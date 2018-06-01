/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import beans.ProductBean;
import beans.VendedorBean;
import entity.Produto;
import entity.Vendedor;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author pedro
 */
@Named(value = "ExtrasCtl")
@RequestScoped
public class ExtrasCtl {
    
    @EJB
    private ProductBean pb;
    @EJB
    private VendedorBean vb;
    
    private int aux=0;
    private String nm = "";
    
    List<Produto> productList = new ArrayList<>();
    List<Vendedor> vendedorList = new ArrayList<>();
    
    Vendedor vende = new Vendedor();
    Produto prod = new Produto();

    /**
     * @return the pb
     */
    public ProductBean getPb() {
        return pb;
    }

    /**
     * @param pb the pb to set
     */
    public void setPb(ProductBean pb) {
        this.pb = pb;
    }

    /**
     * @return the vb
     */
    public VendedorBean getVb() {
        return vb;
    }

    /**
     * @param vb the vb to set
     */
    public void setVb(VendedorBean vb) {
        this.vb = vb;
    }
    
    public String mostraVendedor(){
        for(int i=0; i < productList.size(); i++){
            if(productList.get(i).getProdid() == aux){
         
                nm = vendedorList.get(i).getNome();
                
                //setNm(productList.get(i).getNome());
                return "showVendedorProd.xhmtl";
            }
        }
    return "index.xhtml";
    }

    /**
     * @return the aux
     */
    public int getAux() {
        return aux;
    }

    /**
     * @param aux the aux to set
     */
    public void setAux(int aux) {
        this.aux = aux;
    }

    /**
     * @return the nm
     */
    public String getNm() {
        return nm;
    }

    /**
     * @param nm the nm to set
     */
    public void setNm(String nm) {
        this.nm = nm;
    }
    
}
