package dicionarioo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDicionario {

    private static GerenciadorDicionario instancia;
    private List<Palavra> palavras;
    private List<Categoria> categorias;
    private DicionarioFactory fabricaAtual;

    public static GerenciadorDicionario getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDicionario();

        }
        return instancia;
    }

    public void carregarFabrica(DicionarioFactory fabrica) {
        this.fabricaAtual = fabrica;
        fabrica.criarCategoriasIniciais();
    }

    public void adicionarPalavra(Palavra palavra) {
        if (palavra != null && fabricaAtual != null) {
            palavra.add(palavra);
        } else {
            System.out.println("");
        }
    }

    public Palavra buscarPalavra(String nome) {
        for(Palavra p : palavras) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public List<Categoria> listarCategorias() {
        return new ArrayList<>(categorias);
    }

    public void mudarFabrica(DicionarioFactory novaFabrica) {
            this.fabricaAtual = novaFabrica;
            this.categorias.clear();
            fabricaAtual.criarCategoriasIniciais();
    }
    
}
