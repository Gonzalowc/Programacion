package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static Connection con =null;

    public static Connection  conector() {
        try{
            if(con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost:3333/classicmodels?user=root&password=123456"+
                        "&useUnicode=true&useJDBCCompliantTimezoneSift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
                System.out.println("Conexion establecida");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }

    public static void close(){
        try{
            if(con!=null){
                con.close();
                System.out.println("Conexion finalizada");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
