package main.java.com.example.service;

import main.java.com.example.modelo.Cliente;
import main.java.com.example.notificacao.Notificador;
import main.java.com.example.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        // Dessa forma tbm não adianta nada pq ainda há alto acomplamento
        // entre essa classe e a classe NotificadorEmail
        // Notificador notificador = new NotificadorEmail();
        // NotificadorEmail notificador = new NotificadorEmail();
        // NotificadorSMS notificador = new NotificadorSMS();
        notificador.notificar(cliente, "Seu cadastro está ativo!");
    }
}
