package Exception;

public class ExceptionSalaJaCadastrada extends Exception{
    @Override
    public String getMessage(){
        return "Sala Ja Cadastrada, Verificar Disponibilidades";
    }

}
