package projetoUML;

public class AparelhoTelefonico {
    private ReprodutorMusical reprodutor;
    private NavegadorInternet navegador;
    private boolean ligar;
    private boolean atender;
    private boolean correioVoz;

    public AparelhoTelefonico() {
        this.reprodutor = new ReprodutorMusical();
        this.navegador = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

    public boolean isLigar() {
        return ligar;
    }

    public boolean isAtender() {
        return atender;
    }

    public boolean isCorreioVoz() {
        return correioVoz;
    }

    public static void main(String[] args) {
        // Criando um aparelho telefônico
        AparelhoTelefonico aparelho = new AparelhoTelefonico();

        // Utilizando o reprodutor musical do aparelho
        aparelho.getReprodutor().setTocar(true);
        aparelho.getReprodutor().setSelecionarMusica("Shape of You - Ed Sheeran");

        System.out.println("Reprodutor Musical:");
        System.out.println("Está tocando? " + aparelho.getReprodutor().isTocar());
        System.out.println("Música selecionada: " + aparelho.getReprodutor().getSelecionarMusica());

        // Utilizando o navegador de internet do aparelho
        aparelho.getNavegador().setExibirPagina(true);
        aparelho.getNavegador().setAtualizarPagina(true);

        System.out.println("\nNavegador Internet:");
        System.out.println("Está exibindo uma página? " + aparelho.getNavegador().isExibirPagina());
        System.out.println("Está atualizando a página? " + aparelho.getNavegador().isAtualizarPagina());
    }
}
