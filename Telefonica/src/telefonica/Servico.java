package telefonica;

public class Servico {
    
    private String descricao;
    private TipoServico tipoServico;
    private Double valor;

    public Servico(String descricao, TipoServico tipoServico, Double valor) {
        this.descricao = descricao;
        this.tipoServico = tipoServico;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public Double getValor() {
        return valor;
    }
    
    
    
}
