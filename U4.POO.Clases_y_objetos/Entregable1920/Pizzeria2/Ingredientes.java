package Entregable1920.Pizzeria2;

public enum Ingredientes {
    PEPERONI(504),QUESO(300),CHORIZO(356),JAMON_SERRANO(319),PINIA(48),
    BACON(682),JAMON_YORK(114), CEBOLLA(32), PIMIENTO(33), ESPINACA(7),
    BROCOLI(63),AJO(119), POLLO(120), TERNERA(135), CHAMPINION(34),
    MAIZ(86), ACEITUNA(117), TOMATE(18), SALCHICHA(304), CALABACIN(16),
    ALBAHACA(22), ATUN(116), GAMBA(105), SALSA_CARBONARA(307), ANCHOAS(253), SALSA_BARBACOA(71);
    int calorias;
    Ingredientes(int calorias) {
        this.calorias = calorias;
    }
    int getCalorias(){
        return calorias;
    }


}
