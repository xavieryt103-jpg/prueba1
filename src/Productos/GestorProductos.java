package Productos;

import java.util.ArrayList;
import java.util.List;

public class GestorProductos {
    private List<Productos> productos = new ArrayList<>();


    public void registrarProducto(String nombre, double precio){
        Productos producto = new Productos(nombre, precio);
        productos.add(producto);
        System.out.println("Producto registrado: " + producto);
    }

    public void consultarProducto(String nombre, double precio){

        for(int i = 0 ; i < productos.size() ; i++){
            Productos p = productos.get(i);
            System.out.println(p);

        }
    }

}