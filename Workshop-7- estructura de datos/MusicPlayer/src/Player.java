
import java.util.LinkedList;
import java.util.Queue;

public class Player {
    private Song cancionActual;
    private Queue<Song> playList;

    public Player() {
        this.cancionActual = null;
        this.playList = new LinkedList<>();
    }
    public void addCancion(Song cancion){
        this.playList.add(cancion);
    }
    public void playCancion(){
        if (this.playList.peek()!= null) {
            this.cancionActual = this.playList.remove();
            this.playList.add(cancionActual);
            System.out.println("Estás escuchando: " + this.cancionActual);
        }else{
            System.out.println("No tiene canciones agregadas");
        }
    }

    public void removeCancion(String nombre){
        Song selectCancion = null;
        for (Song cancion : playList) {
            if (cancion.getTitulo().equals(nombre)){
                selectCancion = cancion;
                break;
            }
        }
        if (selectCancion == null){
            System.out.println("No tienes esta canción en tu lista de reproducción");
        }
        else{
            playList.remove(selectCancion);
        }
    }
}