
package sistema_de_monitoramento_ambiental_1.pkg0;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProjetoAmbiental {
    private String nome;
    private String descricao;
    private double orcamento;
    List<AreaProtegida> ListAreaProtegida = new ArrayList<>();
    List<RelatorioAmbiental> ListRelatorioAmbiental = new ArrayList<>();
    List<Voluntario> ListVoluntario = new ArrayList<>();
    List<Especie> ListEspecie = new ArrayList<>();

    public ProjetoAmbiental(String nome, String descricao, double orcamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento;
    } 

    public void exibirInformacoes() { 
        JOptionPane.showMessageDialog(null, "Nome: " + nome);
        JOptionPane.showMessageDialog(null, "DEscrição: " + descricao);
        JOptionPane.showMessageDialog(null, "Orçamento: " + orcamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    
      
}

