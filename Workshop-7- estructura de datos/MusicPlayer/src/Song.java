
public class Song {
    private int duracion;
    private String artista;
    private String titulo;

    public Song(int duracion, String artista, String titulo) {
        this.duracion = duracion;
        this.artista = artista;
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return "{" +
                " duracion:'" + getDuracion() + "'" +
                ", artista:'" + getArtista() + "'" +
                ", titulo:'" + getTitulo() + "'" +
                "}";
    }

}