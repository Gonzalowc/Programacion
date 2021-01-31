package Entregable1920.Pizzeria2;

import java.util.Arrays;

public class Pizzas {
    Ingredientes I;
    Size s;
    int ingredientesMax;
    Ingredientes[] ingredient;
    String mensaje;

    public Pizzas(Size s, Ingredientes i) {
        ingredient = new Ingredientes[0];
        this.s = s;
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = i;
        this.ingredientesMax = 3;
    }
    public Pizzas(Size s, Ingredientes i, Ingredientes i2) {
        this(s,i);
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = i2;
    }
    public Pizzas(Size s, Ingredientes i, Ingredientes i2, Ingredientes i3) {
        this(s,i,i2);
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = i3;
    }

    public Pizzas(Ingredientes i) {
        this(Size.FAMILIAR,i);
    }
    public Pizzas(Ingredientes i, Ingredientes i2) {
        this(i);
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = i2;
    }
    public Pizzas(Ingredientes i, Ingredientes i2, Ingredientes i3) {
        this(i,i2);
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = i3;
    }
    public Pizzas(){
        this.ingredientesMax = 3;
        ingredient = new Ingredientes[0];
        this.s = Size.FAMILIAR;
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = Ingredientes.JAMON_SERRANO;
        ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
        ingredient[ingredient.length-1] = Ingredientes.QUESO;
    }
    public Pizzas(Favoritas v){
        ingredient = new Ingredientes[0];
        this.ingredientesMax = 3;
        switch (v.name()){
            case "JAMON_SERRANO_QUESO_MEDIANA":
                this.s = Size.MEDIANA;
                addIngrediente(Ingredientes.JAMON_SERRANO);
                addIngrediente(Ingredientes.QUESO);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "JAMON_SERRANO_QUESO_FAMILIAR":
                this.s = Size.FAMILIAR;
                addIngrediente(Ingredientes.JAMON_SERRANO);
                addIngrediente(Ingredientes.QUESO);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "BARBACOA_MEDIANA":
                this.s = Size.MEDIANA;
                addIngrediente(Ingredientes.SALSA_BARBACOA);
                addIngrediente(Ingredientes.BACON);
                addIngrediente(Ingredientes.QUESO);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "BARBACOA_FAMILIAR":
                this.s = Size.FAMILIAR;
                addIngrediente(Ingredientes.SALSA_BARBACOA);
                addIngrediente(Ingredientes.BACON);
                addIngrediente(Ingredientes.QUESO);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "CARBONARA_MEDIANA":
                this.s = Size.MEDIANA;
                addIngrediente(Ingredientes.SALSA_CARBONARA);
                addIngrediente(Ingredientes.BACON);
                addIngrediente(Ingredientes.CHAMPINION);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "CARBONARA_FAMILIAR":
                this.s = Size.FAMILIAR;
                addIngrediente(Ingredientes.SALSA_CARBONARA);
                addIngrediente(Ingredientes.BACON);
                addIngrediente(Ingredientes.CHAMPINION);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "MARGARITA_MEDIANA":
                this.s = Size.MEDIANA;
                addIngrediente(Ingredientes.QUESO);
                addIngrediente(Ingredientes.JAMON_YORK);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
            case "MARGARITA_FAMILIAR":
                this.s = Size.FAMILIAR;
                addIngrediente(Ingredientes.QUESO);
                addIngrediente(Ingredientes.JAMON_YORK);
                this.mensaje = v.name().charAt(0)+v.name().substring(1,v.name().length()-1).toLowerCase();
                break;
        }
    }

    public void addIngrediente(Ingredientes i){
        if(ingredient.length<ingredientesMax){
            ingredient = Arrays.copyOf(ingredient,ingredient.length+1);
            ingredient[ingredient.length-1] = i;
        }else{
            System.out.println("Cantidad de ingredientes máximo alcanzado");
        }
    }

    public void infoPizza(){
        if(this.mensaje!=null){
            System.out.println("Pizza favorita: "+mensaje);
        }
        System.out.println("La pizza tiene ("+cantidadIngredientes()+"/"+ingredientesMax+") Ingredientes");
        System.out.printf("%15s | %-8s\n","Ingredientes","Calorías");
        for (int i = 0; i < ingredient.length; i++) {
            System.out.printf("%15s | %3d\n",ingredient[i].name().charAt(0)+ingredient[i].name().substring(1,ingredient[i].name().length()).toLowerCase(),ingredient[i].getCalorias());
        }
        System.out.printf("Calorias totales: %5d",infoCalorias());
        System.out.println();
    }
    public int infoCalorias(){
        int sumacalorias=0;

        for (int i = 0; i < ingredient.length; i++) {
            sumacalorias+= ingredient[i].getCalorias();
        }
        return sumacalorias;
    }
    public int cantidadIngredientes(){
        return ingredient.length;
    }




}
