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
public class Empleado {
    private String Nombre;
    private double Salario;
    private Departamento revisor;
    private Empleado[] Empleados;

    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Empleados = new Empleado[10];
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public Departamento getRevisor() {
        return revisor;
    }

    public Empleado[] getEmpleados() {
        return Empleados;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setRevisor(Departamento revisor) {
        this.revisor = revisor;
    }

    public void setEmpleados(Empleado[] Empleados) {
        this.Empleados = Empleados;
    }
    
    
    
}
