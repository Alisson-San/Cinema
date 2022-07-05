package Exception;

public class ExceptionSemHorarioDisponivel extends Exception{

    @Override
    public String getMessage(){
        return "Sem Horarios Disponives nessa sala, cadastre a Exibição em outra";
    }
}