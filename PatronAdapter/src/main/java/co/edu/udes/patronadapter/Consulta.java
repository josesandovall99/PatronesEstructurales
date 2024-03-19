/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronadapter;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Consulta implements Atencion{

    public Consulta(){
        super();
        System.out.println(">> Atencion de Consulta Prioritaria <<");
    }

    @Override
    public void ingresoPaciente() {
        System.out.println("1. Ingresa el paciente a la consulta medica.");
    }

    @Override
    public void interrogatorio() {
        System.out.println("2. Motivo de consulta y demas...");
    }

    @Override
    public void salidaPaciente()
    {
        System.out.println("3. Sale el paciente de la consulta medica.");
        System.out.println("");
    }
    
}
