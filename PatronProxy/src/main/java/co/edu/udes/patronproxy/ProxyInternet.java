/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronproxy;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ProxyInternet implements Internet{
    
    private Internet conexionInternet;

    public ProxyInternet() {
        conexionInternet = new ConexionInternet();
    }
    
    @Override
    public void acceder(String sitioWeb) {
        // Verificar si el sitio web está permitido
        if (sitioWeb.equals("example.com") || sitioWeb.equals("google.com")) {
            conexionInternet.acceder(sitioWeb);
        } else {
            System.out.println("Acceso a " + sitioWeb + " bloqueado.");
        }
    }
    
}
