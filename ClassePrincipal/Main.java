

package ClassePrincipal;

import Controller.AmbulanteController;
import View.CadastroAmbulanteView;


public class Main {
    public static void main(String[] args) {
        CadastroAmbulanteView view = new CadastroAmbulanteView();
        AmbulanteController controller = new AmbulanteController();

        view.setVisible(true);

        // Exemplo de ação ao clicar no botão salvar
        view.salvarButton.addActionListener(e -> {
            String[] dados = view.getDados();
            controller.salvarAmbulante(dados);
        });
    }
}
