
package sistema_de_monitoramento_ambiental_1.pkg0;

import javax.swing.JOptionPane;


public class RelatorioAmbiental {
    private String data;
    private String responsavel;
    private String conteudo;

    public RelatorioAmbiental(String data, String responsavel, String conteudo) {
        this.data = data;
        this.responsavel = responsavel;
        this.conteudo = conteudo;
    }
    public RelatorioAmbiental() {

    }
    
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Data: " + data);
        JOptionPane.showMessageDialog(null, "Responsavel: " + responsavel);
        JOptionPane.showMessageDialog(null, "Conteudo: " + conteudo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


      
}

