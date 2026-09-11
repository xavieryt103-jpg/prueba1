import Clientes.GestordeClientes;
import Pedidos.GestorDePedidos;
import Productos.GestorProductos;

public class Main {
    public static void main(String[] args) {
        GestordeClientes gestorClientes = new GestordeClientes();
        gestorClientes.registrarCliente("Juan", "Pérez", "juan@example.com");
        gestorClientes.registrarCliente("María", "López", "maria@example.com");



        GestorDePedidos gestor = new GestorDePedidos();
        gestor.registrarPedido("Juan Pérez", "Calle Falsa 123");
        gestor.consultarPedido("Juan Gomez", "Calle Falsa 124");

        GestorProductos gestorProductos = new GestorProductos();
        gestorProductos.registrarProducto("Producto A", 10.99);
        gestorProductos.consultarProducto("Producto B", 10.99);

        

    }
}
