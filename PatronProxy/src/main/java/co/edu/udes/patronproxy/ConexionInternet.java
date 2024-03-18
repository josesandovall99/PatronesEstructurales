/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronproxy;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ConexionInternet implements Internet{
    
    @Override
    public void acceder(String sitioWeb) {
        System.out.println("Accediendo a " + sitioWeb);
    }
    
}
