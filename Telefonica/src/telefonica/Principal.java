package telefonica;

public class Principal {

    public static void main(String[] args) {
        
        BancoClientes bc = BancoClientes.getInstance();
        Cliente cliente = bc.getCliente(1);
        
        BancoServicos bs = BancoServicos.getInstance();
        Servico servico = bs.getServico(3);
        
        Atendimento atend = new Atendimento(cliente, servico);
        atend.registrar();
        
        BancoTecnicos bt = BancoTecnicos.getInstance();
        Tecnico tecnico = bt.buscaTecnico();
        AgendamentoTecnico agend = new AgendamentoTecnico(atend, tecnico);
        agend.agendar();
        
        if (servico.getTipoServico().equals(TipoServico.EXTERNO)) {
            BancoVeiculos bv = BancoVeiculos.getInstance();
            Veiculo veiculo = bv.buscaVeiculo();
            ReservaVeiculo reserva = new ReservaVeiculo(atend, veiculo);
            reserva.reservar();
        }
        
        if (servico.getValor() > 0) {
            Financeiro fatura = new Financeiro();
            fatura.faturar(cliente, servico);
        }
        
    }
    
}
