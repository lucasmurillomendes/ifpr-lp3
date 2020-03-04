package factorymethod;

/**
 *
 * @author lucas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Exportador exp = ExportadorFactory.getInstance().getExportador(Formato.PDF);

        exp.exportar("Arquivo 2222");
    }

}
