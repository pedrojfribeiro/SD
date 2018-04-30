/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Cliente {
    
    public String cat;
    public String ip;
    public int port;
    
    public Cliente(){
        cat = "";
        ip = "";
        port = 0;
    }
    public Cliente(String categoria, String IP, int port){
        this.cat = categoria;
        this.ip = IP;
        this.port = port;
    }

    public String getCat() {
        return cat;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cat=" + cat + ", ip=" + ip + ", port=" + port + '}';
    }
    
    
}
