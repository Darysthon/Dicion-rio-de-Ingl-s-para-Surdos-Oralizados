package dicionarioo;

public abstract class DicionarioFactory {

    public abstract PalavraFactory criarPalavraFactory();

    public abstract void criarCategoriasIniciais();

    public abstract String getNomeDicionario();

    
}
