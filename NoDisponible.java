import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class NoDisponible{

    private Date fechaInicio;
    private Date fechaFinal;

    public NoDisponible(String fechaInicio, String fechaFinal) throws ParseException{
        this.setFechaInicio(fechaInicio);
        this.setFechaFinal(fechaFinal);
    }
    /* Getter and Setters //////////////////////////////////////////////////////////////// */
    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public Date getFechaFinal(){
        return this.fechaFinal;
    }

    public void setFechaInicio(String fecha) throws ParseException{
        this.fechaInicial(fecha);
    }

    public void setFechaFinal(String fecha) throws ParseException{
        this.fechaFinal(fecha);
    }
    /* String to Date //////////////////////////////////////////////////////////////// */
    public void fechaInicial(String fechaInicio) throws ParseException{
        SimpleDateFormat dateFormateo = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = dateFormateo.parse(fechaInicio);
        this.fechaInicio = fecha;
    }

    public void fechaFinal(String fechaFinal) throws ParseException{
        SimpleDateFormat dateFormateo = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = dateFormateo.parse(fechaFinal);
        this.fechaFinal = fecha;
    }
}
