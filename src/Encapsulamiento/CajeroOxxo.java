/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author sergi
 */
public class CajeroOxxo {
    private int id;//set get
    private String nombre;//set get 
    private String locacion;//get
    private String tipo;//get
    private String horario;//set get
    private double salario;//get
    
    public void NoAtenderLaSegundaCaja(){
        System.out.println("La segunda caja esta cerrada");
    }
    public void DormirseEnLaBodega(){
        System.out.println("Ya es noche y no quiero atender");
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHorario() {
        return horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CajeroOxxo(int id, String nombre, String locacion, String tipo, String horario, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.locacion = locacion;
        this.tipo = tipo;
        this.horario = horario;
        this.salario = salario;
    }
    
}

