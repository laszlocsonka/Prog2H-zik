/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katona;

/**
 *
 * @author LacGep
 */
public class Katona {
    private int tamado;
    private int vedo;

    public Katona(int tamado, int vedo) {
        this.tamado = tamado;
        this.vedo = vedo;
    }

    public Katona(){
        this.tamado=5;
        this.vedo=5;
    }
    
    public int getTamado() {
        return tamado;
    }

    public void setTamado(int tamado) {
        this.tamado = tamado;
    }

    public int getVedo() {
        return vedo;
    }

    public void setVedo(int vedo) {
        this.vedo = vedo;
    }

    @Override
    public String toString() {
        return "TE: [" + tamado + "], VE: [" + vedo + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Katona other = (Katona) obj;
        if (this.tamado != other.tamado) {
            return false;
        }
        if (this.vedo != other.vedo) {
            return false;
        }
        return true;
    }
    
    
}
