package Cinema;

import java.io.Serializable;

public class Horario implements Serializable,Comparable<Horario> {

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

    @Override
    public int compareTo(Horario o) {
        int codigoReceptor = this.getCodHorario();
		int codigoParametro = o.getCodHorario();
		if(codigoReceptor < codigoParametro) {
			return -1;
		}
		else {
			if(codigoReceptor > codigoParametro) {
				return 1;
			}
		}
        return 0;
    }    
}
