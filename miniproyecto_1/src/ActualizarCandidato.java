import java.util.Scanner;

public class ActualizarCandidato extends Candidato {
    public ActualizarCandidato(String nombre, String cedula, Ciudades ciudades) {
        super(ideologia, partido, promesas, votos, nombre, cedula, ciudades);
    }
    public static String TextoNormal(String texto) {
        return texto.toLowerCase().replaceAll("[\\s_]", "");
    }


    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Digite la opcion que desee modificar del candidato-----\n");
        System.out.println("1) Ideologia");
        System.out.println("2) Partido");
        System.out.println("3) Votos");
        System.out.println("4) Promesas");
        System.out.println("0) Salir de la actualizacion");
        
        int opcion;
        do {
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nueva ideología (Izquierda/Derecha): ");
                    String nuevaIdeologiaStr = scanner.nextLine();
                    Ideologia nuevaIdeologia = Ideologia.valueOf(nuevaIdeologiaStr);
                    setIdeologia(nuevaIdeologia);
                    break;
                case 2:
                    System.out.print("Nuevo partido Politico: ");
                    String nuevoPartidoStr = scanner.nextLine();
                    Partidos nuevoPartido = Partidos.valueOf(nuevoPartidoStr);
                    setPartido(nuevoPartido);
                    break;
                case 3:
                    System.out.print("Nuevas promesas (separalas por coma): ");
                    String promesasStr = scanner.nextLine();
                    String[] nuevasPromesas = promesasStr.split(",");
                    setPromesas(nuevasPromesas);
                    break;
                case 4:
                    System.out.print("Nuevos votos: ");
                    int nuevosVotos = scanner.nextInt();
                    setVotos(nuevosVotos);
                    break;
                case 0:
                    System.out.println("Saliendo de la actualización.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

}

