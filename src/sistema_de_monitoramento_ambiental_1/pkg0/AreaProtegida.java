
package sistema_de_monitoramento_ambiental_1.pkg0;

import javax.swing.JOptionPane;

public class AreaProtegida {
    private String nome;
    private String localizacao;
    private double tamanho; // hectares

    public AreaProtegida(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }
    
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome);
        JOptionPane.showMessageDialog(null, "Localização: " + localizacao);
        JOptionPane.showMessageDialog(null, "Tamanho: " + tamanho + "Hectares");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
      
}

