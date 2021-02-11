package ENTREGABLE2021Interfaces;

public class Main {
    public static void main(String[] args) {
        Edicion ed1 = new Edicion(2021,"España");
        Pais p1 = new Pais("España",25);
        Pais p2 = new Pais("Francia",30);
        Pais p3 = new Pais("Italia",15);
        JugadorBaloncesto JBalon1 = new JugadorBaloncesto("Fernando J1",22,1.95);
        JugadorBaloncesto JBalon2 = new JugadorBaloncesto("Roberto J2",23,2.10);
        JugadorBaloncesto JBalon3 = new JugadorBaloncesto("Felipe J3",21,1.8);

        Atleta Atle1 = new Atleta("Angela A1",22,"100m Vallas");
        Atleta Atle2 = new Atleta("Alicia A2",25,"200 Lisos");
        Atleta Atle3 = new Atleta("María A3",18,"100 Obstaculos");

        Judoka judoka1 = new Judoka("Rafa K1",21,76);
        Judoka judoka2 = new Judoka("Osk K2",21,70);
        Judoka judoka3 = new Judoka("Pedro K3",22,75);

        Baloncesto baloncesto  = new Baloncesto("Baloncesto juvenil","Grande",15);
        Judo judo = new Judo("Judo masculino","Central",25);
        Atletismo atletismo = new Atletismo("Atletismo Femenino","Pista",5);

        baloncesto.addJugadorBaloncesto(JBalon1);
        baloncesto.addJugadorBaloncesto(JBalon2);
        baloncesto.addJugadorBaloncesto(JBalon3);

        atletismo.addAtleta(Atle1);
        atletismo.addAtleta(Atle2);
        atletismo.addAtleta(Atle3);

        judo.addJudoka(judoka1);
        judo.addJudoka(judoka2);
        judo.addJudoka(judoka3);

        ed1.addDeporte(baloncesto);
        ed1.addDeporte(atletismo);
        ed1.addDeporte(judo);
        ed1.addPais(p1);
        ed1.addPais(p2);
        ed1.addPais(p3);
        CDI comite = new CDI();
        comite.addEdicion(ed1);
        Atle1.correr();
        judoka1.luchar();
        JBalon1.encestar();
        Atle1.hacerJuramento();
        Atle2.hacerJuramento();
        Atle3.hacerJuramento();
        judoka1.hacerJuramento();
        judoka2.hacerJuramento();
        judoka3.hacerJuramento();
        JBalon1.hacerJuramento();
        JBalon2.hacerJuramento();
        JBalon3.hacerJuramento();
        System.out.println(comite);
        System.out.println("////////////Orden por mostrarPaises//////////");
        ed1.mostrarPaises();
        System.out.println("//////////////////FIN////////////////////////");
        System.out.println("///////////mostrarPaisesParaCeremonia////////");
        ed1.mostrarPaisesParaCeremonia();
        System.out.println("//////////////////FIN////////////////////////");
        System.out.println("///////////mostrarParticipantes///BALONCESTO/////");
        baloncesto.mostrarParticipantes();
        System.out.println("///////////mostrarParticipantes///JUDO/////");
        judo.mostrarParticipantes();
        System.out.println("///////////mostrarParticipantes///ATLETISMO/////");
        atletismo.mostrarParticipantes();
        System.out.println("//////////////////FIN////////////////////////");
        System.out.println("///////////mostrarParticipantes///BaloncestoAltura/////");
        baloncesto.mostrarJugadoresBaloncestoPorAltura();
    }
}
