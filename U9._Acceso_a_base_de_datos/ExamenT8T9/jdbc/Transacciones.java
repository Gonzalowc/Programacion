package jdbc;

import conector.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static boolean insertarCliente (Cliente cliente, Payment pago1, Payment pago2){
        if(cliente.getCustomerNumber() == pago1.getCustomerNumber() && cliente.getCustomerNumber()== pago2.getCustomerNumber()){
            Connection con = ConexionDB.conector();
            try{
                con.setAutoCommit(false);
                insertCustomer(cliente);
                insertPayment(pago1);
                insertPayment(pago2);
                con.commit();
                con.setAutoCommit(true);
                return true;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                try{
                    System.out.println("Dejando la base de datos sin modificar");
                    con.rollback();
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }
        }else{
            System.out.println("Los datos no son compatibles");
        }

        return false;
    }

    public static void insertPayment(Payment pago){
        Connection con = ConexionDB.conector();
        String sql = "INSERT INTO payments(`customerNumber`,`checkNumber`,`paymentDate`,`amount`) VALUES(?,?,?,?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1,pago.getCustomerNumber());
            stmt.setString(2,pago.getCheckNumber());
            stmt.setString(3, pago.getPaymentDate());
            stmt.setDouble(4,pago.getAmount());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insertCustomer(Cliente cliente){
        Connection con = ConexionDB.conector();
        String sql = "INSERT INTO customers(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`," +
                "`addressLine1`,`city`,`country`)"+
                "VALUES(?,?,?,?,?,?,?,?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1,cliente.getCustomerNumber());
            stmt.setString(2,cliente.getCustomerName());
            stmt.setString(3,cliente.getContactLastName());
            stmt.setString(4,cliente.getContactFirstName());
            stmt.setString(5,cliente.getPhone());
            stmt.setString(6,cliente.getAddressLine1());
            stmt.setString(7,cliente.getCity());
            stmt.setString(8,cliente.getCountry());
            stmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
