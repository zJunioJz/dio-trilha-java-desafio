import reprodutor.ReprodutorMusical;
import navegador.NavegadorInternet;
import aparelho.AparelhoTelefonico;


public class FuncoesIphone {
    public static void main(String[] args) {
        ReprodutorMusical rp = new ReprodutorMusical();
        AparelhoTelefonico ap = new AparelhoTelefonico();
        NavegadorInternet nv = new NavegadorInternet();

        rp.tocar();
        rp.pausar();
        rp.selecionarMusica("Avicci - Waiting for Love");
        
        System.out.println("");
       
        ap.ligar();
        ap.atender();
        ap.iniciarCorreioVoz();
        
        System.out.println("");
        
        nv.exibirPagina();
        nv.adicionarNovaAba();
        nv.atualizarPagina();
    }
}
