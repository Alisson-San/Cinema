package Exception;

public class ExceptionFilmeJaCadastrado extends Exception{

    @Override
    public String getMessage(){
        return "Filme Ja Cadastrado, Verificar Disponibilidades";
    }
}