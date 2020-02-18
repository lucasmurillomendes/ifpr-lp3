package telefonica;

public class Financeiro {

    public void faturar(Cliente cliente, Servico servico) {
        System.out.println(" Fatura ");
        System.out.println(" Cliente : " + cliente.getNome());
        System.out.println(" Serviço : " + servico.getDescricao());
        System.out.println(" Valor   : " + servico.getValor());
    }

}
