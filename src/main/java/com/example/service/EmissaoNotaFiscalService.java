package main.java.com.example.service;

import main.java.com.example.modelo.Cliente;
import main.java.com.example.modelo.Produto;
import main.java.com.example.notificacao.Notificador;
import main.java.com.example.notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {
    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        //TODO faz todo processo de emissão da nota fiscal
        //NotificadorSMS notificador = new NotificadorSMS();
        notificador.notificar(cliente, "Nota fiscao do produto " + produto.getNome() + " foi emitida!");
    }
}
