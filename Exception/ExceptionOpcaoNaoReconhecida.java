package Exception;

public class ExceptionOpcaoNaoReconhecida extends Exception{
    @Override
    public String getMessage(){
        return "Opção não reconhecida!";
    }
    
}
