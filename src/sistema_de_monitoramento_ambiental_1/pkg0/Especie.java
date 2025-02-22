
package sistema_de_monitoramento_ambiental_1.pkg0;

import javax.swing.JOptionPane;


public class Especie {
    private String nomeCientifico;
    private String nomePopular;
    private String categoriaRisco; // Vulneravel ou em perigo.

    public Especie(String nomeCientifico, String nomePopular, String categoriaRisco) {
        this.nomeCientifico = nomeCientifico;
        this.nomePopular = nomePopular;
        this.categoriaRisco = categoriaRisco;
    }
    public Especie() {
    }

    
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Data: " + nomeCientifico);
        JOptionPane.showMessageDialog(null, "Responsavel: " + nomePopular);
        JOptionPane.showMessageDialog(null, "Conteudo: " + categoriaRisco);
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getCategoriaRisco() {
        return categoriaRisco;
    }

    public void setCategoriaRisco(String categoriaRisco) {
        this.categoriaRisco = categoriaRisco;
    }
    
    
}

