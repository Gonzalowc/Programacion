package Instrumentos;

public class Piano extends Instrumento{
    public Piano() {
        super();
    }
    @Override
    void interpretar() {
        for (int i = 0; i < notasMusicales.length; i++){
            String nota ="";
            nota+=notasMusicales[i].toString().charAt(0);
            nota+=notasMusicales[i].toString().substring(1).toLowerCase();
            nota+="- ";
            System.out.print(nota);
        }
    }
}
