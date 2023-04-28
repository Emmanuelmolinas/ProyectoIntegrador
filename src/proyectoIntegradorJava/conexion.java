package proyectoIntegradorJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class conexion {

    // Nombre de la base de datos
    public String database = "pronostico";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "emma1989sm";

    public String driver = "com.mysql.cj.jdvc.driver\""
    		  ;
    		 
    		
    		
    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Properties connectionProps = new Properties();
            connectionProps.put("user", this.username);
            connectionProps.put("password", this.password);

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + this.hostname + ":" + this.port + "/" + this.database,
                    connectionProps);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
