
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.sistema.model.persistence.mysql;

import br.edu.ifpr.sistema.model.dominio.Cliente;
import br.edu.ifpr.sistema.model.persistence.ClienteDAO;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MysqlClienteDAO implements ClienteDAO{
    
    private static MysqlClienteDAO instancia;

    private MysqlClienteDAO() {
    }
    
    public static MysqlClienteDAO getInstance(){
        if (instancia == null) {
            instancia = new MysqlClienteDAO();
        }
        return instancia;
    }

    @Override
    public void salvar(Cliente c) {
        System.out.println("SAlvar mysql");
    }

    @Override
    public void excluir(Cliente c) {
        System.out.println("Excluir mysql");
    }

    @Override
    public List<Cliente> buscar(Cliente cliete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
