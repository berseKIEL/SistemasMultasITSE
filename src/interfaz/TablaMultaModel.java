
package interfaz;

import javax.swing.table.AbstractTableModel;
import entidades.*;
import java.util.ArrayList;
import entidades.Multa;

public class TablaMultaModel extends AbstractTableModel{
    String[] Titulo={"ID","Tipo", "Año","Descripción", "Monto"};
    ArrayList<Multa> Lista;
    
    public TablaMultaModel() {
        Lista = new ArrayList<Multa>();
    }
    
    public TablaMultaModel(ArrayList<Multa> Lista) {
        this.Lista = Lista;
    }
    @Override
    public int getRowCount() {
        return Lista.size();
    }

    @Override
    public int getColumnCount() {
        return Titulo.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno=null;
        
        Multa Multaper=Lista.get(rowIndex);
        switch(columnIndex){
            case 0: 
                retorno=Multaper.getID();
                break;
            case 1:
                retorno=Multaper.getTipo();
                break;
            case 2:
                retorno=Multaper.getAño();
                break;
            case 3:
                retorno=Multaper.getDescripcion();
                break;
            case 4:
                retorno=Multaper.getMonto();
                break;
        }
        return retorno;
    }
    
    public String getColumnName(int index){
        return Titulo[index];
    }
    
}
