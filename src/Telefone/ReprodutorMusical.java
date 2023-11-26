package Telefone;

public class ReprodutorMusical extends AparelhoTelefonico {

    private boolean tocar = false;
    private boolean pausar = false;
    private boolean selecionarMusica = false;


    public void tocar() {
        tocar = true;
        System.out.println("A musica esta tocando.");
    }

    public void pausar() {
        pausar = true;
        System.out.println("A musica foi pausada.");
    }

    public void selecionarMusica(){
        selecionarMusica = true;
        System.out.println("Selecionando musica.");
    }


}
