/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.persintence.Mysql;

import fabrica.model.Cliente;
import fabrica.persintence.ClienteDAO;

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
    
}
