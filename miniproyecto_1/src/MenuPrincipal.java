import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) throws Exception {
        //MetodosCreateC metodosCreateC = new MetodosCreateC();
        System.out.println("--------Bienvenido señor usuario-----------\n");

        System.out.println("--------Digite la opcion a la cual desee acceder---------\n");
        Scanner scanner = new Scanner(System.in);
        byte opciones;

        do{
        System.out.println("1) Insertar candidato");
        System.out.println("2) Actualizar candidato");
        System.out.println("3) Eliminar candidato");
        System.out.println("4) Buscar candidato por nombre");
        System.out.println("5) Lista de todos los candidatos");
        System.out.println("0) Salir");
        System.out.println("Seleccione alguna opcion");
        opciones = scanner.nextByte();
        scanner.nextLine();

        switch(opciones) {
            case 1: InsertarCandidato.main(args);
            break;

            //case 2: ActualizarCandidato.main();
            //break;
            
            //case 3: EliminarCandidato.main();
            //break;

            //case 4; BuscarCandidato.main();
            //break;
            
            //case 5; ListaCandidatos.main();
            //break;

            //case 0; break;
            default: System.out.println("Opcion Invalida");
        }
        } while (opciones != 0);
        scanner.close();
    }
}






























/*      Metodo para limpiar consola
        limpiarConsola();
        System.out.println("Espere porfavor");

    private static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Si el sistema operativo es Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Si es otro sistema operativo como Linux o macOS
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Manejo de excepciones si ocurre un error al limpiar la consola
            e.printStackTrace();
        }
    }
}
 */