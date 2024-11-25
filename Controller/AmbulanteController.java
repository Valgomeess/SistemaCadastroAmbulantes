
package Controller;

import Model.Ambulante;



public class AmbulanteController {
    public void salvarAmbulante(String[] dados) {
        // Dados recebidos da View
        String nome = dados[0];
        String cpf = dados[1];
        String tipoProduto = dados[2];
        String contato = dados[3];
        String evento = dados[4];

        // Criando o objeto Ambulante
        Ambulante ambulante = new Ambulante(nome, cpf, tipoProduto, contato, evento);

        // Simulação de salvar no banco de dados
        System.out.println("Ambulante salvo: " + ambulante.getNome());
    }
}
