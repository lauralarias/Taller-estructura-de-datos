
import java.util.Scanner;


public class Main {

    public static Scanner inSc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        int duracion = 0;
        String artista = "";
        String titulo = "";

        Player musica = new Player();
        musica.addCancion(new Song(3, "karol g", "tusa"));
        musica.addCancion(new Song(10, "queen", "Break free"));
        musica.addCancion(new Song(2, "diomedes", "amarte mas no pude"));
        musica.addCancion(new Song(5, "TEKKNO", "Praise the lord"));

        while (option!=-1) {
            System.out.println("1. Agregar cancion");
            System.out.println("2. Reproducir cancion");
            System.out.println("3. Eliminar cancion");
            System.out.print("Ingresar seleccion: ");
            option = inSc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Duración (min): ");
                    duracion = inSc.nextInt();
                    System.out.println("Artista : ");

                    inSc.nextLine();

                    artista = inSc.nextLine();
                    System.out.println("Título de la canción: ");
                    titulo = inSc.nextLine();
                    musica.addCancion(new Song(duracion, artista, titulo));
                    break;
                case 2:
                    musica.playCancion();
                    break;
                case 3:
                    inSc.nextLine();
                    System.out.println("Título de la canción a eliminar: ");
                    titulo = inSc.nextLine();
                    musica.removeCancion(titulo);
                    break;
                default:
                    option = -1;
                    break;
            }
        }
    }
}