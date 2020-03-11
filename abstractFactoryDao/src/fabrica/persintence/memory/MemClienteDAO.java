/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.persintence.memory;

import java.util.ArrayList;
import java.util.List;
import fabrica.model.Cliente;
import fabrica.persintence.ClienteDAO;

/**
 *
 * @author lucas
 */
public class MemClienteDAO implements ClienteDAO{
    
    private static MemClienteDAO instancia;
    private List<Cliente> lista;

    private MemClienteDAO() {
        this.lista = new ArrayList<>();
    }
    
    public static MemClienteDAO getInstance(){
        if (instancia == null) {
            instancia = new MemClienteDAO();
        }
        return instancia;
    }
    
    @Override
    public void salvar(Cliente cliente) {
        lista.add(cliente);
        System.out.println("Salvar memoria");
    }

    @Override
    public void excluir(Cliente cliente) {
        if (lista.contains(cliente)) {
            lista.remove(cliente);
            System.out.println("Excluir memoria");
        }
    }
    
    public void mostrarClientes(){
        
    }
    
}
