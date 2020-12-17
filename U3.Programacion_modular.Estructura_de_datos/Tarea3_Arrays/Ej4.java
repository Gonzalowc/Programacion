package T3.Tarea4_Tablas;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=1, max=5;
        long numero=0;
        boolean acertar=false;
        String num;
        System.out.println("Introduce longitud de la contraseña: ");
        int cant = sc.nextInt();
        int[] password = new int[cant];
        int[] password2 = new int[cant];
        for (int i = 0; i <cant ; i++) {
            password[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        do{
            //mostrar contraseña generada
            for (int i = 0; i < cant; i++) {
                System.out.print(password[i]+" ");
            }
            System.out.println("");
            //FIN
            do{
                System.out.println("Introduce una contraseña de longitud " + cant);
                numero = sc.nextLong();
            }while((int)Math.floor(Math.log10(numero))+1 != cant );


            num = String.valueOf(numero);

            for (int i = 0; i <cant; i++) {
                password2[i] = Integer.parseInt(""+num.charAt(i));
                if(password[i] == password2[i] ){
                    System.out.println(password2[i]+" es igual");
                }else if(password[i] >= password2[i]){
                    System.out.println(password2[i]+" es menor");
                }else if(password[i] <= password2[i]){
                    System.out.println(password2[i]+" es mayor");
                }
            }
            for (int i = 0; i < cant; i++) {
                if(password[i] == password2[i]){
                    acertar= true;
                }else{
                    acertar = false;
                    break;
                }
            }



        }while(!acertar);
        System.out.println("Has acertado!");
    }
}
