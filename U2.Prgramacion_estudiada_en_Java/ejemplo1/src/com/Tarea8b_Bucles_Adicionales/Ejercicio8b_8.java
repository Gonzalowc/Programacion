package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;
public class Ejercicio8b_8 {

        public static void main(String[] args) {

            String s = "Hello World! 3 + 3.0 = 6";

            // create a new scanner with the specified String Object
            Scanner scanner = new Scanner(s);

            // find a string of world, with horizon of 10
            System.out.println("" + scanner.findWithinHorizon("World", 10));

            // find a string of world, with horizon of 20
            System.out.println("" + scanner.findWithinHorizon("World", 20));

            // print the rest of the string
            System.out.println("" + scanner.nextLine());

            // close the scanner
            scanner.close();
        }
}
