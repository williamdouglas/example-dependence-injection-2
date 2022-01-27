package main.java.com.example;

import main.java.com.example.modelo.Cliente;
import main.java.com.example.notificacao.NotificadorSMS;
import main.java.com.example.service.AtivacaoClienteService;

public class App {
    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao da Silva", "joao@xyz.com", "3198765432");
        Cliente maria = new Cliente("Maria da silva", "maria@xyz.com", "1198765432");

        // AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(new NotificadorSMS());
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
