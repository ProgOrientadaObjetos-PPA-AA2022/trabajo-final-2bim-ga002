/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double megasEnGigas;
    private double gigas;
    private double costoPorGiga;

    public PlanPostPagoMinutosMegas(String nom, String ced, String ciu,
            String mar, String mod, String numeroCe, double m,
            double cm, double mg, double cxg) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        minutos = m;
        costoMinutos = cm;
        estableceMegasEnGigas(mg);
        costoPorGiga = cxg;
    }

    public PlanPostPagoMinutosMegas(String nom, String ced, String ciu,
            String mar, String mod, String numeroCe, double m,
            double cm, double gi, double cxg, double pagMen) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        minutos = m;
        costoMinutos = cm;
        gigas = gi;
        costoPorGiga = cxg;
        pagoMensual = pagMen;
    }

    public void establecerMinutos(double m) {
        minutos = m;
    }

    public void estableceCostoMinutos(double cm) {
        costoMinutos = cm;
    }

    public void estableceMegasEnGigas(double mg) {
        megasEnGigas = mg / 1024;
    }

    public void establecerGigas(double gi) {
        gigas = gi;
    }

    public void estableceCostoPorGiga(double cxg) {
        costoPorGiga = cxg;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (megasEnGigas * costoPorGiga);
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoPorGiga() {
        return costoPorGiga;
    }

    @Override
    public String toString() {
        String data = String.format("\tPlan Post Pago Minutos Megas\n%s"
                + "Minutos: %.2f\n"
                + "Costo Minutos: $%.2f\n"
                + "Megas en Gigas: %.2f\n"
                + "Costo por Megas: $%.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                minutos,
                costoMinutos,
                gigas,
                costoPorGiga,
                pagoMensual);
        return data;
    }
}
