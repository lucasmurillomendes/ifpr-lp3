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
public class AtendimentoFacade {
    private final BancoTecnicos bancoTecnicos;
    private final BancoVeiculos bancoVeiculos;
    

    public AtendimentoFacade() {
       this.bancoTecnicos = BancoTecnicos.getInstance();
       this.bancoVeiculos = BancoVeiculos.getInstance();
    }
    
    public void registrarAtendimento(Cliente cliente, Servico servico){
       
        Atendimento atend = new Atendimento(cliente, servico);
        atend.registrar();
        
       
        Tecnico tecnico = bancoTecnicos.buscaTecnico();
        AgendamentoTecnico agend = new AgendamentoTecnico(atend, tecnico);
        agend.agendar();
        
        if (servico.getTipoServico().equals(TipoServico.EXTERNO)) {          
            Veiculo veiculo = bancoVeiculos.buscaVeiculo();
            ReservaVeiculo reserva = new ReservaVeiculo(atend, veiculo);
            reserva.reservar();
        }
        
        if (servico.getValor() > 0) {
            Financeiro fatura = new Financeiro();
            fatura.faturar(cliente, servico);
        }
    }
  
}
