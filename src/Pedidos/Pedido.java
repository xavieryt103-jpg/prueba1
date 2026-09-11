package Pedidos;

public class Pedido {
    private String nombreCliente;
    private String direccionEntrega;
    public Pedido(String nombreCliente, String direccionEntrega) {
        this.nombreCliente = nombreCliente;
        this.direccionEntrega = direccionEntrega;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
    @Override
    public String toString() {
        return "Pedido [nombreCliente=" + nombreCliente + ", direccionEntrega=" + direccionEntrega + "]";
    }
    
    
}
