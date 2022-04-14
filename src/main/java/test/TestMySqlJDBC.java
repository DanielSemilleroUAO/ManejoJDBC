/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;

/**
 *
 * @author adseglocdom
 */
public class TestMySqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "root12345");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT * FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("Id Persona = " + resultado.getInt("id_persona"));
                System.out.println("Nombre Persona = " + resultado.getString("nombre"));
                System.out.println("Email Persona = " + resultado.getString("email"));
                System.out.println("Telefono Persona = " + resultado.getString("telefono"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
