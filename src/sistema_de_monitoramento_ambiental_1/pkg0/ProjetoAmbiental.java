
package sistema_de_monitoramento_ambiental_1.pkg0;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProjetoAmbiental {
    private String nome;
    private String descricao;
    private double orcamento;
    private ArrayList<AreaProtegida> ListAreaProtegida = new ArrayList<>();
    private ArrayList<RelatorioAmbiental> ListRelatorioAmbiental = new ArrayList<>();
    private ArrayList<Voluntario> ListVoluntario = new ArrayList<>();
    private ArrayList<Especie> ListEspecie = new ArrayList<>();

    public ProjetoAmbiental(String nome, String descricao, double orcamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento;
    } 
    
    public ProjetoAmbiental(){
        
    }
    // metodo para adicionarArea(AreaProtegida area)
    
    public boolean adicionarArea(AreaProtegida area){
        if (area != null){
            ListAreaProtegida.add(area);
            return true;
        }else{
            return false;
        }
    }
    
    // metodo para  listarAreas()
    
    public ArrayList<AreaProtegida> listarAreas(ArrayList<AreaProtegida> area){
        return area;
    }
    
    
    // metodo para  adicionarRelatorio(RelatorioAmbiental relatorio)
    
    public boolean adicionarRelatorio(RelatorioAmbiental relatorio){
        if (relatorio != null){
            ListRelatorioAmbiental.add(relatorio);
            return true;
        }else{
            return false;
        }
    }
    
    // metodo para  listarRelatorios() 
    
    public ArrayList<RelatorioAmbiental> listarRelatorios(ArrayList<RelatorioAmbiental> relatorio){
        return relatorio;
    }
    
    
    // metodo para  adicionarVoluntario(Voluntario voluntario)
    
    public boolean  adicionarVoluntario(Voluntario voluntario){
        if (voluntario != null){
            ListVoluntario.add(voluntario);
            return true;
        }else{
            return false;
        }
    }
    
    // metodo para  listarVoluntarios()
    
    public ArrayList<Voluntario> listarVoluntarios(ArrayList<Voluntario> voluntario){
        return voluntario;
    }
    
    // metodo para  adicionarEspecie(Especie especie)
    
    public boolean  adicionarEspecie(Especie especie){
        if (especie != null){
            ListEspecie.add(especie);
            return true;
        }else{
            return false;
        }
    }
    
    // metodo para  listarEspecie()
    
    public ArrayList<Especie> listarEspecie(ArrayList<Especie> especie){
        return especie;
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

