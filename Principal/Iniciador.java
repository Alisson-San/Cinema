package Principal;

import Exception.ExceptionHorarioJaCadastrado;
import View.InterfaceDeUsuario;

public class Iniciador {
    
    public static void main(String[] args) throws ExceptionHorarioJaCadastrado {
        InterfaceDeUsuario run = new InterfaceDeUsuario();
        run.menu();
    }
}
