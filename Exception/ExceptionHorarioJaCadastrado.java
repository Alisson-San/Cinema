package Exception;

public class ExceptionHorarioJaCadastrado extends Exception{

    @Override
    public String getMessage(){
        return "Este Horario ou Codigo já está cadastrado, Verificar Disponibilidades";
    }
    
}
