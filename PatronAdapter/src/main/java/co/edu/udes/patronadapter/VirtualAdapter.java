/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronadapter;

/**
 *
 * @author JOSE SANDOVAL
 */
public class VirtualAdapter implements Atencion {

    private Virtual virtual;

    public VirtualAdapter() {
        super();
        System.out.println("Creando Consulta virtual --adapter...");
        this.virtual = new Virtual();
    }

    @Override
    public void ingresoPaciente() {
        System.out.println("Conectando con el paciente --adapter.");
        this.virtual.conectar();
        this.virtual.activar();
    }

    @Override
    public void interrogatorio() {
        System.out.println("Interrogatorio al paciente --adapter.");
        this.virtual.realizarConsulta();
        this.virtual.guardar();
    }

    @Override
    public void salidaPaciente() {
        System.out.println("Terminacion de consulta virtual --adapter.");
        this.virtual.desconectar();
    }

}
