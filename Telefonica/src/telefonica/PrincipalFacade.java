/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonica;

/**
 *
 * @author lucas
 */
public class PrincipalFacade {
    public static void main(String[] args) {
         AtendimentoFacade facade = new AtendimentoFacade();
         facade.registrarAtendimento(BancoClientes.getInstance().getCliente(1),
                 BancoServicos.getInstance().getServico(3));
    }

}
