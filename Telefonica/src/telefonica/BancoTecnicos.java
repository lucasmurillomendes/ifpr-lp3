package telefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoTecnicos {
    
    private static BancoTecnicos bancoTecnicos;

    private List<Tecnico> listaTecnicos = new ArrayList<>();

    private BancoTecnicos() {
        listaTecnicos.add(new Tecnico(10, "Josué"));
        listaTecnicos.add(new Tecnico(13, "Claudio"));
        listaTecnicos.add(new Tecnico(21, "Anderson"));
    }
    
    public static BancoTecnicos getInstance(){
        if (bancoTecnicos == null) {
            bancoTecnicos = new BancoTecnicos();
        }
        return bancoTecnicos;
    }
    
    public Tecnico buscaTecnico() {
        Random r = new Random();
        int index = r.nextInt(3);
        return listaTecnicos.get(index);
    }

}
