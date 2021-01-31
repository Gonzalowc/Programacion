package Instrumentos;

public class Campana extends Instrumento{
    public Campana() {
        super();
    }

    @Override
    void interpretar() {
        for (int i = 0; i < notasMusicales.length; i++){
            String nota ="";
            nota+=notasMusicales[i].toString().charAt(0);
            if(notasMusicales[i].toString().length()==2){
                for (int j = 0; j < 4; j++) {
                    nota+=notasMusicales[i].toString().substring(1).toLowerCase();
                }
            } else{
                for (int j = 0; j < 4; j++) {
                    nota+=Character.toString(notasMusicales[i].toString().charAt(1)).toLowerCase();
                }
                nota+=Character.toString(notasMusicales[i].toString().charAt(2)).toLowerCase();
            }
            nota+=" ";
            System.out.print(nota);
        }
    }
}
