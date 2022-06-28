package Exception;

import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

public class ExceptionFilmeJaCadastrado extends Exception{

    @Override
    public String getMessage(){
        return "Filme Ja Cadastrado, Verificar Disponibilidades";
    }
}