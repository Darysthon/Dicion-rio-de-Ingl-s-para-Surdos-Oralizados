package dicionarioo;

public class Usuario {

    private String nome;
    private String tipoUsuario;
    private PronunciacaoStrategy preferenciasPronuncia;

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public PronunciacaoStrategy getPrefrenciasPronuncia() {
        return preferenciasPronuncia;
    }

    public void setPreferenciasPronuncia(PronunciacaoStrategy preferenciasPronuncia) {
        this.preferenciasPronuncia = preferenciasPronuncia;
    }
    
}
