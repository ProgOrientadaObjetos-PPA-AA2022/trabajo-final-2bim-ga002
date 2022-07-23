/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class PlanPostPagoMinutos {

    private double minutosNacionales;
    private double costoMinutosNacionales;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(double mN, double cmN, double mI, double cmI) {
        minutosNacionales = mN;
        costoMinutosNacionales = cmN;
        minutosInternacionales = mI;
        costoMinutoInternacional = cmI;
    }

    public void establecerMinutosNacionales(double mN) {
        minutosNacionales = mN;
    }

    public void establecerCostoMinutosNacionales(double cmN) {
        costoMinutosNacionales = cmN;
    }

    public void establecerMinutosInternacionales(double mI) {
        minutosInternacionales = mI;
    }

    public void establecerCostoMinutoInternacional(double cmI) {
        costoMinutoInternacional = cmI;
    }

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutosNacionales() {
        return costoMinutosNacionales;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    @Override
    public String toString() {
        String data = String.format("Plan Post Pago Minutos\n"
                + "Minutos: %.2f\n"
                + "Costo Minutos: %.2f\n"
                + "Megas en Gigas: %.2f\n"
                + "Costo por Megas: %.2f\n",
                minutosNacionales,
                costoMinutosNacionales,
                minutosInternacionales,
                costoMinutoInternacional);
        return data;
    }
}
