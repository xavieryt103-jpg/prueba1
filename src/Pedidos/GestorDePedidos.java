package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class GestorDePedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(String nombreCliente, String direccionEntrega){
        Pedido pedido = new Pedido(nombreCliente, direccionEntrega);
        pedidos.add(pedido);
        System.out.println("Pedido registrado: " + pedido);
    }

    public void consultarPedido(String nombreCliente, String direccionEntrega){

        for(int i = 0 ; i < pedidos.size() ; i++){
            Pedido p = pedidos.get(i);
            System.out.println(p);

        }
    }
}
