package iphone;

public class Iphone2007 implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public String ligarIphone() {
        return "Ligando iPhone...";
    }

    public String desligarIphone() {
        return "Desligando iPhone...";
    }

    
    @Override
    public String exibirPagina(String url) {
        return "Exibindo página: " + url;
    }

    @Override
    public String adicionarNovaAba() {
        return "Nova aba adicionada.";
    }

    @Override
    public String atualizarPagina() {
        return "Página atualizada.";
    }

    
    @Override
    public String ligar(String num) {
        return "Ligando para " + num;
    }

    @Override
    public String atender() {
        return "Chamada atendida.";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Correio de voz iniciado.";
    }

   
    @Override
    public String tocar() {
        return "Música tocando.";
    }

    @Override
    public String pausar() {
        return "Música pausada.";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Música selecionada: " + musica;
    }
}

