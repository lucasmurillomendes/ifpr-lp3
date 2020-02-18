package telefonica;

public class AgendamentoTecnico {
    
    private Atendimento atendimento;
    private Tecnico tecnico;

    public AgendamentoTecnico(Atendimento atendimento, Tecnico tecnico) {
        this.atendimento = atendimento;
        this.tecnico = tecnico;
    }

    public void agendar() {
        System.out.println(" Agendamento de Técnico ");
        System.out.println(" Serviço : " + atendimento.getServico().getDescricao());
        System.out.println(" Técnico : " + tecnico.getNome());
    }
    
}
