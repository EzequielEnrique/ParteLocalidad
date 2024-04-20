/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conector.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class LlenarComboBox {
    
    public static void llenarComboBox(JComboBox comboBox) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = new Conector().getConexion(); // Obtén la conexión desde la clase Conector
            String query = "SELECT provNombre FROM Provincias"; // Reemplaza 'tabla' con el nombre de tu tabla en la base de datos
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String item = rs.getString("provNombre"); // Reemplaza 'nombre' con el nombre de la columna que quieres mostrar en el JComboBox
                comboBox.addItem(item);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}

