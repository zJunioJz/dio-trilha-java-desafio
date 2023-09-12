package aparelho;

public class AparelhoTelefonico implements Aparelho{
    
    public void ligar(){
        System.out.println("Efetuando a Ligacacao...");
    }

    public void atender(){
        System.out.println("Ligacao Atendida!");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio Voz.");
    }
}
