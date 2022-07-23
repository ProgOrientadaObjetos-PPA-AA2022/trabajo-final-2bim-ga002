/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public abstract class PlanCelular {

    protected String nombre;
    protected String cedula;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String nom, String ced, String ciu, String mar,
            String mod, String numeroCe) {
        nombre = nom;
        cedula = ced;
        ciudad = ciu;
        marca = mar;
        modelo = mod;
        numeroCelular = numeroCe;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public void establecerModelo(String mod) {
        modelo = mod;
    }

    public void establecerNumeroCelular(String numeroCe) {
        numeroCelular = numeroCe;
    }

    public abstract void calcularPagoMensual();

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

}
