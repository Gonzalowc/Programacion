package jdbc;

import com.google.gson.Gson;
import conector.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static List<Office> ObtenerOficinas(){
        Connection con = ConexionDB.conector();
        String sql = "SELECT * FROM offices";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            ArrayList<Office> oficinas = new ArrayList<>();
            ResultSet result = stmt.executeQuery();
            while (result.next()){
                oficinas.add(new Office(result));
            }
            return oficinas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    public static void mostrarOficinasJSON(List<Office> oficinas){
        Gson json = new Gson();
        System.out.println("OFICINAS Objeto: "+oficinas);
        String oficinasJSON = json.toJson(oficinas);
        ordenarJSON(oficinasJSON);
    }
    public static void ordenarJSON(String json){
        String copia = json;
        copia = copia.replace("\",\"","\",\n\"");
        copia = copia.replace("},{","},\n{");
        System.out.println("OFICINAS JSON:\n"+copia);
    }
}
