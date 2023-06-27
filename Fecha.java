import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
class Fecha {
    private Date dateStart;
    private Date dateEnd;
    private String dia;
    private ArrayList<Date> feriados = new ArrayList<Date>();
    private Turno turno;

    public Fecha (String dateStart, String dateEnd, String[] feriados) throws ParseException{
        this.setDateStart(dateStart);
        this.setDateEnd(dateEnd);
        this.setFeriados(feriados);
    }
    /* Getter and Setters //////////////////////////////////////////////////////////////// */
    public Date getDateStart(){
        return this.dateStart;
    }

    public Date getDateEnd(){
        return this.dateEnd;
    }

    public String getDia(){
        return this.dia;
    }

    public Turno getTurno(){
        return this.turno;
    }

    public void getFeriados(){
        for (int i = 0; i< this.feriados.size(); i++){   
            System.out.println(this.feriados.get(i));   
        }
    }

    public void setDateStart(String dateStart) throws ParseException{
        SimpleDateFormat dateFormateo = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = dateFormateo.parse(dateStart);
        this.dateStart = fecha;
    }

    public void setDateEnd(String dateEnd) throws ParseException{
        SimpleDateFormat dateFormateo = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = dateFormateo.parse(dateEnd);
        this.dateEnd = fecha;
    }

    public void setFeriados(String[] feriados) throws ParseException{
        for (int i = 0; i < feriados.length; i++){
            SimpleDateFormat dateFormateo = new SimpleDateFormat("dd/MM/yyyy");
            Date diaFeriado = dateFormateo.parse(feriados[i]);
            this.feriados.add(diaFeriado);
        }  
    }

    public static void main(String[] args) throws ParseException {
    String[] feriado = {"20/06/2023","23/06/2023","01/07/2023"};

    Fecha fecha = new Fecha("15/06/2023", "16/07/2023", feriado);
    fecha.getFeriados();
}
}


