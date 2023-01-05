package entities;

public class FilmeAvaliacao {

    private String avaliacaoId;

    private String UsuarioId;

    private String nomeFilme;

    private Nota nota;

    private String comentario;

    public FilmeAvaliacao(){}

    public FilmeAvaliacao(String avaliacaoId, String UsuarioId, String nomeFilme, Nota nota, String comentario) {
        this.avaliacaoId = avaliacaoId;
        this.UsuarioId = UsuarioId;
        this.nomeFilme  = nomeFilme;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getAvaliacaoId() {
        return avaliacaoId;
    }

    public void setAvaliacaoId(String avaliacaoId) {
        this.avaliacaoId = avaliacaoId;
    }

    public String getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
