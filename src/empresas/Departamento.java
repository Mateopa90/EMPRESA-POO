/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

/**
 *
 * @author Estudiante
 */
public class Departamento {
    private String Nombre;
    private Empleado Revisor;
    private Empleado[] Empleados;
    private Empleado Director;
    private int EmpleadosRegistrados;
    
    public Departamento ( String Nombre){
        this.Nombre = Nombre;
        this.Empleados = new Empleado[20];
        this.EmpleadosRegistrados = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public Empleado getRevisor() {
        return Revisor;
    }

    public Empleado[] getEmpleados() {
        return Empleados;
    }

    public Empleado getDirector() {
        return Director;
    }

    public int getEmpleadosRegistrados() {
        return EmpleadosRegistrados;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRevisor(Empleado Revisor) {
        this.Revisor = Revisor;
    }

    public void setEmpleados(Empleado[] Empleados) {
        this.Empleados = Empleados;
    }

    public void setDirector(Empleado Director) {
        this.Director = Director;
    }

    public void setEmpleadosRegistrados(int EmpleadosRegistrados) {
        this.EmpleadosRegistrados = EmpleadosRegistrados;
    }
    
    public boolean addDirector(Empleado director){
        this.Director = director;
        return true;
    }
    
    public boolean addRevisor( Empleado revisor ){
        this.Revisor = revisor;
        return true;
    }
    
    public Empleado darDirector(){
        return this.Director;
    }
    
    public boolean addEmpleado(Empleado empleado){
        if (this.EmpleadosRegistrados < 20){
            this.Empleados[this.EmpleadosRegistrados] = empleado;
            this.EmpleadosRegistrados++;
            return true;
        }
        else
            return false;
    } 

}
