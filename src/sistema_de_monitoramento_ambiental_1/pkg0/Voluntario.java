
package sistema_de_monitoramento_ambiental_1.pkg0;

import javax.swing.JOptionPane;


public class Voluntario {
    private String nome;
    private int idade;
    private String cidade;

    public Voluntario(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Data: " + nome);
        JOptionPane.showMessageDialog(null, "Responsavel: " + idade);
        JOptionPane.showMessageDialog(null, "Conteudo: " + cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}

