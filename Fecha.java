import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
class Fecha {
    private Date dateStart;
    private Date dateEnd;
    private String dia;
    private ArrayList<Date> feriados = new ArrayList<Date>();
    private Turno turno;
    private ArrayList<Date> mes = new ArrayList<Date>();

    public Fecha (String dateStart, String dateEnd, String[] feriados) throws ParseException{
        this.setDateStart(dateStart);
        this.setDateEnd(dateEnd);
        this.setFeriados(feriados);
        this.setMes();
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

    public Date getMes(){
        Date diaMes = new Date();
        for (int i = 0; i< this.mes.size(); i++){
            diaMes = this.mes.get(i);
        }
        return diaMes;
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

    public void setMes (){
        Date date = new Date();
        Calendar i = Calendar.getInstance();
        Calendar j = Calendar.getInstance();
        j.setTime(this.dateEnd);
        Calendar c = Calendar.getInstance();
        c.setTime(this.dateStart);

        for (i.setTime(this.dateStart);i.before(j);  i.add(Calendar.DATE, 1)){
            c.add(Calendar.DATE, 1);
            date = c.getTime();
            System.out.println(date);
            this.mes.add(date);   
        }
    }
    /*no funciona esto lpm ahhhhhhhh */
    public String esFeriado(){
        String feriado =" ";
        Date diaDelMes = new Date();
        Date feriadoDelMes = new Date();
        for(int i = 0; i < this.mes.size(); i++){
            diaDelMes = this.mes.get(i);
            for(int j = 0; j < this.feriados.size();j++){
                feriadoDelMes = this.feriados.get(j);
                if(diaDelMes.equals(feriadoDelMes)){
                    feriado = diaDelMes + "es feriado";
                }
                else{
                    feriado = diaDelMes + "no es feriado";
                }
            }
        } 
        return feriado;
    }

    public static void main(String[] args) throws ParseException {
    String[] feriado = {"20/06/2023","23/06/2023","01/07/2023"};

    Fecha fecha = new Fecha("14/06/2023", "16/07/2023", feriado);
    System.out.println(fecha.esFeriado());
}
}


