package EFerroviaria.Maquinaria;

 class Vagones {
    int cargaMax;
    int cargaActual;
    String tipoMercancia;

    public Vagones(int cargaMax, int cargaActual, String tipoMercancia) {
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
    public void infoVagones(){
        System.out.println("Carga máxima: "+cargaMax);
        System.out.println("Carga actual: "+cargaActual);
        System.out.println("Tipo de mercancía: "+ tipoMercancia);
    }
}
