/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String Nombre;
    private int NIT;
    private ArrayList <Empleado> empleados;
    private ArrayList <Departamento> departamentos;

    public Empresa(String Nombre, int NIT) {
        this.Nombre = Nombre;
        this.NIT = NIT;
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNIT() {
        return NIT;
    }
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public boolean addEmpleado (Empleado empleado){
        if(this.empleados.add(empleado)==true)
            return true;
        else
            return false;
    } 
    
    public boolean addDepartamento (Departamento departamento){
        if (this.departamentos.add(departamento)==true)
            return true;
        else
            return false;
    }
    public ArrayList<Departamento> listarDepartamentos(){
        return this.departamentos;
    }
    
    public Empleado darDirector(String NombreDepartamento){
        Empleado Director = null;
        for ( int i; i < this.departamentos.size();i++){
            Departamento aux = this.departamentos.get(i);
            if (aux.getNombre().equals( NombreDepartamento )){
                Director = aux.darDirector();
                break;
            }
        }
        return Director;
    }
}


