/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megasGi;
    private double costoGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(String nom, String ced, String ciu, String mar,
            String mod, String numeroCe, double megasG, double costoM,
            double tarifaB) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        establecerMegasGi(megasG);
        costoGiga = costoM;
        tarifaBase = tarifaB;
    }

    public void establecerMegasGi(double me) {
        megasGi = me / 1064;
    }

    public void establecerCostoMega(double costoM) {
        costoGiga = costoM;
    }

    public void establecerTarifaBase(double tarifaB) {
        tarifaBase = tarifaB;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megasGi * costoGiga) + tarifaBase;
    }

    public double obtenerMegasGi() {
        return megasGi;
    }

    public double obtenerCostoMega() {
        return costoGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plan Post Pago Megas\n"
                + "%sMegas en Gigas: %.2f\n"
                + "Costo por cada Giga: $ %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Pago Mensual: $ %.2f\n",
                super.toString(),
                megasGi,
                costoGiga,
                tarifaBase,
                pagoMensual);
        return cadena;
    }
}
