/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronproxy;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Cliente {
    
    public static void main(String[] args) {
        Internet proxyInternet = new ProxyInternet();

        // Acceso permitido
        proxyInternet.acceder("example.com");
        proxyInternet.acceder("google.com");

        // Acceso bloqueado
        proxyInternet.acceder("facebook.com");
    }
    
}
