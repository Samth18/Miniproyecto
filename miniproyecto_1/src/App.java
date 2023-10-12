import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------Bienvenido Ciudadano/Ciudadana-----------\n");
        System.out.println("--------Digite la opcion a la cual desee acceder---------\n");
        Scanner scanner = new Scanner(System.in);
        byte opciones;
        do{
        System.out.println("---Menu Principal---");
        System.out.println("1) Insertar candidato");
        System.out.println("2) Lista de todos los candidatos");
        System.out.println("3) Actualizar candidato");
        System.out.println("4) Eliminar candidato");
        System.out.println("0) Salir");
        System.out.print("Seleccione alguna opcion: ");
        String input = scanner.nextLine();

        try {
            opciones = Byte.parseByte(input);
        } catch (NumberFormatException e) {
            // Si no se puede convertir a byte, asignamos un valor que no afectará el bucle
            opciones = -1;
        }

        System.out.println();
            switch(opciones) {
                case 1: 
                    Crud.crearCandidato(); 
                    break;
                case 2: Crud.leerCandidato();
                    break;
                case 3: Crud.ActualizarCandidato();
                    break;
                case 4: Crud.EliminarCandidato();
                    break;
                case 0: break;
                default: System.out.println("Opcion Invalida");
            }
        }while(opciones != 0);
        scanner.close();

        Crud.reporte();
        Crud.candidatoGanador(null);
    }
}