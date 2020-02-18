package telefonica;

public class ReservaVeiculo {
    
    private Atendimento atendimento;
    private Veiculo veiculo;

    public ReservaVeiculo(Atendimento atendimento, Veiculo veiculo) {
        this.atendimento = atendimento;
        this.veiculo = veiculo;
    }

    public void reservar() {
        System.out.println(" Reserva de Veiculo: " );
        System.out.println(" Serviço : " + atendimento.getServico().getDescricao());
        System.out.println(" Veiculo : " + veiculo.getDescricao());
    }
    
}
