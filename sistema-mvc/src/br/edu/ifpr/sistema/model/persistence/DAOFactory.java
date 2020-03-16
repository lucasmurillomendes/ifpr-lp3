/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.sistema.model.persistence;

import br.edu.ifpr.sistema.model.persistence.memoria.MemDAOFactory;
import br.edu.ifpr.sistema.model.persistence.mysql.MysqlDAOFActory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author lucas
 */
public abstract class DAOFactory {

    private static DAOFactory instancia;
    private static TipoPersistencia persistencia;

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static DAOFactory getDAOFactoryInstance() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("configuracoes.properties");
        properties.load(fis);
        fis.close();
        String tipo = properties.getProperty("tipo.persistencia", null);
        if (tipo != null) {
            persistencia = TipoPersistencia.valueOf(tipo);
        } else {
            throw new IOException("Parâmetro tipo.persistencia não encontrado");
        }
        if (instancia == null) {
            switch (persistencia) {
                case MEMORIA:
                    instancia = new MemDAOFactory();
                    break;
                case MYSQL:
                    instancia = new MysqlDAOFActory();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return instancia;
    }

    public abstract ClienteDAO getCliente();


}
