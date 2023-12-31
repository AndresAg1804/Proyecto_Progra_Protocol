package instrumentos.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calibraciones implements Serializable {

    String numero;

    String fecha;

    int mediciones;

    Instrumento instrumento;

    List<Mediciones> medicionesList = new ArrayList<>();

    public Calibraciones() {
        this(new Instrumento(), "", 0);
    }
    public List<Mediciones> getMedicionesList() {
        return medicionesList;
    }

    public void setMedicionesList(List<Mediciones> medicionesList) {
        this.medicionesList = medicionesList;
    }

    public Calibraciones(Instrumento inst, String fecha, int mediciones) {
        this.instrumento = inst;
        this.fecha = fecha;
        this.mediciones = mediciones;

        this.numero = String.valueOf(0);

        if (instrumento != null && mediciones != 0) {
            int refValor = inst.getMaximo() - inst.getMinimo();
            int refValor2 = refValor / mediciones;
            for (int i = 1; i < mediciones + 1; i++) {
                if (i == 1) {
                    Mediciones med = new Mediciones();
                    med.setReferencia("0");
                    med.setLectura(0);
                    med.setCalibraciones(this);
                    medicionesList.add(med);
                } else {
                    Mediciones med = new Mediciones();
                    med.setReferencia(String.valueOf(refValor2));
                    med.setLectura(0);
                    med.setCalibraciones(this);
                    medicionesList.add(med);
                    refValor2 += refValor2;
                }
            }
        }


    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumen) {
        if(instrumen.getSerie().equals(instrumento.getSerie())){
            instrumen.setCalibraciones(instrumento.getCalibraciones());
            instrumento = instrumen;
            return;
        }
        instrumento = instrumen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String nu) { this.numero = nu; }

    public int getMediciones() {
        return mediciones;
    }

    public void setMediciones(int mediciones) {
        this.mediciones = mediciones;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calibraciones that = (Calibraciones) o;
        return mediciones == that.mediciones && numero == that.numero && Objects.equals(medicionesList, that.medicionesList) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicionesList, fecha, mediciones, numero);
    }
}


