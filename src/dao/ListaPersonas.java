package dao;

import entidades.Multa;
import java.util.ArrayList;
import entidades.Persona;

public class ListaPersonas {

    ArrayList<Persona> personaM;

    public ListaPersonas() {
        personaM = new ArrayList<Persona>();
    }

    public ListaPersonas(ArrayList<Persona> personaM) {
        this.personaM = personaM;
        personaM.add(new Persona(41299019,"Nicolas","Calderon","nicocalderon9822@gmail.com"));
        personaM.add(new Persona(41748148,"Mara","Santillan","mjsn@gmail.com"));
        personaM.add(new Persona(42698355,"Exequiel","Barco","exebarco280320@gmail.com"));
        ArrayList<Multa> multasNico = new ArrayList<Multa>();
        ArrayList<Multa> multasMara = new ArrayList<Multa>();
        ArrayList<Multa> multasBarco = new ArrayList<Multa>();
        multasNico.add(new Multa(1,2019,1500,"Grave","Choco un arbol"));
        multasMara.add(new Multa(1,2017,400.5,"Leve","Cruzo un semaforo en rojo"));
        multasMara.add(new Multa(2,2015,1000,"Grave","no lleva patente"));
        multasBarco.add(new Multa(1,2017,400.5,"Leve","exceso de velocidad"));
        multasBarco.add(new Multa(2,2020,1200,"Grave","Falta de documentos"));
        multasBarco.add(new Multa(3,2021,2000,"Muy Grave","Circulacion en estado de ebriedad"));
        personaM.get(0).setMultas(multasNico);
        personaM.get(1).setMultas(multasMara);
        personaM.get(2).setMultas(multasBarco);
        
    }

    public void modificarPorDNI(int DNI,int nuevoDNI, String nombre, String apellido, String Correo) {
        
        for (int i = 0; i < personaM.size(); i++) {
            if(personaM.get(i).getDNI()==DNI){
                personaM.get(i).setApellido(apellido);
            personaM.get(i).setDNI(nuevoDNI);
            personaM.get(i).setNombre(nombre);
            personaM.get(i).setEmail(Correo);
            }
        }
        
//        if (index >= 0 && index < personaM.size()) {
//            personaM.get(index).setApellido(apellido);
//            personaM.get(index).setDNI(DNI);
//            personaM.get(index).setNombre(nombre);
//            personaM.get(index).setEmail(Correo)
////            personaM.set(index, persona);
//            return true;
//
//        } else {
//            return false;
//        }
    }

    public ArrayList buscar(int dni) {

        ArrayList<Persona> personaBusqueda = new ArrayList<>();
        for (Persona persona : personaM) {
            if (persona.getDNI() == dni) {
                personaBusqueda.add(persona);
            }
        }
        return personaBusqueda;
    }

//    public boolean eliminarPorIndex(int index){
//        if(index>=0 && index<personaM.size()){
//            personaM.remove(index);
//            return true;
//        }else{
//            return false;
//        }
//    }
    public ArrayList<Persona> getPersonaM() {
        return personaM;
    }
    
    public Persona getPersonaSeleccionada(int i){
        return personaM.get(i);
    }

    public boolean buscarPersonaMDNI(int DNI) {
        boolean encontrado = false;
        for (Persona persona : personaM) {
            if (persona.getDNI() == DNI) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public int indicePersonaMDNI (int DNI) {
        int i = 0;
        for (Persona persona: personaM) {
            if (persona.getDNI() == DNI) {
                personaM.get(i);
            }
        }
        return i;  
    }

    public void setPersonaM(ArrayList<Persona> personaM) {
        this.personaM = personaM;
    }

    public void guardar(Persona persona) {
        personaM.add(persona);
    }

    public boolean eliminarPorDNI(int DNI) {
        boolean encontrado = false;
        for (int i = 0; i < personaM.size(); i++) {
            if (personaM.get(i).getDNI() == DNI) {
                personaM.remove(i);
                encontrado = true;
            }
        }
        return encontrado;
    }

}
