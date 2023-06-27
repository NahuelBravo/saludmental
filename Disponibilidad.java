class Disponibilidad{
    private String[] complete;
    private String[] diurnal;
    private String[] nigth;
    private NoDisponible noDisponible;


    public Disponibilidad(String[] complete, String[] diurnal, String[] nigth, 
    NoDisponible noDisponible){
        this.setComplete(complete);
        this.setDiurnal(diurnal);
        this.setNigth(nigth);
        this.noDisponible = noDisponible;
    }

    /* Getter and Setters //////////////////////////////////////////////////////////////// */
    public String getComplete(){
        return this.completeDays();
    }

    public String getDiurnal(){
        return this.diurnalDays();
    }

    public String getNigth(){
        return this.nigthDays();
    }

    public NoDisponible getNoDisponible(){
        return this.noDisponible;
    }

    public void setComplete(String [] days){
        this.complete = days;
    }

    public void setDiurnal(String[] diurnal) {
        this.diurnal = diurnal;
    }

    public void setNigth(String[] nigth){
        this.nigth = nigth;
    }

    public void setNoDisponible(NoDisponible noDisponible){
        this.noDisponible = noDisponible;
    }

    /* String[] to Strign for Getters ////////////////////////////////////////////////////////////////*/

    public String completeDays(){
       String[] day = this.complete;
       String days = "";
        for (int i = 0; i < day.length; i+=1){ 
            days += ", " + day[i];
        };
        return days;
    }

    private String diurnalDays() {
        String[] day = this.diurnal;
        String days = "";
        for (int i = 0; i < day.length; i+=1){ 
            days += ", " + day[i];
        };
        return days;
    }

    private String nigthDays() {
        String[] day = this.nigth;
        String days = "";
        for (int i = 0; i < day.length; i+=1){ 
            days += ", " + day[i];
        };
        return days;
    }
}
