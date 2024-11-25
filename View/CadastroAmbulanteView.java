
package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroAmbulanteView extends JFrame {
    private JTextField nomeField, cpfField, tipoProdutoField, contatoField, eventoField;
    public JButton salvarButton;

    public CadastroAmbulanteView() {
        setTitle("Cadastro de Ambulantes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Campos
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Tipo de Produto:"));
        tipoProdutoField = new JTextField();
        add(tipoProdutoField);

        add(new JLabel("Contato:"));
        contatoField = new JTextField();
        add(contatoField);

        add(new JLabel("Evento:"));
        eventoField = new JTextField();
        add(eventoField);

        // Botão
        salvarButton = new JButton("Salvar");
        add(salvarButton);

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Dados enviados para o Controller.");
            }
        });
    }

    public String[] getDados() {
        return new String[] {
            nomeField.getText(),
            cpfField.getText(),
            tipoProdutoField.getText(),
            contatoField.getText(),
            eventoField.getText()
        };
    }
}


