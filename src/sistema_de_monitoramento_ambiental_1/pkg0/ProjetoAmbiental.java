
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
    
    public void adicionarArea(String nome, String localizacao, double tamanho){
        AreaProtegida area = new AreaProtegida(nome,localizacao,tamanho);
        ListAreaProtegida.add(area);
        System.out.println(area.getNome() + " - " + area.getLocalizacao()+ "-" + area.getTamanho());
    }
    
    // metodo para  listarAreas()
    
    
    
    public void listarAreas(){
        for (int i = 0; i < ListAreaProtegida.size(); i++){
            System.out.println(ListAreaProtegida.get(i).getNome());
            System.out.println(ListAreaProtegida.get(i).getLocalizacao());
            System.out.println(ListAreaProtegida.get(i).getTamanho());
        }
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
    
    public void listarRelatorios(){
        
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
    
    public void listarVoluntarios(){
        
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
    
    public void listarEspecie(){
        
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

