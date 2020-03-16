/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.sistema.view;

import br.edu.ifpr.sistema.model.dominio.Cliente;
import br.edu.ifpr.sistema.model.persistence.ClienteDAO;
import br.edu.ifpr.sistema.model.persistence.DAOFactory;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class Principal {
    public static void main(String[] args) {
        try {
            DAOFactory factory = DAOFactory.getDAOFactoryInstance();
            ClienteDAO dao = factory.getCliente();
            Cliente ci = new Cliente();
            ci.setNome("teste");
            System.out.println(dao.buscar(ci));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
