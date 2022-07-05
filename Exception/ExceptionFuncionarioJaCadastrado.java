package Exception;

public class ExceptionFuncionarioJaCadastrado extends Exception{
    
    @Override
    public String getMessage(){
        return "Funcionario Ja Cadastrado, Verificar Informações de Usuario";
    }
}
