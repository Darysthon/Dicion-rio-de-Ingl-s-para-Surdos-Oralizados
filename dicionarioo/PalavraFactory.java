package dicionarioo;

public interface PalavraFactory {

    Palavra criarPalavra(String texto, Categoria categoria, PronunciacaoStrategy pronuncia);
    
}
