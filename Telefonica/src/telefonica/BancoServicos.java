package telefonica;

import java.util.Collection;
import java.util.HashMap;

public class BancoServicos {
    private static BancoServicos bancoServicos;

    private HashMap<Integer, Servico> listaServicos = new HashMap();

    private BancoServicos() {
        listaServicos.put(1, new Servico("Troca de Senha", TipoServico.INTERNO, 0.0));
        listaServicos.put(2, new Servico("Reconfiguração Remota", TipoServico.INTERNO, 0.0));
        listaServicos.put(3, new Servico("Nova Instalação", TipoServico.EXTERNO, 50.0));
        listaServicos.put(4, new Servico("Visita Tecnica", TipoServico.EXTERNO, 100.0));
    }
    
    public static BancoServicos getInstance(){
        if (bancoServicos == null) {
            bancoServicos = new BancoServicos();
        }
        return bancoServicos;
    }

    public Servico getServico(int id) {
        return listaServicos.get(id);
    }

    public Servico removeServico(int id) {
        return listaServicos.remove(id);
    }

    public Collection<Servico> getAll() {
        return listaServicos.values();
    }

}
