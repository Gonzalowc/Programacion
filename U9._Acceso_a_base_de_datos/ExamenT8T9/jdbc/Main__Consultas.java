package jdbc;

import conector.ConexionDB;

public class Main__Consultas {
    public static void main(String[] args) {
        Consultas.mostrarOficinasJSON(Consultas.ObtenerOficinas());
        ConexionDB.close();
    }
}
