/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class PlanPostPagoMinutosMegasEconomico {

    private double minutos;
    private double costoMinutos;
    private double megasEnGigas;
    private double costoPorMegas;
    private double porcentajeDescuento;
    private double descuento;

    public PlanPostPagoMinutosMegasEconomico(double m, double cm, double mg, double cxm, double pd) {
        minutos = m;
        costoMinutos = cm;
        estableceMegasEnGigas(mg);
        costoPorMegas = cxm;
        porcentajeDescuento = pd;
    }

    public void establecerMinutos(double m) {
        minutos = m;
    }

    public void estableceCostoMinutos(double cm) {
        costoMinutos = cm;
    }

    public void estableceMegasEnGigas(double mg) {
        megasEnGigas = mg / 1064;
    }

    public void estableceCostoPorMegas(double cxm) {
        costoPorMegas = cxm;
    }

    public void establecePorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
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

    public double obtenerCostoPorMegas() {
        return costoPorMegas;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String data = String.format("Plan Post Pago Minutos Megas Economico\n"
                + "Minutos: %.2f\n"
                + "Costo Minutos: %.2f\n"
                + "Megas en Gigas: %.2f\n"
                + "Costo por Megas: %.2f\n"
                + "Porcentaje Descuento: %.2f\n"
                + "Descuento: %.2f\n",
                minutos,
                costoMinutos,
                megasEnGigas,
                costoPorMegas,
                porcentajeDescuento,
                descuento);
        return data;
    }
}
