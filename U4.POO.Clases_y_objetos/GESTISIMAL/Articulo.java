package GESTISIMAL;

public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private boolean estado;

    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.estado = true;
    }

    public Articulo(String codigo, String descripcion, double precioCompra, int porcentaje, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioCompra+precioCompra*(double)(porcentaje/100);
        this.stock = stock;
        this.estado = true;
    }

    public Articulo(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = 0;
        this.precioVenta=0;
        this.stock = 0;
        this.estado = true;
    }

    public boolean addstock(int cantidad){
        if(cantidad>0){
            this.stock+=cantidad;
            return true;
        }else{
            return false;
        }
    }
    public void cambiarPrecioVenta(double nuevoPrecio){
        this.precioVenta = nuevoPrecio;
    }
    public void cambiarPrecioCompra(double nuevoPrecio){
        this.precioCompra = nuevoPrecio;
    }
    public boolean comprarProducto(int cantidad){
        if(cantidad<=stock){
            this.stock-=cantidad;
            return true;
        }else{
            return false;
        }
    }
    public void cambiarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void eliminarStock(int cantidad){
        if(cantidad<=stock){
            this.stock -=cantidad;
        }
    }
    public void eliminartodoStock(){
        this.stock = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void changeEstado() {
        estado = !estado;

    }
}
