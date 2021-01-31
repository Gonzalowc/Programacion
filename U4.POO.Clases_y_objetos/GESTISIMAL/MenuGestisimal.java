package GESTISIMAL;
import java.util.Arrays;
import java.util.Scanner;
public class MenuGestisimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuGestisimal menu = new MenuGestisimal();

        menu.Menu();
    }

    Articulo[] artic;

    public MenuGestisimal(){
        artic = new Articulo[0];
    }
    public void addProducto(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {

        if(!existeCodigo(artic,codigo)){
            artic = Arrays.copyOf(artic, artic.length+1);
            artic[artic.length-1] = new Articulo(codigo,descripcion,precioCompra,precioVenta,stock);
        }

    }

    public void addProducto(String codigo, String descripcion, double precioCompra, int porcentaje, int stock) {
        if(!existeCodigo(artic,codigo)){
            artic = Arrays.copyOf(artic, artic.length+1);
            double precioVenta = precioCompra+precioCompra*(double)(porcentaje/100);
            artic[artic.length-1] = new Articulo(codigo,descripcion,precioCompra,precioVenta,stock);
        }
    }
    public void addProducto(String codigo, String descripcion) {
        if(!existeCodigo(artic,codigo)){
            artic = Arrays.copyOf(artic, artic.length+1);

            artic[artic.length-1] = new Articulo(codigo,descripcion,0,0,0);
        }
    }
    public void addProducto(Articulo l){
        artic = Arrays.copyOf(artic, artic.length+1);

        artic[artic.length-1] = l;
    }
    static boolean existeCodigo(Articulo[] ar, String codigo){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i].getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    public int indexArticulo(String codigo){
        for (int i = 0; i < artic.length; i++) {
            if(artic[i].getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }

    public void removeArticulo(String codigo){
        Articulo[] aux = new  Articulo[0];
        if(existeCodigo(artic,codigo)){
            for (int i = 0; i < artic.length; i++) {
                if(!artic[i].getCodigo().equals(codigo)){
                    aux = Arrays.copyOf(aux, aux.length+1);
                    aux[aux.length-1] = artic[i];
                }
            }
            artic = aux;
        }
    }

    @Override
    public String toString() {
        String resultado ="";

        for (int i = 0; i < artic.length; i++) {
            resultado+="Código: " + artic[i].getCodigo() + "\n" +
                    "Descripción : " + artic[i].getDescripcion() + "\n" +
                    "Precio de Compra: " + artic[i].getPrecioCompra() + "\n"+
                    "Precio de Venta: "+ artic[i].getPrecioVenta() + "\n"+
                    "Estado : " + (artic[i].isEstado() ? "ACTIVO" :"INACTIVO") + "\n" +
                    "Stock: " + artic[i].getStock() + "\n" +
                    "___________________________________\n";
        }
        return resultado;
    }

    public void cambiarEstadoArticulo(String codigo){
        for (int i = 0; i < artic.length; i++) {
            if(artic[i].getCodigo().equals(codigo)){
                artic[i].changeEstado();
            }
        }
    }
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while(opcion!=8){
            do{
                System.out.println("Introduce opción: \n"+
                        "1-Listado\n"+
                        "2-Alta\n"+
                        "3-Baja\n"+
                        "4-Modificación\n"+
                        "5-Entrada de Mercancía\n"+
                        "6-Salida de Mercancía\n"+
                        "7-Eliminar Articulo\n"+
                        "8-Salir");
                opcion = sc.nextInt();
            }while(opcion<0 || opcion>8);
            String codigo = " ";
            int pos=0;
            switch (opcion){

                case 1:
                    System.out.println(this);
                    break;
                case 2:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce código: ");
                         codigo = sc.nextLine();
                         if(indexArticulo(codigo)!=-1 && !artic[indexArticulo(codigo)].isEstado()){
                             break;
                         }
                    }while(existeCodigo(this.artic,codigo));
                    if(existeCodigo(this.artic,codigo)){
                        artic[indexArticulo(codigo)].changeEstado();
                        break;
                    }
                    System.out.println("Introduce Descripción del Articulo: ");
                    String descripcion = sc.nextLine();
                    System.out.println("Introduce precio de Compra: ");
                    double precioCompra = sc.nextDouble();
                    int opcionDinero;
                    do{
                        System.out.println("introduce opcion de venta: ");
                        System.out.println("1-Precio íntegro");
                        System.out.println("2-Porcentaje en funcion del precio de compra");
                        opcionDinero = sc.nextInt();
                    }while(opcionDinero<1 || opcionDinero>2);
                    double precioVenta=0;
                    int precioVenta2=0;
                    switch (opcionDinero){
                        case 1:
                            System.out.println("Introduce el precio:");
                            precioVenta = sc.nextDouble();
                            break;
                        case 2:
                            System.out.println("Introduce el porcentaje: ");
                            precioVenta2 = sc.nextInt();
                            break;
                    }
                    System.out.println("Introduce el Stock: ");
                    int stock = sc.nextInt();
                    Articulo ar;
                    if(opcionDinero==1){
                         ar = new Articulo(codigo,descripcion,precioCompra,precioVenta,stock);
                    }else{
                        ar = new Articulo(codigo,descripcion,precioCompra,precioVenta2,stock);
                    }
                    addProducto(ar);
                    break;
                case 3:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce código: ");
                        codigo = sc.nextLine();
                    }while(!existeCodigo(artic,codigo));
                    pos = indexArticulo(codigo);
                    artic[pos].changeEstado();
                    break;
                case 4:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce código que quiere modificar: ");
                        codigo = sc.nextLine();
                    }while(!existeCodigo(artic,codigo));
                    String opcionModificar;
                    do{
                        System.out.println("Quieres Modificar el código?(S/N)");
                        opcionModificar = sc.nextLine();
                    }while(!opcionModificar.equalsIgnoreCase("s") && !opcionModificar.equalsIgnoreCase("n"));

                    if(opcionModificar.equalsIgnoreCase("s")){
                        System.out.println("Introduce nuevo Código: ");
                        String newCodigo = sc.nextLine();
                        pos = indexArticulo(codigo);
                        if(!existeCodigo(artic, newCodigo) && pos!=-1){
                            artic[pos].setCodigo(newCodigo);
                        }
                    }
                    do{
                        System.out.println("Quieres Modificar la descripción?(S/N)");
                        opcionModificar = sc.nextLine();
                    }while(!opcionModificar.equalsIgnoreCase("s") && !opcionModificar.equalsIgnoreCase("n"));
                    String newDescripcion="";
                    if(opcionModificar.equalsIgnoreCase("s")){
                        System.out.println("Introduce nueva descripción: ");
                        newDescripcion = sc.nextLine();
                        artic[pos].setDescripcion(newDescripcion);
                    }
                    do{
                        System.out.println("Quieres Modificar el precio de compra?(S/N)");
                        opcionModificar = sc.nextLine();
                    }while(!opcionModificar.equalsIgnoreCase("s") && !opcionModificar.equalsIgnoreCase("n"));
                    double newPrecioCompra=0;
                    if(opcionModificar.equalsIgnoreCase("s")){
                        System.out.println("Introduce nuevo precio de compra: ");
                        newPrecioCompra = sc.nextDouble();
                        artic[pos].setPrecioCompra(newPrecioCompra);
                    }
                    sc.nextLine();
                    do{
                        sc.nextLine();
                        System.out.println("Quieres Modificar el precio de venta?(S/N)");
                        opcionModificar = sc.nextLine();
                    }while(!opcionModificar.equalsIgnoreCase("s") && !opcionModificar.equalsIgnoreCase("n"));
                    double newPrecioventa=0;
                    if(opcionModificar.equalsIgnoreCase("s")){
                        System.out.println("Introduce nuevo precio de venta: ");
                        newPrecioventa = sc.nextDouble();
                        artic[pos].setPrecioVenta(newPrecioventa);
                    }
                    sc.nextLine();
                    do{
                        System.out.println("Quieres Modificar el Stock?(S/N)");
                        opcionModificar = sc.nextLine();
                    }while(!opcionModificar.equalsIgnoreCase("s") && !opcionModificar.equalsIgnoreCase("n"));
                    int newStock=0;
                    if(opcionModificar.equalsIgnoreCase("s")){
                        System.out.println("Introduce nuevo Stock: ");
                        newStock = sc.nextInt();
                        artic[pos].setStock(newStock);
                    }
                    break;
                case 5:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce código: ");
                        codigo = sc.nextLine();
                    }while(!existeCodigo(artic,codigo));
                    pos = indexArticulo(codigo);
                    int cantidad;
                    do{
                        System.out.println("Introduce la cantidad que desea introducir: ");
                        cantidad = sc.nextInt();
                    }while(cantidad<0);
                    artic[pos].addstock(cantidad);
                    break;
                case 6:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce código: ");
                        codigo = sc.nextLine();
                    }while(!existeCodigo(artic,codigo));
                    pos = indexArticulo(codigo);

                    do{
                        System.out.println("Introduce la cantidad que desea Eliminar: ");
                        cantidad = sc.nextInt();
                    }while(cantidad<0);
                    artic[pos].eliminarStock(cantidad);
                    break;
                case 7:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce código: ");
                        codigo = sc.nextLine();
                    }while(!existeCodigo(artic,codigo));
                    removeArticulo(codigo);
                    break;
                case 8:
                    break;
            }
            System.out.println(this);

        }
    }

}
