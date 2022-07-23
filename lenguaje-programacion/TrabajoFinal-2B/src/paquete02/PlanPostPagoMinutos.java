/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private double minutosNacionales;
    private double costoMinutosNacionales;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(String nom, String ced, String ciu, String mar,
            String mod, String numeroCe, double mN, double cmN, double mI,
            double cmI) {
        super(nom, ced, ciu, mar, mod, numeroCe);
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

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutosNacionales)
                + (minutosInternacionales * costoMinutoInternacional);
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
        String data = String.format("Plan Post Pago Minutos\n%s"
                + "Minutos Nacionales: %.2f\n"
                + "Costo Minutos Nacionales: $ %.2f\n"
                + "Minutos Internacionales: %.2f\n"
                + "Costo Minuto Internacional: $ %.2f\n"
                + "Pago Mensual: $ %.2f\n",
                super.toString(),
                minutosNacionales,
                costoMinutosNacionales,
                minutosInternacionales,
                costoMinutoInternacional,
                pagoMensual);
        return data;
    }
}
