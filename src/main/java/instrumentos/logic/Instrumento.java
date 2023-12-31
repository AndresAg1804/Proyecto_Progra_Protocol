/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Instrumento implements Serializable {

    String serie;
    String descripcion;
    int minimo;
    int maximo;
    int tolerancia;
    TipoInstrumento tipo;
    List<Calibraciones> calibraciones = new ArrayList<>();

    public List<Calibraciones> getCalibraciones() {
        return calibraciones;
    }

    public void setCalibraciones(List<Calibraciones> calibraciones) {
        this.calibraciones = calibraciones;
    }

    public Instrumento() {
        this("","", 0, 0, 0, new TipoInstrumento());
    }

    public Instrumento(String serie, String descripcion, int minimo, int maximo, int tolerancia, TipoInstrumento tipoInstrumento) {
        this.serie = serie;
        this.descripcion = descripcion;
        this.minimo = minimo;
        this.maximo = maximo;
        this.tolerancia = tolerancia;
        this.tipo = tipoInstrumento;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }


    public TipoInstrumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstrumento tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.serie);
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
        final Instrumento other = (Instrumento) obj;
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        return true;
    }
}
