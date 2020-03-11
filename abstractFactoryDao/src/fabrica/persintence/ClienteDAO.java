/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.persintence;

import fabrica.model.Cliente;

/**
 *
 * @author lucas
 */
public interface ClienteDAO {
    
    void salvar(Cliente c);
    void excluir(Cliente c);
    
}
