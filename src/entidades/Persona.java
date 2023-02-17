
package entidades;

import java.util.ArrayList;

public class Persona {
    private int DNI;
    private String nombre, apellido, email;
    private ArrayList<Multa> MultasP;

    public Persona() {
        this.DNI = 0;
        this.nombre = "";
        this.apellido = "";
        this.email = "";
        MultasP=new ArrayList<Multa>();
    }

    public Persona(int DNI, String nombre, String apellido, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        MultasP=new ArrayList<Multa>();
    }

    public Persona(Persona personaSeleccionada) {
        this.DNI=personaSeleccionada.DNI;
        this.nombre=personaSeleccionada.nombre;
        this.apellido=personaSeleccionada.apellido;
        this.email=personaSeleccionada.email;
        this.MultasP=personaSeleccionada.MultasP;
    }

    public int getDNI() {
        return DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Multa> getMultas() {
        return MultasP;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMultas(ArrayList<Multa> MultasP) {
        this.MultasP = MultasP;
    }
    
    public int cantidadMultas(){
        int cantidad;
        cantidad=MultasP.size();
        return cantidad;
    }
    public int multasLeves(){
        int cantidad=0;
        for (int i = 0; i < MultasP.size(); i++) {
            if(MultasP.get(i).getTipo().equals("Leve")){
                cantidad++;
            }            
        }
        return cantidad;
    }

    public int multasGraves(){
        int cantidad=0;
        for (int i = 0; i < MultasP.size(); i++) {
            if(MultasP.get(i).getTipo().equals("Grave")){
                cantidad++;
            }            
        }
        return cantidad;
    }
    public int multasMuyGraves(){
        int cantidad=0;
        for (int i = 0; i < MultasP.size(); i++) {
            if(MultasP.get(i).getTipo().equals("Muy Grave")){
                cantidad++;
            }            
        }
        return cantidad;
    }
    
    public double TotalMonto(){
        double cantidad=0;
        for (int i = 0; i < MultasP.size(); i++) {
            cantidad= cantidad + MultasP.get(i).getMonto();           
        }
        return cantidad;
    }
    
    public boolean eliminarPorIndex(int index){
        if(index>=0 && index<MultasP.size()){
            MultasP.remove(index);
            return true;
        }else{
            return false;
        }
    }
    
}
