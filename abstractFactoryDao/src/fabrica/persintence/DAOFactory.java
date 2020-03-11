/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.persintence;

import fabrica.persintence.Mysql.MysqlDAOFActory;
import fabrica.persintence.memory.MemDAOFactory;

/**
 *
 * @author lucas
 */
public abstract class DAOFactory {
    
    private static DAOFactory instancia;
    private static TipoPersistencia persistencia;
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static DAOFactory getDAOFactoryInstance(){
        if (instancia == null) {
            switch (persistencia) {
                case MEMORIA: instancia = new MemDAOFactory();
                    break;
                case MYSQL: instancia = new MysqlDAOFActory();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return instancia;
    }
    
    public abstract ClienteDAO getCliente();

    public static void setPersistencia(TipoPersistencia persistencia) {
        DAOFactory.persistencia = persistencia;
    }
    
    
}
