package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro>pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorItervaloAnos(int anoInicial, int anoFinal) {
        List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;

    }
    public Livro PesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros cataologoLivro = new CatalagoLivros();
        cataologoLivro.adicionarLivro("Livro 1" ,"Autor 1", 2020);
        cataologoLivro.adicionarLivro("Livro 1" ,"Autor 2", 2021);
        cataologoLivro.adicionarLivro("Livro 2" ,"Autor 2", 2022);
        cataologoLivro.adicionarLivro("Livro 3" ,"Autor 3", 2024);
        cataologoLivro.adicionarLivro("Livro 4" ,"Autor 4", 1994);

        System.out.println(cataologoLivro.pesquisaPorAutor("Autor 4"));
        System.out.println(cataologoLivro.pesquisaPorItervaloAnos(2020,2022));
        System.out.println(cataologoLivro.PesquisaPorTitulo("Livro 1"));
    }

}
