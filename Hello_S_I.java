/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public interface Hello_S_I extends java.rmi.Remote{
    
    public void printOnServer(String s)throws java.rmi.RemoteException;
    public void subscribe(String s, Hello_C_I cliente) throws java.rmi.RemoteException;
    
}

    
