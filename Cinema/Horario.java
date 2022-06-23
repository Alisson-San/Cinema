package Cinema;

public class Horario {

    private int Horario;
    private int CodHorario;

    public Horario(int horario, int codHorario) {
        Horario = horario;
        CodHorario = codHorario;
    }

    public int getCodHorario() {
        return CodHorario;
    }

    public void setCodHorario(int codHorario) {
        CodHorario = codHorario;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int horario) {
        Horario = horario;
    }    
}
