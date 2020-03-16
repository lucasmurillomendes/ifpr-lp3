/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.util.tablemodel;

import br.com.mario.model.Aluno;
import br.com.mario.util.GenericTableModel;
import static br.com.mario.util.Util.convertToString;
import java.util.List;

/**
 *
 * @author mario
 */
public class AlunoTableModel extends GenericTableModel<Aluno> {

    private final String[] colunas = {"Codigo", "Nome", "Endereço", "Telefone", "Nascimento", "Altura", "Peso", "Editar", "Remover"};

    public AlunoTableModel(List<Aluno> rows) {
        super(rows);
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return rows.get(row).getId();
            case 1:
                return rows.get(row).getNome();
            case 2:
                return rows.get(row).getEndereco();
            case 3:
                return rows.get(row).getTelefone();
            case 4:
                return convertToString(rows.get(row).getNascimento());
            case 5:
                return rows.get(row).getAltura();
            case 6:
                return rows.get(row).getPeso();
            case 7:
                return "Editar";
            case 8:
                return "Remover";

        }
        return null;
    }

    @Override
    public String getNomeColuna(int coluna) {
        return colunas[coluna];
    }

    @Override
    public int qtdeColunas() {
        return colunas.length;
    }

}
