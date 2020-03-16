/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.sistema.model.persistence.memoria;

import br.edu.ifpr.sistema.model.dominio.Cliente;
import br.edu.ifpr.sistema.model.persistence.ClienteDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MemClienteDAO implements ClienteDAO {

    private static MemClienteDAO instancia;
    private List<Cliente> lista;
    private Long ultimoId;

    private MemClienteDAO() {
        this.lista = new ArrayList<>();
        this.ultimoId = new Long(1);
    }

    public static MemClienteDAO getInstance() {
        if (instancia == null) {
            instancia = new MemClienteDAO();
        }
        return instancia;
    }

    @Override
    public void salvar(Cliente cliente) {
        if (cliente.getCodigo() == null) {
            cliente.setCodigo(ultimoId);
            this.ultimoId++;
        }
        if (lista.contains(cliente)) {
            lista.remove(cliente);
        }
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

    public void mostrarClientes() {

    }

    @Override
    public List<Cliente> buscar(Cliente cliente) {
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.forEach((cli) -> {
            if (cliente.getCodigo() != null
                    && cliente.getCodigo().equals(cli.getCodigo())) {
                listaCliente.add(cliente);
            }
        });
       return listaCliente;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return this.lista;
    }

}
