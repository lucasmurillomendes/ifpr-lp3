/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import fabrica.model.Cliente;
import fabrica.persintence.ClienteDAO;
import fabrica.persintence.DAOFactory;
import fabrica.persintence.TipoPersistencia;

/**
 *
 * @author lucas
 */
public class Principal {
    
    public static void main(String[] args) {
        DAOFactory.setPersistencia(TipoPersistencia.MYSQL);
        DAOFactory daoFactory = DAOFactory.getDAOFactoryInstance();
        ClienteDAO clienteDAO = daoFactory.getCliente();
        
        Cliente c1 = new Cliente("Teste");
        clienteDAO.salvar(c1);
        
    }
}
