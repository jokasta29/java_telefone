package Telefone;

public class AparelhoTelefonico extends NavegadorDeInternet{

    private boolean ligar = false;
    private boolean atender = false;
    private boolean iniciarCorreioVoz = false;


    public void ligar() {
        ligar = true;
        System.out.println("Ligando");
    }

    public void atender() {
        atender = true;
        System.out.println("Ligacao atendida");
    }

    public void iniciarCorreioVoz() {
        iniciarCorreioVoz = true;
        System.out.println("Sua chamada esta sendo encaminhada para caixa de mensagem.");
    }
}
