
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Autó {
    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasDatuma=new Date();

    public Autó(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Autó rendszam " + rendszam + ", motorTeljesitmeny " + motorTeljesitmeny + ", gyartasDatuma " + gyartasDatuma;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Autó other = (Autó) obj;
        if (this.motorTeljesitmeny != other.motorTeljesitmeny) {
            return false;
        }
        if (!Objects.equals(this.rendszam, other.rendszam)) {
            return false;
        }
        if (!Objects.equals(this.gyartasDatuma, other.gyartasDatuma)) {
            return false;
        }
        return true;
    }
}
