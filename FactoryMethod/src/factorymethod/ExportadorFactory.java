/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author lucas
 */
public class ExportadorFactory {
    
    private static ExportadorFactory instancia;

    private ExportadorFactory() {
    
    }
   
    public Exportador getExportador(Formato formato) {

        switch (formato) {
            case PDF:
                return new ExportadorPDF();
            case XML:
                return new ExportadorXML();
            case TXT:
                return new ExportadorTXT();
            default:
                System.out.println("Nada relacionado foi passado!");
                return null;
        }
    }
    
    public static ExportadorFactory getInstance(){
        if (instancia == null) {
            return instancia = new ExportadorFactory();
        }
        return instancia;
    }
}
