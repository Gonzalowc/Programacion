package com.gwaackc;

public class BreakEtiqueta6_5_1 {
    public static void main(String[] args) {

        int n1;
        bucleInterrumpir:
        for (n1=1; n1<=20; n1++){
            System.out.println(n1);
            if(n1==10) break bucleInterrumpir;

        }
    }
}
