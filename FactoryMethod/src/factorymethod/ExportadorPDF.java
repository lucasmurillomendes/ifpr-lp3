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
public class ExportadorPDF implements Exportador{

    @Override
    public void exportar(String documento) {
        System.out.println("Exportando documento em PDF");
        System.out.println(documento);
    }
    
}
