package Telefone;

public class TelefoneFuncionando extends ReprodutorMusical {

    public static void main (String[] args){
        TelefoneFuncionando meuTelefone = new TelefoneFuncionando();

        
        meuTelefone.tocar();
        meuTelefone.pausar();
        meuTelefone.selecionarMusica();
        meuTelefone.ligar();
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();
        meuTelefone.exibirPagina();
        meuTelefone.adicionarNovaAba();
        meuTelefone.atualizarPagina();
 
    }
}
