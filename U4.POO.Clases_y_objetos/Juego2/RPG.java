package Juego2;

import java.util.Arrays;
import java.util.Scanner;

public class RPG{
    private  Personaje[] personajes;
    private int cantidadMax;

    public RPG() {
        this.personajes = new Personaje[0];
        cantidadMax=10;
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }
    public void mostrarPersonaje(String nombre){
        for (int i = 0; i < personajes.length; i++) {
            if(personajes[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println(personajes[i]);
            }
        }
    }
    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }

    public void borrarMuertos(){
        Personaje[] aux = new Personaje[0];
        for (int i = 0; i < personajes.length; i++) {
            if(personajes[i].getEnergia()>0){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = personajes[i];
            }
        }
        personajes = aux;
    }
    public void cambiarPersonaje(int index, Personaje personaje){
        if(index>=0 && index<personajes.length){
            personajes[index] = personaje;
        }
    }
    public void addPersonaje(Personaje personaje){
        boolean puedeAdd = true;
        if(personajes.length<cantidadMax){
            for (int i = 0; i < personajes.length; i++) {
                if(personajes[i].getNombre().equals(personaje.getNombre()) && personajes[i].getClass().getSimpleName().equals(personaje.getClass().getSimpleName())){
                    puedeAdd=false;
                    System.out.println("Error: Personaje del mismo tipo y nombre ya añadido");
                    break;
                }
            }
            if(puedeAdd){
                personajes = Arrays.copyOf(personajes, personajes.length+1);
                personajes[personajes.length-1] = personaje;
                System.out.println("Personaje "+personaje.getClass().getSimpleName()+" de nombre "+ personaje.getNombre()+" añadido");
            }
        }else{
            System.out.println("Capacidad máxima de personajes alcanzada");
        }
    }
    private int posicionPersonaje(String nombre){
        for (int i = 0; i < personajes.length; i++) {
            if(nombre.equalsIgnoreCase(personajes[i].getNombre())){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "Personajes: \n" + Arrays.toString(personajes);
    }
    private boolean esPersonaje(String nombre){
        if(nombre.equalsIgnoreCase("elfo") || nombre.equalsIgnoreCase("enano") ||
                nombre.equalsIgnoreCase("orco") || nombre.equalsIgnoreCase("guerrero") ||
                nombre.equalsIgnoreCase("mago") ){
            return true;
        }else{
            return false;
        }
    }
    public void empezarPartida(){
        Scanner sc = new Scanner(System.in);
        String opcion;
        String nombre,valextra;
        int energia,ataque,defensa, valorExtra;
        int cantidadPersonajes;

            do{
                System.out.print("Indica cuantos personajes quiere unir a la partida(2-10): ");
                cantidadPersonajes= sc.nextInt();
            }while(cantidadPersonajes<2 || cantidadPersonajes>10);
            sc.nextLine();
        for (int i = 0; i < cantidadPersonajes; i++) {
            do{
                System.out.print("Personajes Disponibles:\n Ataque:\n"+
                        "Elfo\nEnano\nOrco\nGuerrero\n Magia:\n"+
                        "Mago\n:");

                opcion = sc.nextLine();
                if(!esPersonaje(opcion)){
                    System.out.println("Personaje no válido. Vuelve a introducirlo");
                }
            }while(!esPersonaje(opcion));
            opcion = opcion.toLowerCase();

            TipoElfo type;
            System.out.println("Nombre del personaje: ");
            nombre = sc.nextLine();
            do{
                System.out.println("Introduce la energía(vida)(0-1000]: ");
                energia = sc.nextInt();
            }while(energia<=0 || energia>1000);
            do{
                System.out.println("Introduce el poder de ataque(0-100]: ");
                ataque = sc.nextInt();
            }while(ataque<=0 || ataque>100);
            do{
                System.out.println("introduce el poder de defensa(0-100]: ");
                defensa = sc.nextInt();
            }while(defensa<=0 || defensa>100);

            switch (opcion){
                case "elfo":
                    sc.nextLine();
                    do{
                        System.out.println("Tipo de elfo: "+TipoElfo.BOSQUE+" o "+TipoElfo.COSTA);
                        valextra = sc.nextLine();
                    }while(!valextra.equalsIgnoreCase("bosque") && !valextra.equalsIgnoreCase("costa"));
                    if(valextra.equalsIgnoreCase("bosque")){
                        type = TipoElfo.BOSQUE;
                    }else{
                        type = TipoElfo.COSTA;
                    }
                    addPersonaje(new Elfo(nombre,energia,ataque,defensa,false,type));
                    break;
                case "Orco":
                    do{
                        System.out.println("Introduce el tonelaje del Orco: ");
                        valorExtra = sc.nextInt();
                    }while(valorExtra<=0);
                    addPersonaje(new Orco(nombre,energia,ataque,defensa,false,valorExtra));
                    break;
                case "enano":
                    do{
                        System.out.println("Introduce la altura del enano: ");
                        valorExtra = sc.nextInt();
                    }while(valorExtra<0);
                    addPersonaje(new Enano(nombre,energia,ataque,defensa,false,valorExtra));
                    break;
                case "guerrero":
                    do{
                        System.out.println("Introduce la edad del guerrero: ");
                        valorExtra = sc.nextInt();
                    }while(valorExtra<15);
                    addPersonaje(new Guerrero(nombre,valorExtra,energia,ataque,defensa,false));
                    sc.nextLine();
                    break;
                case "mago":
                    do{
                        System.out.println("Introduce la longitud de la barba del mago: ");
                        valorExtra = sc.nextInt();
                    }while(valorExtra<0);
                    addPersonaje(new Mago(nombre,energia,ataque,defensa,false,valorExtra));
            }
        }
        int opcionJuego;
        while(true){
            do{
                System.out.println("1.-Mostrar información todos los personajes.\n" +
                        "2.-Mostrar información de un personaje\n" +
                        "3.-Atacar\n" +
                        "4.Ordenar por Energía\n" +
                        "5.-Ordenar por Ataque\n" +
                        "6.-Ordenar por Defensa\n" +
                        "7.-AbortarPartida\n");
                opcionJuego = sc.nextInt();
            }while(opcionJuego<=0 || opcionJuego>7);
            switch (opcionJuego){
                case 1:
                    System.out.println(this);
                    break;
                case 2:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce el nombre del personaje que quiere mostrar: ");
                        nombre = sc.nextLine();

                        if(posicionPersonaje(nombre)==-1){
                            System.out.println("El nombre no existe.");
                        }
                    }while(posicionPersonaje(nombre)==-1);
                    System.out.println(personajes[posicionPersonaje(nombre)]);
                    break;
                case 3:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce el nombre del personaje que ataca: ");
                        nombre = sc.nextLine();
                        if(posicionPersonaje(nombre)==-1){
                            System.out.println("El nombre no existe.");
                        }
                    }while(posicionPersonaje(nombre)==-1);
                    Personaje atacante = getPersonajes()[posicionPersonaje(nombre)];
                    if(atacante instanceof Atacar){
                        Atacar atacantee = (Atacar) atacante;
                        do{
                            System.out.println("Introduce nombre del personaje que va a atacar: ");
                            nombre = sc.nextLine();
                            if(posicionPersonaje(nombre)==-1){
                                System.out.println("El nombre no existe.");
                            }
                        }while(posicionPersonaje(nombre)==-1);
                        cambiarPersonaje(posicionPersonaje(nombre), atacantee.atacarPersonaje(getPersonajes()[posicionPersonaje(nombre)]));
                        borrarMuertos();
                    }else if( atacante instanceof Magia){
                        Magia magico = (Magia) atacante;
                        do{
                            System.out.println("1.-Encantar\n2.-Desencantar\n");
                            opcionJuego = sc.nextInt();
                        }while(opcionJuego<=0 || opcionJuego>2);
                        sc.nextLine();
                        do{
                            System.out.println("Introduce el nombre del personaje vas a "+(opcionJuego==1?"Encantar": "Desencantar"));
                            nombre = sc.nextLine();
                            if(posicionPersonaje(nombre)==-1){
                                System.out.println("Personaje no encontrado");
                            }
                        }while(posicionPersonaje(nombre)==-1);
                        switch (opcionJuego){
                            case 1:
                                cambiarPersonaje(posicionPersonaje(nombre),magico.encantar(personajes[posicionPersonaje(nombre)]));
                                break;
                            case 2:
                                cambiarPersonaje(posicionPersonaje(nombre),magico.desencantar(personajes[posicionPersonaje(nombre)]));
                                break;
                        }
                    }
                    break;
                case 4:
                    Arrays.sort(personajes);
                    break;
                case 5:
                    Arrays.sort(personajes,new Personaje.mostrarxAtaque());
                    break;
                case 6:
                    Arrays.sort(personajes,new Personaje.mostrarxDefensa());
                    break;
                case 7:
                    break;
            }
            if(opcionJuego==7){
                break;
            }
        }
    }
}
