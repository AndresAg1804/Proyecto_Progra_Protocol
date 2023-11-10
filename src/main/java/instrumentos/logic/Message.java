package instrumentos.logic;

import java.io.Serializable;

public class Message implements Serializable {
    int tipo;
    String entidad;
    String texto;

    public static final int CREATE=1;
    public static final int UPDATE=2;
    public static final int DELETE=3;
    public Message(int tipo, String entidad, String texto) {
        this.tipo = tipo;
        this.entidad = entidad;
        this.texto = texto;
    }
    public Message() {
        this(0,"","");
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getEntidad() {
        return entidad;
    }
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
