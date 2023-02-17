package entidades;

public class Multa {
    private int año,ID;
    private double monto;
    private String tipo, descripcion;

    public Multa() {
        this.ID = 0;
        this.año = 0;
        this.monto = 0;
        this.tipo = "";
        this.descripcion = "";
    }

    public Multa(int ID, int año, double monto, String tipo, String descripcion) {
        this.ID = ID;
        this.año = año;
        this.monto = monto;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAño() {
        return año;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
