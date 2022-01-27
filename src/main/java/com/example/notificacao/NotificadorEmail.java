package main.java.com.example.notificacao;

import main.java.com.example.modelo.Cliente;

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando cliente %s - email: %s - mensagem: %s\n", cliente.getNome(), cliente.getEmail(),
                mensagem);
    }
}