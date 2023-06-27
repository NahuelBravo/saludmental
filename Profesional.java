import java.text.ParseException;

class Profesional{
    private String name;
    private int cantidadGuardias;
    private Disponibilidad disponibilidad;

    public Profesional(String name, int cantidadGuardias, Disponibilidad disponibilidad){
        this.setName(name);
        this.setCantidadGuardias(cantidadGuardias);
        this.setDisponibilidad(disponibilidad);
    }

    /* Getter and Setters //////////////////////////////////////////////////////////////// */
    public String getName(){
        return this.name;
    }

    public int getCantidad_Guardias(){
        return this.cantidadGuardias;
    }

    public Disponibilidad getDisponibilidad(){
        return this.disponibilidad;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCantidadGuardias(int cantidadGuardias){
        this.cantidadGuardias = cantidadGuardias;
    }

    private void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public static void main(String[] args) throws ParseException {
    /*me quiero pegar un tiro, ayuda */
        String[] completeArray = new String[] {"Lunes", "Miercoles", "Viernes","Sabados"};
        String[] diurnalArray = new String[] {"Viernes","Sabados","Domingos"};
        String[] nigthArray = new String[] {"Sabados","Domingos"};

        NoDisponible noDisponible = new NoDisponible("2023/06/18", "2023/06/24");

        Profesional Marta = new Profesional("Marta", 3, new Disponibilidad(completeArray,diurnalArray,nigthArray,noDisponible));
    


        System.out.println("hola soy" +" "+ Marta.getName() +" "+ "mucho gusto :)"+", "+
        "mi numero de guardias es"+" "+ Marta.getCantidad_Guardias()+", "+ 
        "puedo hacer guardias completas los dias"+" "+Marta.disponibilidad.getComplete()+", "+ 
        "puedo hacer guardias diurnas los dias"+" "+Marta.disponibilidad.getDiurnal()+", "+ 
        "puedo hacer guardias nocturna los dias"+" "+Marta.disponibilidad.getNigth()+", "+ 
        "no puedo hacer guardias desde"+" "+Marta.disponibilidad.getNoDisponible().getFechaInicio()+", hasta "+
        Marta.disponibilidad.getNoDisponible().getFechaFinal() );

    }
}

