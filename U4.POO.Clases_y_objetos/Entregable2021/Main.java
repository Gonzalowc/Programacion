package Entregable2021;

import static Entregable2021.Empleado.getCantEmpleados;
import static Entregable2021.Departamento.getCantDepart;
public class Main {
    public static void main(String[] args) {
        Empresa Em1 = new Empresa("Javalandia");
        Departamento informatica = new Departamento("Informatica","Madrid","+34");
        Departamento RRRPP = new Departamento("Relaciones Públicas","Sevilla","+05");
        Departamento mantenimiento = new Departamento("Mantenimiento","+07");
        Empleado gonzalo = new Empleado("Gonzalo WC","12345","667578285",TipoEmpleado.ADMINISTRATIVO);
        Empleado  pepe = new Empleado("Pepe GN","123","666757333");
        Empleado  Angela = new Empleado("Angela BG","12355","11111111",TipoEmpleado.DIRECTIVO);
        Empleado  alis = new Empleado("Alicia BB","12355231","22222222");
        Empleado oscar = new Empleado("Óscar CC", "111","123456",TipoEmpleado.DIRECTIVO);
        Empleado pedro = new Empleado("Pedro Larr","2345678","22222",TipoEmpleado.TECNICO);

        informatica.addEmpleado(gonzalo);
        informatica.addEmpleado(Angela);
        RRRPP.addEmpleado(pepe);
        RRRPP.addEmpleado(alis);
        mantenimiento.addEmpleado(oscar);
        mantenimiento.addEmpleado(pedro);

        Em1.addDepartamento(informatica);
        Em1.addDepartamento(RRRPP);
        Em1.addDepartamento(mantenimiento);

        Em1.mostrarDatosDepart();

        informatica.mostrarListaEmpleados();
        mantenimiento.mostrarListaEmpleados();

        mantenimiento.borrarEmpleado("2345678");

        mantenimiento.mostrarListaEmpleados();

        Em1.borrarDepartamento("Informatica");
        System.out.println("Cantidad de departamentos creados: "+getCantDepart());
        System.out.println("Cantidad de Empleados creados: "+getCantEmpleados());
    }
}
