package projetoUML;

public class ReprodutorMusical {
    private boolean tocar;
    private boolean pausar;
    private String selecionarMusica;

    public boolean isTocar() {
        return tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    public boolean isPausar() {
        return pausar;
    }

    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }

    public String getSelecionarMusica() {
        return selecionarMusica;
    }

    public void setSelecionarMusica(String selecionarMusica) {
        this.selecionarMusica = selecionarMusica;
    }

}
