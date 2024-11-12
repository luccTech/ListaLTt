
package sistema_de_monitoramento_ambiental_1.pkg0;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProjetoAmbiental {
    private String nome;
    private String descricao;
    private double orcamento;
    private double hectare = 3600.0; // supondo que o preço por hectare seja 3600 R$/hectar
    private static ArrayList<AreaProtegida> ListAreaProtegida = new ArrayList<>();

    public static ArrayList<AreaProtegida> getListAreaProtegida() {
        return ListAreaProtegida;
    }

    public ArrayList<RelatorioAmbiental> getListRelatorioAmbiental() {
        return ListRelatorioAmbiental;
    }

    public ArrayList<Voluntario> getListVoluntario() {
        return ListVoluntario;
    }
    private static ArrayList<RelatorioAmbiental> ListRelatorioAmbiental = new ArrayList<>();
    private static ArrayList<Voluntario> ListVoluntario = new ArrayList<>();
    
    public ProjetoAmbiental(String nome, String descricao, double orcamento, double hectare, ArrayList<AreaProtegida> ListAreaProtegida, ArrayList<RelatorioAmbiental> ListRelatorioAmbiental, ArrayList<Voluntario> ListVoluntario) {
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.hectare = hectare;
        this.ListAreaProtegida = ListAreaProtegida;
        this.ListRelatorioAmbiental = ListRelatorioAmbiental;
        this.ListVoluntario = ListVoluntario;
    } 
    
    public ProjetoAmbiental(){
        
    }
    
    // 10. Cálculo do Orçamento Total do Projeto
    
    public double calcularOrcamentoTotal(double tamanho){
        orcamento += (hectare * tamanho);
        return orcamento;
    }
    
    // metodo para adicionarArea(AreaProtegida area)
    
    public void adicionarArea(String nome, String localizacao, double tamanho){
        AreaProtegida area = new AreaProtegida(nome,localizacao,tamanho);
        ListAreaProtegida.add(area);
        System.out.println("Nome: " + area.getNome() + " - Localização: " + area.getLocalizacao()+ " - Tamanho: " + area.getTamanho()+ " Hectares");
    }
    
    // metodo para  listarAreas() exibirInformaçoes()
    
    public void listarAreas(){
        for (int i = 0; i < ListAreaProtegida.size(); i++){
            System.out.println("Nome: \t" + ListAreaProtegida.get(i).getNome());
            System.out.println("Localização: \t" + ListAreaProtegida.get(i).getLocalizacao());
            System.out.println("Tamanho: \t" + ListAreaProtegida.get(i).getTamanho()+ " Hectares");
        }
    }
    
    // metodo para  adicionarRelatorio(RelatorioAmbiental relatorio)
    
    public void adicionarRelatorio(String data, String responsavel, String conteudo){
        RelatorioAmbiental relatorio = new RelatorioAmbiental(data, responsavel, conteudo);
        ListRelatorioAmbiental.add(relatorio);
        System.out.println("Data: " + relatorio.getData() + " - Responsavel: " + relatorio.getResponsavel()+ " - Conteudo: " + relatorio.getConteudo());
    }
    
    // metodo para  listarRelatorios() 
    
    public void listarRelatorios(){
        for (int i = 0; i < ListRelatorioAmbiental.size(); i++){
            System.out.println("Data: \t" + ListRelatorioAmbiental.get(i).getData());
            System.out.println("Responsavel: \t" + ListRelatorioAmbiental.get(i).getResponsavel());
            System.out.println("Conteudo: \t" + ListRelatorioAmbiental.get(i).getConteudo());
        }
    }
    
    // metodo para  adicionarVoluntario(Voluntario voluntario)
    
    public void  adicionarVoluntario(String nome, int idade, String cidade){
        Voluntario volun = new Voluntario(nome, idade, cidade);
        ListVoluntario.add(volun);
        System.out.println("Nome: " + volun.getNome() + " - Idade: " + volun.getIdade()+ " - Cidade: " + volun.getCidade());
    }
    
    // metodo para  listarVoluntarios()
    
    public void listarVoluntarios(){
        for (int i = 0; i < ListVoluntario.size(); i++){
            System.out.println("Nome: \t" + ListVoluntario.get(i).getNome());
            System.out.println("Idade: \t" + ListVoluntario.get(i).getIdade());
            System.out.println("Cidade: \t" + ListVoluntario.get(i).getCidade());
        }
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

