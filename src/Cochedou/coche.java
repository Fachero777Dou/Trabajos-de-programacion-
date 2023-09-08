/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cochedou;

/**
 *
 * @author sergi
 */
public class coche {
    private String Marca;
    private String Modelo;
    private String Color;
    private String Matricula;
    private double Precio;
    static double Descuento = 2000;
    
    public void Arrancar(){
    }
    public void Detenerse(){
    }
    public void Acelerar(){
    }
    public void Frenar(){        
    }
    public void verPrecio(){
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return Color;
    }

    public String getMatricula() {
        return Matricula;
    }

    public double getPrecio() {
        return Precio;
    }

    public static double getDescuento() {
        return Descuento;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public static void setDescuento(double Descuento) {
        coche.Descuento = Descuento;
    }

    public coche(String Marca, String Modelo, String Color, String Matricula, double Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Matricula = Matricula;
        this.Precio = Precio;
    }

}
