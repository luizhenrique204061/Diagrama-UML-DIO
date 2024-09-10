package Iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    
    public static void main(String[] args) {
        System.out.println("Iniciando o Iphone");

        Iphone iphone = new Iphone();

        //Testando Reprodutor Musical
        iphone.tocar();
        iphone.selecionarMusica("Womam - Jhon Lennon");
        iphone.pausar();

        //Testando serviços web do iphone
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //Testando funcionalidades de aparelho telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA SELECIONADA " + musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO A MÚSICA");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA SELECIONADA");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PÁGINA " + url);
        
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO A CHAMADA");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("FAZENDO LIGAÇÃO");
        
    }
}
