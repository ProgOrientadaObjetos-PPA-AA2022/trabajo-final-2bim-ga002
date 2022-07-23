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
    private double costoMega;
    private double tarifaBase;

    public PlanPostPagoMegas(String nom, String ced, String ciu, String mar,
            String mod, String numeroCe, int megasG, double costoM,
            double tarifaB) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        megasGi = megasG;
        costoMega = costoM;
        tarifaBase = tarifaB;
    }

    public void establecerMegasGi(double me) {
        megasGi = me / 1064;
    }

    public void establecerCostoMega(double costoM) {
        costoMega = costoM;
    }

    public void establecerTarifaBase(double tarifaB) {
        tarifaBase = tarifaB;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megasGi * costoMega) + tarifaBase;
    }

    public double obtenerMegasGi() {
        return megasGi;
    }

    public double obtenerCostoMega() {
        return costoMega;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("PlanPostPagoMegas\n%s", super.toString());
        return cadena;
    }
}
