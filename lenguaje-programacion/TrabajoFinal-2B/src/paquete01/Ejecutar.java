/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        int opc;
        while (bandera) {
            System.out.printf("--------Menu Planes de Celular--------\n| 1 | "
                    + "Plan Post Pago Minutos\n| 2 | Plan Post Pago Megas\n"
                    + "| 3 | Plan Post Pago Minutos Megas\n| 4 |"
                    + " Plan Post Pago Minutos Megas Economico\n"
                    + "| 5 | Salir\n");
            opc = entrada.nextInt();
            if (opc >= 1 && opc <= 4) {
                entrada.nextLine();
                System.out.println("Nombre del Propietario");
                String nom = entrada.nextLine();
                System.out.println("Cedula del Propietario");
                String ced = entrada.nextLine();
                System.out.println("Ciudad del Propietario");
                String ciu = entrada.nextLine();
                System.out.println("Marca del celular");
                String mar = entrada.nextLine();
                System.out.println("Modelo del celular");
                String mod = entrada.nextLine();
                System.out.println("Numero del celular");
                String numCel = entrada.nextLine();
                if (opc == 1) {
                    System.out.println("Minutos Nacionales");
                    double minNa = entrada.nextDouble();
                    System.out.println("Costo minuto Nacional");
                    double cosMinNa = entrada.nextDouble();
                    System.out.println("Minutos Internacionales");
                    double minInter = entrada.nextDouble();
                    System.out.println("Costo minuto Internacional");
                    double cosMinInter = entrada.nextDouble();
                    PlanPostPagoMinutos plan1
                            = new PlanPostPagoMinutos(nom, ced, ciu, mar, mod,
                                    numCel, minNa, cosMinNa, minInter,
                                    cosMinInter);
                    plan1.calcularPagoMensual();
                    System.out.println(plan1);
                } else {
                    if (opc == 2) {
                        System.out.println("Megas");
                        double meg = entrada.nextDouble();
                        System.out.println("Costo por cada Giga");
                        double cosGi = entrada.nextDouble();
                        System.out.println("tarifa Base");
                        double tari = entrada.nextDouble();
                        PlanPostPagoMegas plan2
                                = new PlanPostPagoMegas(nom, ced, ciu, mar, mod,
                                        numCel, meg, cosGi, tari);
                        plan2.calcularPagoMensual();
                        System.out.println(plan2);
                    } else {
                        if (opc == 3) {
                            System.out.println("Minutos");
                            double min = entrada.nextDouble();
                            System.out.println("Costo Minutos");
                            double costMin = entrada.nextDouble();
                            System.out.println("Megas");
                            double meg = entrada.nextDouble();
                            System.out.println("Costo por cada giga");
                            double cosGi = entrada.nextDouble();
                            PlanPostPagoMinutosMegas plan3
                                    = new PlanPostPagoMinutosMegas(nom, ced,
                                            ciu, mar, mod, numCel, min, costMin,
                                            meg, cosGi);
                            plan3.calcularPagoMensual();
                            System.out.println(plan3);
                        } else {
                            if (opc == 4) {
                                System.out.println("Minutos");
                                double min = entrada.nextDouble();
                                System.out.println("Costo Minutos");
                                double costMin = entrada.nextDouble();
                                System.out.println("Megas");
                                double meg = entrada.nextDouble();
                                System.out.println("Costo por cada giga");
                                double cosGi = entrada.nextDouble();
                                System.out.println("Porcentaje de Descuento");
                                double des = entrada.nextDouble();
                                PlanPostPagoMinutosMegasEconomico plan4
                                        = new PlanPostPagoMinutosMegasEconomico(
                                                nom, ced, ciu, mar, mod, numCel,
                                                min, costMin, meg, cosGi, des);
                                plan4.calcularPagoMensual();
                                System.out.println(plan4);
                            } else {
                                if (opc == 5) {
                                    bandera = false;
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Valor fuera del Rango Permitido");
            }
        }
    }

}
