/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.persintence.memory;

import fabrica.persintence.ClienteDAO;
import fabrica.persintence.DAOFactory;

/**
 *
 * @author lucas
 */
public class MemDAOFactory extends DAOFactory{

    @Override
    public ClienteDAO getCliente() {
        return MemClienteDAO.getInstance();
    }
    
}
