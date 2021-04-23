package conexionSQL;


import com.sun.jdi.connect.spi.Connection;

import javax.swing.*;
import java.sql.Driver;
import java.sql.DriverManager;

public class conexionSQL {

    java.sql.Connection conectar = null;
    public Connection conexion() {
        try {
            Class.forName("com.sun.jdi.connect.spi.Driver");
            conectar = DriverManager.getConnection("jdbc;mysql://localhost/escuela","root","");
            JOptionPane.showMessageDialog(null,"conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error"+e.getMessage());
        }
        return (Connection) conectar;
    }
}
