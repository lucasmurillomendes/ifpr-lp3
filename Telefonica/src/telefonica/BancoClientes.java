package telefonica;

import java.util.Collection;
import java.util.HashMap;

public class BancoClientes {
    private static BancoClientes bancoClientes;

    private HashMap<Integer, Cliente> listaClientes = new HashMap();

    private BancoClientes() {
        listaClientes.put(1, new Cliente(1, "Alan Turing"));
        listaClientes.put(2, new Cliente(2, "Ada Byron"));
        listaClientes.put(3, new Cliente(3, "Richard Feynmann"));
        listaClientes.put(4, new Cliente(4, "Mario Schenberg"));
    }
    
    public static BancoClientes getInstance(){
        if (bancoClientes == null) {
            bancoClientes = new BancoClientes();
        }
        return bancoClientes;
    }

    public Cliente getCliente(int id) {
        return listaClientes.get(id);
    }

    public Cliente removeCliente(int id) {
        return listaClientes.remove(id);
    }

    public Collection<Cliente> getAll() {
        return listaClientes.values();
    }

    public void addCliente(int id, String nome) {
        if (!listaClientes.containsKey(id)) {
            listaClientes.put(id, new Cliente(id, nome));
        } else {
            addCliente(id + 1, nome);
        }
    }
}
