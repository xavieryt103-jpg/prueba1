package Clientes;

import java.util.ArrayList;
import java.util.List;

public class GestordeClientes {
    private List<Clientes> clientes = new ArrayList<>();


    public void registrarCliente(String nombre, String apellido, String correo){
        Clientes cliente = new Clientes(nombre, apellido, correo);
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente);
    }

    public void consultarCliente(String nombre, String apellido, String correo){
        for(int i = 0 ; i < clientes.size() ; i++){
            Clientes clientes = this.clientes.get(i);
            System.out.println(clientes);

        }
    }
    
}
