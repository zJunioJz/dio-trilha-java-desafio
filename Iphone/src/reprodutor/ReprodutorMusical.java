package reprodutor;

public class ReprodutorMusical implements Reprodutor{

    public void tocar(){
        System.out.println("Tocando a musica.");
    }

    public void pausar(){
        System.out.println("Pausando a Musica.");
    }
    
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a Musica: " + musica);
    }
}
