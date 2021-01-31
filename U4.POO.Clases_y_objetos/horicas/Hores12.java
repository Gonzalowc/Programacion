package horicas;

public class Hores12 extends Hores{
    public static void main(String[] args) {
        Hores12 h2 = new Hores12(12,59,zona.AM);
        System.out.println(h2);
        h2.inc();
        System.out.println(h2);
    }
    zona zonita;

    public Hores12(int horas, int minutos, horicas.zona zona) {
        super(horas, minutos);
        setHoras(horas);
        this.zonita = zona;
    }
    @Override
    public void inc(){// 11.59 PM -> 00.00 AM || 12.59AM --> 1.00PM
        if(zonita.equals(zona.PM)){
            if(minutos<59){
                minutos++;
            }else{
                minutos=0;
                if(horas<11){
                    horas++;
                }else{
                    horas=0;
                    zonita = zona.AM;
                }
            }
        }else{
            if(minutos<59){
                minutos++;
            }else{
                minutos=0;
                if(horas<12){
                    horas++;
                }else{
                    horas=1;
                    zonita = zona.PM;
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+" "+zonita;
    }
}
