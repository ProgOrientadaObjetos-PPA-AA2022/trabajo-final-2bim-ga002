/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.PlanCelular;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author Jonathan Coronel y Pablo Figeroa
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            //System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos "
                    + "(nombre,cedula,ciudad,marca,modelo,numeroCelular,"
                    + "minutosNacionales,costoMinutosNacionales,"
                    + "minutosInternacionales,costoMinutoInternacional,"
                    + "pagoMensual) "
                    + "values ('%s', '%s','%s','%s','%s','%s',%s,%s,"
                    + "%s,%s,%s)",
                    plan1.obtenerNombre(),
                    plan1.obtenerCedula(),
                    plan1.obtenerCiudad(),
                    plan1.obtenerMarca(),
                    plan1.obtenerModelo(),
                    plan1.obtenerNumeroCelular(),
                    plan1.obtenerMinutosNacionales(),
                    plan1.obtenerCostoMinutosNacionales(),
                    plan1.obtenerMinutosInternacionales(),
                    plan1.obtenerCostoMinutoInternacional(),
                    plan1.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan2) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas "
                    + "(nombre,cedula,ciudad,marca,modelo,numeroCelular,"
                    + "megasGi,costoGiga,tarifaBase,pagoMensual) "
                    + "values ('%s', '%s','%s','%s','%s','%s',%s,%s,"
                    + "%s,%s)",
                    plan2.obtenerNombre(),
                    plan2.obtenerCedula(),
                    plan2.obtenerCiudad(),
                    plan2.obtenerMarca(),
                    plan2.obtenerModelo(),
                    plan2.obtenerNumeroCelular(),
                    plan2.obtenerMegasGi(),
                    plan2.obtenerCostoMega(),
                    plan2.obtenerTarifaBase(),
                    plan2.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan3) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas "
                    + "(nombre,cedula,ciudad,marca,modelo,numeroCelular,"
                    + "minutos,costoMinutos,megasEnGigas,costoPorGiga"
                    + ",pagoMensual) "
                    + "values ('%s', '%s','%s','%s','%s','%s',%s,%s,"
                    + "%s,%s,%s)",
                    plan3.obtenerNombre(),
                    plan3.obtenerCedula(),
                    plan3.obtenerCiudad(),
                    plan3.obtenerMarca(),
                    plan3.obtenerModelo(),
                    plan3.obtenerNumeroCelular(),
                    plan3.obtenerMinutos(),
                    plan3.obtenerCostoMinutos(),
                    plan3.obtenerMegasEnGigas(),
                    plan3.obtenerCostoPorGiga(),
                    plan3.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(
            PlanPostPagoMinutosMegasEconomico plan4) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO "
                    + "PlanPostPagoMinutosMegasEconomico "
                    + "(nombre,cedula,ciudad,marca,modelo,numeroCelular,"
                    + "minutos,costoMinutos,megasEnGigas,costoPorGiga"
                    + ",porcentajeDescuento,pagoMensual) "
                    + "values ('%s', '%s','%s','%s','%s','%s',%s,%s,"
                    + "%s,%s,%s,%s)",
                    plan4.obtenerNombre(),
                    plan4.obtenerCedula(),
                    plan4.obtenerCiudad(),
                    plan4.obtenerMarca(),
                    plan4.obtenerModelo(),
                    plan4.obtenerNumeroCelular(),
                    plan4.obtenerMinutos(),
                    plan4.obtenerCostoMinutos(),
                    plan4.obtenerMegasEnGigas(),
                    plan4.obtenerCostoPorGigas(),
                    plan4.obtenerPorcentajeDescuento(),
                    plan4.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanCelular> obtenerDataPlanCelular() {
        ArrayList<PlanCelular> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutos;";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos plan1 = new PlanPostPagoMinutos(
                        rs.getString("nombre"), rs.getString("cedula"),
                        rs.getString("ciudad"), rs.getString("marca"),
                        rs.getString("modelo"), rs.getString("numeroCelular"),
                        rs.getDouble("minutosNacionales"),
                        rs.getDouble("costoMinutosNacionales"),
                        rs.getDouble("minutosInternacionales"),
                        rs.getDouble("costoMinutoInternacional"),
                        rs.getDouble("pagoMensual"));
                lista.add(plan1);
            }
            Statement statement1 = obtenerConexion().createStatement();
            String data1 = "Select * from PlanPostPagoMegas;";
            ResultSet rs1 = statement1.executeQuery(data1);
            while (rs1.next()) {
                PlanPostPagoMegas plan2 = new PlanPostPagoMegas(
                        rs1.getString("nombre"), rs1.getString("cedula"),
                        rs1.getString("ciudad"), rs1.getString("marca"),
                        rs1.getString("modelo"), rs1.getString("numeroCelular"),
                        rs1.getDouble("megasGi"),
                        rs1.getDouble("costoGiga"),
                        rs1.getDouble("tarifaBase"),
                        rs1.getDouble("pagoMensual"));
                lista.add(plan2);
            }
            Statement statement2 = obtenerConexion().createStatement();
            String data2 = "Select * from PlanPostPagoMinutosMegas;";
            ResultSet rs2 = statement2.executeQuery(data2);
            while (rs2.next()) {
                PlanPostPagoMinutosMegas plan3 = new PlanPostPagoMinutosMegas(
                        rs2.getString("nombre"), rs2.getString("cedula"),
                        rs2.getString("ciudad"), rs2.getString("marca"),
                        rs2.getString("modelo"), rs2.getString("numeroCelular"),
                        rs2.getDouble("minutos"),
                        rs2.getDouble("costoMinutos"),
                        rs2.getDouble("megasEnGigas"),
                        rs2.getDouble("costoPorGiga"),
                        rs2.getDouble("pagoMensual"));
                lista.add(plan3);
            }
            Statement statement3 = obtenerConexion().createStatement();
            String data3 = "Select * from PlanPostPagoMinutosMegasEconomico;";
            ResultSet rs3 = statement3.executeQuery(data3);
            while (rs3.next()) {
                PlanPostPagoMinutosMegasEconomico plan3
                        = new PlanPostPagoMinutosMegasEconomico(
                                rs3.getString("nombre"),
                                rs3.getString("cedula"),
                                rs3.getString("ciudad"),
                                rs3.getString("marca"),
                                rs3.getString("modelo"),
                                rs3.getString("numeroCelular"),
                                rs3.getDouble("minutos"),
                                rs3.getDouble("costoMinutos"),
                                rs3.getDouble("megasEnGigas"),
                                rs3.getDouble("costoPorGiga"),
                                rs3.getDouble("porcentajeDescuento"),
                                rs3.getDouble("pagoMensual"));
                lista.add(plan3);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanCelular");
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
