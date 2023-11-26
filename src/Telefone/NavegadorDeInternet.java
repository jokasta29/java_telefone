package Telefone;

public class NavegadorDeInternet {
    private boolean exibirPagina = false;
    private boolean adicionarNovaAba = false;
    private boolean atualizarPagina = false;

   

    public void exibirPagina() {
        exibirPagina = true;
        System.out.println("Pagina sendo exibida.");
    }

    public void adicionarNovaAba() {
        adicionarNovaAba = true;
        System.out.println("Nova aba sendo adicionada.");
    }

    public void atualizarPagina() {
        atualizarPagina = true;
        System.out.println("Pagina sendo atualizada.");
    }
}
