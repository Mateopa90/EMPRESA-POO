/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Empresas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Empresa empresa = new Empresa("xxx", 123 );
        int continuar=0, opcion=0;
        do{
        System.out.println("1. CREAR DEPARTAMENTO");
        System.out.println("2. CREAR EMPLEADO");
        System.out.println("3. Listar Departamento");
        opcion = in.nextInt();
        if (opcion==1){
            System.out.println("NOMBRE DEL DEPARTAMENTO");
            String nombre = in.next();
            Departamento nuevo = new Departamento(nombre);
            if(empresa.addDepartamento(nuevo)){
                System.out.println("Se agregó Satisfactoriamente");
            }
                else{
                System.out.println("Problemas al registrar el departemento");
            }
        }else if(opcion==2)
            System.out.println("");
        else if(opcion==3){
            ArrayList<Departamento> departamento = empresa.listarDepartamentos();
            for (Departamento Departamento: departamento){
                System.out.println("OPCION INVALIDA");
            }
        }else
            System.out.println("OPCION INVALIDA");
        while(continuar==0);
    }
    
}
