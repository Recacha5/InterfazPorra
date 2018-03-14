/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazporra;

/**
 *
 * @author Alex Recacha
 */
public class Apuesta {

    private String nombre;
    private String APLocal;
    private String APVisitante;
    private boolean pagado;

    public Apuesta(String nombre, String APLocal, String APVisitante, boolean pagado) {
        this.nombre = nombre;
        this.APLocal = APLocal;
        this.APVisitante = APVisitante;
        this.pagado = pagado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the APLocal
     */
    public String getAPLocal() {
        return APLocal;
    }

    /**
     * @param APLocal the APLocal to set
     */
    public void setAPLocal(String APLocal) {
        this.APLocal = APLocal;
    }

    /**
     * @return the APVisitante
     */
    public String getAPVisitante() {
        return APVisitante;
    }

    /**
     * @param APVisitante the APVisitante to set
     */
    public void setAPVisitante(String APVisitante) {
        this.APVisitante = APVisitante;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return nombre + ": " + APLocal + " - " + APVisitante + " pagado: " + pago() + "\n";
    }

    private String pago() {
        if (pagado) {
            return "Sí";
        } else {
            return "No";
        }
    }
    

}
