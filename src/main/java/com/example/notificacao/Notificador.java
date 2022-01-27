package main.java.com.example.notificacao;

import main.java.com.example.modelo.Cliente;

public interface Notificador {
    public void notificar(Cliente cliente, String mensagem);
}
