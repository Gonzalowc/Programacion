package CasaBombillas;

class Bombilla {

    private boolean encendida;


    public Bombilla(){
        encendida=false;
    }

    public void interruptor(){
        encendida= !encendida;
    }
    public boolean estadoBombilla(){
        if(encendida){
            return true;
        }else{
            return false;
        }
    }

}
