
package Model;


public class Ambulante {
    private String nome;
    private String cpf;
    private String tipoProduto;
    private String contato;
    private String evento;

    // Construtor
    public Ambulante(String nome, String cpf, String tipoProduto, String contato, String evento) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoProduto = tipoProduto;
        this.contato = contato;
        this.evento = evento;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTipoProduto() { return tipoProduto; }
    public void setTipoProduto(String tipoProduto) { this.tipoProduto = tipoProduto; }
    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
    public String getEvento() { return evento; }
    public void setEvento(String evento) { this.evento = evento; }
}

