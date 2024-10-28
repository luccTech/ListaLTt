
package sistema_de_monitoramento_ambiental_1.pkg0;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AreaProtegida {
    private String nome;
    private String localizacao;
    private double tamanho; // hectares k
    private ArrayList<Especie> ListEspecie = new ArrayList<>();

    public ArrayList<Especie> getListEspecie() {
        return ListEspecie;
    }

    public void setListEspecie(ArrayList<Especie> ListEspecie) {
        this.ListEspecie = ListEspecie;
    }

    public AreaProtegida(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public AreaProtegida() {
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
    
    // metodo para  adicionarEspecie(Especie especie)
    
    public void  adicionarEspecie(String nomeCientifico, String nomePopular, String categoriaRisco){
        Especie esp = new Especie(nomeCientifico, nomePopular, categoriaRisco);
        ListEspecie.add(esp);
        System.out.println("Nome Cientifico: " + esp.getNomeCientifico() + " - Nome Popular: " + esp.getNomePopular()+ " - Categoria de rico: " + esp.getCategoriaRisco());
    }
    
    // metodo para  listarEspecie()
    
    public void listarEspecie(){
        for (int i = 0; i < ListEspecie.size(); i++){
            System.out.println("Nome Cientifico: \t" + ListEspecie.get(i).getNomeCientifico());
            System.out.println("Nome Popular: \t" + ListEspecie.get(i).getNomePopular());
            System.out.println("Categoria de rico: \t" + ListEspecie.get(i).getCategoriaRisco());
        }
    }
}

