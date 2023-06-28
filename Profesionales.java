import java.util.ArrayList;

public class Profesionales {

    private ArrayList<Profesional> profesionales = new ArrayList<Profesional>();


    public Profesionales(ArrayList<Profesional> profesional){
        this.setProfesionales(profesional);
    }


    public void setProfesionales(ArrayList<Profesional> profesional) {
        this.profesionales.addAll(profesional);
    }

    
}
