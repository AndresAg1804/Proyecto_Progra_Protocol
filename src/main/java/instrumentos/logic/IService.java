
package instrumentos.logic;
import java.util.ArrayList;
import java.util.List;

public interface IService {

    //================= TIPOS DE INSTRUMENTO ============
    public void create(TipoInstrumento e)throws Exception;

    public TipoInstrumento read(TipoInstrumento e) throws Exception;

    public void update(TipoInstrumento e)throws Exception;

    public void delete(TipoInstrumento e)throws Exception;

    public List<TipoInstrumento> search(TipoInstrumento e) throws Exception;

    // ------------ INSTRUMENTOS -------------

    public void create(Instrumento e) throws Exception;

    public Instrumento read(Instrumento e) throws Exception;

    public void update(Instrumento e)throws Exception;

    public void delete(Instrumento e)throws Exception;

    public List<Instrumento> search(Instrumento v) throws Exception;

    //================= Calibraciones ============

    public void create(Calibraciones e) throws Exception;

    public Calibraciones read(Calibraciones e) throws Exception;

    public void update(Calibraciones e)throws Exception;

    public void delete(Calibraciones e)throws Exception;

    public List<Calibraciones> search(Calibraciones v) throws Exception;

    //================= Mediciones ============

    public void create(Mediciones e) throws Exception;
    public Mediciones read(Mediciones e) throws Exception;

    public void update(Mediciones e)throws Exception;

    public void delete(Mediciones e)throws Exception;

    public List<Mediciones> search(Mediciones v) throws Exception;

    public List<Mediciones> searchMedicionesByCalibracion(String id);

    public List<Calibraciones> searchCalibracionesByInstrumento(String serie);
}
