package main.java.com.example.notificacao;

import main.java.com.example.modelo.Cliente;

public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando cliente %s - numero: %s - mensagem: %s\n", cliente.getNome(),
                cliente.getTelefone(), mensagem);
    }
}
