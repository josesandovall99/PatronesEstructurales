/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.patronadapter;

import java.util.Scanner;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Cliente {

    private static Scanner n = new Scanner(System.in);
    private static Atencion atencion;

    public static void main(String[] args){
        

        Atencion paciente1 = new Consulta();
        paciente1.ingresoPaciente();
        paciente1.interrogatorio();
        paciente1.salidaPaciente();

        Atencion paciente2 = new Urgencia();
        paciente2.ingresoPaciente();
        paciente2.interrogatorio();
        paciente2.salidaPaciente();

        
        
        Atencion atencionVirtual = new VirtualAdapter();
        atencionVirtual.ingresoPaciente();
        atencionVirtual.interrogatorio();
        atencionVirtual.salidaPaciente();
}
}
