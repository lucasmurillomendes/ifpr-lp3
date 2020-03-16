/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.sistema.model.persistence.memoria;

import br.edu.ifpr.sistema.model.persistence.ClienteDAO;
import br.edu.ifpr.sistema.model.persistence.DAOFactory;

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
