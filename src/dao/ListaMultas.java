/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Multa;
import java.util.ArrayList;

/**
 *
 * @author Santillan
 */
public class ListaMultas {
    
    ArrayList<Multa> multaM;
    
    public ListaMultas() {
        multaM = new ArrayList<Multa>();
    }
    
    public ListaMultas(ArrayList<Multa> multaM) {
        this.multaM = multaM;
    }
    
    public void modificarPorID(int ID, Multa multa) {
        for (int i = 0; i < multaM.size(); i++) {
            if (multaM.get(i).getID() == ID) {
                multaM.get(i).setAño(multa.getAño());
                multaM.get(i).setDescripcion(multa.getDescripcion());
                multaM.get(i).setTipo(multa.getTipo());
                multaM.get(i).setMonto(multa.getMonto());
            }
        }
    }
    
    public void eliminarPorID(int ID) {
        for (int i = 0; i < multaM.size(); i++) {
            if(multaM.get(i).getID()== ID){
                multaM.remove(i);
            }
            
        }
    }
    
    public ArrayList<Multa> getMultaM() {
        return multaM;
    }
    
    public void setMultaM(ArrayList<Multa> multaM) {
        this.multaM = multaM;
    }
    
    public void guardar(Multa multa) {
        multaM.add(multa);
    }
    
    public ArrayList buscar(String tipo) {
        ArrayList<Multa> multaBusqueda = new ArrayList<Multa>();
        for (int i = 0; i < multaM.size(); i++) {
            if (multaM.get(i).getTipo().equals(tipo)) {
                multaBusqueda.add(multaM.get(i));
            }
        }
        return multaBusqueda;
    }
    
}
