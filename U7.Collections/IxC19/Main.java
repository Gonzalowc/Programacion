package IxC19;

public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico("Pepe", "Perez Corazon","1234","Macarena");
        Medico m2 = new Medico("Maria", "Perez Pulmon","1234","Macarena");
        Medico m3 = new Medico("Antonia", "Perez Motriz","1234","Macarena");

        Paciente p0 = new Paciente("Alicia",25,55,true,m1,"Britanica");
        Paciente p1 = new Paciente("Pedro",35,55,true,m1,"Rusa");
        Paciente p2 = new Paciente("Angela",22,55,false,m1,"Brasil");
        Paciente p3 = new Paciente("Gonzalo",22,55,true,m1,"Britanica");
        Paciente p4 = new Paciente("Oscar",40,55,true,m1,"Rusa");
        Paciente p5 = new Paciente("Fran",16,55,true,m1,"Britanica");
        Paciente p6 = new Paciente("David",7,55,true,m1,"Rusa");
        Paciente p7 = new Paciente("Carlos",29,55,true,m1,"Brasil");
        Paciente p8 = new Paciente("Guille",80,55,true,m1,"Britanica");
        Paciente p9 = new Paciente("Pepito",73,55,true,m1,"Rusa");
        Coronavirus c = new Coronavirus("Coronavirus-19","Wuhan");
        c.addPaciente(p0.getCepa(),p0);
        c.addPaciente(p1.getCepa(),p1);
        c.addPaciente(p2.getCepa(),p2);
        c.addPaciente(p3.getCepa(),p3);
        c.addPaciente(p4.getCepa(),p4);
        c.addPaciente(p5.getCepa(),p5);
        c.addPaciente(p6.getCepa(),p6);
        c.addPaciente(p7.getCepa(),p7);
        c.addPaciente(p8.getCepa(),p8);
        c.addPaciente(p9.getCepa(),p9);
        System.out.println("/////////MOSTRAR TODO///////////");
        System.out.println(c);
        System.out.println("//////////DAR DE ALTA//////////");
        c.darDeAltaPaciente(p3);
        System.out.println("//////////POR EDAD//////////");
        c.pacientesPorEdad("Brasil");
        System.out.println("//////////POR PESO//////////");
        c.pacientesPorPeso("Brasil");
        System.out.println("///////////PACIENTES DE UN DOCTOR/////////");
        System.out.println(c.pacientesDeUnDoctor("1234"));
        c.guardarPacientes();
    }
}
