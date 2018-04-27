/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public interface Hello_C_I extends java.rmi.Remote{
    public void printOnClient (String s) throws java.rmi.RemoteException;
}
