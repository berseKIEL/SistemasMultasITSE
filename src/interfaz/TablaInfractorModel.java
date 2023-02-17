
package interfaz;

import javax.swing.table.AbstractTableModel;
import entidades.*;
import java.util.ArrayList;

public class TablaInfractorModel extends AbstractTableModel{
    String[] Titulo={"DNI", "Nombre", "Apellido", "E-mail"};
    ArrayList<Persona> Lista;    

    public TablaInfractorModel() {
        Lista = new ArrayList<Persona>();
    }
    
    public TablaInfractorModel(ArrayList<Persona> Lista) {
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
        
        Persona per=Lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                retorno=per.getDNI();
                break;
            case 1:
                retorno=per.getNombre();
                break;
            case 2:
                retorno =per.getApellido();
                break;
            case 3:
                retorno=per.getEmail();
                break;
        }
        return retorno;
    }
    
    public String getColumnName(int index){
        return Titulo[index];
    }
    
}
