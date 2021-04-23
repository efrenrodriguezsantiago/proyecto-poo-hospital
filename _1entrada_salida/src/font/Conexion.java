package font;

import com.sun.jdi.connect.spi.Connection;

import java.beans.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cn;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=asistencia";
    String drv = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String usu = "sa";
    String pass = "20Peru20";

//    String url = "jdbc:mysql://localhost/controlasistencia?useSSL=false";
//    String drv = "com.mysql.jdbc.Driver";
//    String usu = "root";
//    String pass = "root";

    public Statement stm = null;
    ResultSet rs = null;
    public Connection ConeccionSQL() {

        try {
            Class.forName(drv);//driver
            cn = (Connection) DriverManager.getConnection(url, usu, pass);
            //pstm = cn.prepareStatement(sql);
            //stm = cn.createStatement();
//            JOptionPane.showMessageDialog(null, "Conexion Exitosa PRUEB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e);
        }
        return cn;
    }

//    public void ConeccionSQL() {
//        try {
//            Class.forName("");
//            cn = DriverManager.getConnection(";user=sa;password=");
//            System.out.println("conectado a base de datos");
//        } catch (SQLException e) {
//            System.out.println("Sql Exception: " + e);
//        } catch (ClassNotFoundException ex) {
//            System.out.println("Class not found Exceptio: " + ex);
//        }
//    }

    //    public void ConeccionSQL() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//            //con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=veterinario;user=sa;password=Sql2018;");
//            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=veterinario;user=sa;password=Sql2017;");
//            System.out.println("conectado a base de datos");
//        } catch (SQLException sqle) {
//            System.out.println("Sql Exception: " + sqle.getMessage());
//        } catch (ClassNotFoundException e) {
//            System.out.println("Class not found Exceptio: " + e.getMessage());
//        }
//    }
    public void CerrarConexion() {
        try {
            cn.close();
        } catch (IOException sqle) {
            System.out.println("Sql Exception: " + sqle.getMessage());
        }
    }

    public ResultSet getDatos(String com) {
        try {
            this.ConeccionSQL();
            //rs = stm.executeQuery(com);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getDatos: " + e);
        }
        return rs;
    }
}
