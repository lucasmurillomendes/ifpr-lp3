/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.sistema.model.persistence;

import br.edu.ifpr.sistema.model.dominio.Cliente;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface ClienteDAO {

    void salvar(Cliente c);

    void excluir(Cliente c);
    
    List<Cliente> buscar(Cliente cliete);
    
    List<Cliente> buscarTodos();

}
