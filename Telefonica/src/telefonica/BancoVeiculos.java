package telefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoVeiculos {
    
    private static BancoVeiculos bancoVeiculos;

    private List<Veiculo> listaVeiculos = new ArrayList<>();

    private BancoVeiculos() {
        listaVeiculos.add(new Veiculo("AAA-1234", "GOL Branco"));
        listaVeiculos.add(new Veiculo("AUD-4637", "Saveiro"));
        listaVeiculos.add(new Veiculo("ACD-8724", "Fiorino"));
    }
    
    public static BancoVeiculos getInstance(){
        if (bancoVeiculos == null) {
            bancoVeiculos = new BancoVeiculos();
        }
        return bancoVeiculos;
    }

    public Veiculo buscaVeiculo() {
        Random r = new Random();
        int index = r.nextInt(3);
        return listaVeiculos.get(index);
    }

}
