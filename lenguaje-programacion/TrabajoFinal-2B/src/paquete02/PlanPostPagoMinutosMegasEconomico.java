/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double megasEnGigas;
    private double costoPorGiga;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(String nom, String ced, String ciu,
            String mar, String mod, String numeroCe, double m, double cm,
            double mg, double cxm, double pd) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        minutos = m;
        costoMinutos = cm;
        establecerMegasEnGigas(mg);
        costoPorGiga = cxm;
        porcentajeDescuento = pd;
    }

    public void establecerMinutos(double m) {
        minutos = m;
    }

    public void establecerCostoMinutos(double cm) {
        costoMinutos = cm;
    }

    public void establecerMegasEnGigas(double mg) {
        megasEnGigas = mg / 1064;
    }

    public void establecerCostoPorGigas(double cxm) {
        costoPorGiga = cxm;
    }

    public void establecerPorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((minutos * costoMinutos) + (megasEnGigas * costoPorGiga));
        pagoMensual = pagoMensual - ((pagoMensual * porcentajeDescuento) / 100);
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

    public double obtenerCostoPorGigas() {
        return costoPorGiga;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String data = String.format("Plan Post Pago Minutos Megas Economico\n%s"
                + "Minutos: %.2f\n"
                + "Costo Minutos: $%.2f\n"
                + "Megas en Gigas: %.2f\n"
                + "Costo por Megas: $%.2f\n"
                + "Porcentaje Descuento: %.2f%%\n"
                + "Pago Mensual: $%.2f\n",
                super.toString(),
                minutos,
                costoMinutos,
                megasEnGigas,
                costoPorGiga,
                porcentajeDescuento,
                pagoMensual);
        return data;
    }
}
