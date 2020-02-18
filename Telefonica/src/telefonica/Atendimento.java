package telefonica;

public class Atendimento {
    
    private Cliente cliente;
    private Servico servico;

    public Atendimento(Cliente cliente, Servico servico) {
        this.cliente = cliente;
        this.servico = servico;
    }
    
    public void registrar() {
        System.out.println(" Solicitação de Atendimento ");
        System.out.println(" Cliente : " + cliente.getNome());
        System.out.println(" Serviço : " + servico.getDescricao());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }
    
}
