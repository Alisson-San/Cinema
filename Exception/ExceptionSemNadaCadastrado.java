package Exception;

public class ExceptionSemNadaCadastrado extends Exception {
    @Override
    public String getMessage(){
        return "Nada Esta Registrado Nessa Lista";
    }
    
}
